package com.example.youngkaaa.recycleranimations;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by : youngkaaa on 2016/10/3.
 * Contact me : 645326280@qq.com
 */

public abstract class BaseRecyclerAdapter<T> extends RecyclerView.Adapter implements View.OnTouchListener {
    private List<T> mLists;
    private RecyclerView.ViewHolder mCurrentViewHolder;
    private Context mContext;
    private boolean isFirst=false;
    private boolean isLast=false;
    private int lastY;

    public BaseRecyclerAdapter(Context context,List<T> list){
        this.mContext=context;
        this.mLists=list;
    }

    public boolean isFirst() {
        return isFirst;
    }

    public boolean isLast() {
        return isLast;
    }

    public abstract void bottomEnterAnim(RecyclerView.ViewHolder viewHolder);
    public abstract void topEnterAnim(RecyclerView.ViewHolder viewHolder);

    public abstract int getRootLayoutId();
    public abstract void onBind(BaseViewHolder viewHolder, int position);


    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        mCurrentViewHolder=holder;
        if(position==mLists.size()-1){
            isLast=true;
        }else{
            isLast=false;
        }
        if(position==0){
            isFirst=true;
        }else{
            isFirst=false;
        }
        onBind((BaseViewHolder) holder,position);
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        BaseViewHolder innerViewHolder
                = new BaseViewHolder(LayoutInflater.from(parent.getContext()).inflate(getRootLayoutId(), parent, false));
        parent.setOnTouchListener(this);
        return innerViewHolder;
    }

    public Context getContext() {
        return mContext;
    }

    @Override
    public int getItemCount() {
        return mLists.size();
    }

    @Override
    public boolean onTouch(View view, MotionEvent event) {
        int x = (int) event.getX();
        int y = (int) event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_MOVE:
                int deltaY = y - lastY;
                if (deltaY < 0) {   //swipe up
                    if(!isLast()){
                       bottomEnterAnim(mCurrentViewHolder);
                    }
                } else {   //swipe down
                    if(!isFirst()){
                       topEnterAnim(mCurrentViewHolder);
                    }
                }
                break;
        }
        lastY=y;
        return false;
    }

    public class BaseViewHolder extends RecyclerView.ViewHolder{
        private View rootView;
        private SparseArray<View> views = new SparseArray<>();
        public BaseViewHolder(View itemView) {
            super(itemView);
            rootView=itemView;
        }

        public <T extends View> T getViewById(int id){
            View v = views.get(id);
            if (null == v) {
                v = rootView.findViewById(id);
                views.put(id, v);
            }
            return (T)v;
        }
    }

    public Object getListItem(int position) {
        if (position >= mLists.size())
            return null;
        return mLists.get(position);
    }
}

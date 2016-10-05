package com.example.youngkaaa.recycleranimations;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

import com.example.youngkaaa.recyclerviewanims.AnimHelper;
import com.example.youngkaaa.recyclerviewanims.BaseRecyclerAdapter;

import java.util.List;

/**
 * Created by : youngkaaa on 2016/10/3.
 * Contact me : 645326280@qq.com
 */

public class MainRecyclerAdapter2 extends BaseRecyclerAdapter<String> {

    public MainRecyclerAdapter2(Context context, List<String> list) {
        super(context, list);
    }

    @Override
    public void bottomEnterAnim(RecyclerView.ViewHolder viewHolder) {
//        AnimHelper.RotationXTopACW(viewHolder,1000);
        AnimHelper.RotationXCenterACW(viewHolder,1000);
//        AnimHelper.RotationXCenterCW(viewHolder,1000);
    }

    @Override
    public void topEnterAnim(RecyclerView.ViewHolder viewHolder) {
//        AnimHelper.RotationXTopACW(viewHolder,1000);
        AnimHelper.RotationXCenterACW(viewHolder,1000);
//        AnimHelper.RotationXCenterCW(viewHolder,1000);
//        AnimHelper.BottomInDelayAnim(viewHolder,getContext(),300);
    }

    @Override
    public int getRootLayoutId() {
        return R.layout.recycler_item;
    }

    @Override
    public void onBind(BaseRecyclerAdapter<String>.BaseViewHolder viewHolder, int position) {
        TextView textView=viewHolder.getViewById(R.id.textViewRecyclerItem);
        textView.setText((String)getListItem(position));
    }
}

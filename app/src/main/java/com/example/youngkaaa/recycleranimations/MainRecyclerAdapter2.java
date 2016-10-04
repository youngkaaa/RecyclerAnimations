package com.example.youngkaaa.recycleranimations;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

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
//        AnimHelper.BottomInDelayAnim(viewHolder,getContext(),800);
//        AnimHelper.LeftSlideInAnim(viewHolder);
        AnimHelper.RightSlideInAnim(viewHolder,300);
//        AnimHelper.FadeInAnim(viewHolder);
//        AnimHelper.ScaleOutAnim(viewHolder,300);
//        AnimHelper.RotationXCenter(viewHolder,1000);
//        AnimHelper.RotationXTopACW(viewHolder,1000);
//        AnimHelper.RotationXCenterACW(viewHolder,1000);
//        AnimHelper.RotationXCenterCW(viewHolder,1000);
    }

    @Override
    public void topEnterAnim(RecyclerView.ViewHolder viewHolder) {
//        AnimHelper.TopInDelayAnim(viewHolder,getContext());
        AnimHelper.LeftSlideInAnim(viewHolder,300);
//        AnimHelper.FadeInAnim(viewHolder);
//        AnimHelper.ScaleOutAnim(viewHolder,300);
//        AnimHelper.RotationXCenter(viewHolder,1000);
//        AnimHelper.RotationXTopACW(viewHolder,1000);
//        AnimHelper.RotationXCenterACW(viewHolder,1000);
//        AnimHelper.RotationXCenterCW(viewHolder,1000);
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

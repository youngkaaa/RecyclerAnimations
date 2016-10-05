# RecyclerAnimations
Recycler's Animations，when items slide in!

 
 你可以继承library中的`BaseRecyclerAdapter`，然后实现所需方法就可以实现上滑下滑加载动画了
 
 就像这样：
 
 ```
public class MainRecyclerAdapter2 extends BaseRecyclerAdapter<String> {
    public MainRecyclerAdapter2(Context context, List<String> list) {
        super(context, list);
    }
    @Override
    public void bottomEnterAnim(RecyclerView.ViewHolder viewHolder) {
        AnimHelper.BottomInDelayAnim(viewHolder,getContext(),300);
    }
    @Override
    public void topEnterAnim(RecyclerView.ViewHolder viewHolder) {
        AnimHelper.BottomInDelayAnim(viewHolder,getContext(),300);
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
 ```
 
你只需要在`bottomEnterAnim()`和`topEnterAnim()`方法中实现你的自定义动画就行。
当然，我还内置了十多种现成的动画供你使用，具体封装在`AnimHelper`类中，你只需要拿来用就行了，适合于快速开发的需要！

下面贴一部分内置的动画效果：

运行图：

![](https://github.com/youngkaaa/RecyclerAnimations/blob/master/app/screens/slidelayout_animation_02.gif)

![](https://github.com/youngkaaa/RecyclerAnimations/blob/master/app/screens/slidelayout_animation_03.gif)

![](https://github.com/youngkaaa/RecyclerAnimations/blob/master/app/screens/slidelayout_animation_04.gif)

![](https://github.com/youngkaaa/RecyclerAnimations/blob/master/app/screens/slidelayout_animation_05.gif)

![](https://github.com/youngkaaa/RecyclerAnimations/blob/master/app/screens/slidelayout_animation_06.gif)

由于我的电脑比较卡，所以动画看起来会有点不流畅，请谅解。

具体使用方法即封装过程可以看我的博客： [戳这里](http://youngkaaa.cn/2016/10/04/2016-10-4%20RecyclerView%20Slide%20Animations)

如果你感觉该仓库或者对应博客对你有用的话就给个`star`以示鼓励吧。谢谢

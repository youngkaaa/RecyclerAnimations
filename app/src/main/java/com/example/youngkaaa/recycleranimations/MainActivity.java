package com.example.youngkaaa.recycleranimations;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.recyclerMain)
    RecyclerView mRecyclerView;
    private List<String> strings;
    //    private MainRecyclerAdapter mRecyclerAdapter;
    private MainRecyclerAdapter2 mRecyclerAdapter2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initWidgets();
    }

    private void initWidgets() {
//        mRecyclerAdapter = new MainRecyclerAdapter(this,getData());
        mRecyclerAdapter2=new MainRecyclerAdapter2(this,getData());
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));
//        mRecyclerView.setAdapter(mRecyclerAdapter);
        mRecyclerView.setAdapter(mRecyclerAdapter2);

        mRecyclerView.addItemDecoration(new MyItemDecoration(this, LinearLayout.VERTICAL));

//        Animation animation = AnimationUtils.loadAnimation(this, R.anim.item_anim);
//        LayoutAnimationController layoutAnimationController = new LayoutAnimationController(animation);
//        layoutAnimationController.setInterpolator(new AccelerateInterpolator());
//        layoutAnimationController.setDelay(0.2f);
//        layoutAnimationController.setOrder(LayoutAnimationController.ORDER_RANDOM);
//
//        mRecyclerView.setLayoutAnimation(layoutAnimationController);

    }

    public List<String> getData() {
        strings=new ArrayList<>();
        for(int i=0;i<50;i++){
            strings.add("youngkaaa"+i);
        }
        return strings;
    }
}
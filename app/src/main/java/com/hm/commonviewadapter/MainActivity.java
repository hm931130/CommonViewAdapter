package com.hm.commonviewadapter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<IMulTypeHelper> mdatas = new ArrayList<>();
    private LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linearLayout = findViewById(R.id.id_linerlayout);
//        mdatas.add(new TestBean("haha", "http://7xi8d6.com1.z0.glb.clouddn.com/20171206084331_wylXWG_misafighting_6_12_2017_8_43_16_390.jpeg"));
//        mdatas.add(new TestBean("呵呵", "http://7xi8d6.com1.z0.glb.clouddn.com/20171201091356_OPqmuO_kanna399_1_12_2017_9_13_42_126.jpeg"));
//        mdatas.add(new TestBean("嘿嘿", "http://7xi8d6.com1.z0.glb.clouddn.com/20171123083218_5mhRLg_sakura.gun_23_11_2017_8_32_9_312.jpeg"));
//        mdatas.add(new TestBean("这是第四条", "http://7xi8d6.com1.z0.glb.clouddn.com/20171126223118_jeCYtY_chayexiaoguo_apple_26_11_2017_22_30_59_409.jpeg"));
//        mdatas.add(new TestBean("five", "http://7xi8d6.com1.z0.glb.clouddn.com/20171201091356_OPqmuO_kanna399_1_12_2017_9_13_42_126.jpeg"));
//        ViewGroupUtils.addViews(linearLayout, new SingleAdapter<TestBean>(this, mdatas, R.layout.layout_item) {
//            @Override
//            public void onBindView(ViewGroup parent, View itemView, TestBean data, int pos) {
//                TextView textView = itemView.findViewById(R.id.id_tv);
//                textView.setText(data.getName());
//                ImageView imageView = itemView.findViewById(R.id.id_iv);
//                Glide.with(MainActivity.this).load(data.getUrl()).into(imageView);
//            }
//        });
//        mdatas.add(new MulTypeBean("haha", "http://7xi8d6.com1.z0.glb.clouddn.com/20171206084331_wylXWG_misafighting_6_12_2017_8_43_16_390.jpeg", true));
//        mdatas.add(new MulTypeBean("呵呵", "http://7xi8d6.com1.z0.glb.clouddn.com/20171201091356_OPqmuO_kanna399_1_12_2017_9_13_42_126.jpeg"));
//        mdatas.add(new MulTypeBean("嘿嘿", "http://7xi8d6.com1.z0.glb.clouddn.com/20171123083218_5mhRLg_sakura.gun_23_11_2017_8_32_9_312.jpeg", true));
//        mdatas.add(new MulTypeBean("这是第四条", "http://7xi8d6.com1.z0.glb.clouddn.com/20171126223118_jeCYtY_chayexiaoguo_apple_26_11_2017_22_30_59_409.jpeg"));
//        mdatas.add(new MulTypeBean("five", "http://7xi8d6.com1.z0.glb.clouddn.com/20171201091356_OPqmuO_kanna399_1_12_2017_9_13_42_126.jpeg", true));
//        ViewGroupUtils.addViews(linearLayout, new MulTypeAdapter<MulTypeBean>(this,mdatas) {
//            @Override
//            public void onBindView(ViewGroup parent, View itemView, MulTypeBean data, int pos) {
//                TextView textView = itemView.findViewById(R.id.id_tv);
//                textView.setText(data.getName());
//                ImageView imageView = itemView.findViewById(R.id.id_iv);
//                Glide.with(MainActivity.this).load(data.getUrl()).into(imageView);
//            }
//        });
        mdatas.add(new TypeBean1("haha", "http://7xi8d6.com1.z0.glb.clouddn.com/20171206084331_wylXWG_misafighting_6_12_2017_8_43_16_390.jpeg"));
        mdatas.add(new TypeBean2("我是第二种类型的1"));
        mdatas.add(new TypeBean1("我我我我...", "http://7xi8d6.com1.z0.glb.clouddn.com/20171123083218_5mhRLg_sakura.gun_23_11_2017_8_32_9_312.jpeg"));
        mdatas.add(new TypeBean2("我是第二种类型的2"));
        ViewGroupUtils.addViews(linearLayout, new MulTypeAdapter(this, mdatas) {
            @Override
            public void onBindView(ViewGroup parent, View itemView, IMulTypeHelper data, int pos) {
                switch (data.getItemLayoutId()) {
                    case R.layout.layout_item:
                        TypeBean1 bean1 = (TypeBean1) data;
                        TextView textView = itemView.findViewById(R.id.id_tv);
                        textView.setText(bean1.getName());
                        ImageView imageView = itemView.findViewById(R.id.id_iv);
                        Glide.with(MainActivity.this).load(bean1.getUrl()).into(imageView);
                        break;
                    case R.layout.layout_itemother:
                        TypeBean2 typeBean2 = (TypeBean2) data;
                        TextView textView2 = itemView.findViewById(R.id.id_tv);
                        textView2.setText(typeBean2.getUrl());
//                        ImageView imageView2 = itemView.findViewById(R.id.id_iv);
//                        Glide.with(MainActivity.this).load(typeBean2.getUrl()).into(imageView2);
                        break;
                }
            }
        });
    }
}

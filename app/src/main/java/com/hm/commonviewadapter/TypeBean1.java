package com.hm.commonviewadapter;

/**
 * Created by ThinkPad on 2017/12/8.
 */

public class TypeBean1 implements IMulTypeHelper {
    private String name;

    private String url;

    public TypeBean1(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public int getItemLayoutId() {
        return R.layout.layout_item;
    }
}

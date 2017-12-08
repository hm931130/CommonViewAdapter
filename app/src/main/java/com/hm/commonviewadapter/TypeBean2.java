package com.hm.commonviewadapter;

/**
 * Created by ThinkPad on 2017/12/8.
 */

public class TypeBean2 implements IMulTypeHelper {
    private String url;

    public TypeBean2(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public int getItemLayoutId() {
        return R.layout.layout_itemother;
    }
}

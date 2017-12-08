package com.hm.commonviewadapter;

/**
 * Created by ThinkPad on 2017/12/8.
 */

public class MulTypeBean implements IMulTypeHelper {

    private String name;
    private String url;
    private boolean isReceive;

    public MulTypeBean(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public MulTypeBean(String name, String url, boolean isReceive) {
        this.name = name;
        this.url = url;
        this.isReceive = isReceive;
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

    public boolean isReceive() {
        return isReceive;
    }

    public void setReceive(boolean receive) {
        isReceive = receive;
    }

    @Override
    public int getItemLayoutId() {
        if (isReceive) {
            return R.layout.layout_item;
        } else {
            return R.layout.layout_itemother;
        }
    }
}

package com.hm.commonviewadapter;

import android.view.View;
import android.view.ViewGroup;

/**
 * Created by ThinkPad on 2017/12/8.
 */

public interface OnItemLongClickListener {
    boolean onItemLongClick(ViewGroup viewGroup, View itemView, int pos);
}

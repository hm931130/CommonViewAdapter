package com.hm.commonviewadapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

/**
 * Created by ThinkPad on 2017/12/8.
 */

public class ViewGroupUtils {


    public static void addViews(final ViewGroup viewGroup,
                                IViewGroupAdapter iViewGroupAdapter,
                                boolean removeViews,
                                final OnItemClickListener onItemClickListener,
                                final OnItemLongClickListener onItemLongClickListener) {

        if (viewGroup == null || iViewGroupAdapter == null) return;
        if (removeViews && viewGroup.getChildCount() > 0) {
            viewGroup.removeAllViews();
        }
        //开始添加子View，通过Adapter获得需要添加的count
        int count = iViewGroupAdapter.getCount();
        for (int i = 0; i < count; i++) {
            //通过Adapter获得itemview
            View itemView = iViewGroupAdapter.getView(viewGroup, i);
            viewGroup.addView(itemView);

            if (null != onItemClickListener && !itemView.isClickable()) {
                final int finalI = i;
                itemView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onItemClickListener.onItemClick(viewGroup, view, finalI);
                    }
                });
            }
            if (null != onItemLongClickListener && !itemView.isLongClickable()) {
                final int finalI = i;
                itemView.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View view) {
                        return onItemLongClickListener.onItemLongClick(viewGroup, view, finalI);
                    }
                });
            }

        }

    }

    public static void addViews(final ViewGroup viewGroup, IViewGroupAdapter adapter) {
        addViews(viewGroup, adapter, true, null, null);
    }

    public static void addViews(final ViewGroup viewGroup, IViewGroupAdapter adapter
            , final OnItemClickListener onItemClickListener) {
        addViews(viewGroup, adapter, true, onItemClickListener, null);
    }

    /**
     * 设置OnItemClickListener
     *
     * @param viewGroup
     * @param onItemClickListener
     */
    public static void setOnItemClickstener(final ViewGroup viewGroup, final OnItemClickListener onItemClickListener) {
        if (viewGroup == null || onItemClickListener == null) return;
        int count = viewGroup.getChildCount();
        for (int i = 0; i < count; i++) {
            View view = viewGroup.getChildAt(i);
            if (null != view && !view.isClickable()) {
                final int finalI = i;
                view.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        onItemClickListener.onItemClick(viewGroup, view, finalI);
                    }
                });
            }
        }

    }

    public static void setOnItemLongClickListener(final ViewGroup viewGroup, final OnItemLongClickListener onItemLongClickListener) {
        if (viewGroup == null || onItemLongClickListener == null) return;
        int count = viewGroup.getChildCount();
        for (int i = 0; i < count; i++) {
            View view = viewGroup.getChildAt(i);
            if (null != view && !view.isLongClickable()) {
                final int finalI = i;
                view.setOnLongClickListener(new View.OnLongClickListener() {
                    @Override
                    public boolean onLongClick(View view) {
                        return onItemLongClickListener.onItemLongClick(viewGroup, view, finalI);
                    }
                });
            }
        }
    }
}

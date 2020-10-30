package com.isseiaoki.simplecropview;

import android.graphics.RectF;

/**
 * <pre>
 *     @author fingdo
 *     @date 2020/10/29
 *     @version 1.0
 *     e-mail : fingdo@qq.com
 *     desc   : xxxx描述
 * </pre>
 */
public interface ChangeFrameListener {
    /**
     * 修改比例，滑动方框等操作会触发监听
     * @param rect
     */
    void change(RectF rect);

    /**
     * 初始化后得到的显示区域
     * @param rect
     */
    void init(RectF rect);
}

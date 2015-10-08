/*
 *    Copyright 2015 Azmeer Raja
 *
 *      Licensed under the Apache License, Version 2.0 (the "License");
 *      you may not use this file except in compliance with the License.
 *      You may obtain a copy of the License at
 *
 *          http://www.apache.org/licenses/LICENSE-2.0
 *
 *      Unless required by applicable law or agreed to in writing, software
 *      distributed under the License is distributed on an "AS IS" BASIS,
 *      WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *      See the License for the specific language governing permissions and
 *      limitations under the License.
 */

package com.raja.suvar;

import android.graphics.Canvas;
import android.view.MotionEvent;
import android.view.View;

/**
 * Created by ugliest on 12/28/14.
 */
public abstract class Screen {

    // recommended to have a screen's constructor accept the main activity, so calls back to
    // game-common things there may be made in the below methods.

    /**
     * Update the screen's state.
     */
    public abstract void update(View v);

    /**
     * draw the screen to the inpassed canvas.
     * @param c
     * @param v
     */
    public abstract void draw(Canvas c, View v);

    /**
     * handle touch event.
     * @param e
     * @return
     */
    public abstract boolean onTouch(MotionEvent e);

    /**
     * returns tru if the inpassed event location is within the inpassed rectangle bounds.
     * @param event
     * @param x
     * @param y
     * @param width
     * @param height
     * @return
     */
    boolean eventInBounds(MotionEvent event, int x, int y, int width, int height) {
        float ex = event.getX();
        float ey = event.getY();
        return (ex > x && ex < x + width - 1 &&
                ey > y && ey < y + height - 1);
    }
}

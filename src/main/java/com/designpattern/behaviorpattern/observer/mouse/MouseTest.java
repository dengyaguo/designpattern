package com.designpattern.behaviorpattern.observer.mouse;


import com.designpattern.behaviorpattern.observer.core.Event;

import java.lang.reflect.Method;

/**
 * Created by Tom on 2018/3/17.
 */
public class MouseTest {

    public static void main(String[] args) {
        try {
            MouseEventCallback callback = new MouseEventCallback();
            Method onClick = MouseEventCallback.class.getMethod("onClick", Event.class);

            //人为的调用鼠标的单击事件
            Mouse mouse = new Mouse();
            mouse.addLisenter(MouseEventType.ON_CLICK, callback,onClick);

            mouse.click();

        }catch (Exception e){
            e.printStackTrace();
        }


    }

}

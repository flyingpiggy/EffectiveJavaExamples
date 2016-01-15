package org.effectivejava.examples.chapter11.item77;

/**
 * Created by linxuan on 1/15/16.
 */

public class Elvis1 {
    public static final Elvis1 INSTANCE = new Elvis1();
    private Elvis1() {
        //...
    }
    public void leaveTheBuilding()
    { //...
    }

    // readResolve for instance control - you can do better!
    private Object readResolve() {
        // Return the one true Elvis and let the garbage collector
        // take care of the Elvis impersonator.
        return INSTANCE;
    }

    
}

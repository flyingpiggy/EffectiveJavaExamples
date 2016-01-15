package org.effectivejava.examples.chapter11.item75;

import java.io.Serializable;

/**
 * Created by linxuan on 1/15/16.
 */
// Awful candidate for default serialized form
public final class StringListAwful implements Serializable {
    private int size = 0;
    private Entry head = null;
    private static class Entry implements Serializable {
        String data;
        Entry next;
        Entry  previous;
    }
    // Remainder omitted
}

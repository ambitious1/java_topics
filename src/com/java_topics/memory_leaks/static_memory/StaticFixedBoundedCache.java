package com.java_topics.memory_leaks.static_memory;

import java.util.ArrayDeque;
import java.util.Deque;

public class StaticFixedBoundedCache {

	private static final int MAX = 1000;
    private static final Deque<byte[]> CACHE = new ArrayDeque<>();

    public static void main(String[] args) {
        for (int i = 0; i < 1_000_000; i++) {
            CACHE.addLast(new byte[64 * 1024]);
            if (CACHE.size() > MAX) CACHE.removeFirst(); // evict oldest
        }
        System.out.println("Cache size: " + CACHE.size());
    }

}

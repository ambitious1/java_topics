package com.java_topics.memory_leaks.static_memory;
import java.util.ArrayList;
import java.util.List;

public class StaticCollectionLeak{
	private static final List<byte[]> CACHE = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < 1_000_000; i++) {
            // Hold on to 64 KB chunks indefinitely
            CACHE.add(new byte[64 * 1024]);
            if (i % 100 == 0) System.out.println("Stored blocks: " + i);
        }
    }
}
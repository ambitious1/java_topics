package com.java_topics.memory_leaks.event_listeners;

import java.util.ArrayList;
import java.util.List;

class Publisher {
	private final List<Runnable> listeners = new ArrayList<>();
    void addListener(Runnable r) { listeners.add(r); }
    void fire() { listeners.forEach(Runnable::run); }
}

public class ListenerLeak {

	private static final Publisher PUB = new Publisher();

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 1_000_000; i++) {
            // Each listener captures 'data' and stays in PUB forever
            byte[] data = new byte[64 * 1024];
            PUB.addListener(() -> System.out.print("")); // holds strong ref to data via closure
            if (i % 10_000 == 0) PUB.fire();
        }
    }

}

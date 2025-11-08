package com.java_topics.memory_leaks.event_listeners;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

class WeakPublisher {
    private final List<WeakReference<Runnable>> listeners = new ArrayList<>();
    void addListener(Runnable r) { listeners.add(new WeakReference<>(r)); }
    void fire() {
        listeners.removeIf(ref -> ref.get() == null);
        for (var ref : listeners) {
            Runnable r = ref.get();
            if (r != null) r.run();
        }
    }
}

public class FixedWeakListeners {

	private static final WeakPublisher PUB = new WeakPublisher();

    public static void main(String[] args) {
        for (int i = 0; i < 100_000; i++) {
            byte[] data = new byte[64 * 1024];
            Runnable l = () -> { /* use data */ };
            PUB.addListener(l);
            // Later: let l go out of scope; GC can reclaim once not referenced elsewhere
            if (i % 10_000 == 0) PUB.fire();
        }
    }
}

package org.thingml.java;

import org.thingml.java.ext.Event;

/**
 * Created by bmori on 25.02.2016.
 */
public class FinalState extends AtomicState {

    public FinalState(String name) {
        super(name);
    }

    @Override
    protected final AtomicState handle(Event e, Port p) {
        return null;
    }
}

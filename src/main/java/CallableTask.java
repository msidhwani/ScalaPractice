package org.javahorizon;

import java.util.concurrent.Callable;

public class CallableTask implements Callable {
    @Override
    public String call() {
        return "Callable task running!";
    }
}

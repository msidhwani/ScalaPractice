package org.javahorizon;

import java.util.Arrays;
import java.util.concurrent.*;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class CompletableFuturesDemo {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Runnable runnable = () -> System.out.println("Runnable");
        Supplier<String> supplier = () ->  {
            return "Supplier";
        };
        CompletableFuture future = CompletableFuture.runAsync(runnable);
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(supplier);
        Stream.of(runnable,supplier).map(
                f -> CompletableFuture.anyOf()

        );
    }
}

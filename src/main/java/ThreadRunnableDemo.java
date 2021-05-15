package org.javahorizon;

import java.util.Arrays;
import java.util.concurrent.*;

public class ThreadRunnableDemo {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<?> runnableFuture = executorService.submit(() -> System.out.println("Runnable"));
        Future<String> callableFuture = executorService.submit((Callable) () -> "Callable Lambda");
        Future<String> callableTask = executorService.submit(new CallableTask());
        Arrays.asList(runnableFuture, callableFuture, callableTask).parallelStream()
                .forEach(
                        f -> {
                                try {
                                    System.out.println(f.get());
                                } catch (Exception e) {
                                    throw new RuntimeException(e);
                                }
                        }
                );

        executorService.shutdown();
        if (!executorService.awaitTermination(1, TimeUnit.MINUTES)) {
            executorService.shutdownNow();
        }

    }
}

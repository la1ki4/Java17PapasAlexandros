package lesson32.hw;

/*
Посчитать сумму от 1 до 1_000_000 используя 10 потоков, так, xтобы каждый поток считал по 100_000 цифр
 */

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        List<Callable<Long>> tasks = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            final int start = i * 100_000 + 1;
            final int end = (i + 1) * 100_000;
            tasks.add(() -> {
                long sum = 0;
                for (int j = start; j <= end; j++) {
                    sum += j;
                }
                return sum;
            });
        }

        try {
            List<Future<Long>> results = executorService.invokeAll(tasks);
            long totalSum = 0;
            for (Future<Long> result : results) {
                totalSum += result.get();
                System.out.println(totalSum);
            }
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executorService.shutdown();
        }
    }
}


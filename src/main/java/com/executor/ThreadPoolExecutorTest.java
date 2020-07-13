package com.executor;

import java.util.concurrent.*;

/**
 * RUNNING:  Accept new tasks and process queued tasks
 * SHUTDOWN: Don't accept new tasks, but process queued tasks
 * STOP:     Don't accept new tasks, don't process queued tasks,
 * and interrupt in-progress tasks
 * TIDYING:  All tasks have terminated, workerCount is zero,
 * the thread transitioning to state TIDYING
 * will run the terminated() hook method
 * TERMINATED: terminated() has completed
 *
 *
 * @Author 布衣神相
 * 线程池
 */
public class ThreadPoolExecutorTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ThreadPoolExecutor executor = new ThreadPoolExecutor(4, 4,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>());
        Future<String> submit = executor.submit(() -> "game over");
        executor.execute(() -> System.out.println("game over"));
        submit.get();

        long l = System.currentTimeMillis();
        Thread.sleep(1000);
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);

    }









}

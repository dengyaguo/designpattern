package com.executor;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.apache.commons.lang3.time.StopWatch;

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
 * //ctl贯穿了整个线程池
 * private final AtomicInteger ctl = new AtomicInteger(ctlOf(RUNNING, 0));
 *     private static int runStateOf(int c)     { return c & ~CAPACITY; }
 *     private static int workerCountOf(int c)  { return c & CAPACITY; }
 *     private static int ctlOf(int rs, int wc) { return rs | wc; }
 *     private static final int COUNT_BITS = Integer.SIZE - 3;//29
 *     //将 1 的二进制向左位移29位,再减 1 表示最大线程容量00011111111111111111111111111111
 *     private static final int CAPACITY   = (1 << COUNT_BITS) - 1;
 *
 *     //接受新任务并执行队列中的任务     11100000000000000000000000000000
 *     private static final int RUNNING    = -1 << COUNT_BITS;
 *     //不接受新任务，执行队列中的任务    00000000000000000000000000000000
 *     private static final int SHUTDOWN   =  0 << COUNT_BITS;
 *     //不接收新任务,不执行队列中的任务,中断正在执行中的任务  00100000000000000000000000000000
 *     private static final int STOP       =  1 << COUNT_BITS;
 *     //所有的任务都已结束，线程数量为0，处于改状态的线程池即将调用terminated（）方法
 *     // 01000000000000000000000000000000
 *     private static final int TIDYING    =  2 << COUNT_BITS;
 *     //terminated()方法执行完成
 *     // 01100000000000000000000000000000
 *     private static final int TERMINATED =  3 << COUNT_BITS;
 *
 * //RUNNING  -1左移29位
 * //-1的二级制表示？ 负数的二进制 是正数的反码再+1（即补码）
 * // 1的二进制      00000000000000000000000000000001
 * // 反码          11111111111111111111111111111110
 * //-1的二进制      11111111111111111111111111111111
 * //左移29位        11100000000000000000000000000000
 * //ctl  二进制的值 | 0 得到的结果仍然是 11100000000000000000000000000000
 *
 *
 * @Author buyi
 * 线程池
 */
public class ThreadPoolExecutorTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //无核心线程，最大线程Integer.MAX_VALUE，60s回收，队列用的是SynchronousQueue
        ExecutorService cachedExecutorService = Executors.newCachedThreadPool();
        //核心线程等于最大线程 没有超时回收，队列用的是LinkedBlockingQueue
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        //核心线程等于最大线程 没有超时回收，队列用的是LinkedBlockingQueue
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(4);
        //延迟队列 DelayedWorkQueue  ，核心线程指定，最大线程Integer.MAX_VALUE
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        ScheduledThreadPoolExecutor stps = new ScheduledThreadPoolExecutor(1);
        scheduledExecutorService.schedule(new Thread(),1,TimeUnit.SECONDS);
        //Java8  线程池
        ExecutorService executorService = Executors.newWorkStealingPool();


        ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 4,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>(2), new ThreadFactoryBuilder()
                .setNameFormat("测试-thread-%d")
                .setDaemon(true)
                .build());
       // Future<String> submit = executor.submit(() -> "game over");
        executor.execute(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("game over");});
        executor.execute(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("game over");});
        executor.execute(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("game over");});
        executor.execute(() -> {
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("game over");});
        while (true){
            int largestPoolSize = executor.getLargestPoolSize();
            int activeCount = executor.getActiveCount();
            int poolSize = executor.getPoolSize();
            System.out.println("largestPoolSize："+largestPoolSize+"   poolSize："+poolSize+"   activeCount："+activeCount);
            if (activeCount > 1){
                System.out.println("超过core thread");
            }else if(activeCount == 0){
                System.out.println("等于0");
            }else {
                System.out.println("等于core thread");
            }
        }
        //submit.get();
    }









}

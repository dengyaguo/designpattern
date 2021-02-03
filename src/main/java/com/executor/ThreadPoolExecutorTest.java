package com.executor;

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
        ExecutorService cachedExecutorService = Executors.newCachedThreadPool();
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(4);
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        //ScheduledThreadPoolExecutor scheduledExecutorService = new ScheduledThreadPoolExecutor(1);
        scheduledExecutorService.schedule(new Thread(),1,TimeUnit.SECONDS);

        ThreadPoolExecutor executor = new ThreadPoolExecutor(4, 4,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>());
        Future<String> submit = executor.submit(() -> "game over");
        executor.execute(() -> System.out.println("game over"));
        submit.get();
    }









}

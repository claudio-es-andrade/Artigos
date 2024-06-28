import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

import static java.util.concurrent.ForkJoinTask.invokeAll;

public class ParallelismExample {
    private static final int SMALL_TASK_THRESHOLD = 100;

    public static void main(String[] args) {
        // Create a fork-join pool with 4 worker threads
        ForkJoinPool pool = new ForkJoinPool(4);

        // Divide the task into smaller subtasks and execute them in parallel
        MyRecursiveTask task = new MyRecursiveTask();
        int result = pool.invoke(task);

        System.out.println("Final result: " + result);
    }
    static class MyRecursiveTask extends RecursiveTask<Integer> {

        @Override
        protected Integer compute() {
            if (calculateSmallTask() <= SMALL_TASK_THRESHOLD) {
                // Task is small enough, execute it directly
                return calculateSmallTask();
            } else {
                // Task is too large, divide it into smaller subtasks
                MyRecursiveTask[] tasks = new MyRecursiveTask[4];
                for (int i = 0; i < 4; i++) {
                    tasks[i] = new MyRecursiveTask();
                }
                invokeAll(tasks);
                return combineResults(tasks);
            }
        }
    }
//    private int calculateSmallTask() {
//        // Simulate some small computation
//        return 10;
//    }

    private static int combineResults(MyRecursiveTask[] tasks) {
        // Combine the results from all subtasks
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result += tasks[i].join();
        }
        return result;
    }

    static int calculateSmallTask() {
        // Simulate some small computation
        return (int) (Math.random() * 100);
    }

}

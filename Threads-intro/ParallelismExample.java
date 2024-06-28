import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class ParallelismExample {
    public static void main(String[] args) {
        // Create a fork-join pool with 4 worker threads
        ForkJoinPool pool = new ForkJoinPool(4);

        // Divide the task into smaller subtasks and execute them in parallel
        MyRecursiveTask task = new MyRecursiveTask();
        pool.invoke(task);
    }

    static class MyRecursiveTask extends RecursiveTask<Integer> {
        @Override
        protected Integer compute() {
            if (/* small enough */) {
                return calculateSmallTask();
            } else {
                // Divide the task into smaller subtasks and execute them in parallel
                MyRecursiveTask[] tasks = new MyRecursiveTask[4];
                for (int i = 0; i < 4; i++) {
                    tasks[i] = new MyRecursiveTask();
                }
                invokeAll(tasks);
                return combineResults(tasks);
            }
        }

        private int calculateSmallTask() {
            // Simulate some small computation
            return 10;
        }

        private int combineResults(MyRecursiveTask[] tasks) {
            // Combine the results from all subtasks
            int result = 0;
            for (int i = 0; i < 4; i++) {
                result += tasks[i].join();
            }
            return result;
        }
    }
}

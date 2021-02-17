// we can achieve thread pool in java using Interface ExecutorService

// how to create a thread pool

// this return executors with single thread often we dont use much
/*  Executors.newSingleThreadExecutor */

// it will create a thread pool with a no of given threads
// so below we are giving 2 threads
/* Executors.newFixedThreadPool(2) */

class Main {
    public static void main(String[] args) {
        var executor = Executors.newFixedThreadPool(2);
        try {
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
            });
        } finally {
            // it shutdown the task but after the completion of task
            // if we dont use this than our code will not stop because thread will wait for
            // another task whether the task has already completed.
            executor.shutdown();
        }

    }
}
class DownloadFileTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Downloading a task.. " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Download Complete " + Thread.currentThread().getName());
    }
}

class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();
        try {
            // because of join it waits for the completion of the thread
            // join tells the current thread to wait for the completion of another thread
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("This line will excute after the completion of thread bcoz of thread.join() method");
    }
}
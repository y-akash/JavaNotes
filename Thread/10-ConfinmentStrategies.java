import java.util.ArrayList;
import java.util.List;

class DownloadStatus {
    private int totalBytes;

    public int getTotalBytes() {
        return totalBytes;
    }

    public void incrementTotalBytes() {
        totalBytes++;
    }
}

class DownloadFileTask implements Runnable {
    private DownloadStatus status;

    public DownloadFileTask() {
        this.status = new DownloadStatus();
    }

    @Override
    public void run() {
        System.out.println("Downloading a task.. " + Thread.currentThread().getName());
        for (var i = 0; i < 10_000; i++) {
            status.incrementTotalBytes();
        }
    }

    // getter method
    public DownloadStatus getStatus() {
        return status;
    }
}

class Main {
    public static void main(String[] args) {

        List<Thread> threads = new ArrayList<>();
        List<DownloadFileTask> tasks = new ArrayList<>();

        for (var i = 0; i < 10; i++) {
            var task = new DownloadFileTask();
            tasks.add(task);
            Thread thread = new Thread(task);
            thread.start();
            threads.add(thread);
        }

        for (var thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        var totalBytes = tasks.stream().map(t -> t.getStatus().getTotalBytes()).reduce(Integer::sum);
        // here we restrict the each thread to have its own data.
        // means each threda have its own status after completion of each thread we add
        // all the status of the thread
        System.out.print(totalBytes);

    }
}
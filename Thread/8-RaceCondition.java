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

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a task.. " + Thread.currentThread().getName());
        for (var i = 0; i < 10_000; i++) {
            status.incrementTotalBytes();
        }
    }
}

class Main {
    public static void main(String[] args) {
        DownloadStatus status = new DownloadStatus();
        List<Thread> threads = new ArrayList<>();

        for (var i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask(status));
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
        // at the end we are printing totalBytes
        // ideally it should give 100000 but thread is incrementing the value
        // simultaneously so what happen first thread get the value 3 and second thread
        // also get the 3 value in the memory
        // so after incrmentig of both thread we get 4 instead of 5 because
        // here we are modifying the data at same time
        // so here we are getting the race condition
        // so we use some sratagies to overcome such type of problem
        System.out.print(status.getTotalBytes());

    }
}
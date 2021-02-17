class DownloadFileTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Downloading a task.. " + Thread.currentThread().getName());
        try {
            // here we are trying to pause the thread
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
        // all the 10 thread start simultansly and wait for 5 second and after
        // that it print "Download Complete". so here it will take only 5 seconds to
        // comlete bcoz of multithreading
        // if we used single thread than it will take 50 second for completion which
        // means each take 5 second.
        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(new DownloadFileTask());
            thread.start();
        }
    }
}
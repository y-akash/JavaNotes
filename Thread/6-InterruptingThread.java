class DownloadFileTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Downloading a task.. " + Thread.currentThread().getName());
        for (var i = 0; i < Integer.MAX_VALUE; i++) {
            if (Thread.currentThread().isInterrupted())
                return;
            System.out.println("Downloading byte " + i);
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
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // if we want to interrupt in between to run the thread than we can use
        // interrupt() method
        // it sends a request to interrupt the thread if we dont check the request than
        // it's no use
        // and it will unable to interrupt the thread
        // so in DownloadFileTask , inside for loop we check the interrupt request when
        // we send the request it will listen that
        // than we explicitly return from the method to end the thread
        thread.interrupt();

        System.out.println("This line will excute after the completion of thread bcoz of thread.join() method");
    }
}
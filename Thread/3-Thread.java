class DownloadFileTask implements Runnable {
    @Override
    public void run() {
        System.out.println("Downloading a task.. " + Thread.currentThread().getName());
    }
}

class Main {
    public static void main(String[] args) {
        // this will print the thread name which this method is running on
        System.out.println(Thread.currentThread().getName());

        // The constructor of Tread class is overloaded and
        // one of the constructor takes an Runnable object
        // so here we are using that constructor so that
        // we have to pass an object of class which implements Runnable interface
        Thread thread = new Thread(new DownloadFileTask());
        thread.start();
    }
}
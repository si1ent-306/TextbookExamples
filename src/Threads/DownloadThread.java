package Threads;

public class DownloadThread implements Runnable {

    private String url;

    public DownloadThread(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        // Download logic for the specified url
        System.out.println("Downloading file from: " + url);
        // Simulate download time
        try {
            Thread.sleep(3000); // Simulate 3 seconds of download time
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Download complete!");
    }

    public static void main(String[] args) {
        // Create a thread for downloading
        Thread downloadThread = new Thread(new DownloadThread("https://example.com/file.zip"));

        // Start the download thread
        downloadThread.start();

        // Main thread can continue doing other tasks
        System.out.println("Main thread still running!");
    }
}

public class DownloadInfo {
    private String title;
    private int timesDownloaded;

    /**
     * Creates a new instance with the given unique title and sets the
     * number of times downloaded to 1.
     * 
     * @param title the unique title of the downloaded song
     */
    public DownloadInfo(String title) {
        this.title = title;
        this.timesDownloaded = 1;
    }

    /** @return the title */
    public String getTitle() {
        return this.title;
    }

    public int getTimesDownloaded() {
        return this.timesDownloaded;
    }

    /** Increment the number times downloaded by 1 */
    public void incrementTimesDownloaded() {
        this.timesDownloaded++;
    }

    // There may be instance variables, constructors, and methods that are not
    // shown.
}

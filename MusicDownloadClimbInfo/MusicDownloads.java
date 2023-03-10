import java.util.List;
import java.util.ArrayList;

public class MusicDownloads {
    /**
     * The list of downloaded information.
     * Guaranteed not to be null and not to contain duplicate titles.
     */
    private List<DownloadInfo> downloadList;

    /** Creates the list of downloaded information. */
    public MusicDownloads() {
        downloadList = new ArrayList<DownloadInfo>();
    }

    /**
     * Returns a reference to the DownloadInfo object with the requested title if it
     * exists.
     * 
     * @param title the requested title
     * @return a reference to the DownloadInfo object with the
     *         title that matches the parameter title if it exists in the list;
     *         null otherwise.
     *         Postcondition:
     *         - no changes were made to downloadList.
     */
    public DownloadInfo getDownloadInfo(String title) {
        for (DownloadInfo info : this.downloadList) {
            if (info.getTitle().equals(title))
                return info;
        }
        return null;
    }

    public void updateDownloads(List<String> titles) {
        for (String t : titles) {
            DownloadInfo findRes = this.getDownloadInfo(t);
            if (findRes != null) {
                findRes.incrementTimesDownloaded();
            } else {
                this.downloadList.add(new DownloadInfo(t));
            }
        }
    }

    // There may be instance variables, constructors, and methods that are not
    // shown.
}
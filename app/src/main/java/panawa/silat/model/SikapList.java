package panawa.silat.model;

/**
 * Created by hanifsugiyanto on 3/5/16.
 */
public class SikapList {
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    private String title;

//    public SikapList(){
//
//    }

    public SikapList(String title, String content) {
        this.title = title;
        this.content = content;
    }

}

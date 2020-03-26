package space.kroha.toolsshop;

public class Drill {

    private String title;
    private String info;
    private int imageResoursesId;

    public Drill(String title, String info, int imageResoursesId) {
        this.title = title;
        this.info = info;
        this.imageResoursesId = imageResoursesId;
    }

    public String getTitile() {
        return title;
    }

    public String getInfo() {
        return info;
    }

    public int getImageResoursesId() {
        return imageResoursesId;
    }

    @Override
    public String toString() {
        return title;
    }
}

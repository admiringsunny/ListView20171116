package com.ramson.mobilesmachines.listview20171116;

public class MyClass {

    private int imageID;
    private String heading;
    private String content;

    public MyClass() {

    }

    public MyClass(int imageID, String heading, String content) {
        this.imageID = imageID;
        this.heading = heading;
        this.content = content;
    }

    public int getImageID() {
        return imageID;
    }

    public void setImageID(int imageID) {
        this.imageID = imageID;
    }

    public String getHeading() {
        return heading;
    }

    public void setHeading(String heading) {
        this.heading = heading;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

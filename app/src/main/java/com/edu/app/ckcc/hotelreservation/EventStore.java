package com.edu.app.ckcc.hotelreservation;

/**
 * Created by se7en on 4/27/18.
 */

public class EventStore  {

    //depend on event....what do you want to show?
    private String title;
    private String date;
    private String location;
    private String description;
    private String image;

    public EventStore(String title, String date, String location, String description, String image) {
        this.title = title;
        this.date = date;
        this.location = location;
        this.description = description;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

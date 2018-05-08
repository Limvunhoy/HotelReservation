package com.edu.app.ckcc.hotelreservation;

/**
 * Created by se7en on 4/12/18.
 */

public class Todo  {
    private String name;
    private String desc;

    public Todo(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }


    public String getName(){return name;}
    public String getDesc(){return desc;}

}


package com.enesb.simpsonbook;

import java.io.Serializable;

public class Simpson implements Serializable {

    private String name;
    private String job;
    private int pictureId; // Bitmap olarak atarken android studio nun otomatik id verdigini gördük. O id ile tanimlayacagiz

    public Simpson(String name, String job, int pictureId) {
        this.name = name;
        this.job = job;
        this.pictureId = pictureId;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public int getPictureId() {
        return pictureId;
    }
}

package com.example.elprofeadonis.recyclertrimestre;

public class TrimestreSetimo {
    String yokoName;
    int images;

    public TrimestreSetimo(String yokoName, int images) {
        this.yokoName = yokoName;
        this.images = images;
    }


    public String getYokoName() {
        return yokoName;
    }

    public void setYokoName(String yokoName) {
        this.yokoName = yokoName;
    }


    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }
}

package com.example.elprofeadonis.recyclerMenu;

public class MenuclaseModel {
    String aminoAcidName;
    int image;

    public MenuclaseModel(String aminoAcidName, int image) {
        this.aminoAcidName = aminoAcidName;
        this.image = image;
    }

    public String getAminoAcidName() {
        return aminoAcidName;
    }

    public void setAminoAcidName(String aminoAcidName) {
        this.aminoAcidName = aminoAcidName;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}

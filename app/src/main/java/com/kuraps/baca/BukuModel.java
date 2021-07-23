package com.kuraps.baca;

public class BukuModel {
    int cover,favorites;
    String judul;

    public int getImageCover() {
        return cover;
    }

    public void setImageCover(int cover) {
        this.cover = cover;
    }
    public int getImageFav() {
        return favorites;
    }

    public void setImageFav(int favorites) {
        this.favorites = favorites;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
}
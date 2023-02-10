package ru.netology.postermanager;

public class MoviesProperties {
    private int id;
    private String movieName;
    private String genre;
    private String imageUrl;

    public void setId(int id) {
        this.id = id;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getId() {
        return id;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getGenre() {
        return genre;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public MoviesProperties(int id, String movieName, String genre, String imageUrl) {
        this.id = id;
        this.movieName = movieName;
        this.genre = genre;
        this.imageUrl = imageUrl;
    }
}

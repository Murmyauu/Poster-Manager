package ru.netology.postermanager;

public class PosterManager {
    private MoviesProperties[] posters = new MoviesProperties[0];
    private int limit;

    public PosterManager(int maxLimit) {
        if (maxLimit > 0) {
            limit = maxLimit;
        } else {
            limit = 10;
        }
    }

    public PosterManager() {
        limit = 10;
    }

    public void addMovie(MoviesProperties poster) {
        MoviesProperties[] tmp = new MoviesProperties[posters.length + 1];
        for (int i = 0; i < posters.length; i++) {
            tmp[i] = posters[i];
        }
        tmp[tmp.length - 1] = poster;
        posters = tmp;
    }

    public MoviesProperties[] findAll() {
        return posters;
    }

    public MoviesProperties[] findLast() {
        int resultLength;
        if (posters.length < limit) {
            resultLength = posters.length;
        } else {
            resultLength = limit;
        }
        MoviesProperties[] result = new MoviesProperties[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = posters[posters.length - 1 - i];
        }
        return result;
    }
}

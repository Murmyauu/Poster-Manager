import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.postermanager.MoviesProperties;
import ru.netology.postermanager.PosterManager;

public class PosterManagerMethodTest {

    MoviesProperties movie1 = new MoviesProperties(1, "Бладшот", "боевик", "ссылка");
    MoviesProperties movie2 = new MoviesProperties(2, "Вперед", "мультфильм", "ссылка");
    MoviesProperties movie3 = new MoviesProperties(3, "Отель <Белград>", "комедия", "ссылка");
    MoviesProperties movie4 = new MoviesProperties(4, "Джентльмены", "боевик", "ссылка");
    MoviesProperties movie5 = new MoviesProperties(5, "Человек-вемидимка", "ужасы", "ссылка");
    MoviesProperties movie6 = new MoviesProperties(6, "Тролли. Мировой тур", "мультфильм", "ссылка");
    MoviesProperties movie7 = new MoviesProperties(7, "Номер один", "комедия", "ссылка");
    MoviesProperties movie8 = new MoviesProperties(8, "Аватар", "фэнтези", "ссылка");
    MoviesProperties movie9 = new MoviesProperties(9, "Аватар: Путь воды", "фэнтези", "ссылка");
    MoviesProperties movie10 = new MoviesProperties(10, "Дюна", "фэнтези", "ссылка");
    MoviesProperties movie11 = new MoviesProperties(11, "Пиджак", "драма", "ссылка");
    MoviesProperties movie12 = new MoviesProperties(12, "Лобстер", "драма", "ссылка");

    @Test
    public void shouldReturnMoviesReverseWhenLimit5() {
        PosterManager poster = new PosterManager(5);

        poster.addMovie(movie1);
        poster.addMovie(movie2);
        poster.addMovie(movie3);
        poster.addMovie(movie4);
        poster.addMovie(movie5);
        poster.addMovie(movie6);
        poster.addMovie(movie7);
        poster.addMovie(movie8);
        poster.addMovie(movie9);
        poster.addMovie(movie10);
        poster.addMovie(movie11);
        poster.addMovie(movie12);

        MoviesProperties[] expected = {movie12, movie11, movie10, movie9, movie8};
        MoviesProperties[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnMoviesReverseWhenLimit5But4Movies() {
        PosterManager poster = new PosterManager(5);

        poster.addMovie(movie9);
        poster.addMovie(movie10);
        poster.addMovie(movie11);
        poster.addMovie(movie12);

        MoviesProperties[] expected = {movie12, movie11, movie10, movie9};
        MoviesProperties[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnMoviesReverseWhenMinus() {
        PosterManager poster = new PosterManager(-1);

        poster.addMovie(movie1);
        poster.addMovie(movie2);
        poster.addMovie(movie3);
        poster.addMovie(movie4);
        poster.addMovie(movie5);
        poster.addMovie(movie6);
        poster.addMovie(movie7);
        poster.addMovie(movie8);
        poster.addMovie(movie9);
        poster.addMovie(movie10);
        poster.addMovie(movie11);
        poster.addMovie(movie12);

        MoviesProperties[] expected = {movie12, movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3};
        MoviesProperties[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnMoviesReverseWhen0Movies() {
        PosterManager poster = new PosterManager();
        MoviesProperties[] expected = {};
        MoviesProperties[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnMoviesReverseWhen1Movie() {
        PosterManager poster = new PosterManager();

        poster.addMovie(movie12);

        MoviesProperties[] expected = {movie12};
        MoviesProperties[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnMoviesReverseWhen9Movies() {
        PosterManager poster = new PosterManager();

        poster.addMovie(movie4);
        poster.addMovie(movie5);
        poster.addMovie(movie6);
        poster.addMovie(movie7);
        poster.addMovie(movie8);
        poster.addMovie(movie9);
        poster.addMovie(movie10);
        poster.addMovie(movie11);
        poster.addMovie(movie12);

        MoviesProperties[] expected = {movie12, movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4};
        MoviesProperties[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldReturnMoviesReverseWhen10Movies() {
        PosterManager poster = new PosterManager();

        poster.addMovie(movie3);
        poster.addMovie(movie4);
        poster.addMovie(movie5);
        poster.addMovie(movie6);
        poster.addMovie(movie7);
        poster.addMovie(movie8);
        poster.addMovie(movie9);
        poster.addMovie(movie10);
        poster.addMovie(movie11);
        poster.addMovie(movie12);

        MoviesProperties[] expected = {movie12, movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3};
        MoviesProperties[] actual = poster.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}


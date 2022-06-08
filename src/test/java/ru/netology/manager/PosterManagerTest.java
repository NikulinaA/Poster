package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class PosterManagerTest {

    PosterItem first = new PosterItem(1, 252, "Бладшот", "боевик", false);
    PosterItem second = new PosterItem(2, 47, "Вперед", "мультфильм", false);
    PosterItem third = new PosterItem(3, 89999, "Тролли. Мировой тур", "мультфилим", true);
    PosterItem fourth = new PosterItem(4, 2052, "Джентельменты", "боевик", false);
    PosterItem fifth = new PosterItem(5, 470, "Шрек", "мультфильм", false);
    PosterItem sixth = new PosterItem(6, 899, "Вверх", "мультфилим", true);
    PosterItem seventh = new PosterItem(7, 22, "Блайд", "боевик", false);
    PosterItem eighth = new PosterItem(8, 447, "Евротур", "комедия", false);
    PosterItem ninth = new PosterItem(9, 8499, "Власть", "драма", true);
    PosterItem tenth = new PosterItem(10, 52, "Гнев", "боевик", false);
    PosterItem eleventh = new PosterItem(11, 407, "Семейка Крудс", "мультфильм", false);



    @Test

    public void AddFindAllNoCountPoster() {
        PosterManager add = new PosterManager();

        add.save(first);
        add.save(second);
        add.save(third);
        add.save(fourth);
        add.save(fifth);
        add.save(sixth);
        add.save(seventh);
        add.save(eighth);
        add.save(ninth);
        add.save(tenth);
        add.save(eleventh);

        PosterItem[] actual = add.findAll();
        PosterItem[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test

    public void AddFindAllMaxCountPoster() {
        PosterManager add = new PosterManager(18);

        add.save(first);
        add.save(second);
        add.save(third);
        add.save(fourth);
        add.save(fifth);
        add.save(sixth);
        add.save(seventh);
        add.save(eighth);
        add.save(ninth);
        add.save(tenth);
        add.save(eleventh);

        PosterItem[] actual = add.findAll();
        PosterItem[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test

    public void AddFindAllPoster() {
        PosterManager add = new PosterManager(11);

        add.save(first);
        add.save(second);
        add.save(third);
        add.save(fourth);
        add.save(fifth);
        add.save(sixth);
        add.save(seventh);
        add.save(eighth);
        add.save(ninth);
        add.save(tenth);
        add.save(eleventh);

        PosterItem[] actual = add.findAll();
        PosterItem[] expected = {first, second, third, fourth, fifth, sixth, seventh, eighth, ninth, tenth, eleventh};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test

    public void AddFindAllCountPoster() {
        PosterManager add = new PosterManager(5);

        add.save(first);
        add.save(second);
        add.save(third);
        add.save(fourth);
        add.save(fifth);
        add.save(sixth);
        add.save(seventh);
        add.save(eighth);
        add.save(ninth);
        add.save(tenth);
        add.save(eleventh);


        PosterItem[] actual = add.findAll();
        PosterItem[] expected = {first, second, third, fourth, fifth};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void AddLastNoCountPoster() {
        PosterManager add = new PosterManager();

        add.save(first);
        add.save(second);
        add.save(third);
        add.save(fourth);
        add.save(fifth);
        add.save(sixth);
        add.save(seventh);
        add.save(eighth);
        add.save(ninth);
        add.save(tenth);
        add.save(eleventh);


        PosterItem[] actual = add.findLast();
        PosterItem[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void AddLastCountPoster() {
        PosterManager add = new PosterManager(7);

        add.save(first);
        add.save(second);
        add.save(third);
        add.save(fourth);
        add.save(fifth);
        add.save(sixth);
        add.save(seventh);
        add.save(eighth);
        add.save(ninth);
        add.save(tenth);
        add.save(eleventh);


        PosterItem[] actual = add.findLast();
        PosterItem[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test

    public void AddLastPoster() {
        PosterManager add = new PosterManager(11);

        add.save(first);
        add.save(second);
        add.save(third);
        add.save(fourth);
        add.save(fifth);
        add.save(sixth);
        add.save(seventh);
        add.save(eighth);
        add.save(ninth);
        add.save(tenth);
        add.save(eleventh);


        PosterItem[] actual = add.findLast();
        PosterItem[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test

    public void AddLastMaxCountPoster() {
        PosterManager add = new PosterManager(589);

        add.save(first);
        add.save(second);
        add.save(third);
        add.save(fourth);
        add.save(fifth);
        add.save(sixth);
        add.save(seventh);
        add.save(eighth);
        add.save(ninth);
        add.save(tenth);
        add.save(eleventh);


        PosterItem[] actual = add.findLast();
        PosterItem[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }
}

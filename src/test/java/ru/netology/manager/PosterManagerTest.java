package ru.netology.manager;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterItem;
import ru.netology.repository.PosterRepository;


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

    public void AddNoCountPoster() {
        PosterManager add = new PosterManager(new PosterRepository());

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

    public void AddCountPoster() {
        PosterManager add = new PosterManager(new PosterRepository(), 5);
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

    public void GetCountPoster() {
        PosterManager add = new PosterManager(new PosterRepository(), 5);
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

        PosterItem[] actual = add.getAll();
        PosterItem[] expected = {eleventh, tenth, ninth, eighth, seventh};

        Assertions.assertArrayEquals(expected, actual);

    }

    @Test

    public void GetNoCountPoster() {
        PosterManager add = new PosterManager(new PosterRepository());
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

        PosterItem[] actual = add.getAll();
        PosterItem[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test

    public void FindByPoster() {
        PosterManager add = new PosterManager(new PosterRepository(5));
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

        PosterItem[] actual = add.findById();
        PosterItem[] expected = {fifth};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test

    public void RemoveIdNoCountPoster() {
        PosterManager add = new PosterManager(new PosterRepository(7));
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

        PosterItem[] actual = add.removeById();
        PosterItem[] expected = {first, second, third, fourth, fifth, sixth, eighth, ninth, tenth, eleventh};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void RemoveAllNoCountPoster() {
        PosterManager add = new PosterManager(new PosterRepository());
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

        PosterItem[] actual = add.removeAll();
        PosterItem[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    }

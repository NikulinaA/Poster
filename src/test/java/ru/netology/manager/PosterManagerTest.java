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
    private PosterManager manager;


    @Test

    public void AddLastNoCountPoster() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);





        PosterItem[] actual = manager.getAll();
        PosterItem[] expected = {eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third, second, first};

        Assertions.assertArrayEquals(expected, actual);
    }



}

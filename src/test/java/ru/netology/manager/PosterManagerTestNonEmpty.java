package ru.netology.manager;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

public class PosterManagerTestNonEmpty {

    private PosterRepository repository = Mockito.mock(PosterRepository.class);
    private PosterManager manager = new PosterManager(repository);
    private PosterItem first = new PosterItem(1, 252, "Бладшот", "боевик", false);
    private PosterItem second = new PosterItem(2, 47, "Вперед", "мультфильм", false);
    private PosterItem third = new PosterItem(3, 89999, "Тролли. Мировой тур", "мультфилим", true);

    @BeforeAll
    public void start() {
        System.out.println("Hello");
    }
    @Test

    public void findAll () {
        PosterItem[] returned = {first, second, third};
        doReturn(returned).when(repository).findAll();

        PosterItem[] expected = {third, second, first};
        PosterItem[] actual = manager.getAll();


        verify(repository).findAll();
    }


}

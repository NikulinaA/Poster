package ru.netology.manager;


import ru.netology.domain.PosterItem;
import ru.netology.repository.PosterRepository;

public class PosterManager {

    private PosterRepository repository;
    private int posterCount = 10;


    public PosterManager(PosterRepository repository) {
        this.repository = repository;

    }

    public PosterManager(PosterRepository repository, int posterCount) {
        this.repository = repository;
        this.posterCount = posterCount;
    }

    public void save(PosterItem item) {
        repository.save(item);
    }


    public PosterItem[] findAll() {

        PosterItem[] items = repository.findAll();

        if (items.length > posterCount) {
            PosterItem[] film = new PosterItem[posterCount];
            System.arraycopy(items, 0, film, 0, posterCount);
            items = film;
        }

        return items;
    }



    public PosterItem[] getAll() {
        PosterItem[] items = repository.findAll();
        PosterItem[] result = new PosterItem[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        if (result.length > posterCount) {
            PosterItem[] film = new PosterItem[posterCount];
            System.arraycopy(result, 0, film, 0, posterCount);
            result = film;
        }
        return result;
    }

    public PosterItem[] findById() {
        PosterItem[] items = repository.findById();


        return items;
    }

    public PosterItem[] removeById() {
        PosterItem[] items = repository.removeById();

            return items;}

    public PosterItem[] removeAll() {
        PosterItem[] items = repository.removeAll();

        return items;}


}
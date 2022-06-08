package ru.netology.manager;

public class PosterManager {

    private PosterRepository repository;


    public PosterManager(PosterRepository repository) {
        this.repository = repository;
    }



    public void findAll() {
        repository.findAll();
    }

    public void add(PosterItem item) {
        repository.save(item);
    }

    public PosterItem[] getAll() {
        PosterItem[] items = repository.findAll();
        PosterItem[] result = new PosterItem[items.length];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
    public void findById() {
        repository.findById();
    }

    public void removeById(int id) {
        repository.removeById();
    }

    public void removeAll() {
        repository.removeAll();
    }
}
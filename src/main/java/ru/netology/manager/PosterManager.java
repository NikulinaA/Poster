package ru.netology.manager;

public class PosterManager {
    private int posterCount = 10;
    private PosterItem[] items = new PosterItem[0];

    public PosterManager(int posterCount) {
        this.posterCount = posterCount;
    }

    public PosterManager() {
    }

    public void save(PosterItem item) {
        int length = items.length + 1;
        PosterItem[] tmp = new PosterItem[length];

        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }
    public PosterItem[] findAll() {
        if (items.length > posterCount) {
            PosterItem[] film = new PosterItem[posterCount];
            System.arraycopy(items, 0, film, 0, posterCount);
            items = film;
        }
        return items;
    }

    public PosterItem[] findLast() {
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

}
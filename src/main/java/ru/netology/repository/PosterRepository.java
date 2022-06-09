package ru.netology.repository;

import ru.netology.domain.PosterItem;

public class PosterRepository {


    private PosterItem[] items = new PosterItem[0];
    private int id;

    public PosterRepository(int id) {
        this.id = id;
    }

    public PosterRepository() {
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

              return items;
    }
    public PosterItem[] findById() {
        int length = items.length - 1;
        PosterItem[] tmp = new PosterItem[length];
        int index = 0;
        for (PosterItem item : items) {
            if (item.getId() == id) {
                tmp[index] = item;
                index++;
            }
        }
        PosterItem[] ind = new PosterItem[index];
        System.arraycopy(tmp, 0, ind, 0, ind.length);

        return ind;
    }

        public PosterItem[] removeById () {
            int length = items.length - 1;
            PosterItem[] tmp = new PosterItem[length];
            int index = 0;
            for (PosterItem item : items) {
                if (item.getId() != id) {
                    tmp[index] = item;
                    index++;
                }
            }

            return tmp;
        }

        public PosterItem[] removeAll () {
            PosterItem[] tmp = new PosterItem[0];
            items = tmp;
            return tmp;
        }



}




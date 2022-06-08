package ru.netology.manager;

public class PosterRepository {


    private PosterItem[] items = new PosterItem[0];
    private int id;



    public void save(PosterItem item) {
        int length = items.length + 1;
        PosterItem[] tmp = new PosterItem[length];

        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;


    }
    public PosterItem[] findAll() {


        PosterItem[] count = new PosterItem[items.length];
        System.arraycopy(items, 0, count, 0, items.length);

        return count;
    }
    public PosterItem[] findById() {
        PosterItem[] tmp = new PosterItem[0];
        for (int i = 0; i < tmp.length; i++) {
            int index = 0;
            for (PosterItem item : items) {
                if (item.getId() == id) {
                    tmp[index] = item;
                    index++;
                }

            }
        }
        return tmp;
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




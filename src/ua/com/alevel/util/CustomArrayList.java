package ua.com.alevel.util;

import java.util.Arrays;

public class CustomArrayList {

    private Object[] objects;
    private int size;
    private int index = 0;

    public void add(Object o) {
        if (index >= objects.length) {
            this.size = this.size * 2;
            this.objects = Arrays.copyOf(this.objects, this.size);
        }
        objects[index] = o;
        index++;
    }

    public Object get(int index) {
        if (index < objects.length) {
            return objects[index];
        } else {
            return null;
        }
    }

    public Object[] getAll() {
        return this.objects;
    }

    public void delete(int index) {
        if (index < objects.length) {
            for (int i = index; i < objects.length - 1; i++) {
                this.objects[i] = this.objects[i + 1];
            }
            this.index--;
            this.objects[this.size -1] = null;
        }
    }

    public void update(int index, Object o) {
        if (index < objects.length) {
            this.objects[index] = o;
        }
    }

    public int length() {
        return this.size;
    }

    public CustomArrayList() {
        this.size = 10;
        init(this.size);
    }

    public CustomArrayList(int size) {
        this.size = size;
        init(this.size);
    }

    private void init(int size) {
        this.objects = new Object[size];
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "objects=" + Arrays.toString(objects) +
                '}';
    }
}

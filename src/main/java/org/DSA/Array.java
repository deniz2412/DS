package org.DSA;

public class Array {
    private int[] items;
    private int count;

    //Constructor
    public Array(int length) {
        items = new int[length];
    }

    //print
    public void print() {
        for (int i = 0; i < count; i++) {
            System.out.println(items[i]);
        }
    }

    //insert
    public void insert(int item) {
        if (items.length == count) {
            int[] new_items = new int[count * 2];

            for (int i = 0; i < count; i++) {
                new_items[i] = items[i];

            }
            items = new_items;
        }

        items[count++] = item;

    }

    //removeAt
    public void removeAt(int index) {
        if (index < 0 || index >= count) {
            throw new IllegalArgumentException();
        }

        for (int i = index; i < count; i++) {
            items[i] = items[i + 1];
        }
        count--;
    }


    //indexOf
    public int indexOf(int item) {
        for(int i=0;i<count;i++){
            if(item == items[i]){
                return i;
            }

    }
        return -1;
}





}

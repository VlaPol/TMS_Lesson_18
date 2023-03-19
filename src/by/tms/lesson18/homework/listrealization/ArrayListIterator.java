package by.tms.lesson18.homework.listrealization;

import by.tms.lesson18.homework.IntList;

import java.util.Iterator;

public class ArrayListIterator implements Iterator<Integer> {

    private final IntList list;
    private int index = 0;

    public ArrayListIterator(IntList list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {

        int size = list.size();
        return index < size;
    }

    @Override
    public Integer next() {
        return list.get(++index - 1);
    }
}

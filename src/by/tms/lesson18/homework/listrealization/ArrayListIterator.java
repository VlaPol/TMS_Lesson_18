package by.tms.lesson18.homework.listrealization;

import by.tms.lesson18.homework.IntList;

import java.util.Iterator;
import java.util.NoSuchElementException;

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
    public Integer next() throws NoSuchElementException {
        if(hasNext()) {
            return list.get(++index - 1);
        }else{
            throw new NoSuchElementException();
        }
    }
}

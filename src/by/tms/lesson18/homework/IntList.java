package by.tms.lesson18.homework;

public interface IntList extends Iterable<Integer>{
    int get(int index);
    int set(int index, int element);
    int size();
    void add(int element);
    int lastIndexOf(int element);
    int remove(int index);


}

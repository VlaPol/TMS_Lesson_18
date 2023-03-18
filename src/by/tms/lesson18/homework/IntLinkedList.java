package by.tms.lesson18.homework;

import by.tms.lesson18.homework.entity.Node;
import by.tms.lesson18.homework.listrealization.LinkedListIterator;

import java.util.Iterator;

public class IntLinkedList implements IntList {

    private Node firstElement;

    public IntLinkedList() {
        firstElement = null;
    }

    @Override
    public void add(int element) {

        Node newNode = new Node();
        newNode.setElement(element);

        if (firstElement == null) {
            firstElement = newNode;
        } else {
            Node lastElement = firstElement;
            while (lastElement.getNextNode() != null) {
                lastElement = lastElement.getNextNode();
            }
            lastElement.setNextNode(newNode);
        }

    }

    @Override
    public int size() {

        Node lastElement = firstElement;
        int counter = 0;

        while (lastElement != null) {
            counter++;
            lastElement = lastElement.getNextNode();
        }

        return counter;
    }

    @Override
    public int get(int index) {

        if (index < 0) {
            throw new IllegalArgumentException("Not such element");
        }
        return getNode(index).getElement();
    }

    @Override
    public int set(int index, int element) {

        if (index < 0) {
            throw new IllegalArgumentException("No element with index [" + index + "] in the list");
        }

        Node lastNode = getNode(index);
        int returnedElement = lastNode.getElement();
        lastNode.setElement(element);

        return returnedElement;
    }

    @Override
    public int lastIndexOf(int element) {

        int listSize = size();
        Node lastElement = firstElement;
        int returnedIndex = -1;

        for (int i = 0; i < listSize; i++) {
            if (lastElement.getElement() == element) {
                returnedIndex = i;
            }
            lastElement = lastElement.getNextNode();
        }

        return returnedIndex;
    }

    @Override
    public String toString() {

        if (firstElement == null) {
            return "[ ]";
        }

        Node lastElement = firstElement;
        StringBuilder stringBuilder = new StringBuilder("[");

        while (lastElement.getNextNode() != null) {
            stringBuilder.append(lastElement.getElement()).append(", ");
            lastElement = lastElement.getNextNode();
        }
        stringBuilder.append(lastElement.getElement()).append("]");
        return stringBuilder.toString();
    }

    @Override
    public int remove(int index) {

        int deletedElement;

        if (firstElement == null) {
            throw new IllegalArgumentException("List is empty");
        }
        if (index < 0) {
            throw new IllegalArgumentException("No element with index [" + index + "] in the list");
        }

        if (index == 0) {
            deletedElement = firstElement.getElement();
            firstElement = firstElement.getNextNode();
        } else {
            Node lastElement = getNode(index - 1);
            deletedElement = lastElement.getNextNode().getElement();
            lastElement.setNextNode(lastElement.getNextNode().getNextNode());
        }

        return deletedElement;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new LinkedListIterator(firstElement);
    }

    private Node getNode(int index) {

        Node lastElement = firstElement;
        for (int i = 0; i < index; i++) {
            if (lastElement == null) {
                throw new IllegalArgumentException("Not such element");
            }
            lastElement = lastElement.getNextNode();
        }

        return lastElement;
    }


}

package by.tms.lesson18.homework;

import by.tms.lesson18.homework.entity.Node;

public class IntLinkedList implements IntList {

    private Node firstElement;
    private Node lastElement;

    public IntLinkedList() {
        firstElement = null;
    }

    @Override
    public void add(int element) {

        Node newNode = new Node();
        newNode.setElement(element);

        lastElement = firstElement;

        if (firstElement == null) {
            firstElement = newNode;
        } else {
            while (lastElement.getNextNode() != null) {
                lastElement = lastElement.getNextNode();
            }
            lastElement.setNextNode(newNode);
        }

    }

    @Override
    public int size() {

        lastElement = firstElement;
        int counter = 0;

        while (lastElement != null) {
            counter++;
            lastElement = lastElement.getNextNode();
        }

        return counter;
    }

    @Override
    public int get(int index) {

        int listSize = size();
        int returnedElement = 0;

        if (index < 0 || index > listSize) {
            throw new IllegalArgumentException("Not such element");
        }

        lastElement = firstElement;

        for (int i = 0; i <= index; i++) {
            returnedElement = lastElement.getElement();
            lastElement = lastElement.getNextNode();
        }

        return returnedElement;
    }

    @Override
    public int set(int index, int element) {

        int listSize = size();

        if (listSize == 0) {
            throw new IllegalArgumentException("No elements in the list!");
        }

        if (index >= listSize || index < 0) {
            throw new IllegalArgumentException("No element with index [" + index + "] in the list");
        }

        int returnedElement = get(index);

        lastElement = firstElement;

        for (int i = 0; i <= index; i++) {
            if (i == index) {
                returnedElement = lastElement.getElement();
                lastElement.setElement(element);
            }
            lastElement = lastElement.getNextNode();
        }

        return returnedElement;
    }

    @Override
    public int lastIndexOf(int element) {

        int listSize = size();
        lastElement = firstElement;
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
        return String.valueOf(firstElement);
    }

    @Override
    public int remove(int index) {

        int listSize = size();
        int deletedDigit = 0;

        if (listSize == 0) {
            throw new IllegalArgumentException("List is empty");
        }
        if (index >= listSize || index < 0) {
            throw new IllegalArgumentException("No element with index [" + index + "] in the list");
        }

        if (firstElement == lastElement) {
            deletedDigit = firstElement.getElement();
            firstElement = null;
            lastElement = null;
            return deletedDigit;
        }

        lastElement = firstElement;

        if (index == 0) {
            deletedDigit = lastElement.getElement();
            lastElement = lastElement.getNextNode();
            firstElement = lastElement;
            return deletedDigit;
        }

        for (int i = 0; i <= index; i++) {
            if (i + 1 == index) {
                deletedDigit = lastElement.getNextNode().getElement();
                lastElement.setNextNode(lastElement.getNextNode().getNextNode());
                break;
            }
            lastElement = lastElement.getNextNode();
        }

        return deletedDigit;
    }

    public void printList() {

        Node tmpHead = firstElement;

        while (tmpHead != null) {
            System.out.print(tmpHead);
            tmpHead = tmpHead.getNextNode();
        }
    }

}

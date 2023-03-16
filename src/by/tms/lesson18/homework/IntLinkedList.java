package by.tms.lesson18.homework;

import by.tms.lesson18.homework.entity.Node;

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

    @Override
    public int set(int index, int element) {

        Node lastElement = firstElement;

        if (index < 0 || lastElement == null) {
            throw new IllegalArgumentException("No element with index [" + index + "] in the list");
        }

        int returnedElement = getNode(index).getElement();

        for (int i = 0; i <= index; i++) {
            if (i == index) {
                returnedElement = lastElement.getElement();
                lastElement.setElement(element);
                break;
            }
            lastElement = lastElement.getNextNode();
        }

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
        return String.valueOf(firstElement);
    }

    @Override
    public int remove(int index) {

        Node lastElement = firstElement;
        int deletedElement = 0;

        if (lastElement == null) {
            throw new IllegalArgumentException("List is empty");
        }
        if (index < 0) {
            throw new IllegalArgumentException("No element with index [" + index + "] in the list");
        }

        if (index == 0) {
            deletedElement = firstElement.getElement();
            firstElement = firstElement.getNextNode();
            return deletedElement;
        }

        for (int i = 0; i <= index; i++) {
            if (i + 1 == index) {
                deletedElement = lastElement.getNextNode().getElement();
                lastElement.setNextNode(lastElement.getNextNode().getNextNode());
                break;
            }
            lastElement = lastElement.getNextNode();
        }

        return deletedElement;
    }
    public void printList() {

        Node lastElement = firstElement;

        while (lastElement != null) {
            System.out.print(lastElement);
            lastElement = lastElement.getNextNode();
        }
    }

}

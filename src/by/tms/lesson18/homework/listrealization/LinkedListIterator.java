package by.tms.lesson18.homework.listrealization;

import by.tms.lesson18.homework.entity.Node;

import java.util.Iterator;

public class LinkedListIterator implements Iterator<Integer> {

    private Node intLinkedNode;

    public LinkedListIterator(Node firstNode) {
        this.intLinkedNode = firstNode;
    }

    @Override
    public boolean hasNext() {
        return intLinkedNode != null;
    }

    @Override
    public Integer next() {
        if (hasNext()) {
            Integer returnedElement = intLinkedNode.getElement();
            intLinkedNode = intLinkedNode.getNextNode();
            return returnedElement;
        }
        return null;
    }
}

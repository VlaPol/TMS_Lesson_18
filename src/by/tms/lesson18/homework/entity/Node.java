package by.tms.lesson18.homework.entity;

public class Node {

    private int element;
    private Node nextNode;

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "[ " + element + " ]";
    }
}

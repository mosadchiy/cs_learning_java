package com.mosadchiy.basic_questions;

public class MyList<T> {
    private Node<T> firstNode;
    private Node<T> lastNode;

    public MyList() {
        firstNode = null;
        lastNode = null;
    }

    public Node<T> getFirstNode() {
        return firstNode;
    }

    public Node<T> getLastNode() {
        return lastNode;
    }

    public void add(T value) {
        Node<T> newNode = new Node<>(value);
        if (firstNode == null) {
            firstNode = newNode;
        } else {
            lastNode.setNextNode(newNode);
        }
        lastNode = newNode;
    }

    public static class Node<T> {
        private final T value;
        private Node<T> nextNode;

        public Node(T value) {
            this.value = value;
        }

        public void setNextNode(Node<T> nextNode) {
            this.nextNode = nextNode;
        }

        public T getValue() {
            return value;
        }

        public Node<T> getNextNode() {
            return nextNode;
        }
    }
}

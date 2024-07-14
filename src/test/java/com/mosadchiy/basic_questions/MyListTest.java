package com.mosadchiy.basic_questions;

import org.junit.jupiter.api.Test;

import java.util.Stack;

public class MyListTest {

    @Test
    public void printFirstAndLastNodesTest() {
        System.out.println("print First and Last Nodes Test");
        MyList<String> myList = new MyList<>();
        myList.add("Hello");
        myList.add("World");
        myList.add("!!!");
        System.out.println(myList.getFirstNode().getValue());
        System.out.println(myList.getLastNode().getValue());
    }

    @Test
    public void forwardPrintTest() {
        System.out.println("forward Print Test");
        MyList.Node<String> node = generateMyStringList().getFirstNode();
        while (true) {
            System.out.println("Node value: " + node.getValue());
            if (node.getNextNode() == null) {
                return;
            }
            node = node.getNextNode();
        }
    }

    @Test
    public void backwardPrintViaStackTest() {
        System.out.println("backward Print Via Stack Test");
        MyList.Node<String> node = generateMyStringList().getFirstNode();
        Stack<Object> stack = new Stack<>();
        while (true) {
            stack.push(node.getValue());
            if (node.getNextNode() == null) {
                break;
            }
            node = node.getNextNode();
        }
        while (!stack.isEmpty()) {
            System.out.println("Node value: " + stack.pop());
        }
    }

    @Test
    public void backwardPrintViaRecursionTest() {
        System.out.println("backward Print Via Recursion Test");
        MyList.Node<String> node = generateMyStringList().getFirstNode();
        printListInReverseOrder(node);
    }

    private void printListInReverseOrder(MyList.Node<String> node) {
        if (node.getNextNode() == null) {
            System.out.println("Node value: " + node.getValue());
        } else {
            printListInReverseOrder(node.getNextNode());
            System.out.println("Node value: " + node.getValue());
        }
    }

    private MyList<String> generateMyStringList() {
        MyList<String> myList = new MyList<>();
        myList.add("1");
        myList.add("2");
        myList.add("3");
        myList.add("4");
        myList.add("5");
        return myList;
    }
}

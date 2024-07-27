package com.mosadchiy.grokking_algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BreadthFirstSearch {

    static Map<String, List<String>> graph = new HashMap<>();

    public static void main(String[] args) {
        graph.put("you", Arrays.asList("alice", "bob", "claire"));
        graph.put("bob", Arrays.asList("anuj", "peggy"));
        graph.put("alice", List.of("peggy"));
        graph.put("claire", Arrays.asList("thom", "jonny"));
        graph.put("anuj", Collections.emptyList());
        graph.put("peggy", Collections.emptyList());
        graph.put("thom", Collections.emptyList());
        graph.put("jonny", Collections.emptyList());

        System.out.println("Item found: " + search("you"));
    }

    static boolean search(String name) {
        Queue<String> searchQueue = new LinkedList<>();
        searchQueue.addAll(graph.get(name));
        boolean itemFound = false;
        List<String> searched = new ArrayList<>();
        while (searchQueue.peek() != null) {
            String person = searchQueue.poll();
            if (!searched.contains(person)) {
                if (isPersonSeller(person)) {
                    itemFound = true;
                    break;
                } else {
                    searchQueue.addAll(graph.get(person));
                    searched.add(person);
                }
            }
        }
        return itemFound;
    }

    static boolean isPersonSeller(String person) {
        return person.endsWith("mango");
    }
}

package datastructures.quicknote;

import java.util.*;

public class DataStructureRevision {
    public static void main(String[] args) {
        ArrayList(args);
        LinkedList(args);
        Stack(args);
        Queue(args);
        HashSet(args);
        Hashmap(args);
        TreeMap(args);
        Priorityqueue(args);
    }

//    ArrayList
    public static void ArrayList(String[] args){
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        System.out.println("list:- "+list);
    }
//   LinkedList
    public static void LinkedList(String[] args){
        List<String> linkedList = new LinkedList<>();
        linkedList.add("Hello");
        linkedList.add("Java");
        linkedList.add("World");
        System.out.println("linkedList:- "+linkedList);
    }
//  Stack
//  LIFO
    public static void Stack(String[] args){
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("Java");
        stack.push("World");
        System.out.println("Stack:- "+stack);
        System.out.println(stack.pop());
    }
//  Queue
//  FIFO
    public static void Queue(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Hello");
        queue.add("Java");
        queue.add("World");
        System.out.println("Queue:- "+queue);
        System.out.println(queue.poll());
    }
//  HashSet
//  HashSet is a collection that doesn’t allow duplicate elements. It’s especially useful when you want to keep track of unique elements.
    public static void HashSet(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Hello");
        hashSet.add("Java");
        hashSet.add("Java");
        System.out.println("hashSet:-"+hashSet);
    }

//    HashMap
//    HashMap is a collection that stores elements as key-value pairs. It allows you to retrieve a value quickly if you know its key.
    public static void Hashmap(String[]args){
        HashMap<String,String> hashMap= new HashMap<>();
        hashMap.put("String","3");
        hashMap.put("String","3");
        System.out.println("hashMap"+hashMap);
    }

//    TreeMap is a collection that stores key-value pairs in a sorted order. It’s a good choice when you need to maintain a sorted map.

    public static void TreeMap(String[] args) {
        Set<String> treeSet = new TreeSet<>();
        treeSet.add("Hello");
        treeSet.add("Java");
        treeSet.add("World");
        System.out.println("treeSet:-"+treeSet);

    }

//    Priority Queue
//    PriorityQueue is a collection that orders its elements based on their natural ordering or a custom comparator.
//    It’s useful when you need to process elements based on their priority.

    public static void Priorityqueue(String[] args) {
        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Hello");
        priorityQueue.add("Java");
        priorityQueue.add("World");
        System.out.println("priorityQueue:-"+priorityQueue);
        System.out.println("poll of priorityQueue:- "+priorityQueue.poll());

    }


}

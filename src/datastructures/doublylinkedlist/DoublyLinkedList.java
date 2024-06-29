package datastructures.doublylinkedlist;

public class DoublyLinkedList {

//    Constructor

    private Node head;
    private Node tail;

    private int length;


    public class Node {
        public int value;
        Node next;
        Node prev;
        Node(int value) {
            this.value = value;
        }
    }

    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList(){
        Node temp = head;
        while (temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead(){
        System.out.println("Head:" + head.value);
    }
    public void getTail(){
        System.out.println("Tail:" + tail.value);
    }
    public void getLength(){
        System.out.println("Length:" + length);

    }

//      append
    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            newNode.prev  =tail;
            tail = newNode;
        }
        length++;
    }

//    removeLast

    public Node removeLast(){
        if(length == 0)return null;
        Node temp = tail;
        if(length==1) {
        head = null;
        tail = null;
        }else{
            tail = tail.prev;
            tail.next = null;
            temp.prev = null;
        }
        length--;
        return temp;
    }

    //    prepend
    public void printAll() {
        if (length == 0) {
            System.out.println("Head: null");
            System.out.println("Tail: null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length:" + length);
        System.out.println("\nDoubly Linked List:");
        if (length == 0) {
            System.out.println("empty");
        } else {
            printList();
        }
    }
    public void prepend(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }else{
            newNode.next = head;
            head.prev  = newNode;
            head = newNode;
        }
        length++;
    }

//    Remove First

    public Node removeFirst(){
        if(length == 0)return null;
        Node temp = head;
        if(length==1) {
            head = null;
            tail = null;
        }else{
            head = head.next;
            head.prev = null;
            temp.next = null;
        }
        length--;
        return temp;
    }

//    Get

    public Node get (int index){
        if (index <0 || index >= length)return null;
        Node temp  = head;
        if(index< length/2){
            for (int i= 0 ; i<index ; i++){
                temp = temp.next;
            }
        }else{
            temp = tail;
            for (int i= length-1 ; i>index ; i--){
                temp = temp.prev;
            }
        }
        return temp;
    }

//    Set
    public boolean set (int index,int value){
        Node temp  = get(index);
        if(temp!=null){
         temp.value = value;
         return true;
        }
        return false;
    }

//    insert

    public boolean insert (int index,int value) {
        if (index < 0 || index > length) return false;

        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node before = get(index-1);
        Node after = before.next;
        newNode.prev=before;
        newNode.next = after;
        before.next = newNode;
        after.prev = newNode;
        length++;
        return true;
    }

//    remove
        public Node remove (int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0 ) return removeFirst();
        if (index == length-1) return removeLast();

        Node temp = get(index);

        temp.next.prev = temp.prev;
        temp.prev.next = temp.next;
        temp.next = null;
        temp.prev = null;

        length--;
        return temp;
    }

//    Swap

    public void swapFirstLast(){
        if (length<2)return;

        int temp = head.value;
        head.value = tail.value;
        tail.value = temp ;
    }

//    reverse
    public void reverse() {
        Node current = head;
        Node temp = null;

        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }

        temp = head;
        head = tail;
        tail = temp;
    }

//    Palindrome

//    Check list length:
//If the length of the doubly linked list is less than or equal to 1, return true, as it is a palindrome.
//Initialize nodes for traversal:
//Set forwardNode to head.
//Set backwardNode to tail.
//Traverse and compare values:
//For i in the range 0 to (length / 2), do the following:
//If forwardNode.value is not equal to backwardNode.value, return false, as it is not a palindrome.
//Set forwardNode to forwardNode.next.
//Set backwardNode to backwardNode.prev.
//Return true, as the list is a palindrome.

    public boolean isPalindrome(){
        if(length<=1)return true;
        Node forwardNode  = head;
        Node backwardNode  = tail;

        for(int i =0;i<length/2;i++){
            if(forwardNode.value!=backwardNode.value)return false;
            forwardNode  = forwardNode.next;
            backwardNode = backwardNode.prev;
        }
        return true;
    }

//    Swap Nodes Pair

//    Initialize variables:
//Create a dummyNode with value 0.
//Set dummyNode.next to head.
//Set previousNode to dummyNode.
//Iterate through the list:
//While head is not null and head.next is not null, execute the following sub-steps.
//Identify nodes to swap:
//Set firstNode to head.
//Set secondNode to head.next.
//Update pointers to swap nodes:
//Set previousNode.next to secondNode.
//Set firstNode.next to secondNode.next.
//Set secondNode.next to firstNode.
//Update previous pointers:
//Set secondNode.prev to previousNode.
//Set firstNode.prev to secondNode.
//If firstNode.next is not null, set firstNode.next.prev to firstNode.
//Move pointers for the next iteration and update list head:
//Set head to firstNode.next.
//Set previousNode to firstNode.
//Eventually, set head to dummyNode.next.

    public void swapPairs() {
    Node dummyNode = new Node(0);
    dummyNode.next = head;
    Node previousNode = dummyNode;

    while (head != null && head.next != null) {
        Node firstNode = head;
        Node secondNode = head.next;

        previousNode.next = secondNode;
        firstNode.next = secondNode.next;
        secondNode.next = firstNode;

        secondNode.prev = previousNode;
        firstNode.prev = secondNode;

        if (firstNode.next != null) {
            firstNode.next.prev = firstNode;
        }

        head = firstNode.next;
        previousNode = firstNode;
    }

    head = dummyNode.next;
    if (head != null) head.prev = null;
}

}

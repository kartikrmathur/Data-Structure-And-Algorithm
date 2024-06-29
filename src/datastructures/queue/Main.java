package datastructures.queue;

import datastructures.doublylinkedlist.DoublyLinkedList;

public class Main {

    public static void main(String[] args){

//        Constructor
//        DoublyLinkedList myDLL = new DoublyLinkedList(7);
//        myDLL.getHead();
//        myDLL.getTail();
//        myDLL.getLength();
//        myDLL.printList();

//        Append
//        DoublyLinkedList myDLL = new DoublyLinkedList(1);
//        myDLL.append(2);
//        myDLL.printList();

//        RemoveLast
//        DoublyLinkedList myDLL = new DoublyLinkedList(1);
//        myDLL.append(2);
//        // (2) Items - Returns 2 Node
//        System.out.println(myDLL.removeLast().value);
//        // (1) Item - Returns 1 Node
//        System.out.println(myDLL.removeLast().value);
//        // (0) Items - Returns null
//        System.out.println(myDLL.removeLast());

//        Prepend
//        DoublyLinkedList myDLL = new DoublyLinkedList(2);
//        myDLL.append(3);
//        System.out.println("Before prepend():");
//        System.out.println("-----------------");
//        myDLL.printAll();
//        myDLL.prepend(1);
//        System.out.println("\n\nAfter prepend():");
//        System.out.println("----------------");
//        myDLL.printAll();

//        RemoveFirst

//        DoublyLinkedList myDLL = new DoublyLinkedList(2);
//        myDLL.append(1);
//
//        // (2) Items - Returns 2 Node
//        System.out.println(myDLL.removeFirst().value);
//        // (1) Item - Returns 1 Node
//        System.out.println(myDLL.removeFirst().value);
//        // (0) Items - Returns null
//        System.out.println(myDLL.removeFirst());


//        Get

//        DoublyLinkedList myDLL = new DoublyLinkedList(0);
//        myDLL.append(1);
//        myDLL.append(2);
//        myDLL.append(3);
//
//
//        System.out.println(myDLL.get(3).value);

//        Set

//        DoublyLinkedList myDLL = new DoublyLinkedList(0);
//        myDLL.append(1);
//        myDLL.append(2);
//        myDLL.append(3);
//        System.out.println("DLL before set():");
//        myDLL.printList();
//        myDLL.set(2, 99);
//        System.out.println("\nDLL after set():");
//        myDLL.printList();




//        Insert
//        DoublyLinkedList myDLL = new DoublyLinkedList(1);
//        myDLL.append(3);
//
//        System.out.println("DLL before insert():");
//        myDLL.printList();
//
//        myDLL.insert(1, 2);
//
//        System.out.println("\nDLL after insert(2) in middle:");
//        myDLL.printList();
//
//        myDLL.insert(0, 0);
//
//        System.out.println("\nDLL after insert(0) at beginning:");
//        myDLL.printList();
//
//        myDLL.insert(4, 4);
//
//        System.out.println("\nDLL after insert(4) at end:");
//        myDLL.printList();



//      Remove
//        DoublyLinkedList myDLL = new DoublyLinkedList(1);
//        myDLL.append(2);
//        myDLL.append(3);
//        myDLL.append(4);
//        myDLL.append(5);
//
//        System.out.println("DLL before remove():");
//        myDLL.printList();
//
//        System.out.println("\nRemoved node:");
//        System.out.println(myDLL.remove(2).value);
//        System.out.println("DLL after remove() in middle:");
//        myDLL.printList();
//
//        System.out.println("\nRemoved node:");
//        System.out.println(myDLL.remove(0).value);
//        System.out.println("DLL after remove() of first node:");
//        myDLL.printList();
//
//        System.out.println("\nRemoved node:");
//        System.out.println(myDLL.remove(2).value);
//        System.out.println("DLL after remove() of last node:");
//        myDLL.printList();

//        SWAP
//        DoublyLinkedList myDLL = new DoublyLinkedList(1);
//        myDLL.append(2);
//        myDLL.append(3);
//        myDLL.append(4);
//        myDLL.append(5);
//
//        System.out.println("DLL before swap:");
//        myDLL.printList();
//
//        myDLL.swapFirstLast();
//
//        System.out.println("\nDLL after swap:");
//        myDLL.printList();

//      Palindrome
//        DoublyLinkedList myDLL1 = new DoublyLinkedList(1);
//        myDLL1.append(2);
//        myDLL1.append(3);
//        myDLL1.append(2);
//        myDLL1.append(1);
//
//        System.out.println("myDLL1 isPalindrome:");
//        System.out.println( myDLL1.isPalindrome() );


//      swapPairs
        DoublyLinkedList myDLL2 = new DoublyLinkedList(1);
        myDLL2.append(2);
        myDLL2.append(3);

        System.out.println("\nmyDLL2 isPalindrome:");
        System.out.println( myDLL2.isPalindrome() );

        DoublyLinkedList myDll = new DoublyLinkedList(1);
        myDll.append(2);
        myDll.append(3);
        myDll.append(4);

        System.out.println("myDll before swapPairs:");
        myDll.printList();

        myDll.swapPairs();

        System.out.println("\nmyDll after swapPairs:");
        myDll.printList();



    }
}

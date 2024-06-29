package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {

            //        Constructor

//        LinkedList myLinkedList = new LinkedList(4);
//        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
//        myLinkedList.append(2);


            //        Remove Last

//        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.append(2);
//        (0) Item - return 2 Node
//        System.out.println(myLinkedList.removeLast());
//        System.out.println(myLinkedList.removeLast().value);
//        (1) Item - return 1 Node
//        System.out.println(myLinkedList.removeLast());
//        System.out.println(myLinkedList.removeLast().value);
//        (0) Item - return null
//        System.out.println(myLinkedList.removeLast());
//        myLinkedList.printList();


        //        Append

//        LinkedList myLinkedList = new LinkedList(2);
//        myLinkedList.append(3);
//        myLinkedList.prepend(1);
//        myLinkedList.printList();

        //        Remove first

//        LinkedList myLinkedList = new LinkedList(2);
//        myLinkedList.append(1);
//        myLinkedList.printList();
//       2(Item) - Return 2 node
//        System.out.println(myLinkedList.removeFirst().value);
//       1(Item) - Return 1 node
//        System.out.println(myLinkedList.removeFirst().value);
//       0(Item) - Return 0 node
//        System.out.println(myLinkedList.removeFirst());


        //      Get - set

//        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.append(3);
//        myLinkedList.append(23);
//        myLinkedList.append(7);
//
//        myLinkedList.set(1,4);
//        myLinkedList.printList();


        //        Insert

//        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.append(3);
//
//        System.out.println("LL before insert():");
//        myLinkedList.printList();
//
//        myLinkedList.insert(1, 2);
//
//        System.out.println("\nLL after insert(2) in middle:");
//        myLinkedList.printList();
//
//        myLinkedList.insert(0, 0);
//
//        System.out.println("\nLL after insert(0) at beginning:");
//        myLinkedList.printList();
//
//        myLinkedList.insert(4, 4);
//
//        System.out.println("\nLL after insert(4) at end:");
//        myLinkedList.printList();


        //          Remove

//        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.append(2);
//        myLinkedList.append(3);
//        myLinkedList.append(4);
//        myLinkedList.append(5);
//
//        System.out.println("LL before remove():");
//        myLinkedList.printList();
//
//        System.out.println("\nRemoved node:");
//        System.out.println(myLinkedList.remove(2).value);
//        System.out.println("LL after remove() in middle:");
//        myLinkedList.printList();
//
//        System.out.println("\nRemoved node:");
//        System.out.println(myLinkedList.remove(0).value);
//        System.out.println("LL after remove() of first node:");
//        myLinkedList.printList();
//
//        System.out.println("\nRemoved node:");
//        System.out.println(myLinkedList.remove(2).value);
//        System.out.println("LL after remove() of last node:");
//        myLinkedList.printList();


        //        Reverse

//        LinkedList myLinkedList = new LinkedList(1);
//        myLinkedList.append(2);
//        myLinkedList.append(3);
//        myLinkedList.append(4);
//
//        System.out.println("LL before reverse():");
//        myLinkedList.printList();
//
//        myLinkedList.reverse();
//
//        System.out.println("\nLL after reverse():");
//        myLinkedList.printList();

        LinkedList myLinkedList = new LinkedList(1);
        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);
        myLinkedList.append(5);


        System.out.println("1 -> 2 -> 3 -> 4 -> 5");
        System.out.println( "Middle Node: "+ myLinkedList.findMiddleNode().value);


        myLinkedList.append(6);


        System.out.println("===========================");
        System.out.println("1 -> 2 -> 3 -> 4 -> 5 -> 6");
        System.out.println( "Middle Node: "+ myLinkedList.findMiddleNode().value);

    }
}
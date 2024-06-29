package datastructures.heap;

import static datastructures.heap.Heap.findKthSmallest;
import static datastructures.heap.Heap.streamMax;

public class Main {

    public static void main(String[] args) {

//        Heap myHeap = new Heap();
//        myHeap.insert(99);
//        myHeap.insert(72);
//        myHeap.insert(61);
//        myHeap.insert(58);
//        System.out.println(myHeap.getHeap());
//        myHeap.insert(100);
//        System.out.println(myHeap.getHeap());
//        myHeap.insert(75);
//        System.out.println(myHeap.getHeap());
//        myHeap.remove();
//        System.out.println(myHeap.getHeap());
//        myHeap.remove();
//        System.out.println(myHeap.getHeap());

//        Heap myHeap = new Heap();
//        myHeap.insert(99);
//        myHeap.insert(72);
//        myHeap.insert(61);
//        myHeap.insert(58);
//        myHeap.insert(10);
//        myHeap.insert(75);
//
//        System.out.println(myHeap.getHeap());
//
//        Integer removedValue1 = myHeap.remove_minIndex();
//
//        System.out.println("First Removed Value: " + removedValue1);
//        System.out.println(myHeap.getHeap());
//
//        Integer removedValue2 = myHeap.remove_minIndex();
//
//        System.out.println("General.Second Removed Value: " + removedValue2);
//        System.out.println(myHeap.getHeap());

//            // Test case 1
//            int[] nums1 = {7, 10, 4, 3, 20, 15};
//            int k1 = 3;
//            System.out.println("Test case 1:");
//            System.out.println("Expected output: 7");
//            System.out.println("Actual output: " + findKthSmallest(nums1, k1));
//            System.out.println();
//
//            // Test case 2
//            int[] nums2 = {2, 1, 3, 5, 6, 4};
//            int k2 = 2;
//            System.out.println("Test case 2:");
//            System.out.println("Expected output: 2");
//            System.out.println("Actual output: " + findKthSmallest(nums2, k2));
//            System.out.println();
//
//            // Test case 3
//            int[] nums3 = {9, 3, 2, 11, 7, 10, 4, 5};
//            int k3 = 5;
//            System.out.println("Test case 3:");
//            System.out.println("Expected output: 7");
//            System.out.println("Actual output: " + findKthSmallest(nums3, k3));
//            System.out.println();


            // Test case 1
            int[] nums1 = {1, 5, 2, 9, 3, 6, 8};
            System.out.println("Test case 1:");
            System.out.println("Input: [1, 5, 2, 9, 3, 6, 8]");
            System.out.println("Expected output: [1, 5, 5, 9, 9, 9, 9]");
            System.out.println("Actual output: " + streamMax(nums1));
            System.out.println();

            // Test case 2
            int[] nums2 = {10, 2, 5, 1, 0, 11, 6};
            System.out.println("Test case 2:");
            System.out.println("Input: [10, 2, 5, 1, 0, 11, 6]");
            System.out.println("Expected output: [10, 10, 10, 10, 10, 11, 11]");
            System.out.println("Actual output: " + streamMax(nums2));
            System.out.println();

            // Test case 3
            int[] nums3 = {3, 3, 3, 3, 3};
            System.out.println("Test case 3:");
            System.out.println("Input: [3, 3, 3, 3, 3]");
            System.out.println("Expected output: [3, 3, 3, 3, 3]");
            System.out.println("Actual output: " + streamMax(nums3));
            System.out.println();



    }

}
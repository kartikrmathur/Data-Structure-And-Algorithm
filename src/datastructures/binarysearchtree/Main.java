package datastructures.binarysearchtree;

public class Main {

    public static void main(String[] args) {

//        BinarysearchTree myBST = new BinarysearchTree();
//        System.out.println("Root = " + myBST.root);

        BinarysearchTree myBST = new BinarysearchTree();
//
//
//        myBST.insert(47);
//        myBST.insert(21);
//        myBST.insert(76);
//        myBST.insert(18);
//        myBST.insert(27);
//        myBST.insert(52);
//        myBST.insert(82);


        /*
            THE LINES ABOVE CREATE THIS TREE:
                         2
                        / \
                       1   3
        */

//
//
//        System.out.println("Root: " + myBST.getRoot().value);
//        System.out.println("\nRoot->Left: " + myBST.getRoot().left.value);
//        System.out.println("\nRoot->Right: " + myBST.getRoot().right.value);


//
//        System.out.println(myBST.minValue( myBST.getRoot() ));
//
//        System.out.println(myBST.minValue( myBST.getRoot().right ));

            myBST.insert(2);
            myBST.insert(1);
            myBST.insert(3);

        /*
               2
              / \
             1   3
        */

            System.out.println( "Root: " + myBST.getRoot().value );
            System.out.println( "Root->Left: " + myBST.getRoot().left.value );
            System.out.println( "Root->Right: " + myBST.getRoot().right.value );


            myBST.deleteNode(2);

        /*
               3
              / \
             1  null
        */


            System.out.println( "\nRoot: " + myBST.getRoot().value );
            System.out.println( "Root->Left: " + myBST.getRoot().left.value );
            System.out.println( "Root->Right: " + myBST.getRoot().right );







        }
}

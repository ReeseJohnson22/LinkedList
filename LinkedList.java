// Name:    Reese Johnson
// Class:   CS 3305/Section W01
// Term:    Summer 2023
//Instructor:   Prof. Majeed
// Assignment   1
import org.w3c.dom.Node;

public class LinkedList {

    public Node head, tail;

    //constructor method to create a list of object with head, tail, and size.
    public LinkedList()
    {
        head = null;
        tail = null;
    }

    //method add node to end of list
    public void addLastNode(int data)
    {
        if (tail == null)
            head = tail = new Node(data); //empty list
        else
        {
            tail.next = new Node(data); //link new node as last node
            tail = tail.next; //make tail pointer points to last node
        }
    }

    //======== Your part to complete for this assignment =========

    //method #1: add first node
    //adds at first node location.
    public void addFirstNode(int data)
    {
        Node newFirst = new Node(data); // makes node
        newFirst.next = head; //makes the next node the head
        head = newFirst; //makes new node new head
        if (tail == null){
            tail = head; //makes sure that if this is the first node or if there is not already a tail that this node is
            //the tail node
        }
    }

    //method #2: add node at index
    //adds at a certain node index accounting for potential issues.
    public void addAtIndex(int index, int data)
    {
        if(index == 0){
            addFirstNode(data); //0 index doesn't exist but for this case it will just add to the front.
        } else if (index == countNodes()) {
            addLastNode(data); //if the index is equal to the number of nodes it will place at tail
             } else if (index > countNodes()){
                    System.out.println("Invalid Index, try again.");
                    return;
                } else {
                 Node Counter = head;
                 //iterates through the nodes till the given index is reached, in which it will then add the new node
                 for (int i = 1; i < index-1; i++){
                     Counter = Counter.next;
                 }
                 Node tempNode = Counter.next; //temp node to be used for the new node
                 Counter.next = new Node(data);
                 (Counter.next).next = tempNode;
             }
    }

    //method #3: remove first node
    //removes the first node and accounts for an empty list
    public void removeFirstNode()
    {
        //if the list is empty
        if(countNodes() == 0){
            System.out.println ("List is Empty.");
            return;
            //removes the first node setting the head to the next node.
        } else {
            head = head.next;
            if(head == null){
                tail = null;
            }
        }
    }

    //method #4: remove last node
    //removes last node and accounts for empty list as well
    public void removeLastNode()
    {
        //if the list is empty
        if(countNodes() == 0){
            System.out.println ("List is Empty.");
            return;
            //if there is only 1 node in the list
        } else if(countNodes() == 1) {
            head = tail = null;
            //iterates through till the final node to get rid of it.
             } else {
               Node Counter = head;
               for (int i = 0; i < countNodes() - 2; i++){
                   Counter = Counter.next;
               }
               tail = Counter;
               tail.next = null;
             }
    }

    //method #5: remove node at index
    //ensures that the list has nodes in it, also makes sure that the given index is within range.
    public void removeAtIndex(int index)
    {
        //checks for node range and list is not empty
        if(index < 0) {
            System.out.println("List is Empty.");
            return;
        } else if (index > countNodes()){
            System.out.println("Invalid index, try again.");
            return;
        }
            //removes first node if the given index is 0
            else if (index == 0) removeFirstNode();
                //removes the final node if the index is the final index
                else if (index == countNodes() -1) removeLastNode();
                //removes whatever index is given to the program given it is not last or first
                    else {
                        //makes counter head to iterate through the list
                        Node Counter = head;
                        for(int i = 1; i < index-1; i++){
                            Counter = Counter.next;
                        }
                        //once the node is reached the new node will be made to take its place and then be deleted
                        Node toBeDeleted = Counter.next;
                        Counter.next = toBeDeleted.next;
        }
    }

    //method #6: countNodes
    //counts the nodes within the list
    public int countNodes()
    {
        //empty list
        if(head == null){
            return 0;
        }
        //makes int to count and makes head node once the head is counted list is incremented by 1
        int listSize= 0;
        Node Counter = head;
        listSize++;
        //while loop to iterate through the list of nodes till next one does not exist.
        while(Counter.next != null){
            Counter = Counter.next;
            listSize++;
        }
        //returns size
        return listSize;

    }

    //method #7: printInReverse  (Recursive method)
    //reverse printing with recursion returning a specific node this gets passed the in the test
    public void printInReverse(Node L)
    {
        //empty list
        if(countNodes() == 0){
            System.out.println ("List is Empty.");
            return;
            //only 1 node in the list
        } else if(countNodes() == 1) {
            System.out.print(L);
            return;
        //More than 1 node in the list
        } else {
            //makes counter to iterate through the list
            Node Counter = head;
            for (int i = 1; i < countNodes(); i++) {
                //if statement to catch if the counter node and the node that needs to be printed are the same
                if(Counter == L) {
                        System.out.print(L.data + " ");
                        return;
                }
                //other if to catch that the counter finds that the next node is the one that needs to be printed.
                //This way the counter does not increment too far and that way I can set L to the next node that needs
                //to be printed.
                    if (Counter.next == L) {
                        //prints L then makes L the counter which is the node before L
                      System.out.print(L.data + " ");
                      L = Counter;
                      break;
                    }
                    //increments the counter node through the list
                         Counter = Counter.next;
            }
            //calls the function again passing the L that has been set to the counter to ensure no repeats of the list.
            printInReverse(L);
        }
    }
    //================= end of your part ==============

    //method to print out the list
    public void printList()
    {
        Node temp;
        temp = head;
        while (temp != null)
        {
            System.out.print(temp.data + "   ");
            temp = temp.next;
        }
    }

    //class to create nodes as objects
    private class Node
    {
        private int data;  //data field
        private Node next; //link field

        public Node(int item) //constructor method
        {
            data = item;
            next = null;
        }
    }
}

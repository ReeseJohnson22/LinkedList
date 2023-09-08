// Name:    Reese Johnson
// Class:   CS 3305/Section W01
// Term:    Summer 2023
//Instructor:   Prof. Majeed
// Assignment   1

import java.util.Scanner;

public class myTest
    {
        public static void main (String[] args)
        {
            LinkedList myList = new LinkedList(); //create a list object
            Scanner input = new Scanner(System.in); //create scanner for usage of getting user input
            //prints out and gets the first user input for the menu
            System.out.print("---------MAIN MENU--------\n" +
                    "1 – Add First Node\n" +
                    "2 – Add Last Node\n" +
                    "3 – Add At Index\n" +
                    "4 – Remove First Node\n" +
                    "5 – Remove Last Node\n" +
                    "6 – Remove At Index\n" +
                    "7 – Print List Size\n" +
                    "8 – Print List (Forward)\n" +
                    "9 – Print List In Reverse\n" +
                    "10- Exit program\n" +
                    "Enter option number:  ");
            int userIn = input.nextInt();
            //while and switch case for each of the different menu options every case has the menu options and user input again except 10
            while (userIn != 10) switch (userIn){
                //case 1 adding first node
                case 1:
                    System.out.println("List content before adding at first node");
                    myList.printList();
                    System.out.println("\nGive value for node");
                    userIn = input.nextInt();
                    myList.addFirstNode(userIn);
                    System.out.println("\nList content after adding at first node");
                    myList.printList();
                    System.out.print("\n---------MAIN MENU--------\n" +
                            "1 – Add First Node\n" +
                            "2 – Add Last Node\n" +
                            "3 – Add At Index\n" +
                            "4 – Remove First Node\n" +
                            "5 – Remove Last Node\n" +
                            "6 – Remove At Index\n" +
                            "7 – Print List Size\n" +
                            "8 – Print List (Forward)\n" +
                            "9 – Print List In Reverse\n" +
                            "10- Exit program\n" +
                            "Enter option number:  ");
                    userIn = input.nextInt();
                    break;
                    //adding last node
                case 2:
                    System.out.println("List content before adding at last node");
                    myList.printList();
                    System.out.println("\nGive value for node");
                    userIn = input.nextInt();
                    myList.addLastNode(userIn);
                    System.out.println("\nList content after adding at last node");
                    myList.printList();
                    System.out.print("\n---------MAIN MENU--------\n" +
                            "1 – Add First Node\n" +
                            "2 – Add Last Node\n" +
                            "3 – Add At Index\n" +
                            "4 – Remove First Node\n" +
                            "5 – Remove Last Node\n" +
                            "6 – Remove At Index\n" +
                            "7 – Print List Size\n" +
                            "8 – Print List (Forward)\n" +
                            "9 – Print List In Reverse\n" +
                            "10- Exit program\n" +
                            "Enter option number:  ");
                    userIn = input.nextInt();
                    break;
                    //add node at specific index
                case 3:
                    System.out.println("Give value for node");
                    userIn = input.nextInt();
                    System.out.println("Give value for index");
                    int index = input.nextInt();
                    System.out.println("List content before adding at index");
                    myList.printList();
                    myList.addAtIndex(index, userIn);
                    System.out.println("\nList content after adding at index");
                    myList.printList();
                    System.out.print("\n---------MAIN MENU--------\n" +
                            "1 – Add First Node\n" +
                            "2 – Add Last Node\n" +
                            "3 – Add At Index\n" +
                            "4 – Remove First Node\n" +
                            "5 – Remove Last Node\n" +
                            "6 – Remove At Index\n" +
                            "7 – Print List Size\n" +
                            "8 – Print List (Forward)\n" +
                            "9 – Print List In Reverse\n" +
                            "10- Exit program\n" +
                            "Enter option number:  ");
                    userIn = input.nextInt();
                    break;
                    //removing first node
                case 4:
                    System.out.println("List content before removing first node");
                    myList.printList();
                    myList.removeFirstNode();
                    System.out.println("\nList content after removing first node");
                    myList.printList();
                    System.out.print("\n---------MAIN MENU--------\n" +
                            "1 – Add First Node\n" +
                            "2 – Add Last Node\n" +
                            "3 – Add At Index\n" +
                            "4 – Remove First Node\n" +
                            "5 – Remove Last Node\n" +
                            "6 – Remove At Index\n" +
                            "7 – Print List Size\n" +
                            "8 – Print List (Forward)\n" +
                            "9 – Print List In Reverse\n" +
                            "10- Exit program\n" +
                            "Enter option number:  ");
                    userIn = input.nextInt();
                    break;
                    //removing last node
                case 5:
                    System.out.println("List content before removing last node");
                    myList.printList();
                    myList.removeLastNode();
                    System.out.println("\nList content after removing last node");
                    myList.printList();
                    System.out.print("\n---------MAIN MENU--------\n" +
                            "1 – Add First Node\n" +
                            "2 – Add Last Node\n" +
                            "3 – Add At Index\n" +
                            "4 – Remove First Node\n" +
                            "5 – Remove Last Node\n" +
                            "6 – Remove At Index\n" +
                            "7 – Print List Size\n" +
                            "8 – Print List (Forward)\n" +
                            "9 – Print List In Reverse\n" +
                            "10- Exit program\n" +
                            "Enter option number:  ");
                    userIn = input.nextInt();
                    break;
                    //removing at index
                case 6:
                    System.out.println("List content before removing at index");
                    myList.printList();
                    System.out.println("What index would you like to remove?");
                    userIn = input.nextInt();
                    myList.removeAtIndex(userIn);
                    System.out.println("\nList content after removing at index");
                    myList.printList();
                    System.out.print("\n---------MAIN MENU--------\n" +
                            "1 – Add First Node\n" +
                            "2 – Add Last Node\n" +
                            "3 – Add At Index\n" +
                            "4 – Remove First Node\n" +
                            "5 – Remove Last Node\n" +
                            "6 – Remove At Index\n" +
                            "7 – Print List Size\n" +
                            "8 – Print List (Forward)\n" +
                            "9 – Print List In Reverse\n" +
                            "10- Exit program\n" +
                            "Enter option number:  ");
                    userIn = input.nextInt();
                    break;
                    //gives count of nodes
                case 7:
                    int count = myList.countNodes();
                    if (count == 0) {
                        System.out.println("List is empty.");
                    }
                    if (count > 0) {
                        System.out.println(count);
                    }
                    System.out.print("---------MAIN MENU--------\n" +
                            "1 – Add First Node\n" +
                            "2 – Add Last Node\n" +
                            "3 – Add At Index\n" +
                            "4 – Remove First Node\n" +
                            "5 – Remove Last Node\n" +
                            "6 – Remove At Index\n" +
                            "7 – Print List Size\n" +
                            "8 – Print List (Forward)\n" +
                            "9 – Print List In Reverse\n" +
                            "10- Exit program\n" +
                            "Enter option number:  ");
                    userIn = input.nextInt();
                    break;
                    //prints list
                case 8:
                    System.out.println("Current List: ");
                    myList.printList();
                    System.out.print("\n---------MAIN MENU--------\n" +
                            "1 – Add First Node\n" +
                            "2 – Add Last Node\n" +
                            "3 – Add At Index\n" +
                            "4 – Remove First Node\n" +
                            "5 – Remove Last Node\n" +
                            "6 – Remove At Index\n" +
                            "7 – Print List Size\n" +
                            "8 – Print List (Forward)\n" +
                            "9 – Print List In Reverse\n" +
                            "10- Exit program\n" +
                            "Enter option number:  ");
                    userIn = input.nextInt();
                    break;
                    //prints list forwards then reverse
                case 9:
                    System.out.println("List in forwards order");
                    myList.printList();
                    System.out.println("\nList in reverse order");
                    //passes the tail to ensure recursion will work.
                    myList.printInReverse(myList.tail);
                    System.out.print("\n---------MAIN MENU--------\n" +
                            "1 – Add First Node\n" +
                            "2 – Add Last Node\n" +
                            "3 – Add At Index\n" +
                            "4 – Remove First Node\n" +
                            "5 – Remove Last Node\n" +
                            "6 – Remove At Index\n" +
                            "7 – Print List Size\n" +
                            "8 – Print List (Forward)\n" +
                            "9 – Print List In Reverse\n" +
                            "10- Exit program\n" +
                            "Enter option number:  ");
                    userIn = input.nextInt();
                    break;
                    //stops the program
                case 10: break;
                //makes sure if number that is not an option repeats the menu
                default:
                    System.out.println("Number not in menu");
                    System.out.print("\n---------MAIN MENU--------\n" +
                        "1 – Add First Node\n" +
                        "2 – Add Last Node\n" +
                        "3 – Add At Index\n" +
                        "4 – Remove First Node\n" +
                        "5 – Remove Last Node\n" +
                        "6 – Remove At Index\n" +
                        "7 – Print List Size\n" +
                        "8 – Print List (Forward)\n" +
                        "9 – Print List In Reverse\n" +
                        "10- Exit program\n" +
                        "Enter option number:  ");
                    userIn = input.nextInt();
                    break;
            }
        }

    }

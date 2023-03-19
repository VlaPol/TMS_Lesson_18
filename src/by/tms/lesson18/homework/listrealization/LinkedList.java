package by.tms.lesson18.homework.listrealization;

import by.tms.lesson18.homework.IntLinkedList;

import java.util.Scanner;

public class LinkedList {

    public void getLinkedList() {

        Scanner scanner = new Scanner(System.in);
        IntLinkedList mySingleDirectionLinkedList = new IntLinkedList();

        do {
            System.out.println("\n*********** MENU *************");
            System.out.println("1. print linked list");
            System.out.println("2. add element");
            System.out.println("3. get element");
            System.out.println("4. set element");
            System.out.println("5. linked list size");
            System.out.println("6. remove element from linked list");
            System.out.println("7. last index of element in the linked list");
            System.out.println("8. iteration");
            System.out.println("0. Exit");
            System.out.println("******************************");
            System.out.print("Input task number (0 for exit): ");

            int key = Integer.parseInt(scanner.nextLine());

            switch (key) {
                case 1 -> System.out.println(mySingleDirectionLinkedList);
                case 2 -> {
                    System.out.print("Enter new element: ");
                    int element = Integer.parseInt(scanner.nextLine());
                    mySingleDirectionLinkedList.add(element);
                }
                case 3 -> {
                    System.out.print("Enter index of element: ");
                    int element = Integer.parseInt(scanner.nextLine());
                    System.out.println(mySingleDirectionLinkedList.get(element));
                }
                case 4 -> {
                    System.out.print("Enter index of element: ");
                    int position = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter element: ");
                    int element = Integer.parseInt(scanner.nextLine());
                    System.out.println("Element [" + mySingleDirectionLinkedList.set(position, element) + "] was replaced by " + element);
                }
                case 5 -> System.out.println(mySingleDirectionLinkedList.size());
                case 6 -> {
                    System.out.print("Enter index of element to remove: ");
                    int position = Integer.parseInt(scanner.nextLine());
                    System.out.println("Element [" + mySingleDirectionLinkedList.remove(position) + "] on position [" + position + "] was removed");
                    System.out.println(mySingleDirectionLinkedList);
                }
                case 7 -> {
                    scanner = new Scanner(System.in);
                    System.out.print("Enter element: ");
                    int element = Integer.parseInt(scanner.nextLine());
                    System.out.println(mySingleDirectionLinkedList.lastIndexOf(element));
                }
                case 8 -> {
                    for (Integer integer : mySingleDirectionLinkedList) {
                        System.out.print(integer + " ");
                    }
                }
                case 0 -> {
                    System.out.println("See you!!!");
                    return;
                }
                default -> System.out.println("Wrong key!!!");
            }
        } while (true);
    }
}

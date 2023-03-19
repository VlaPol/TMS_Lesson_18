import java.util.Scanner;

import by.tms.lesson18.homework.listrealization.ArrayList;
import by.tms.lesson18.homework.listrealization.LinkedList;

public class Homework18Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("*********** MENU *************");
            System.out.println("1. Array list realization");
            System.out.println("2. Linked list realization");
            System.out.println("0. Exit");
            System.out.println("******************************");
            System.out.print("Input task number (0 for exit): ");


            int key = scanner.nextInt();

            switch (key) {
                case 1 -> {
                    ArrayList ilr = new ArrayList();
                    ilr.getIntArrayList();
                }
                case 2 -> {
                    LinkedList llr = new LinkedList();
                    llr.getLinkedList();
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
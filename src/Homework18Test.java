import java.util.Scanner;

import by.tms.lesson18.homework.listrealization.IntArrayList;
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
                    IntArrayList ilr = new IntArrayList();
                    ilr.getIntArrayListReaalization();
                }
                case 2 -> {
                    LinkedList llr = new LinkedList();
                    llr.getLinkedListRealization();
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
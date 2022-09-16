package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter 5 lines");
            Scanner scanner = new Scanner(System.in);
            String A = scanner.nextLine();
            listA.add(A);
        }
        System.out.println("List A: " + listA);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter 5 lines");
            Scanner scanner = new Scanner(System.in);
            String B = scanner.nextLine();
            listB.add(B);


        }
        System.out.println("list B : " + listB);

        System.out.println("----------------------------");
        {
            Integer X = 0;


            while (listC.size() < listA.size() + listB.size()) {
                listC.add(listA.get(X));
                listC.add(listB.get(X));
                X++;
            }


            System.out.println("List C " + listC);
            listC.add(listA.get(0));
            listC.add(listB.get(1));

            Collections.sort(listC, new Comparator<String>() {
                @Override
                public int compare(String G1, String G2) {
                    return G1.length() - G2.length();
                }
            });


            System.out.println("Sorted List C: " + listC);
        }
    }
}





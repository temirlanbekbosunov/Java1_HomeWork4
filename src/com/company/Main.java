package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String person[] = new String[3];

        for (int i=0;i<person.length;i++) {
            System.out.print("Введите имя человека: ");
            person[i]= in.nextLine();
        }

        for (int i=0;i<=person.length;i++){
        switch (i){
            case 0:
                System.out.println("Доброе утро "+person[i]);
                break;
            case 1:
                System.out.println("Добрый день "+person[i]);
                break;
            case 2:
                System.out.println("Добрый вечер "+person[i]);
                break;

        }
        }

    }
}

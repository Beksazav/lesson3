package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] name = {"Marat","Murat", "Akbar"};

        for (int i = 0; i < name.length; i++) {

            System.out.println(name[i]);

        }

        String[] name2;
        name2 = Arrays.copyOf(name, 4);

        name2[3] = "Artur";


        for (int i = 0; i < name2.length ; i++) {


            switch (i) {

                case 0:
                    System.out.println("Dobroe utro! " + name2[i]);
                    break;
                case 1:
                    System.out.println("Dobryi den! " + name2[i]);
                    break;
                case 2:
                    System.out.println("Dobryi vecher " + name2[i]);
                    break;
                case 3:
                    System.out.println("Privet " + name2[i]);
                    break;
                default:
                    System.out.println("Net takogo imeni");
            }
        }


    }
}

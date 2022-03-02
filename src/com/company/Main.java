package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Cakes> cakeOptions = new ArrayList<Cakes>();


        cakeOptions.add(new Cakes(1, "small", "Carrot Cake", "Cream Cheese", "Cream Cheese",
                35, true, false));
        cakeOptions.add(new Cakes(1, "Large", "Birthday Cake", "N/A", "Buttercream Frosting",
                45, true, true));
        cakeOptions.add(new Cakes(3, "Large", "Red Velvet", "Raspberry", "Cream Cheese",
                500, true, false));

        List<Cookies> cookieOptions = new ArrayList<Cookies>();
        cookieOptions.add(new Cookies(1, "Chocolate Chip", 1, true, true));
        cookieOptions.add(new Cookies(1, "Sugar Cookie", 1, true, true));
        cookieOptions.add(new Cookies(1, "Peanut Butter", 1, true, true));


        Scanner myScanner = new Scanner(System.in);

        //ACTUAL BAKERY
        System.out.println("Welcome to REJ Bakery");
        System.out.println("Please choose an option to purchase: Cakes[1], Cookies[2], Macaroons[3], Cupcakes[4], Exit Buy Nothing [5]");
        int userInput = myScanner.nextInt();
        if (userInput == 1) {
            for (int i = 0; i < cakeOptions.size(); i++) {
                cakeOptions.get(i).Print();
            }

        }
        if (userInput == 2) {
            for (int i = 0; i < cookieOptions.size(); i++) {
                cookieOptions.get(i).Print();
            }
        }
    }
}

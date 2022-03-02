package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean exitMenu = true;

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

        List<Cupcakes> cupcakeOptions = new ArrayList<Cupcakes>();
        cupcakeOptions.add(new Cupcakes(6, "vanilla", 5.50, true, true));
        cupcakeOptions.add(new Cupcakes(6, "chocolate", 6.25, true, true));
        cupcakeOptions.add(new Cupcakes(6, "oreo", 8.50, true, true));


        List<Macaroons> macaroonsOptions = new ArrayList<Macaroons>();
        macaroonsOptions.add(new Macaroons(4, "vanilla", 4.50, true, true, "green"));
        macaroonsOptions.add(new Macaroons(4, "strawberry", 5.50, true, true, "pink"));
        macaroonsOptions.add(new Macaroons(4, "raspberry", 6.50, true, true, "purple"));


        Scanner myScanner = new Scanner(System.in);

        //ACTUAL BAKERY
        People person = new People("Customer");
        System.out.println("Welcome to REJ Bakery" + person.getTitle());

        Transaction receipt = new Transaction();
        receipt.setCashAvailable(100);
        receipt.setAmtInRegister(50);
        double totalPrice = 0;

        do {
            System.out.println("Please choose an option to purchase: Cakes[1], Cookies[2], Macaroons[3], Cupcakes[4], Exit Buy Nothing [5]");
            int userInput = myScanner.nextInt();

            //Cakes
            if (userInput == 1) {
                for (int i = 0; i < cakeOptions.size(); i++) {
                    cakeOptions.get(i).Print();
                }//end for
                System.out.println("Choose an option: [1] Carrot Cake [2] Birthday Cake [3] Wedding Cake [4] Return to Main Menu");
                int choice = myScanner.nextInt();

                if (choice == 1) {
                    double price = cakeOptions.get(0).getPrice();
                    totalPrice = totalPrice + price;
                    receipt.CalculatePurchase(price, 1);
                }//end choice 1
                if (choice == 2) {
                    double price = cakeOptions.get(1).getPrice();
                    totalPrice = totalPrice + price;
                    receipt.CalculatePurchase(price, 1);

                }//end choice 2
                if (choice == 3) {
                    double price = cakeOptions.get(2).getPrice();
                    totalPrice = totalPrice + price;
                    System.out.println(receipt.CalculatePurchase(price, 1));
                }//end choice 3
                if (choice == 4) {
                    break;
                }//end choice 4

            }//end if

            //Cookies
            else if (userInput == 2) {
                for (int i = 0; i < cookieOptions.size(); i++) {
                    cookieOptions.get(i).Print();
                }//end for
                System.out.println("Choose an option: [1] Chocolate Chip [2] Sugar Cookie [3] Peanut Butter [4] Return to Main Menu");
                int cookieChoice = myScanner.nextInt();

                if (cookieChoice == 1) {
                    double price = cookieOptions.get(0).getPrice();
                    totalPrice = totalPrice + price;
                    receipt.CalculatePurchase(price, 1);
                }//end choice 1
                if (cookieChoice == 2) {
                    double price = cookieOptions.get(1).getPrice();
                    totalPrice = totalPrice + price;
                    receipt.CalculatePurchase(price, 1);

                }//end choice 2
                if (cookieChoice == 3) {
                    double price = cookieOptions.get(2).getPrice();
                    totalPrice = totalPrice + price;
                    System.out.println(receipt.CalculatePurchase(price, 1));
                }//end choice 3
                if (cookieChoice == 4) {
                    break;
                }//end choice 4
            }

            //Cupcakes
            else if (userInput == 3) {
                for (int i = 0; i < cupcakeOptions.size(); i++) {
                    cupcakeOptions.get(i).Print();
                }//end for
                System.out.println("Choose an option: [1] Vanilla [2] Chocolate [3] Oreo [4] Return to Main Menu");
                int cupcakeChoice = myScanner.nextInt();

                if (cupcakeChoice == 1) {
                    double price = cupcakeOptions.get(0).getPrice();
                    totalPrice = totalPrice + price;
                    receipt.CalculatePurchase(price, 1);
                }//end choice 1
                if (cupcakeChoice == 2) {
                    double price = cupcakeOptions.get(1).getPrice();
                    totalPrice = totalPrice + price;
                    receipt.CalculatePurchase(price, 1);

                }//end choice 2
                if (cupcakeChoice == 3) {
                    double price = cupcakeOptions.get(2).getPrice();
                    totalPrice = totalPrice + price;
                    System.out.println(receipt.CalculatePurchase(price, 1));
                }//end choice 3
                if (cupcakeChoice == 4) {
                    break;
                }//end choice 4
            }

            //Macaroons
            else if (userInput == 4) {
                for (int i = 0; i < macaroonsOptions.size(); i++) {
                    macaroonsOptions.get(i).Print();
                }//end for
                System.out.println("Choose an option: [1] Carrot Cake [2] Birthday Cake [3] Wedding Cake [4] Return to Main Menu");
                int choice = myScanner.nextInt();

                if (choice == 1) {
                    double price = macaroonsOptions.get(0).getPrice();
                    totalPrice = totalPrice + price;
                    receipt.CalculatePurchase(price, 1);
                }//end choice 1
                if (choice == 2) {
                    double price = macaroonsOptions.get(1).getPrice();
                    totalPrice = totalPrice + price;
                    receipt.CalculatePurchase(price, 1);

                }//end choice 2
                if (choice == 3) {
                    double price = macaroonsOptions.get(2).getPrice();
                    totalPrice = totalPrice + price;
                    System.out.println(receipt.CalculatePurchase(price, 1));
                }//end choice 3
                if (choice == 4) {
                    break;
                }//end choice 4
            } else {
                break;
            }
        } while (exitMenu);  //end do while
        System.out.println("Your total is: " + totalPrice);
        Transaction registerTotal = new Transaction();
        registerTotal.setAmtInRegister(100.00);
System.out.println("The amount in register is: )" + (registerTotal.getAmtInRegister() + totalPrice);
    }//end main
}

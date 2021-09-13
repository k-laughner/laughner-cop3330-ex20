/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Kaylee Laughner
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("What is the order amount?");
        Scanner input = new Scanner(System.in);
        int order = input.nextInt();

        System.out.println("What state do you live in?");
        Scanner input2 = new Scanner(System.in);
        String state = input2.nextLine();

        double stax = 0;
        double ctax = 0;

        if (state.equals("Wisconsin")){
            System.out.println("What county do you live in?");
            Scanner input3 = new Scanner(System.in);
            String county = input3.nextLine();
            stax = 0.05;
            if (county.equals("Dunn")){
                ctax = 0.004;
            }
            else if (county.equals("Eau Claire")){
                ctax = 0.006;
            }
        }
        else if (state.equals("Illinois")){
            stax = 0.08;
            ctax = 0;
        }
        else {
            stax = 0;
            ctax =0;
        }

        double totalc = order*ctax;
        double totals = order*stax;
        double totaltax = totalc+totals;
        double total = order+totaltax;

        System.out.printf("The total tax is $%.2f. \n The total is $%.2f.", totaltax, total);
    }
}
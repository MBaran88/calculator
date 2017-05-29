package com.calc;

import javafx.scene.web.PromptData;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InputMismatchException {
	// zrobic prosty kalkultor ktory przy uzyciu metody Scanner daje nam mozliwosc dodawania, odejmowania, mnozenia i dzielenia
       /* Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int suma = (x + y);
       System.out.println(suma);*/
       double n1, n2;
       String operation;
       Scanner scannerObject = new Scanner(System.in);
        System.out.println("Enter first number");
        n1 = scannerObject.nextDouble();

        System.out.println("Enter second number");
        n2 = scannerObject.nextDouble();

        Scanner op = new Scanner(System.in);
        System.out.println("Enter your operation");
        operation = op.next();

        try {
            switch (operation) {
                case "+":
                    System.out.println("Your answer is: " + (n1+n2));
                    break;
                case "-":
                    System.out.println("Your answer is: " + (n1-n2));
                    break;
                case "*":
                    System.out.println("Your answer is: " + (n1*n2));
                    break;
                case "/":
                    System.out.println("Your answer is: " + (n1/n2));
                    break;
                default:
                    System.out.println("Ich verstehe nicht");
            }
        } catch (InputMismatchException e){
    }
}

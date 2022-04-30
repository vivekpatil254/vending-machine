package com.bridgelabz;
import java.util.*;

public class VendingMachine {
    int change;
    public void input() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the change in Rs to be return by vending machine");
        change = scanner.nextInt();
        if (change <= 0)
            System.out.println("Enter proper value");
        else {
                this.calculate(change);
        }

    }
        public void calculate(int change)
        {
            if(change==0)
               System.exit(0);
            else if((change-1000)>=0) {
                change = change - 1000;
                System.out.println("1000");
                calculate(change);
            }
            else if((change-500)>=0) {
                    change = change - 500;
                    System.out.println("500");
                    calculate(change);
            }
            else if((change-100)>=0) {
                change = change - 100;
                System.out.println("100");
                calculate(change);
            }
            else if((change-50)>=0) {
                change = change - 50;
                System.out.println("50");
                calculate(change);
            }
            else if((change-10)>=0) {
                change = change - 10;
                System.out.println("10");
                calculate(change);
            }
            else if((change-5)>=0) {
                change = change - 5;
                System.out.println("5");
                calculate(change);
            }
            else if((change-2)>=0) {
                change = change - 2;
                System.out.println("2");
                calculate(change);
            }
            else if((change-1)>=0) {
                change = change - 1;
                System.out.println("1");
                calculate(change);
            }
         }
}

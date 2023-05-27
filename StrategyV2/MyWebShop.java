package StrategyV2;

import java.util.Scanner;

import StrategyV2.Strategies.*;

public class MyWebShop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please select a payment method.\n 1. for PayPal, \n 2. for CashApp,\n 3. for Mastercard");
        int selected = sc.nextInt();
        IPaymentMethod paymentMethod = null;
        switch (selected) {
            case 1:
                paymentMethod = new PayPal();
                break;
            case 2:
                paymentMethod = new CashApp();
                break;
            case 3:
                paymentMethod = new Mastercard();
                break;
            default:
                System.out.println("Invalid selection");
                break;
        }
        paymentMethod.pay();
        System.out.println("Thank you for your purchase");
        sc.close();
    }

}

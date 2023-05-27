package StrategyV2.Strategies;

import StrategyV2.IPaymentMethod;

public class Mastercard implements IPaymentMethod {

    @Override
    public void pay() {
        System.out.println("Mastercard payment method selected");
    }

}

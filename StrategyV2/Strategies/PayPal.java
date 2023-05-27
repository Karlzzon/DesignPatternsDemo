package StrategyV2.Strategies;

import StrategyV2.IPaymentMethod;

public class PayPal implements IPaymentMethod {

    @Override
    public void pay() {
        System.out.println("PayPal payment method selected");
    }

}

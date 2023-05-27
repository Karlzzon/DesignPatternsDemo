package StrategyV2.Strategies;

import StrategyV2.IPaymentMethod;

public class CashApp implements IPaymentMethod {

    @Override
    public void pay() {
        System.out.println("CashApp payment method selected");
    }

}

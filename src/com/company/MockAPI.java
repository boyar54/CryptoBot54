package com.company;

public class MockAPI implements MockInterface{

    @Override
    public void createBuyOrder() {
        System.out.println("Bot buy");
    }

    @Override
    public void createSellOrder() {
        System.out.println("Bot sell");
    }

    @Override
    public int deleteUnexecutedOrders() {
        return 0;
    }

    @Override
    public int getInfOfCurrentOrders() {
        return 0;
    }

    @Override
    public int getInfOnExecutedOrders() {
        return 0;
    }

    @Override
    public int getInfOfCoins() {
        return 0;
    }

}

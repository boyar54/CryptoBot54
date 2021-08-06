package com.company;

public class MockAPI implements MockInterface{

    @Override
    public int createBuyOrder() {
        return 0;
    }

    @Override
    public int createSellOrder() {
        return 0;
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

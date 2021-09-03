package com.company;

public interface MockInterface {
    void createBuyOrder();//создать ордер на покупку
    void createSellOrder();//создать ордер на продажу
    int deleteUnexecutedOrders();//отменить неисполненные ордера
    int getInfOfCurrentOrders();//получить инф. по текущим ордерам
    int getInfOnExecutedOrders();//получить инф. по выполненным ордерам (для ананализа и статистики)
    int getInfOfCoins();//получить инф. по монетам (цены и другие подробности)
}

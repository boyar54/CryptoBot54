package com.company;

public class TradeAlgorithm {

    double maxPriceBtc;
    double halfMaxBtcPrice;
    double priceNow;
    boolean buyOrSell;

    public double getMaxPriceBtc() {
        return maxPriceBtc;
    }
    public void setMaxPriceBtc(double maxPriceBtc) {
        this.maxPriceBtc = maxPriceBtc;
    }


    public double getHalfMaxBtcPrice() {
        return halfMaxBtcPrice;
    }
    public void setHalfMaxBtcPrice(double halfMaxBtcPrice) {
        this.halfMaxBtcPrice = halfMaxBtcPrice;
    }


    public double getPriceNow() {
        return priceNow;
    }
    public void setPriceNow(double priceNow) {
        this.priceNow = priceNow;
    }


    public boolean isBuyOrSell() {
        return buyOrSell;
    }
    public void setBuyOrSell(boolean buyOrSell) {
        this.buyOrSell = buyOrSell;
    }


    //нахождение 50% от цены BTC
    double findHalfMaxBtcPrice (double maxPriceBtc, double halfMaxBtcPrice){
        System.out.println (maxPriceBtc/halfMaxBtcPrice);
        return halfMaxBtcPrice;
    }

    //нахождение корректной цены для сделки
    boolean findingCorrectPrice (double priceNow, double halfMaxBtcPrice){
        if (priceNow < halfMaxBtcPrice){
            System.out.println (buyOrSell = true);
        }
        if (priceNow > halfMaxBtcPrice){
            System.out.println (buyOrSell = false);
        }
        return buyOrSell;
    }


}

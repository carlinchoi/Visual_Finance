package com.techelevator.auctions.model;

import java.io.IOException;

public class StockFeature {
    private String ticker;
    private double currentPrice;

    public double getDividendYield() {
        return dividendYield;
    }

    public void setDividendYield(double dividendYield) {
        this.dividendYield = dividendYield;
    }

    public double getDividendGrowth() {
        return dividendGrowth;
    }

    public void setDividendGrowth(double dividendGrowth) {
        this.dividendGrowth = dividendGrowth;
    }

    public double getPriceYTD() {
        return priceYTD;
    }

    public void setPriceYTD(double priceYTD) {
        this.priceYTD = priceYTD;
    }

    public double getRevenue() {
        return revenue;
    }

    public void setRevenue(double revenue) {
        this.revenue = revenue;
    }

    public double getEbitda() {
        return ebitda;
    }

    public void setEbitda(double ebitda) {
        this.ebitda = ebitda;
    }

    public double getFreeCashFlow() {
        return freeCashFlow;
    }

    public void setFreeCashFlow(double freeCashFlow) {
        this.freeCashFlow = freeCashFlow;
    }

    public double getNetIncome() {
        return netIncome;
    }

    public void setNetIncome(double netIncome) {
        this.netIncome = netIncome;
    }

    public double getEps() {
        return eps;
    }

    public void setEps(double eps) {
        this.eps = eps;
    }

    public double getCashAndDebt() {
        return cashAndDebt;
    }

    public void setCashAndDebt(double cashAndDebt) {
        this.cashAndDebt = cashAndDebt;
    }

    public double getSharesOutstanding() {
        return sharesOutstanding;
    }

    public void setSharesOutstanding(double sharesOutstanding) {
        this.sharesOutstanding = sharesOutstanding;
    }

    private double dividendYield;
    private double dividendGrowth;
    private double priceYTD;
    private double revenue;
    private double ebitda;
    private double freeCashFlow;
    private double netIncome;
    private double eps;
    private double cashAndDebt;
    private double sharesOutstanding;


    // Constructor
    public StockFeature(String ticker) {
        this.ticker = ticker;
    }

    // Getters and setters
    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    // Define getters and setters for the remaining attributes as needed


    //Methods
}

package com.gunyen;

public class DividendGrowth {
    private double dividend;
    private double growthPercent;
    private double yearEnd;

    public DividendGrowth(double dividend, double growthPercent, double yearEnd) {
        this.dividend = dividend;
        this.growthPercent = growthPercent / 100;
        this.yearEnd = yearEnd;
    }

    public double getDividend() {
        return dividend;
    }

    public double getGrowthPercent() {
        return growthPercent;
    }

    public double getYearEnd() {
        return yearEnd;
    }

    public void yearGrowth(){
        System.out.println("Initial investment of $" + getDividend() + " at " + (growthPercent*100) + "%");
        double month = 0;
        for(double i = 1; i <= 12; i++){
            month = this.dividend * this.growthPercent;
            month /= 12;
            this.dividend += month;
            this.yearEnd += month;
            System.out.print("Month " + (int)i + " $" + String.format("%.2f", getDividend()) + " ");
            System.out.println("Dividend return = $" + String.format("%.2f", month));
        }
        System.out.println("Year end total of dividend profit = $" + String.format("%.2f", getYearEnd()));
    }
}

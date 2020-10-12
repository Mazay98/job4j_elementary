package ru.job4j.calculator;

public class Fit {

    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manHeight = 185;
        short womanHeight = 170;
        double manWeight = Fit.manWeight(manHeight);
        double womanWeight = Fit.womanWeight(womanHeight);
        System.out.println("Man " + manHeight + " is " + String.format("%.1f", manWeight));
        System.out.println("Woman " + womanHeight + " is " + String.format("%.1f", womanWeight));
    }

}
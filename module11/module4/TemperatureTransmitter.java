package module4;

import java.util.Scanner;

public class TemperatureTransmitter {
    static double constant = 32;
    static double constantcelsiy = (double) 5/9;
    static double constantfarangeyt = (double) 9/5;

    public static double celsiy(double c){
        return constantfarangeyt*c+constant;
    }

    public static double farangeyt(double f){
        return constantcelsiy*(f-constant);
    }
}

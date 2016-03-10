package module4;

public class TemperatureTransmitter {
    static double constant = 32;
    static double constantcelsiy = (double) 5/9;
    static double constantfarangeyt = (double) 9/5;

    public static double farangeyt(double c){
        return constantfarangeyt*c+constant;
    }

    public static double celsiy(double f){
        return constantcelsiy*(f-constant);
    }
}

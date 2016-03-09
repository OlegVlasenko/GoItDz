package module4;

public class TemperatureTransmitter {
    static double constantcelsiy = (double) 5/9;
    static double constantfarangeyt = (double) 9/5;

    public static double farangeyt(double c){
        return constantfarangeyt*c+32;
    }

    public static double celsiy(double f){
        return constantcelsiy*(f-32);
    }
}

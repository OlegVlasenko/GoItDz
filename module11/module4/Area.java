package module4;

import java.math.*;

public class Area {

    static double constant = 0.5;

    public double areaTriangle(double a, double ha){
        return constant*a*ha;
    }

    public double areaRectangle(double a, double b){
        return a*b;
    }

    public double areaCircle(double r){
        return Math.PI*Math.pow(r, 2);
    }

}

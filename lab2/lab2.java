package lab2;

public class lab2 {
    public static void main(String[] args){
        Point3d myPoint = new Point3d (8,5,7);
        System.out.println( myPoint.getX()+ " " + myPoint.getY() + " " + myPoint.getZ());

        if(myPoint.getX() != myPoint.getY() && myPoint.getY() != myPoint.getZ() && myPoint.getX() != myPoint.getZ()){
            System.out.println("Площадь треугольника: " + computeArea(myPoint.getX(),myPoint.getY(),myPoint.getZ()));
        }else{
            System.out.println("Расчет невозможен");
        }
    }

    public static double computeArea(double a, double b, double c){
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}

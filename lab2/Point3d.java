package lab2;

public class Point3d
{
    public static void main(String[] args){
        Point3d myPoint = new Point3d (0,0,0);


        System.out.println( myPoint.getX()+ " " + myPoint.getY() + " " + myPoint.getZ());
        System.out.println(myPoint.compare(myPoint.getX(),myPoint.getY()));
        System.out.println(myPoint.distanceTo(myPoint.getX(),myPoint.getY()));
    }

    /** координата Y **/
    private double xCoord;
    /** координата Y **/
    private double yCoord;
    /** координата Z **/
    private double zCoord;
    /** Конструктор инициализации **/
    Point3d(double x, double y, double z) {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }
    /** Конструктор по умолчанию. **/
    private Point3d () {
    //Вызовите конструктор с двумя параметрами и определите источник.
        this(0, 0, 0);
    }
    /** Возвращение координаты X **/
    public double getX () {
        return xCoord;
    }
    /** Возвращение координаты Y **/
    public double getY () {
        return yCoord;
    }
    /** Возвращение координаты Z **/
    public double getZ () {
        return zCoord;
    }
    /** Установка значения координаты X. **/
    public void setX ( double val) {
        xCoord = val;
    }
    /** Установка значения координаты Y. **/
    public void setY ( double val) {
        yCoord = val;
    }
    /** Установка значения координаты Z. **/
    public void setZ ( double val) {
        yCoord = val;
    }

    public boolean compare(double cor1, double cor2){

        if(cor1 == cor2){
            return true;
        }
        return false;
    }

    public double distanceTo(double x, double y){
        double dist = x - y;
        return  dist;
    }
}

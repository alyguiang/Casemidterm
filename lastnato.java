package lastnato;

public class Two {


    public static void main(String[] args) {
        
         Formula fmla = new Formula();
         
         //Made By Bern
         //start
         System.out.println(fmla.areaOfCircle(4.0));
         System.out.println(fmla.areaOfTriangle(5.0,7.0));
         System.out.println(fmla.areaOfSquare(6.5));
         System.out.println(fmla.areaOfRectangle(4.5,3.5));
         //end
         
         //Made By Allen
         //start
         System.out.println(fmla.perimeterOfCircle(7.0));
         System.out.println(fmla.perimeterOfSquare(4.0));
        System.out.println(fmla.perimeterOfRectangle(10.0,9.0));
        System.out.println(fmla.perimeterOfParallelogram(4.0,6.5));
         //end
    }
}
package two;
class Formula {

public double areaOfCircle(double r) {
    double pi = 3.1415;
    double area = (pi*(r*r));
            return area;
}
public double areaOfTriangle(double b, double h) {
     double area = (b*h)/2;
            return area;
}
public double areaOfSquare(double a) {
     double area = (a*a);
            return area;
}
public double areaOfRectangle(double b, double h) {
     double area = (b*h)/2;
            return area;
}
public double perimeterOfCircle(double h) {
     double area = (h*h)/2;
            return area;
}
public double perimeterOfSquare(double i) {
     double area = (i*i)/2;
            return area;
}
public double perimeterOfRectangle(double a, double b) {
     double area = 2*(a+b);
            return area;
}
public double perimeterOfParallelogram(double c, double d) {
     double area = 2*(c=d);
            return area;
}
public double volumeOfCone(double a, double c) {
     double pp = 3.142;
     double area = pp*(a*c)/2;
            return area;
}
public double volumeOfSphere(double a) {
    int r = 48; 
    double pp = 3.14;
    double area = a * pp * (r*r*r);
    return area;
}
public double volumeOfCylinder(double b, double c) { 
    double pp = 3.14;
    double area = pp *(b*c);
    return area;
}
public double volumeOfBox(double a, double b, double c) {
    double area = a*b*c;
    return area;
}
}

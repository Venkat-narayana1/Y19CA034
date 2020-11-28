import java.util.*;
final class circle{
final double pi=3.14;
final double r;
circle(double r)
 {
 this.r=r;
 }
final void area()
 {
 double a=pi*r*r;
 System.out.println("the area of the circle is:"+" "+a);
 }
}
class FinalDemo{
public static void main(String args[]){
circle c=new circle(6);
c.area();
}
}

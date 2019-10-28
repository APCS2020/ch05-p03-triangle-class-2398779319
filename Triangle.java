public class Triangle{
    private double length;
    private double height;
    private String color;

public Triangle(double l,double h,String c){
    this.length = l;
    this.height = h;
    this.color = c;
}
public double getlength(){
    return length;
}
public double getheight(){
    return height;
}
public String getcolor(){
    return color;
}
public void setlength(double l){
    this.length = l;
}
public void setwidth(double h){
    this.height = h;
}
public void setcolor(String c){
    this.color = c;
}
public Triangle(){
    this.color = "red";
    this.length = 1.0;
    this.height = 2.5;
}
public double getArea(){
    return length * height % 2;
}
}
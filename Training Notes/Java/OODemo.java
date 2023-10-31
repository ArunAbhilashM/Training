class Pen{
 private String color;
private int size;
public void setColor(String color){
this.color=color;
}
public String getColor(){
return color;
}
public void writeText(String msg){
System.out.println(msg+"is written in"+color);
}
}
public class OODemo{
public static void main(String[] args){
Pen redPen=new Pen();
redPen.setColor("red");
redPen.writeText("Hello World");
}
}
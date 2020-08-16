package pro;
import java.util.*;
class Rectangle {
    int width, height;
     void display() {
        System.out.println(height+" "+width);
    }
}
class RectangleArea extends Rectangle {
    void read_input() {
    	RectangleArea  obj=new RectangleArea (); 
       int h,w;
      // h=obj.height;
       //w=obj.width;
       Scanner scan = new Scanner(System.in);
	obj.height = scan.nextInt();
	obj.width=scan.nextInt();
		scan.close();
    }
     void display() {
    	 int c;
    	 c= obj.height*obj.width;
    	 System.out.println(c);
    }
}
public class program8 extends RectangleArea{
public static void main(String args[]) {
	program8 p=new program8();
	p.read_input();
	p.display();
	//System.out.println("hi");
}
}

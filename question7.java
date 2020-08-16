package pro;
import java.util.Scanner;
class Triangle{
    public float getArea(float a, float b, float c){
        float s = (a+b+c)/2f;


        double area = Math.sqrt((s*(s-a)*(s-b)*(s-c)));
        return (float)area;
    }
}
class assignment7 {

    assignment7(){
        Triangle t = new Triangle();
        Scanner scan = new Scanner(System.in);
        float  a = scan.nextFloat();
        float b =  scan.nextFloat();
        float c = scan.nextFloat();
        System.out.println(t.getArea(a,b,c));
    }

    public static void main(String[] args) {
        assignment7 test = new assignment7();
    }

}
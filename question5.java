package pro;
import java.util.*;

import java.util.*;
class Complex {

    int real, imaginary;

   
    Complex()
    {
    }

   
    Complex(int tempReal, int tempImaginary)
    {
        real = tempReal;
        imaginary = tempImaginary;
    }

    Complex addComp(Complex C1, Complex C2)
    {
        
        Complex temp = new Complex();

        
        temp.real = C1.real + C2.real;

        
        temp.imaginary = C1.imaginary + C2.imaginary;

        
        return temp;
    }
    Complex subtractComp(Complex C1, Complex C2)
    {
        
        Complex temp = new Complex();

        
        temp.real = C1.real - C2.real;

       
        temp.imaginary = C1.imaginary - C2.imaginary;

        
        return temp;
    }
    Complex multiplyComp(Complex C1, Complex C2)
    {
        
        Complex temp = new Complex();

        
        temp.real = (C1.real*C2.real)-(C1.imaginary*C2.imaginary);

        
        temp.imaginary = (C1.real*C2.imaginary) + (C1.imaginary*C2.real);

        
        return temp;
    }
}


public class assignment5{

   
    public static void main(String[] args)
    {


        Complex C1 = new Complex(5, 8);

        
        System.out.println("Complex number 1 : "
                + C1.real + " + i"
                + C1.imaginary);

        
        Complex C2 = new Complex(9, 7);

        
        System.out.println("Complex number 2 : "
                + C2.real + " + i"
                + C2.imaginary);

       
        Complex C3 = new Complex();
        Complex C4 = new Complex();
        Complex C5 = new Complex();

        
        C3 = C3.addComp(C1, C2);
        C5 = C5.subtractComp(C1, C2);
        C4 = C4.multiplyComp(C1, C2);


 
        System.out.println("Sum of complex number : "+ C3.real + " + i" + C3.imaginary);
        System.out.println("Subtraction of complex number : "+ C4.real + " + i" + C4.imaginary);
        System.out.println("Multiplication of complex number : " + C5.real + " + i" + C5.imaginary);
    }
}
import java.util.*;

public class MethodWorking {
    public void passByValue(int a){
        a+=2;
        System.out.println("Value of the number inside the method: "+a);
    }
    public void passByValue(boolean b){
        b=!b;
        System.out.println("Value of the boolean value now: "+b);
    }
    public void passByRefernce(Pen pen){
        pen.changeInkLevel(20);
    }
    public void passByReferenceArrays(Pen[] pens){
        for(Pen p:pens){
            p.changeInkLevel(30);
            System.out.println(p.toString());
        }
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        MethodWorking m=new MethodWorking();
        int a=sc.nextInt();
        m.passByValue(a);
        System.out.println("Value of number outside method/after method changing its value: "+a);
        System.out.println("Enter true/false");
        boolean b=sc.nextBoolean();
        m.passByValue(b);
        System.out.println("Value of booolean value outside method/after method changing its value: "+b);

        Pen pen=new Pen();
        pen.setColor("blue");
        pen.setInkLevel(0);
        pen.setType("ballpoint");
        System.out.println("Pen state before passing value by reference: "+pen.toString());
        m.passByRefernce(pen);
        System.out.println("Penstate before passing value by reference: "+pen.toString());

        Pen[] p = {
                new Pen(80, "blue","ballpoint"),
                new Pen(20, "red","fountain")
        };

        System.out.println("Array before method call");
        for(Pen pp:p){
            System.out.println(pp.toString());
        }
        System.out.println("Array after method call:\n");
        m.passByReferenceArrays(p);

        System.out.println("Calling methods of MathUtils class\n");
        int sq=MathUtils.square(8);
        System.out.println("Square of n "+8+"is: "+sq);
        int fac=MathUtils.factorial(4);
        System.out.println("Factorial of "+4+"is: "+fac);
        boolean prime=MathUtils.isPrime(5);
        if (prime == true) {
            System.out.println("It is a prime number");
        }
        else {
            System.out.println("It is not a prime number");
        }

    }
}

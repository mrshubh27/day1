import java.util.Scanner;

public class assign2 
{  
public static void main(String args[])   
{  

    Scanner sc = new Scanner(System.in);

    float a,b,sum;

    System.out.println("Enter the first number a");
    a = sc.nextFloat();

    System.out.println("Enter the second number b");
    b = sc.nextFloat();    

    sc.close();
    sum = a + b;
    System.out.println("The sum of a and b is " + sum);
}  
} 
import java.util.Scanner;
public class assign1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the roll number of student");
        int rollno = sc.nextInt();
        
        System.out.println("Enter the name of student");
        String name = sc.next();

        System.out.println("Enter the surname of student");
        String surname = sc.next();
        
        System.out.println("Enter the marks out of 100");
        float marks = sc.nextFloat();
        
        sc.close();
    
        System.out.println("\nThe roll no of student\n" + rollno);
        System.out.println("The name of student\n" + name + " " + surname);
        System.out.println("The marks of student\n" + marks);
        
    }
}
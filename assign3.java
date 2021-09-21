import java.util.Scanner;

public class assign3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the customer name");
        String name = sc.nextLine();
        System.out.println("Enter the distance travelled in km");
        float dist = sc.nextFloat();
        float sum;
        
        if(dist==5){
            sum = dist * 6;
            System.out.println("The fare for " + dist + " km is " + sum + "rs");
        }
       
        else{
            sum = 30 + (dist-5)*8;
            System.out.println("The fare for " + dist + " km is " + sum + "rs");
        }
    }
}
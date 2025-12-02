import java.util.*;
public class loop5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");

        int n = sc.nextInt();
    int remainder = n % 2;

        switch(remainder){
            
            case 0:
                
                System.out.println("even");
                break;
            case 1:
                System.out.println("odd");
                break;
           
            default:
                System.out.println("invalid input");

break;




        }

        }
        
}
    


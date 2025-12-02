import java.util.*;
public class operator3 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n:");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int sum = 0;
        for(int i = 0 ; i<=n ; i++){

            sum += 2*i ;

        }
        System.out.println(sum);


    }
    
}

import java.util.*;
public class operator2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enters number to compare:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int max = 0;
        max = a>b?a>c?a:c : b>c?b:c;
        System.out.println(max);


    }
    
}

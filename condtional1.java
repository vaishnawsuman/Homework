import java.util.*;

public class condtional1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter age of the candiate for vote:");
        int age = sc.nextInt();
        if(age > 18){
            System.out.println("candidate can vote.");

        }else{
            System.out.println("candidate cannot vote.");
        }

    }
    
}

import java.util.*;
public class conditional4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sides of triangle:");
int a = sc.nextInt();
int b = sc.nextInt();
int c = sc.nextInt();

if(a== b && b==c){
    System.out.println("equilateral triangle");
}else if(a==b || b==c || c==a){
    System.out.println("isosceles triangle");
}else{
    System.out.println("scalene triangle.");
}

    }
    
}

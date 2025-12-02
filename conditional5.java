import java.util.*;
public class conditional5 {
    public static void main(String[] args) {
        System.out.println("enter: ");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();

if( a > b){
System.out.println("a is bigger than b");
    if(a > c){
        System.out.println("a is greater than c");
    System.out.println("a is greatest."+a);
    
    }else{
        System.out.println("c is greater than a");
        System.out.println("c is greatest."+c);
    }
 } else{
        System.out.println("b is  greater than a");
        if(b > c){
            System.out.println("b is greater than c");
System.out.println("b is greatest.");
        }else{
            System.out.println("c is greater than b");
            System.out.println("c is greatest"+c);
        }
  
}

   
}  
}

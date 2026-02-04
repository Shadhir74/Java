import java.util.*;
public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        if(n%1==1 && n%n==1){
            System.out.println("prime");
        }else{
            System.out.println("not prime");
        }
    }
    
}

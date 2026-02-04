import java.util.*;
public class Marks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 for input && enter 0 to stop");
        int input = sc.nextInt();
        if(input==1){
            System.out.println("enter Marks from 0 to 100 ");
            int Marks =sc.nextInt();


            if(Marks>=90 && Marks<=100){
                System.out.println("excellent");
            }else if(Marks>=60 && Marks <90){
                System.out.println("Good");
            }else if (Marks >=0 && Marks <60){
                System.out.println("average");
            }else{
                System.out.println("invalid Marks");
            }
        }else{
            System.out.println("stop");
        }
        sc.close();
    }
}
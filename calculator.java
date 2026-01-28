// import java.util.Scanner;
// public class calculator{
//     //condition switch
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the a value :");
//         int a = sc.nextInt();
//         System.out.print("Enter the b value :"); 
//         int b = sc.nextInt();
        
//         System.out.print("Enter the operation :"); 
//         char calculate = sc.next().charAt(0);

public class calculator {

    public static void main(String[] args) {
        
        String str = "shadhir";
        for(int i=0;i<str.length();i++){
            
            char curr = str.charAt(i);
            System.out.println(curr); 
        }
    }
    
}

//         switch(calculate){
//             case '+' : System.out.println(a+b);
//             break;
//             case '-' : System.out.println(a-b);
//             break;
//             case '*' : System.out.println(a*b);
//             break;
//             case '/' : System.out.println(a/b);
//             break;
//             case '%' : System.out.println(a%b);
//             break;
//             default : System.out.println("invalid choice");
//     }
    
// }

// }
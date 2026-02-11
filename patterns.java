public class patterns {
    public static void main(String[]args){

        // rectangular pattern

        // nrml


        //  for(int i =0;i<=4;i++){
        //     System.out.println("****");
        // }


        // int n=5;
        // int m=5;

        // // nested loop
        // // outer loop
        // for(int i=1;i<=n;i++){
        //     // inner loop
        //     for(int j=1;j<=m;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }


        // hollow rectangle

        
    //     int n=4;
    //     int m=5;

    //     // outr loop
    //     for(int i=1;i<=n;i++){
    //         // inner loop
    //         for( int j=1;j<=m;j++){
    //             if(i==1 || j==1 || i==n || j==m){
    //                 System.out.print("*");
    //             }else{
    //                 System.out.print(" ");
    //             }
    //         }
    //         System.out.println();
        

    // } 



    // half pyramid


    // System.out.println("*\n**\n***\n****");

    // loops
    
    // int n=4;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }


    // inverted half pyramid


//     int n=4;
//     for(int i=4;i>=1;i--){
//         for(int j=1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//     }

    //  inverted half pyramid
    // (rotated by 180)


    // int n=4;
    // for(int i=1;i<=n; i++){
    //     for(int j=1;j<=n-i;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=i;j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // half pyramid with numbers

    // int n=5;
    // // outer loop
    // for(int i=1;i<=n;i++){
    //     // inner loop
    //     for(int j=1;j<=i;j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }

    // inverted half pyramid with numbers

    // outer loop
    // int n=5;
    // for(int i=1;i<=n;i++){
    //     // inner loop
    //     for(int j=1;j<=n-i+1;j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }

    // floyd's Triangle

    // int n=5;
    // int number = 1;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         System.out.print(number+" ");
    //         // number =no.+1
    //         number++;
    //     }
    //     System.out.println();
    // }

    // 0-1 triangle
    // int n=5;
    // for(int i=1;i<=n;i++){
    //     for(int j=1;j<=i;j++){
    //         int sum =i+j;
    //         if(sum %2 ==0){
    //             // even
    //             System.out.print("1 ");
    //         }else{
    //             // odd
    //             System.out.print("0 ");
    //         }
            
    //     }
    //     System.out.println();
    // }

    // full pyramid
        int n = 5;   // number of rows

        for(int i = 1; i <= n; i++) {

            // print spaces
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // print stars
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }

            // move to next line
            System.out.println();
        }
    }
}


 
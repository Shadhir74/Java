public class patterns {
    public static void main(String[]args){
        // for(int i =0;i<=4;i++){
            // System.out.println("****");
        // }
        // int n=5;
        // int m=5;

        // nested loop
        // outer loop
        // for(int i=1;i<=n;i++){
        //     // inner loop
        //     for(int j=1;j<=m;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println(" ");
        // }

        // hollow rectangle
        
        int n=4;
        int m=5;

        // outr loop
        for(int i=1;i<=n;i++){
            // inner loop
            for( int j=1;j<=m;j++){
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        

    } 
}
}
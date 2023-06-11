public class pattern28 {
    static void pattern21(int n)
    {
          // outer loop for no. of rows.
         for(int i=0;i<n;i++){
             
             // inner loop for printing the stars at borders only.
             for(int j=0;j<n;j++){
                 
                 if(i==0 || j==0 || i==n-1 || j==n-1)
                    System.out.print("*");
                    
                 // if not border index, print space.
                 else System.out.print(" ");
             }
             
              // As soon as the stars for each iteration are printed, we move to the
              // next row and give a line break otherwise all stars
              // would get printed in 1 line.
              System.out.println();
         }
    }
    
        public static void main(String[] args) {
            
            // Here, we have taken the value of N as 5.
            // We can also take input from the user.
            int N = 5;
            pattern21(N);
        }
}

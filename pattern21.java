public class pattern21 {
    static void pattern20(int n)
    {
          // initialising the spaces.
          int spaces = 2*n-2;
          
          // Outer loop for printing row.
          for(int i = 1;i<=2*n-1;i++){
              
              // stars for first half
              int stars = i;
              
              // stars for the second half.
              if(i>n) stars = 2*n - i;
              
              //for printing the stars
              for(int j=1;j<=stars;j++){
                  System.out.print("*");
              }
              
              //for printing the spaces
              for(int j = 1;j<=spaces;j++){
                  System.out.print(" ");
              }
              
              //for printing the stars
              for(int j = 1;j<=stars;j++){
                  System.out.print("*");
              }
              
              // As soon as the stars for each iteration are printed, we move to the
              // next row and give a line break otherwise all stars
              // would get printed in 1 line.
              System.out.println();
              if(i<n) spaces -=2;
              else spaces +=2;
          }
    }
    
        public static void main(String[] args) {
            
            // Here, we have taken the value of N as 5.
            // We can also take input from the user.
            int N = 5;
            pattern20(N);
        }
}

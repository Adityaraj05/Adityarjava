public class pattern18 {
    static void pattern10(int N)
    {
        // Outer loop for number of rows.
        for(int i=1;i<=2*N-1;i++){
            
              // stars would be equal to the row no. uptill first half
              int stars = i;
              
              // for the second half of the rotated triangle.
              if(i>N) stars = 2*N-i;
              
              // for printing the stars in each row.
              for(int j=1;j<=stars;j++){
                  System.out.print("*");
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
            pattern10(N);
        }
}

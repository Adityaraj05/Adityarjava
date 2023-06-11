public class pattern27 {
    static void pattern15(int N)
    {
         
          // Outer loop for the number of rows.
          for(int i=0;i<N;i++){
              
              // Inner loop will loop for i times and
              // print alphabets from A to A + (N-i-1).
              for(char ch = 'A'; ch<='A'+(N-i-1);ch++){
                  System.out.print(ch + " ");
                  
              }
              // As soon as the letters for each iteration are printed, we move to the
              // next row and give a line break otherwise all letters
              // would get printed in 1 line.
              System.out.println();
             
          }
    }
    
        public static void main(String[] args) {
            
            // Here, we have taken the value of N as 5.
            // We can also take input from the user.
            int N = 5;
            pattern15(N);
        }
}

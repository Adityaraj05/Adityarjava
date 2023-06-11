// Recursion 7
// 1.  Remove all the occcurrences of 'a' from the strings = 'abcax'.

// time complexity:-  no of calls * time taken in 1 call (n^2) {concatention is linear in time means big o of n}

// import java.util.Scanner;
// public class lecture34 {

//     // dbacx --> dbcx
//     static String removeA(String s, int idx){
//         // base case
//         if(idx == s.length()) return "";

//         // recursive case
//         String smallAns = removeA(s, idx+1);
//         char currChar = s.charAt(idx);


//         // self work
//         if(currChar != 'a'){
//             return currChar + smallAns; // dbcx
//         }else{
//             return smallAns;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         System.out.println(removeA(s, 0));
//     }
    
// }

// alternate method without passing the index value we will solve .


// import java.util.Scanner;
// public class lecture34 {
//     static String removeA2(String s){
//         if(s.length() == 0) return "";
//         String smallAns = removeA2(s.substring(1));
//         char currChar = s.charAt(0);
//         // self work
//         if(currChar != 'a'){
//             return currChar + smallAns; // dbcx
//         }else{
//             return smallAns;
//         }


//     }

//     // dbacx --> dbcx
//     static String removeA(String s, int idx){
//         // base case
//         if(idx == s.length()) return "";

//         // recursive case
//         String smallAns = removeA(s, idx+1);
//         char currChar = s.charAt(idx);
        


//         // self work
//         if(currChar != 'a'){
//             return currChar + smallAns; // dbcx
//         }else{
//             return smallAns;
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         // System.out.println(removeA(s, 0));
//         System.out.println(removeA2(s));
//     }
// }







// 2.Write a program to print reverse of a string using recursion.
    
// import java.util.Scanner;
// public class lecture34 {
//     static String reverse(String s, int idx){
//         if(idx == s.length()) return "";
//         String smallAns = reverse(s,idx+1);
//         return smallAns + s.charAt(idx);

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         System.out.println(reverse(s, 0));
       
//     }
// }


// 3. Write a program to check given string is palindrome or not. time complexity O(n)
    
// import java.util.Scanner;
// public class lecture34 {
//     static String reverse(String s, int idx){
//         if(idx == s.length()) return "";
//         String smallAns = reverse(s,idx+1);
//         return smallAns + s.charAt(idx);

//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         String rev = reverse(s, 0);
//         if(rev.equals(s)){
//             System.out.printf("%s Palindrome", s);
//         }else{
//             System.out.printf("%s is Not Palindrome", s);
//         }
       
//     }  
// }



// alternate method without reversing the string 
    
import java.util.Scanner;
public class lecture34 {
    static boolean isPalindrome(String s, int l, int r) {
        if(l>= r) return true;
        return (s.charAt(l) == s.charAt(r) && isPalindrome(s, l+1, r-1));
        
    }

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(isPalindrome(s, 0, s.length()-1));
       
       
    }  
}

 
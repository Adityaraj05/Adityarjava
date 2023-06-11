// Recursion on string new topic
// import java.util.*; 
// public class array11th {
    // public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // String s = sc.nextLine(); //nextline print different lines  
        // System.out.println(s);
        // char ch  = s.charAt(0); // return index value 
        // System.out.println(ch);
        /*
         college
         0123456    total length : 7
         */
        // for(int i = 0; i < s.length(); i++){
        //     System.out.println(s.charAt(i));
        // }


        // System.out.println(s.substring(2,4));// only second and third index will print 
    // }
    
// }



// Remove all the occurrences of 'a' from string s = "abcax".
// import java.util.*; 

// public class array11th {

//     public class RemoveOccurrences{
//         static String removeAr(String s, int idx){
//             // base case
//             if(idx ==s.length()) return "";
//             // ṛecursive case
//             String smallAns = removeAr(s, idx+1);
//             char currChar = s.charAt(idx);
//             // self work
//             if(currChar!='a'){
//                 return currChar + smallAns;

//             }else{
//                 return smallAns;
//             }

//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         System.out.println(removeAr(s, 0));

        
//     }
// }

// otherapproach
// time complexity:O(n^2)
// space complexity:O(n)
// import java.util.*; 

// public class array11th {

//     public class RemoveOccurrences{
//         static String removeAr(String s){
//             // base case
//             if(s.length()==0) return "";
//             // ṛecursive case
//             String smallAns = removeAr(s.substring(1));
//             char currChar = s.charAt(0);
//             // self work
//             if(currChar!='a'){
//                 return currChar + smallAns;

//             }else{
//                 return smallAns;
//             }

//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         System.out.println(removeAr(s));

        
//     }
// }

// 3. Write a program to print reverse of a string using recursion.
// Time complexity:O(n^2)
import java.util.*; 

public class array11th {

    static String reverse(String s, int idx) {
        if(idx == s.length()) return "";
        String smallAns = reverse(s, idx+1);
        return smallAns + s.charAt(idx);


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverse(s,0));


        
    }
}







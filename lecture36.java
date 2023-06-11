// Given a string containing digits from 2-9 inclusive . return all possible letter combinations that the number could represent.
// frog problem
//Q.... there are N stones, numbered 0,1,2,3,.....N-1. For each i (0<=i<=N) the height of stone i is hi. There is a frog who is intially on stone 0. He will reeat the following actions some number of times to reach Stone N-1:
// If the frog is currently on Stone i, jump to stone i+1 or stone i+2.
// Here a cost of |hi-hj| is incurred before the frog reaches stone N. 
// Find the minimum possible total cost incurred before the frog reaches stone N.
// input n = 4
// arr[]=10,30,40,20
// outut: 30
// time complexity = O(2^n) 

// public class lecture36 {

//     static int best(int[] h, int n, int idx){
//         if(idx == n-1) return 0;
//         int opt1 = best(h, n, idx+1) + Math.abs(h[idx] - h[idx+1]);
//         if(idx == n-2) return opt1;
//         int opt2 =  best(h, n, idx+2) + Math.abs(h[idx] - h[idx+2]);
    
//         return Math.min(opt1, opt2);
//     }


//     public static void main(String[] args) {
//         int[] h = {10,30,40,20};
//         System.out.println(best(h, h.length, 0));
        
//     }
    
// }




// 2.

// Ascii --> American standard code for information interchange

// --> Standard data encoding format for communication between computer.

// --> assign standard value to letters, numerical , charaters etc. 



// a -z : 97 to 122
//A -Z : 65 to 90 

// question....Given a string digits from 2-9 inclusive,return all posssible letter combinations that the number could represent. Return the answer in any order.


// input digits = "23".
// output digits = ["ad","ae","af","bd","be","bf","cd","ce","cf"]

// standard question.

// time complexity: O(n*4^n):  { i call   O(n) *  toatl no. of call O(4^n)  }

public class lecture36 {

    static void combination(String dig,String[] kp  , String res){//"253" --> kp[2]
        if(dig.length()==0){
            System.out.println(res + " ");
            return;
        }
        int currNum = dig.charAt(0) - '0';//to convert a character into integer  and we get the current number 2
        String currChoices = kp[currNum]; // "abc"
        for(int i=0; i<currChoices.length(); i++){
            combination(dig.substring(1), kp, res + currChoices.charAt(i));
        }


    }
       


    public static void main(String[] args) {
        String dig = "23";
        String[] kp = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz",};
        //              0, 1,  2,    3,    4,    5,    6,    7,      8,   9
        combination(dig, kp,"");
    }
    
}






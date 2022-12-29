import java.util.Scanner;
import java.util.function.DoubleUnaryOperator;

// public class second_question {
    // public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter any integer: ");
//         int n = sc.nextInt();
       
        
//         System.out.println(Math.abs(n));

//     }
    
// }


// another code Profit loss


    //    public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter cost price: ");
    //     int cp = sc.nextInt();
    //     System.out.println("Enter selling  price: ");
    //     int sp = sc.nextInt();
    //     if(sp>cp){
    //         System.out.print("you profit is: ");
    //         System.out.println(sp-cp);
            
    //     }if(cp>sp){
    //         System.out.print("You loss is: ");
    //         System.out.println(cp-sp);
    //     }
        
    //    }
    // }

// profit ans loss


//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the length of rectangle: ");
//         int length  = sc.nextInt();
//         System.out.println("Enter the width of the rectangle: ");
//         int width = sc.nextInt();
//          int area = length * width;
//          System.out.println("Area of the rectangle is: "+area);
//          int perimeter = 2*(length+width);
//          if(area > perimeter){
//             System.out.println("Area is greater than perimeter");
//          }
//          else if(perimeter<area){
//             System.out.println("Perimeter is greater than area");
//           }
//         else{
//         System.out.println("Perimeter is equal to area");
//             }
//     }
// }




// percentage

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         if(n>90){
//             System.out.println("Excellent");
//         }
//         else if(n>80){
//              System.out.println("Very good");
//         }
//         else if(n>70){
//             System.out.println("Good");
//         }
//         else if(n>50){
//             System.out.println("Average Marks");
//         }
//         else if(n>40){
//             System.out.println("Below Average");
//         }else{
//             System.out.println("Fail");
//         }

    
//    }
// }




// Take positive integer input and tell if it is a three digit number or not.
      


//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int n = sc.nextInt();
//         if(n >99 && n <1000){
//             System.out.println("The given number three digit number ");
//         }else{
//             System.out.println("The entered number is not a three digit number");
//         }
//     }
    
// }




// the given number is divisble by 5 and 3
//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int n = sc.nextInt();
//         if(n % 5==0  && n % 3==0){
//             System.out.println("The given number is divisible by 5 and 3 ");
//         }else{
//             System.out.println("The entered number is not divisible by 5 and 3");
//         }
//     }
    
// }


// Take positive integer and input and tell if it is divisible by 5 or 3.


//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number:");
//         int n = sc.nextInt();
//         if(n % 5==0  || n % 3==0){
//             System.out.println("The given number is divisible by 5 or 3 ");
//         }else{
//             System.out.println("The entered number is not divisible by 5 or 3");
//         }
//     }
    
// }


// TAke 3 positive integer input and  print the greatest of them

//      public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first number: ");
//         int a = sc.nextInt();
//         System.out.println("Enter the second number: ");
//         int b = sc.nextInt();
//         System.out.println("Enter the third number: ");
//         int c = sc.nextInt();
//         if(a>b && a>c){
//             System.out.println(a+ " is largest");
//         }
//         else if(b>a && b>c){
//             System.out.println(b + " is largest");
//         }
//         else{
//             System.out.println(c + " is largest");
//         }
       
//     }
    
// }





// side of triangle which is greater
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter first side: ");
//         int a = sc.nextInt();
//         System.out.println("Enter the second side: ");
//         int b = sc.nextInt();
//         System.out.println("Enter the third side: ");
//         int c = sc.nextInt();
//         if(a+b>c && b+c>a && a+c>b){
//             System.out.println("Valid triangle");
//         }else{
//             System.out.println("Invalid triangle");
//         }
//     }

// }




// Nested if else

// write a program to find is a number is divisible by both 3 and 5 .
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int n = sc.nextInt();
//         if(n%5==0){
//             if(n%3==0){
//                 System.out.println("The number is divisible by 3 and 5");
//             }
//             else{
//                 System.out.println("Not divisible");
//             }    
//         }
//          else{
//              System.out.println("Not divisible");
//             }
//     }
   

// }



// Take positive integer input and tell if it is divisible by 5 and 3 but not divisible by 15



//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number: ");
//         int n = sc.nextInt();
//         if(n%5==0|| n%3==0){
//             if(n%15!=0){
//                 System.out.println("The number is divisible by 3 and 5 but not divisible by 15");
//             }
//             else{
//                 System.out.println("Not Matching the required condition");
//             }    
//         }
//          else{
//              System.out.println("Not Matching the required condition");
//             }
//     }
   



// alter method

    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter a number: ");
    //     int n = sc.nextInt();
    //     if((n%5==0 || n%3==0) && (n%15!=0) ){
    //         System.out.println("The number is divisible by 3 and 5 but not divisible by 15");
    //         }
    //         else{
    //             System.out.println("Not Matching the required condition");
    //         }    
    //     }
         
         
    // }





    // Take 3 positive integer input and print the greatest of them. another method




//          public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the first number: ");
//         int a = sc.nextInt();
//         System.out.println("Enter the second number: ");
//         int b = sc.nextInt();
//         System.out.println("Enter the third number: ");
//         int c = sc.nextInt();
//         // a =3, b=2,c=5;
//        if(a>b){
//             if(a>c){
//                 System.out.println(a+" is largest");
//             }
//             // b<a<c
//             else{ //a<c-->b<a<c
//                   System.out.println(c+" is largest");
//                  }
//         }else{//a<b
//             if(b>c){
//                 System.out.println(b+" is largest");
//             }else{//b<c-->a<b<c
//                 System.out.println(c+" is largest");
//             }
//         }
       
       
//     }
    
// }



// Given three points (x1,y1), and (x2,y2), and (x3,y3),write a program to check if all the three pints fall on one straight line.



//         public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          System.out.println();
//          double x1 = 1, x2 = 2, x3 =3, y1 = 1, y2 = 2, y3 = 3;
//          double m1 = (y2-y1)/(y3-y2);
//          double m2 = (x2-x1)/(x3-x2);
//          if(m1 == m2){
//             System.out.println("The three points lie on the same line ");
//          }else{
//             System.out.println("They do not lie on a single line");
//          }
       
        
       
       
//     }
    
// }






// given a point (x,y), write a program to find out if it lies on the x - axis ,  y-axis or at the origin , viz (0,0).



// public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          System.out.println();
//          System.out.println("Enter the x coordinate ");
//          int x = sc.nextInt();
//          System.out.println("Enter the y coordinate ");
//          int y = sc.nextInt();
//          if(x==0 && y==0) {
//             System.out.println("The point is origin");
//          }else if(x==0){
//             System.out.println("The point is on the y axis");
         
//          }else if(y==0){
//             System.out.println("The point is on the x axis");
//          }else{
//             System.out.println("The point is not in the 1st coordinate ");
//          }
       
//     }
    
// }  








// logical question


//     public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//          int x= 10 , y =20;
//          if(x==y);
//          System.out.println(x+ " "+y);
//     }
// }


// 2.


    // public static void main(String[] args) {
//          Scanner sc = new Scanner(System.in);
//         int a = 300,b,c;
//         if(a>=400)
//            b=300;
//            c=200;
//         System.out.println(b+ " "+c); //it will give an error b

//     }
// }


// 3



//     public static void main(String[] args) {
//           Scanner sc = new Scanner(System.in);
//          int x = 3, y =5;
//          if(x==3)
//          System.out.println(x);

//        else;
//           System.out.println(y);
//     }
// }


// 4.
//     public static void main(String[] args) {
//           Scanner sc = new Scanner(System.in);
//          int x = 3;
//          Double y =3.0;
//          if(x==y)
//          System.out.println("x and y are equal");

//        else
//           System.out.println("x and y are not equal");
//     }
// }



// 5
 
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int x=3,y,z;
//         y=x=10;
//         z=x=10;
//          z=x<10;  //false x<10 and z will be automatically become to 0 due to false in c language but in java  it will be error
//         System.out.println("x="+x+" y="+y+" z="+z);
//     }
// }



// 6


//     public static void main(String[] args) {
//           Scanner sc = new Scanner(System.in);
//          int k= 35;
//          System.out.println(k==35);
//          System.out.println(k=50);
//          System.out.println(k>40);
//          int x=15;
//          System.out.println(x!=15);
//          System.out.println(x=120);
//          System.out.println(x<30);
         
//     }
// }




//7
//     public static void main(String[] args) {
//           Scanner sc = new Scanner(System.in);
//         int i =65;
//         char j='A';
//         if(i==j)//ascii value it will be compare
//              System.out.println("C is VOW");
//         else
//         System.out.println("C is a heading");
//     }
// }
 

// 8
//     public static void main(String[] args) {
//           Scanner sc = new Scanner(System.in);
//         int i =0;
//         boolean flag = false;
//         if(i==j)//error
//              System.out.println("C is VOW");
//         else
//         System.out.println("C is a heading");
//     }
// }
// note : in java : char and int  can  compare with each other
 
   


 




         




  
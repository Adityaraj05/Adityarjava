import java.util.Scanner;
class ArrayExample {
   void demoArray(){
      

        // int[] ages = new int[3];
        // float[] weights = new float[3];
        // String[] names = {"aditya","priya","raju"};
    
        // int[] ages = new int [5];
        // float[] Weights= new float  [3];
        // String[] names = new String [3];
        

        // ages[0]=34;
        // ages[1]=14;
        // ages[2]=24;
        // ages[5]=20;//out of bounce

        // for(int i = 0; i < 3; i++){
        //     System.out.println(ages[i]); 
//    }
        // for(int age:ages){
        //     System.out.println(age);

        // }
        // int i=0;
        // while(i < 3){
        //     System.out.println(ages[i]);
        //     i=i+1;
        // }
        int[] arr= {1,2,3,4,5,6};
        for(int i = 0; i < 6; i++){
                System.out.println(arr[i]); 
        }




        
    }
    
}
public class arraytraversa{
    public static void main(String[] args) {
        ArrayExample obj = new ArrayExample();
        obj.demoArray();
        
       
    }
    
}


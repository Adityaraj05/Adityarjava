class Algebra{
    // int a = 10;  // member variable of the class (class level scope ) it can be access anywhere in the program
    // int b = 15;
    int add(){
        int p = 100; // method level scope of the variable(These are the variavbles that are declared inside the mehtod and cannot be accessed outside the method.)
        int q = 100;
        return p + q; 

    }
    int sub(){
        // return a-b;
    }
}


                        
    void demo(){
        int a = 5;
        System.out.println(a);
      
        {
            int b  = 10;
            System.out.println(b); //10    //   block level scope of variable (These are the variable that are declared inside the pair of brackets {}
            
                }
        {
            int b  = 100;
            System.out.println(b);   //100  //   block level scope of variable (These are the variable that are declared inside the pair of brackets {}
            
        }
        for( int i = 0;i<=5;i++ ){
            System.out.println(i);  //   loop level scope of variable (These are the variable that are declared inside the pair of brackets {}
    


        }
        
       
    }


public class scopevariable {
    public static void main(String[] args) {
        
    }
    
}   

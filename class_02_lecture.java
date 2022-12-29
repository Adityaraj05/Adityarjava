import java.util.*;
public class class_02_lecture{
    String Code,Name;
    int qty;
    float price;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        class_02_lecture p = new class_02_lecture();
        System.out.println("EnterCode::");
        p.Code= sc.nextLine();
        System.out.println("EnterName::");
        p.Name= sc.nextLine();
        System.out.println("Enter Qty::");
        p.qty= sc.nextInt();
        System.out.println("Enter Price::");
        p.price= sc.nextFloat();
        System.out.println("Name : "+p.Name);
        System.out.println("Code : "+p.Code);
        System.out.println("Qty : "+p.qty);
        System.out.println("Price : "+p.price);

        

        
    }

    
}

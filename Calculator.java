import java.util.*;
public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b;
        int i;
        int choice;
        do{
            System.out.println("==== CALCULATOR ====");
            System.out.print("Enter the value of a :");
            a = sc.nextInt();
            System.out.print("Enter the value of b :");
            b = sc.nextInt();
            System.out.println("Operators :");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multuplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.print("You Choice :"); 
            choice = sc.nextInt();
            switch(choice){
            case 1:System.out.println("Addition ="+" "+(a+b));
            break;
            case 2:System.out.println("Substraction ="+" "+(a-b));
            break;
            case 3:System.out.println("Multiplication ="+" "+(a*b));
            break;
            case 4:
                if(b==0){
                System.out.println("Undefined");
            }
                else{
                System.out.println("Division ="+" "+((double)a / b));
            }
            break;
            case 5:
                if(b==0){
                    System.out.println("Undefined");
                }
                else{
                    System.out.println("Remainder ="+" "+(a % b));
                }
                break;
                default:System.out.println("Invalid Choice");
                break;
            }
            System.out.print("Enter 1 to continue, any other number to exit :");
            i = sc.nextInt();
        }
        while(i==1);
        sc.close();
    }
}

import java.util.Scanner;
public class calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a,b,i;
        int choice;
        do{
            System.out.println("Enter 1 for continue :");
            i = sc.nextInt();
            if(i==1){
                System.out.println("Enter the value of a :");
                a = sc.nextInt();
                System.out.println("Enter the value of b :");
                b = sc.nextInt();
                System.out.println("==CALCULATOR==");
                System.out.println("Operators :");
                System.out.println("1. Addition");
                System.out.println("2. Substraction");
                System.out.println("3. Multuplication");
                System.out.println("4. Division");
                System.out.println("5. Remainder");
                System.out.println("6. Exit");
                System.out.println("You Choice :");
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
                    case 6:System.out.println("Thank You !");
                    break;
                    default:System.out.println("Invalid Choice");
                }
            }
            else{
                System.out.println("Thank You");
                break;
            }
        }
        while(choice!=6);
        sc.close();
    }
}
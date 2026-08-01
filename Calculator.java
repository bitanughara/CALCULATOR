import java.util.*;
public class Calculator {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a,b;
        int choice;
        do{
            System.out.println("\n--------------------------");
            System.out.println("        Calculator");
            System.out.println("--------------------------");
            System.out.println("Calculator Menu :-\n");
            System.out.println("1. Addition.");
            System.out.println("2. Substraction.");
            System.out.println("3. Multuplication.");
            System.out.println("4. Division.");
            System.out.println("5. Remainder.");
            System.out.println("6. Factorial.");
            System.out.println("7. Power.");
            System.out.println("8. Squre.");
            System.out.println("9. Squre Root.");
            System.out.println("10. Avarage.");
            System.out.println("11. Find Multuplication Table.");
            System.out.println("12. Max of Two Number.");
            System.out.println("13. Exit.");
            System.out.print("\nYour Choice (1-13) : "); 
            choice = sc.nextInt();
            System.out.println();
            switch(choice){
                case 1:
                    System.out.print("Enter the value of a :");
                    a = sc.nextInt();
                    System.out.print("Enter the value of b :");
                    b = sc.nextInt();
                    System.out.println("\nAddition = "+(a+b));
                    break;
                case 2:
                    System.out.print("Enter the value of a :");
                    a = sc.nextInt();
                    System.out.print("Enter the value of b :");
                    b = sc.nextInt();
                    System.out.println("\nSubtraction = "+(a-b));
                    break;
                case 3:
                    System.out.print("Enter the value of a :");
                    a = sc.nextInt();
                    System.out.print("Enter the value of b :");
                    b = sc.nextInt();
                    System.out.println("\nMultiplication = "+(a*b));
                    break;
                case 4:
                    System.out.print("Enter the value of a :");
                    a = sc.nextInt();
                    System.out.print("Enter the value of b :");
                    b = sc.nextInt();
                    if(b==0){
                        System.out.println("\nUndefined");
                    }
                    else{
                        System.out.println("\nDivision ="+" "+((double)a / b));
                    }
                    break;
                case 5:
                    System.out.print("Enter the value of a :");
                    a = sc.nextInt();
                    System.out.print("Enter the value of b :");
                    b = sc.nextInt();
                    if(b==0){
                        System.out.println("\nUndefined");
                    }
                    else{
                        System.out.println("\nRemainder ="+" "+(a % b));
                    }
                    break;
                case 6:
                    System.out.print("Enter value for Factorial : ");
                    int n=sc.nextInt();
                    if(n < 0){
                        System.out.println("\nFactorial of negative number is not possible!");
                    }
                    else{
                        int fact = 1;
                        for(int i = 1; i <= n; i++){
                            fact *= i;
                        }
                        System.out.println("\nFactorial = " + fact);
                    }
                    break;
                case 7:
                    System.out.print("Enter the Base :");
                    int base=sc.nextInt();
                    System.out.print("Enter the Power :");
                    int power=sc.nextInt();
                    int result=1;
                    if(power >= 0){
                        for(int i = 1; i <= power; i++){
                            result *= base;
                        }
                        System.out.println("\nResult = " + result);
                    }
                    else{
                        System.out.println("\nPower cannot be Negative!");
                    }
                    break;
                case 8:
                    System.out.print("Enter the value for Square :");
                    double square=sc.nextDouble();
                    System.out.print("\nSquare = "+(square*square));
                    break;
                case 9:
                    System.out.print("Enter the value for Squre Root :");
                    double squrtValue=sc.nextDouble();
                    if(squrtValue>=0){
                        System.out.println("\nSquare Root = "+Math.sqrt(squrtValue));
                    }
                    else{
                        System.out.println("\nInvalid Input !");
                    }
                    break;
                case 10:
                    System.out.print("Enter the value a for Average :");
                    a=sc.nextInt();
                    System.out.print("Enter the value b for Average :");
                    b=sc.nextInt();
                    double avg=(a+b)/2.0;
                    System.out.print("\nAverage = "+avg);
                    break;
                case 11:
                    System.out.println("-------------------------");
                    System.out.println("  Multiplication Table");
                    System.out.println("-------------------------");
                    System.out.print("Enter the Multiplicand :");
                    int multiplicand=sc.nextInt();
                    System.out.println();
                    System.out.println("Table :");
                    System.out.println();
                    for(int i=1;i<=10;i++){
                        int product=multiplicand*i;
                        System.out.println(multiplicand+" "+"*"+" "+i+" "+"="+" "+product);
                    }
                    break;
                case 12:
                    System.out.print("Enter the value of a :");
                    a = sc.nextInt();
                    System.out.print("Enter the value of b :");
                    b = sc.nextInt();
                    if(a>b){
                        System.out.println("\n"+a+" is greater");
                    }
                    else if(a==b){
                        System.out.println("\n"+a+" == "+b+" (Equal)");
                    }
                    else{
                        System.out.println("\n"+b+" is greater");
                    }
                    break;
                case 13:
                    System.out.println("\n Thank You..!");
                    break;
                default:System.out.println("\nInvalid Choice !");
                break;
            }
        }
        while(choice!=13);
        sc.close();
    }
}

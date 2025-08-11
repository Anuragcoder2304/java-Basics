import java.util.Scanner;
public class condition {

    //tax caculator
    /* 
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;

        if(income<500000){
            tax=0;
        }
        else if(income>=500000 && income<100000){
            tax=(int)(income*0.2);
        }
        else{
            tax=(int)(income*0.3);
        }
        System.out.println("your income is: "+income);
        System.out.println("your tax is: "+tax);
    }
    */
    


    //ternary operater
    //check if a student will pass or fail
    /*
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks=sc.nextInt(); 
        String reportcard=(marks>=33)?"pass":"Fail";
        System.out.println(reportcard);
    }
    */


    //swiitch case
    //calculator
    
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number a: ");
        int a = sc.nextInt();
        System.out.println("Enter second number b: ");
        int b = sc.nextInt();
        System.out.println("Enter the Operater :");
        char operater = sc.next().charAt(0);

        switch(operater){
            case '+':System.out.println(a+b);
            break;
            case '-':System.out.println(a-b);
            break;
            case '*': System.out.println(a*b);
            break;
            case '%':System.out.println(a%b);
            break;
            default : System.out.println("Wrong operator");

        }
    }
        
    
}

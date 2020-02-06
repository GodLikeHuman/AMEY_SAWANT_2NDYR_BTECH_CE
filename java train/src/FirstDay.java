import java.util.Scanner;

public class FirstDay {

    void showData(){
        System.out.printf("hello");
    }
void checkIfElse(int number){
        if(number%2 == 0){
            System.out.println(number + " number is even");
        }else
        {
            System.out.println(number + " number is odd");
        }

}
    package controlstatement;

import jdk.nashorn.internal.ir.IfNode;

import java.util.Scanner;

    public class FirstDay {
        //   int number;
        void checkIfElse(int number){

            if (number%2==0){
                System.out.println(number+" Even Number");
            }
            else {
                System.out.println(number+" Odd Number");
            }

        }


        void checkElseIf(int number){

            if (number<35){
                System.out.printf("Fail");
            }
            else if(number>=35 && number<60){
                System.out.printf("Pass Class");
            }

            else if (number>=60 && number<74){
                System.out.printf("First Class");
            }
            else if (number>=74 && number<=100){
                System.out.printf("Dist");
            }
            else {
                System.out.printf("Invalid");
            }

        }


        public static void main(String[] args) {
            IFElseDemo demo=new IFElseDemo();
            Scanner scanner=new Scanner(System.in);
            System.out.print("Enter number : ");
            int number=scanner.nextInt();
            //demo.checkIfElse(number);
            demo.checkElseIf(number);
        }

    }
    public static void main(String[] args){
        FirstDay day=new FirstDay();
        day.showData();
        System.out.println("Enter Number: ");

        Scanner sc =new Scanner(System.in);
        int number = sc.nextInt();

        day.checkIfElse(number);
    }



}


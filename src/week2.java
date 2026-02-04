import java.util.Scanner;
public class week2 {
    public static void main(String[] args){
        //problem 1
        Scanner input=new Scanner(System.in);
//        System.out.print("How many cappuccino do you want: ");
//        double cap=input.nextDouble();
//        System.out.print("How many muffins do you want: ");
//        double muf=input.nextDouble();
//        double total=(cap*4.5+muf*3)*1.08+5;
//        System.out.println("Grand total: $"+String.format("%.2f",total));

       //problem 2
//        double fuel=5.7*8.5;
//        System.out.println("distance: $"+570+" km");
//        System.out.println("Fuel needed: $"+String.format("%.2f",fuel)+" litres");
//        double total=fuel*12500;
//        System.out.println("total cost: $"+String.format("%.2f",total)+" UZS");

        //problem 3
//        int sec=input.nextInt();
//        int hour=sec/3600;
//        sec-=hour*3600;
//        int min=sec/60;
//        sec-=min*60;
//        System.out.println(hour+" hours, "+min+" minutes, "+sec+" seconds");

        //problem 4
//        int age=input.nextInt();
//        if (age<=12) {
//           System.out.println("$7");
//        } else if (age<=17) {
//            System.out.println("$10");
//        } else if (age<=64){
//            System.out.println("$15");
//
//        }else{
//            System.out.println("$10");
//        }

        //problem 5
//        int year=input.nextInt();
//        if (year%400==0) {
//            System.out.println("Leap Year");
//        } else if (year%100==0) {
//            System.out.println("Not leap year");
//        } else if (year%4==0){
//            System.out.println("Leap year");
//
//        }else{
//            System.out.println("Not leap year");
//        }

        //problem 6
//        double mass=input.nextDouble();
//        if (mass<=2) {
//            System.out.println("Shipping cost: $"+5);
//        } else if (mass<=10) {
//            System.out.println("Shipping cost: $"+10);
//
//
//        }else{
//            double total=10+(mass-10)*2;
//            System.out.println("Shipping cost: $"+total);
//        }

//        //problem 7
//        int pin= 1407;
//        int flag=0;
//        for(int i=0;i<3;i++){
//
//            System.out.print("Pin: ");
//            int epin=input.nextInt();
//            if(pin==epin){
//                System.out.println("Access granted");
//                flag=1;
//                break;
//            }else if(i<2){System.out.println("try again");}
//        }
//        if (flag==0){
//            System.out.println("Account locked");
//        }
        //problem 8
         int year=0;
         int pop=100000;
         while (pop<200000){
             pop*=105;
             pop/=100;
             year+=1;
             System.out.println("Year "+year+": "+pop);
         }
        System.out.print("It will take "+year+" years to double.");


        //problem 9
//        for(int i=1; i<51;i++){
//
//            if(i%3!=0 && i%5!=0){
//                System.out.print(i);
//            }
//            if(i%3==0 ){
//                System.out.print("Fizz");
//            }
//            if(i%5==0){
//                System.out.print("Buzz");
//            }
//
//            System.out.print(", ");
//        }

        //problem 10
//        double dep=1000;
//        int year=input.nextInt();
//        for (int i=1;i<(year+1);i++){
//            dep*=1.05;
//            System.out.println("Year "+i+": $"+String.format("%.2f",dep));
//        }




    }

}

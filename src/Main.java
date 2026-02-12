import java.util.Scanner;

public class Main {
   public static void main(String[] args){
       // problem 1
//       System.out.println("Addressee's name: Ruhsora \nHouse number and street name: Guliston 65 \nCity: Termez \nProviance and postal code : Surkhandarya , 190100 \nCountry: Uzbekistan ");


       // problem 2
       Scanner input = new Scanner(System.in);
//       System.out.print("Your name: ");
//       String name=input.nextLine();
//       System.out.println("Hello "+name+"!!!");

      // problem 3
//       System.out.println("Area="+String.format("%.2f",4.5*7.9));
//       System.out.println("Parameter="+String.format("%.2f",(4.5+7.9)*2));

       //problem 4
//       System.out.print("Enter the radius and length of a cylinder: ");
//       Double rad=input.nextDouble();
//       Double len=input.nextDouble();
//       System.out.println("Area is "+String.format("%.5f",rad*rad*3.1415));
//       System.out.println("The volume is "+String.format("%.5f",rad*rad*3.1415*len));

      //problem 5
//       System.out.print("Enter the height of sides of a triangle and len: ");
//       double side=input.nextDouble();
//       double len=input.nextDouble();
//       double area=Math.sqrt(3)/4*side*side;
//       double volume =area*len;
//       System.out.println("Area is "+String.format("%.2f",area));
//       System.out.println("The volume is "+String.format("%.2f",volume));

       //problem 6
//       System.out.print("Enter the meal price: ");
//       double price = input.nextDouble();
//       double tip =0.18*price;
//       double tax=0.12*price;
//       System.out.println("The tip is "+String.format("%.2f",tip));
//       System.out.println("the tax is  "+String.format("%.2f",tax));
//       System.out.println("The total amount "+String.format("%.2f",price+tip+tax));


       //problem 7
//       System.out.print("Enter the driving distance: ");
//       double dis=input.nextDouble();
//       System.out.print("Enter miles per gallon: ");
//       double pergal=input.nextDouble();
//       System.out.print("Enter price per gallon: ");
//       double price=input.nextDouble();
//       double gallon = dis/pergal;
//       System.out.println("The cost of driving $"+String.format("%.2f",gallon*price));



       //problem 8

//       System.out.print("enter the four digit number: ");
//       int digit=input.nextInt();
//       int total = digit/1000+digit/100%10+digit/10%10+digit%10;
//       System.out.print(digit/1000+"+"+digit/100%10+"+"+digit/10%10+"+"+digit%10+"="+total);

       //problem 9
       System.out.print("enter the three  numbers: ");
       int d=input.nextInt();
       int b=input.nextInt();
       int a=input.nextInt();
       int total=a+b+d;
       int min=Math.min(a,Math.min(b,d));
       int max=Math.max(a,Math.max(b,d));
       int middle=total- min - max;
       System.out.print("Here is the sorted version: "+min+" "+middle+" "+max);












   }}

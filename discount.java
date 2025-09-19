/* ASSIGNMENT 1
ezekiel bronal nyangweso
Adm no:: S10-4554-2023
*/
import java.utili.Scanner;
public class Discount{
    public static void main(string[] args){
        Scanner scanner =new Scanner(System.in)
        double discount;
     system.out.println("enter the amount purchased");
     double amount = scanner.nextDouble();

     if(amount >5000){
        discount = amount * 0.1;
     }
     else if(amount >= 1000 && amount <=5000){
        discount = amount * 0.05;
     }
     else {
        discount =0;
        }
     double amounToPay = amount -discount;

     system.out.println("intial amount" + amount);
     system.out.println("Discount" + discount);
     system.out.println("amount to pay" + amounToPay);
       
       scanner.close();
    }
}
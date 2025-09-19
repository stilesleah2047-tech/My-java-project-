/*ASSIGNMENT 2
ezekiel bronal nyangweso
Adm no:: S10-4554-2023
*/

import java.utili.Scanner;
public class fine{
    public static void bookfine(string[] args){
        Scanner booker =new Scanner(system.in);

        system.out.println("Enter bookID")
        double bookid = scanner.nextDouble();
        system.out.println("Enter dueDate")
        double duedate = scanner.nextDouble();
        system.out.println("Enter returnDate")
        double returndate = scanner.nextDouble();

double overdue = returndate -duedate;

   if(overdate <= 7){
    double charge =20;
   }else if(overdate >= 8 && duedate <= 14){
    double charge =50;
   }
   else if(overdate >= 15){
     double charge = 100;
   }
   else{
    double charge =0;
   }
   double fineamount = 0 + charge;
system.out.println("your bookID is " + bookid);
system.out.println("your due date is "+ duedate);
system.out.println("your return date is " + returndate);
system.out.println("your daysoverdue is " + overdue);
system.out.println("your fine rate is " + finerate);
system.out.println("your fine amount is " + fineamount);
    }
}

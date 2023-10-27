import java.util.*;
public class atmInterfaceProject {
     public static void main(String[] args) {
         float balance = 30000f;
         int withdrawl = 0;
         int deposit = 0;
         int PIN = 1234;
         Scanner sc = new Scanner(System.in);
       while(true){
           System.out.println("-----WELCOME TO YOUR ATM-----");
           System.out.println("-----------*****-------------");
         System.out.println("PRESS 1 TO CHECK BALANCE");
         System.out.println("PRESS 2 TO DEPOSIT CASH");
         System.out.println("PRESS 3 TO WITHDRAW CASH");
         System.out.println("PRESS 4 TO EXIT");
         
         
         System.out.println("PRESS YOUR BUTTON :");
         int button = sc.nextInt();

         switch(button){
          case 1:
          System.out.println("ENTER YOUR PIN");
          
          int userPin = sc.nextInt();
          if(userPin == PIN){
               System.out.println("Y0UR BALANCE IS :" +balance);
          }else{
               System.out.println("WRONG PIN");
          }
          break;
          case 2:
          System.out.println("ENTER THE AMOUNT TO BE DEPOSITED:");
          int amount = sc.nextInt();
          if(amount>0){
               balance += amount;
               System.out.println("money deposited ="+ amount);
          }else{
               System.out.println("no amount deposited");
          }
          System.out.println("AVAILABLE BALANCE = " +balance);
          break;
          case 3:
          System.out.println("ENTER THE AMOUNT TO WITHDRAW:");
          int amounttowithdraw  = sc.nextInt();
          if(amounttowithdraw>0 && amounttowithdraw<=balance){
               balance -=amounttowithdraw;
               System.out.println("money withdrawn =" +amounttowithdraw);
          }else{
               System.out.println("insufficient amount");
          }
           System.out.println("AVAILABLE BALANCE = " +balance);
           break;
          case 4:
            System.exit(0);
             
          break;
           default:
           System.out.println("please enter the valid inputs");  
          

         }
       }
       }
     
}

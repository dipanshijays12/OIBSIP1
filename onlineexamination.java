import java.util.Scanner;

public class onlineexamination {
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          int roll;
          int marks;
          String name;
          int count = 0;
          System.out.println("*****LOGIN*****");
          System.out.println("ENTER YOUR NAME:");
          name = sc.next();
          System.out.println("ENTER YOUR ROLL NUMBER:");
          roll = sc.nextInt();
          System.out.println(" WELCOME " + name + " ! YOU ARE SUCCESSFULLY LOGGED IN !");
          System.out.println("*****---------------------------------------------*****");
           do{
          System.out.println("1. ATTEMPT THE EXAM");
          System.out.println("2.CHECK YOUR SCORE");
          System.out.println("3.GO BACK");
          

          System.out.println("ENTER YOUR CHOICE:");
          int buttons = sc.nextInt();
          
          switch (buttons) {
               case 1:{
               
                    System.out.println("START THE EXAM");
                    System.out.println("--------------------------");
                    System.out.println("ANSWER THE FOLLOWING QUESTIONS");
                    System.out.println("Answer 7 questions correctly to pass the exam");
                    System.out.println("***ALL THE BEST***");
                    System.out.println("---------------------------------------------");
                    count=7;
                    System.out.println("1.Who developed C language?");
                    System.out.println(
                              "a.Dennis Ritcie \n b.Bjarne Stroustrup \n c.James Gosling \n d.Guido van Rossum");
                    System.out.println("answer:");
                    String answer = sc.next();
                    if (answer == "a") {
                         ++count;
                    }
                    System.out.println("2.Who developed Java language? ");
                    System.out.println(
                              "a.Dennis Ritcie \n b.Bjarne Stroustrup \n c.James Gosling \n d.Guido van Rossum");
                    System.out.println("answer:");
                    answer = sc.next();
                    if (answer == "c") {
                         ++count;
                    }
                    System.out.println("3.How many types of shells are there in UNIX?");
                    System.out.println("a.1\n b.2 \n c.3 \n d.4");
                    System.out.println("answer:");
                    answer = sc.next();
                    if (answer == "c") {
                         ++count;
                    }
                    System.out.println("4.Which of the following is an OOPs concept?");
                    System.out.println("a.Inheritance \n b.Polymorphism \n c.Abstraction \n d.All of these");
                    System.out.println("answer:");
                    answer = sc.next();
                    if (answer == "d") {
                         ++count;
                    }
                    System.out.println("5.What does SQL stands for?");
                    System.out.println(
                              "a.structural Query List \n b.Structured Query Language \n c.Sample Query Language\n d.None of these");
                          System.out.println("answer:");
                    answer = sc.next();
                    if (answer == "b") {
                         ++count;
                    } 
                    System.out.println("6.SQL views are also known as:");
                    System.out.println("a.Simple tables \n b.Virtual tables \n c.Complex tables \n d.Actual tables");   
                     System.out.println("answer:");
                    answer = sc.next();
                    if (answer == "b") {
                         ++count;
                    } 
                    System.out.println("7.A variable declared in a method is called as:");
                    System.out.println("a.local data \n b.global data \n c.actual data \n d.formal data");
                     System.out.println("answer:");
                    answer = sc.next();
                    if (answer == "a") {
                         ++count;
                    }
                    System.out.println("8.Java has its origin in :");
                    System.out.println("a.C language \n b.PERRL \n c.COBOL \n d.Oak programming language");
                     System.out.println("answer:");
                    answer = sc.next();
                    if (answer == "d") {
                         ++count;
                    }
                    System.out.println("9.In C++ , goto is a:");
                    System.out.println("a.variable \n b.label \n c.operator \n d.function");
                     System.out.println("answer:");
                    answer = sc.next();
                    if (answer == "b") {
                         ++count;
                    }
                    System.out.println("10.Python was released publicly on which of the following year?");
                    System.out.println("a.1991 \n b.1998 \n c.1978 \n d.2000");
                     System.out.println("answer:");
                    answer = sc.next();
                    if (answer == "a") {
                         ++count;
                    } 
                         break;
                    
               }
               
                    case 2:{
                    System.out.println("EVALUATING YOUR SCORE");
                    if(count>=7){
                         System.out.println("YOU SCORED "+count+" \n CONGRATULATIONS!");
                    }else{
                         System.out.println("YOU SCORED "+count+" \n BETTER LUCK NEXT TIME!");
                    }
                    System.out.println("-----------------------------------------------------------");
                    break;
               }
          }
     }while(true);

     }
}
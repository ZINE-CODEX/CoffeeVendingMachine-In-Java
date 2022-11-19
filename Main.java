import  java.io.*;
import java.net.*;
import java.util.*;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.jar.Attributes.Name;

class CoffeeMachine{
    String name;
    int num,quantity,x;
    Scanner s = new Scanner(System.in);

public void register(){
    System.out.println("\n1.Enter your details: ");
    System.out.println("2.Exit.");
    System.out.println("\nEnter Your option: ");
    int a = s.nextInt();
    switch(a){
        case 1:
        System.out.println("\nEnter Customer Name: ");
        name = s.next();
        System.out.println("Enter the Mobile Number: ");
        num = s.nextInt();
        System.out.println(" ");;
        System.out.println("\nHello Mr/Mrs."+name+".\nWelcome To CALDCAFI!");
        System.out.println("\nYour Number is: "+num);
        return;

        case 2:
        System.out.println("\nThank You!");
        break;

        default:
        System.out.println("\nEnter the correct choice!");
        return;
    }
}

public void order(){
    System.out.println("\n1.Latte.");
    System.out.println("2.Americano.");
    System.out.println("3.Espresso.");
    System.out.println("4.Instant Coffee.");
    System.out.println("5.Black Coffee.");
    System.out.println("6.Boost.");
    System.out.println("7.Horlicks.");
    System.out.println("8.BornVita.");
    System.out.println(" ");
    System.out.println("\nEnter Your Order Number: ");
    x = s.nextInt();
    System.out.println("\nEnter the quantity: ");
    quantity = s.nextInt();

    switch(x) {
        case 1:
          System.out.println("\nYou Have ordered "+quantity+" Latte.");
          break;

        case 2:
        System.out.println("\nYou Have ordered "+quantity+" Americano.");
          break;

        case 3:
        System.out.println("\nYou Have ordered "+quantity+" Espresso.");
          break;

        case 4:
        System.out.println("\nYou Have ordered "+quantity+" Instant Coffee.");
          break;

        case 5:
        System.out.println("\nYou Have ordered "+quantity+" Black Coffee.");
          break;

        case 6:
        System.out.println("\nYou Have ordered "+quantity+" Boost.");
          break;

        case 7:
        System.out.println("\nYou Have ordered "+quantity+" Horlicks.");
          break;

        case 8:
        System.out.println("\nYou Have ordered "+quantity+" BornVita.");
            break;

        default:
          System.out.println("\nEnter the correct choice!");
          return;
      }
}

public void bill(){
    System.out.println("\n-----------------------------BILL---------------------------------");
    System.out.println("\nCustomer Name: "+name);
    System.out.println("Mobile Number: "+num);
    if(x==1){
        System.out.println("Your order: Latte * "+quantity);
        System.out.println("Amount: "+35*quantity);
    }
    else if(x==2){
        System.out.println("Your order: Americano * "+quantity);
        System.out.println("Amount: "+40*quantity);
    }
    else if(x==3){
        System.out.println("Your order: Espresso * "+quantity);
        System.out.println("Amount: "+30*quantity);
    }
    else if(x==4){
        System.out.println("Your order: Instant Coffee * "+quantity);
        System.out.println("Amount: "+15*quantity);
    }
    else if(x==5){
        System.out.println("Your order: Black Coffee * "+quantity);
        System.out.println("Amount: "+15*quantity);
    }
    else if(x==6){
        System.out.println("Your order: Boost * "+quantity);
        System.out.println("Amount: "+15*quantity);
    }
    else if(x==7){
        System.out.println("Your order: Horlicks * "+quantity);
        System.out.println("Amount: "+15*quantity);
    }
    else if(x==8){
        System.out.println("Your order: BornVita * "+quantity);
        System.out.println("Amount: "+18*quantity);
    }
    else{
        System.out.println("\nEnter the correct Choice!");
        return;
    }
 System.out.println("\n------------------------------------------------------------------");
}

}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CoffeeMachine c1 = new CoffeeMachine();
        System.out.println(" ----------------------------------------------------------------");
        System.out.println("|                   Coffee Machine By KALDKAFi                   |");
        System.out.println(" ----------------------------------------------------------------");

        System.out.println("\nEnter the PassCode: ");
        int passcode = sc.nextInt();

            if(passcode == 222){
                while(true){
                    System.out.println("\n1.Customer registration.");
                    System.out.println("2.Take Order.");
                    System.out.println("3.Print the bill.");
                    System.out.println("4.Exit.");
                    System.out.println("\nEnter your Option: ");
                    int n = sc.nextInt();
                    switch(n) {
                        case 1:
                          c1.register();
                          break;

                        case 2:
                          c1.order();
                          break;

                        case 3:
                          c1.bill();
                          break;

                        case 4:
                          System.out.println("\nThankYou For Visiting!");
                          return;

                        default:
                          System.out.println("\nEnter the correct choice!Thank You!");
                          return;
                      }
                    }
            }
            else{
                System.out.println("\nAccess Denied!");
            }
        }
}
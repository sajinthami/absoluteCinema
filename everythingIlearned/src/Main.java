////import java.util.Scanner;
////
////public class Main {
////
////   static Scanner scanner = new Scanner(System.in);
////    public static void main(String[] args) {
////        // CREATING A SIMPLE BANKING WHICH CAN SHOW USER BALANCE AND USER CAN DEPOSITE AND WITHDRAW MONEY
////
////
////
////        // DECLARING VARIABLES
////        double balance = 0;
////        boolean isRunning = true;
////        int choice;
////
////        while (isRunning) {
////            System.out.println("*****");
////            System.out.println("Welcome to Simple Banking System");
////            System.out.println("*****");
////
////
////            System.out.println("1. Deposit");
////            System.out.println("2. Withdraw");
////            System.out.println("3. Balance");
////            System.out.println("4. Exit");
////
////
////            System.out.println("Choose option (1-4): ");
////            choice = scanner.nextInt();
////
////
////            switch (choice) {
////                case 1 -> System.out.println("Enter the amount to deposit.");
////                case 2 -> System.out.println("Enter the amount to withdraw.");
////                case 3 -> System.out.println("your balance is " + balance);
////                case 4 -> isRunning = false;
////            }
////
////            System.out.println("Thank you for using our service.");
////        }
////
////
////    }
////
////    static void showBalance(double balance) {
////        System.out.printf("Your balance is $%.2f\n", balance);
////    }
////
////    static double depsoit(){
////        double amount;
////
////        System.out.println("Enter the amount to deposit.");
////        amount = scanner.nextDouble();
////
////        if(amount < 0){
////            System.out.println("you cannot deposit negative amount");
////            return 0;
////        }else{
////            return amount;
////        }
////
////    }
////    static double withdraw(double balance){
////        double amount;
////        System.out.println("Enter the amount to withdraw.");
////
////        if(amount > balance) {
////            System.out.println("insufficient funds");
////            return 0;
////        } else if(amount < balance) {
////            System.out.println("cannot withdraw negative amount");
////            return 0;
////        }else{
////            return amount;
////        }
////    }
////}
//
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) {
//
//        try {
//            FileWriter writer = new FileWriter("hello.txt");
//
//            writer.write("Hello, I am learning Java!");
//
//            writer.close();
//
//        } catch (IOException e) {
//            System.out.println("Something went wrong.");
//        }
//    }
//}

////import java.util.Scanner;
////
////public class Main {
////
////   static Scanner scanner = new Scanner(System.in);
////    public static void main(String[] args) {
////        // CREATING A SIMPLE BANKING WHICH CAN SHOW USER BALANCE AND USER CAN DEPOSITE AND WITHDRAW MONEY
////
////
////
////        // DECLARING VARIABLES
////        double balance = 0;
////        boolean isRunning = true;
////        int choice;
////
////        while (isRunning) {
////            System.out.println("*****");
////            System.out.println("Welcome to Simple Banking System");
////            System.out.println("*****");
////
////
////            System.out.println("1. Deposit");
////            System.out.println("2. Withdraw");
////            System.out.println("3. Balance");
////            System.out.println("4. Exit");
////
////
////            System.out.println("Choose option (1-4): ");
////            choice = scanner.nextInt();
////
////
////            switch (choice) {
////                case 1 -> System.out.println("Enter the amount to deposit.");
////                case 2 -> System.out.println("Enter the amount to withdraw.");
////                case 3 -> System.out.println("your balance is " + balance);
////                case 4 -> isRunning = false;
////            }
////
////            System.out.println("Thank you for using our service.");
////        }
////
////
////    }
////
////    static void showBalance(double balance) {
////        System.out.printf("Your balance is $%.2f\n", balance);
////    }
////
////    static double depsoit(){
////        double amount;
////
////        System.out.println("Enter the amount to deposit.");
////        amount = scanner.nextDouble();
////
////        if(amount < 0){
////            System.out.println("you cannot deposit negative amount");
////            return 0;
////        }else{
////            return amount;
////        }
////
////    }
////    static double withdraw(double balance){
////        double amount;
////        System.out.println("Enter the amount to withdraw.");
////
////        if(amount > balance) {
////            System.out.println("insufficient funds");
////            return 0;
////        } else if(amount < balance) {
////            System.out.println("cannot withdraw negative amount");
////            return 0;
////        }else{
////            return amount;
////        }
////    }
////}
//
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) {
//
//        try {
//            FileWriter writer = new FileWriter("hello.txt");
//
//            writer.write("Hello, I am learning Java!");
//
//            writer.close();
//
//        } catch (IOException e) {
//            System.out.println("Something went wrong.");
//        }
//    }
//}

////import java.util.Scanner;
////
////public class Main {
////
////   static Scanner scanner = new Scanner(System.in);
////    public static void main(String[] args) {
////        // CREATING A SIMPLE BANKING WHICH CAN SHOW USER BALANCE AND USER CAN DEPOSITE AND WITHDRAW MONEY
////
////
////
////        // DECLARING VARIABLES
////        double balance = 0;
////        boolean isRunning = true;
////        int choice;
////
////        while (isRunning) {
////            System.out.println("*****");
////            System.out.println("Welcome to Simple Banking System");
////            System.out.println("*****");
////
////
////            System.out.println("1. Deposit");
////            System.out.println("2. Withdraw");
////            System.out.println("3. Balance");
////            System.out.println("4. Exit");
////
////
////            System.out.println("Choose option (1-4): ");
////            choice = scanner.nextInt();
////
////
////            switch (choice) {
////                case 1 -> System.out.println("Enter the amount to deposit.");
////                case 2 -> System.out.println("Enter the amount to withdraw.");
////                case 3 -> System.out.println("your balance is " + balance);
////                case 4 -> isRunning = false;
////            }
////
////            System.out.println("Thank you for using our service.");
////        }
////
////
////    }
////
////    static void showBalance(double balance) {
////        System.out.printf("Your balance is $%.2f\n", balance);
////    }
////
////    static double depsoit(){
////        double amount;
////
////        System.out.println("Enter the amount to deposit.");
////        amount = scanner.nextDouble();
////
////        if(amount < 0){
////            System.out.println("you cannot deposit negative amount");
////            return 0;
////        }else{
////            return amount;
////        }
////
////    }
////    static double withdraw(double balance){
////        double amount;
////        System.out.println("Enter the amount to withdraw.");
////
////        if(amount > balance) {
////            System.out.println("insufficient funds");
////            return 0;
////        } else if(amount < balance) {
////            System.out.println("cannot withdraw negative amount");
////            return 0;
////        }else{
////            return amount;
////        }
////    }
////}
//
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) {
//
//        try {
//            FileWriter writer = new FileWriter("hello.txt");
//
//            writer.write("Hello, I am learning Java!");
//
//            writer.close();
//
//        } catch (IOException e) {
//            System.out.println("Something went wrong.");
//        }
//    }
//}

//import java.io.File;
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class Main {
//    public static void main(String[] args) {
//        File file = new File("hello.txt");
//
//        if(file.exists()){
//            System.out.println("file exists");
//        } else{
//            System.out.println("file doesn't exist");
//        }
//    }
//}

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        try{
            File file = new File("hello.txt");
            Scanner scanner =new Scanner(file);

            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                System.out.println(line);
            }

            scanner.close();
        } catch(IOException e){
            System.out.println("Something went wrong");
        }
    }
}
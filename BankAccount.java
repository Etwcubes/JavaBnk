import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;


public class BankAccount {
    public static void main(String[] args) {
        Bank ericweiscode = new Bank();
        ericweiscode.showMenu();

    }
}
class Bank{
    double Balance;
    double amount;
    double lmao;
    String Username;
    String Password;
    String customerName;
    String customerID;


    void create_Account(String Username, String Password){

//        Scanner accountName = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("Enter new account name:");
//
//        String userName = accountName.nextLine();  // Read user input
//        System.out.println("Account registered");  // Output user input

    }


    void deposit(int amount){

//        Scanner amountCode = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("Enter amount");
//
//        String userName = amount.nextLine();  // Read user input
//        System.out.println("Your new balance is " + amount);  // Output user input

    }


    void withdraw(int amount){

//        Scanner withdrawCode = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("Enter amount");
//
//        int Balance = amount.nextInt();  // Read user input
//        System.out.println("Your new balance is " + (amount));  // Output user input

    }

    void checkBalance(int amount){
        System.out.println("Current amount:" + amount);
    }


    //display a number of options that allows the user to interact with the banking application
    //option A: create account
    //option B: deposit money
    //option C: withdraw money
    //option D: check balance
    //option E: exit

    void showMenu(){
        char option = '\0';
        Scanner scanner = new Scanner(System.in);


        do{
            System.out.println("please enter an option from A(create account),B(deposit money),C(withdraw money),D(check balance),F(Conversion), E(exit)");
            option = scanner.next().charAt(0);

            //TODO HERE

            switch(option){
                case 'A':

                    System.out.println("this is in A");

                    Scanner account = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Enter new account name:");

                    String Name = account.nextLine();  // Read user input
                    int password = account.nextInt();

                    System.out.println("Account registered");  // Output user input



                    break;

                //TODO

                case 'B':
                    System.out.println("this is in B");

                    Scanner B = new Scanner(System.in);
                    System.out.println("Enter amount you wish to deposit:");

                    double deposit = B.nextInt();
                    Balance = deposit;

                    System.out.println("Your new balance is: " + Balance);

                    break;
                //TODO
                //finish the rest of the cases

                case'C':
                    System.out.println("this is in C");

                    Scanner C = new Scanner(System.in);  // Create a Scanner object
                    System.out.println("Enter amount:");

                    int amount = C.nextInt();  // Read user input
                    if (amount > Balance){
                        System.out.println("Invalid please try again");
                        break;
                    }
                    Balance = Balance - amount;
                    System.out.println("Your new balance is " + Balance);  // Output user input

                    break;
                    //TODO

                case'D':
                    System.out.println("this is in D");
                    System.out.println("Current amount:" + Balance);
                    break;
                    //TODO

                case 'F':
                    System.out.println("this is in F");
//                    cad - usd = x 0.8
//                    cad - euro = x 0.67
//                    cad - rmb = x 5.22
//                    cad - jpn = x 86.87
//                    usd - cad = x 1.25
//                    usd - euro = x 0.84
//                    usd - rmb = x 6.54
//                    usd - jpn = x 108.86
//                    euro - cad = x 1.5
//                    euro - usd = x 1.2
//                    euro - rmb = x 7.82
//                    euro - jpn = x 130.18
//                    jpn - cad = x 0.012
//                    jpn - euro = x 0.0077
//                    jpn - rmb = x 0.060
//                    jpn - usd = x 0.0092
//                    rmb - cad = x 0.19
//                    rmb - usd = x 0.0092
//                    rmb - euro = x 0.0077
//                    rmb - jpn = x 16.63

            }
        }while(option != 'E');
            System.out.println("have a nice day!");

    }// end of showMenu()

}


//public class Namer extends JFrame
//{
//
//    public static void main(String [] args)
//    {
//        new Namer();
//    }
//
//    private JButton buttonOK;
//    private JTextField textName;
//    public Namer()
//    {
//        this.setSize(325,100);
//        this.setTitle("Who Are You?");
//        this.setDefaultCloseOperation(
//                JFrame.EXIT_ON_CLOSE);
//
//        ButtonListener bl = new ButtonListener();
//
//        JPanel panel1 = new JPanel();
//
//        panel1.add(new JLabel("Enter your name: "));
//        textName = new JTextField(15);
//        panel1.add(textName);
//
//        buttonOK = new JButton("OK");
//        buttonOK.addActionListener(bl);
//        panel1.add(buttonOK);
//
//        this.add(panel1);
//
//        this.setVisible(true);
//    }
//
//    private class ButtonListener implements
//            ActionListener
//    {
//        public void actionPerformed(ActionEvent e)
//        {
//            if (e.getSource() == buttonOK)
//            {
//                String name = textName.getText();
//                if (name.length() == 0)
//                {
//                    JOptionPane.showMessageDialog(
//                            Namer.this,
//                            "You didn't enter a name",
//                            "ERROR",
//                            JOptionPane.INFORMATION_MESSAGE);
//                }
//                else
//                {
//                    JOptionPane.showMessageDialog(
//                            Namer.this,
//                            "Good morning " + name,
//                            "Salutations",
//                            JOptionPane.INFORMATION_MESSAGE);
//                }
//                textName.requestFocus();
//            }
//        }
//    }
//}
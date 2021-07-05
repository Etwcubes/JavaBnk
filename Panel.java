
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;



public class Panel extends JFrame{

    public static void main(String[] args) { Panel part1 = new Panel();}


    Double Balance = 0.0;
    boolean permit = false;

    String newUser_text;
    String newUser_password;

    Bigram loginKey = new Bigram(newUser_text, newUser_password);

    double bankAccountValue;

    Map<Bigram, Double> bankAccountDetails = new HashMap<Bigram, Double>();


    private JButton loginSubmitButton;
    private JTextField withdraw_amount = new JTextField(15);
    private JTextField deposit_amount = new JTextField(15);
    private JTextField username1 = new JTextField();
    private JPasswordField pass1 = new JPasswordField();
    private JPasswordField confirmPass = new JPasswordField();
    private JTextField username2 = new JTextField();
    private JPasswordField pass2 = new JPasswordField();
    private JTextField cadUSD = new JTextField();
    private JTextField cadEuro = new JTextField();
    private JTextField cadRMB = new JTextField();
    private JTextField cadJPN = new JTextField();
    private JButton cadUSDOK;
    private JButton cadEuroOK;
    private JButton cadRMBOK;
    private JButton cadJPNOK;
    private JButton checkBalanceOKButton;
    private JButton exchangeOKButton;
    private JButton depositButton;
    private JButton submitButton;
    private JButton buttonOK;
    private JButton depositOK;
    private JButton signUp;
    private JButton loginOK;
    private JButton withdrawOK;
    private JButton withdrawOKButton;
    private JButton checkBalanceOK;
    private JButton LogOut;



    public Panel(){
        this.setSize(550, 150);
        this.setTitle("The Bank");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ButtonListener bl = new ButtonListener();

        JPanel MainMenu = new JPanel();

        MainMenu.add(new JLabel("Hello! Welcome to The Bank, please sign up or login"));


        this.add(MainMenu);

        this.setVisible(true);

        checkBalanceOK = new JButton("Check Balance");
        checkBalanceOK.addActionListener(bl);
        buttonOK = new JButton("OK");
        buttonOK.addActionListener(bl);
        depositOK = new JButton("Deposit Money");
        depositOK.addActionListener(bl);
        signUp = new JButton("Sign Up");
        signUp.addActionListener(bl);
        withdrawOK = new JButton("Withdraw Money");
        withdrawOK.addActionListener(bl);
        withdrawOKButton = new JButton("OK");
        withdrawOKButton.addActionListener(bl);
        checkBalanceOKButton = new JButton("OK");
        checkBalanceOKButton.addActionListener(bl);
        submitButton = new JButton("Submit");
        submitButton.addActionListener(bl);
        depositButton = new JButton("OK");
        depositButton.addActionListener(bl);
        exchangeOKButton = new JButton("Exchange Currency");
        exchangeOKButton.addActionListener(bl);
        loginOK = new JButton("Log In");
        loginOK.addActionListener(bl);
        loginSubmitButton = new JButton("Log In");
        loginSubmitButton.addActionListener(bl);
        cadUSDOK = new JButton("OK");
        cadUSDOK.addActionListener(bl);
        cadEuroOK = new JButton("OK");
        cadEuroOK.addActionListener(bl);
        cadRMBOK = new JButton("OK");
        cadRMBOK.addActionListener(bl);
        cadJPNOK =new JButton("OK");
        cadJPNOK.addActionListener(bl);
        LogOut = new JButton("Log Out");
        LogOut.addActionListener(bl);

        MainMenu.add(signUp);
        MainMenu.add(loginOK);
        MainMenu.add(depositOK);
        MainMenu.add(withdrawOK);
        MainMenu.add(checkBalanceOK);
        MainMenu.add(exchangeOKButton);
        MainMenu.add(LogOut);

    }



    private class ButtonListener implements
            ActionListener {
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == loginOK) {
                JFrame loginaccountFrame = new JFrame();
                JPanel loginaccountPanel = new JPanel(new GridLayout(3, 1));
                loginaccountFrame.setSize(300, 300);
                loginaccountFrame.setLocation(100, 100);

                JLabel user_label = new JLabel();
                user_label.setText("Username :");
                JLabel password_label = new JLabel();
                password_label.setText("Password :");


                username2.setBounds(100, 50, 100, 10);

                pass2.setBounds(100, 100, 100, 10);

                JLabel message = new JLabel();

                loginaccountPanel.add(user_label);
                loginaccountPanel.add(username2);
                loginaccountPanel.add(password_label);
                loginaccountPanel.add(pass2);
                loginaccountPanel.add(message);
                loginaccountPanel.add(loginSubmitButton);

                loginaccountFrame.setTitle("Log Into Account");
                loginaccountFrame.add(loginaccountPanel, BorderLayout.CENTER);
                loginaccountFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

                loginaccountFrame.setVisible(true);


            }


            if (e.getSource() == signUp) {

                    JFrame createaccountFrame = new JFrame();
                    JPanel createaccountPanel = new JPanel(new GridLayout(4, 1));
                    createaccountFrame.setSize(300, 300);
                    createaccountFrame.setLocation(100, 100);

                    JLabel user_label = new JLabel();
                    user_label.setText(" Username :");
                    JLabel password_label = new JLabel();
                    password_label.setText(" Password :");
                    JLabel confirm_label = new JLabel();
                    confirm_label.setText(" Confirm Password:");

                    username1.setBounds(100, 50, 100, 10);

                    pass1.setBounds(100, 100, 100, 10);

                    confirmPass.setBounds(100, 150, 100, 10);

                    JLabel spacer = new JLabel();

                    createaccountPanel.add(user_label);
                    createaccountPanel.add(username1);
                    createaccountPanel.add(password_label);
                    createaccountPanel.add(pass1);
                    createaccountPanel.add(confirm_label);
                    createaccountPanel.add(confirmPass);
                    createaccountPanel.add(spacer);
                    createaccountPanel.add(submitButton);


                    createaccountFrame.setTitle("Create Account");
                    createaccountFrame.add(createaccountPanel, BorderLayout.CENTER);
                    createaccountFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

                    createaccountFrame.setVisible(true);


            }

            if ((e.getSource() == submitButton)) {
                if (pass1.getText().equals(confirmPass.getText())) {


                    newUser_text = username1.getText();
                    newUser_password = pass1.getText();
                    Bigram bi = new Bigram(newUser_text, newUser_password);
                    Double balance = 0.0;
                    bankAccountDetails.put(bi, balance);
                    System.out.print(bankAccountDetails.toString());
                    JFrame submitAccountFrame = new JFrame();
                    submitAccountFrame.setSize(400, 100);
                    submitAccountFrame.setTitle("Account Activation");
                    submitAccountFrame.add(new JLabel("Account Creation Successful!"));
                    submitAccountFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                    submitAccountFrame.setVisible(true);
                } else {
                    JFrame submitAccountFrame = new JFrame();

                    submitAccountFrame.setSize(400, 100);
                    submitAccountFrame.setTitle("Error");
                    submitAccountFrame.add(new JLabel("  Check both passwords and make sure they are both correct"));
                    submitAccountFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                    submitAccountFrame.setVisible(true);
                }
            }


            if (e.getSource() == loginSubmitButton) {
                newUser_text = username2.getText();
                newUser_password = pass2.getText();
                loginKey = new Bigram(newUser_text, newUser_password);
//                System.out.print(loginKey);
                System.out.print(newUser_password);

                if (bankAccountDetails.containsKey(loginKey)) {
                    JFrame submitAccountFrame = new JFrame();
                    submitAccountFrame.setSize(400, 100);
                    submitAccountFrame.setTitle("Account Login");
                    submitAccountFrame.add(new JLabel("Account Login Successful!"));
                    submitAccountFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                    submitAccountFrame.setVisible(true);
                    permit = true;
                } else {
                    JFrame submitAccountFrame = new JFrame();
                    submitAccountFrame.setSize(700, 100);
                    submitAccountFrame.setTitle("Make an account");
                    submitAccountFrame.add(new JLabel("Error, please try again! Either the credentials you entered is incorrect or you haven't made a new account yet"));
                    submitAccountFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                    submitAccountFrame.setVisible(true);
                }
            }


            // ONCE LOGGED IN
            //
            //
            //
            //
            //



                        if (e.getSource() == withdrawOK) {
                            if(permit == true){
                                JFrame WithdrawOKFrame = new JFrame();
                                WithdrawOKFrame.setSize(325, 100);
                                WithdrawOKFrame.setTitle("Withdraw");
                                WithdrawOKFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);


                                JPanel withdrawPanel = new JPanel();

                                withdrawPanel.add(new JLabel("Enter Withdraw Amount: "));
                                withdrawPanel.add(withdraw_amount);

                                withdrawPanel.add(withdrawOKButton);

                                WithdrawOKFrame.add(withdrawPanel);
                                WithdrawOKFrame.setVisible(true);
                            }
                                else{
                                JFrame errorframe = new JFrame();
                                errorframe.setSize(400, 100);
                                errorframe.setTitle("Account not found");
                                errorframe.add(new JLabel(" Please make an account"));
                                errorframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                errorframe.setVisible(true);
                            }
                        }


                        if (e.getSource() == withdrawOKButton) {
                            bankAccountValue = bankAccountDetails.get(loginKey);
                            if(permit == true){
                                if (bankAccountDetails.get(loginKey) <= 0) {
                                    JFrame CheckOKFrame = new JFrame();
                                    CheckOKFrame.setSize(400, 100);
                                    CheckOKFrame.setTitle("Withdraw");
                                    CheckOKFrame.add(new JLabel("    YOU'RE VERY POOR COME BACK WHEN YOU HAVE MONEY"));
                                    CheckOKFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                    CheckOKFrame.setVisible(true);
                                } else {
                                    int withdrawValue = Integer.parseInt(withdraw_amount.getText());
                                    double withdrawValueDouble = Double.valueOf(withdrawValue);
                                    bankAccountDetails.put(loginKey, bankAccountValue - withdrawValueDouble);
                                    JFrame checkBalanceOKFrame = new JFrame();

                                    checkBalanceOKFrame.setSize(400, 100);
                                    checkBalanceOKFrame.setTitle("Success");
                                    checkBalanceOKFrame.add(new JLabel("Take your money " + withdrawValue));
                                    checkBalanceOKFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                    checkBalanceOKFrame.setVisible(true);
                                }
                            }
                            else{
                                JFrame errorframe = new JFrame();
                                errorframe.setSize(400, 100);
                                errorframe.setTitle("Account not found");
                                errorframe.add(new JLabel(" Please make an account"));
                                errorframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                errorframe.setVisible(true);
                            }
                        }

                        if (e.getSource() == checkBalanceOK) {
                            if(permit == true){
                                if (bankAccountDetails.get(loginKey) == 0.0) {
                                    JFrame CheckOKFrame = new JFrame();
                                    CheckOKFrame.setSize(400, 100);
                                    CheckOKFrame.setTitle("Check Balance");
                                    CheckOKFrame.add(new JLabel("    YOU'RE VERY POOR"));
                                    CheckOKFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                    CheckOKFrame.setVisible(true);
                                } else {
                                    JFrame CheckOKFrame = new JFrame();
                                    CheckOKFrame.setSize(400, 100);
                                    CheckOKFrame.setTitle("Check Balance");
                                    CheckOKFrame.add(new JLabel("   " + bankAccountDetails.get(loginKey)));
                                    CheckOKFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                    CheckOKFrame.setVisible(true);
                                }
                            }
                            else{
                                JFrame errorframe = new JFrame();
                                errorframe.setSize(400, 100);
                                errorframe.setTitle("Account not found");
                                errorframe.add(new JLabel(" Please make an account"));
                                errorframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                errorframe.setVisible(true);
                            }
                        }

                    if (e.getSource() == depositOK) {
                        if(permit == true){
                            JFrame depositOKFrame = new JFrame();
                            depositOKFrame.setSize(400, 100);

                            JPanel depositOKPanel = new JPanel();

                            JLabel deposit_label = new JLabel();

                            deposit_label.setText("Enter deposit amount");


                            JLabel message = new JLabel();
                            depositOKPanel.add(deposit_label);
                            depositOKPanel.add(deposit_amount);
                            depositOKPanel.add(message);
                            depositOKPanel.add(depositButton);

                            depositOKFrame.add(depositOKPanel);
                            depositOKFrame.setTitle("Depositing");
                            depositOKFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                            depositOKFrame.setVisible(true);

                        }
                        else{
                            JFrame errorframe = new JFrame();
                            errorframe.setSize(400, 100);
                            errorframe.setTitle("Account not found");
                            errorframe.add(new JLabel(" Please make an account"));
                            errorframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                            errorframe.setVisible(true);
                        }
                    }

                    if (e.getSource() == depositButton) {
                        int depositValue = Integer.parseInt(deposit_amount.getText());
                        double depositValueDouble = Double.valueOf(depositValue);
                        bankAccountValue = bankAccountValue + depositValueDouble;
                        bankAccountDetails.put(loginKey, bankAccountValue);
                        JFrame depositAccountFrame = new JFrame();
                        depositAccountFrame.setSize(400, 100);
                        depositAccountFrame.setTitle(" Deposited");
                        depositAccountFrame.add(new JLabel("You just deposited " + depositValue + " dollars"));
                        depositAccountFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                        depositAccountFrame.setVisible(true);
                    }

                        if (e.getSource() == exchangeOKButton) {
                            if(permit == true){
                                JFrame exchangeOKFrame = new JFrame();
                                JPanel exchangeOKPanel = new JPanel(new GridLayout(4, 1));
                                exchangeOKFrame.setSize(400, 600);

                                JLabel USD_label = new JLabel();
                                USD_label.setText("Enter Amount (USD) :");
                                JLabel EURO_label = new JLabel();
                                EURO_label.setText("Enter Amount (EURO) :");
                                JLabel RMB_label = new JLabel();
                                RMB_label.setText("Enter Amount (RMB) :");
                                JLabel JPN_label = new JLabel();
                                JPN_label.setText("Enter Amount (JPN) :");


                                exchangeOKPanel.add(USD_label);
                                exchangeOKPanel.add(cadUSD);
                                exchangeOKPanel.add(cadUSDOK);
                                exchangeOKPanel.add(EURO_label);
                                exchangeOKPanel.add(cadEuro);
                                exchangeOKPanel.add(cadEuroOK);
                                exchangeOKPanel.add(RMB_label);
                                exchangeOKPanel.add(cadRMB);
                                exchangeOKPanel.add(cadRMBOK);
                                exchangeOKPanel.add(JPN_label);
                                exchangeOKPanel.add(cadJPN);
                                exchangeOKPanel.add(cadJPNOK);


                                exchangeOKFrame.add(exchangeOKPanel);
                                exchangeOKFrame.setVisible(true);
                                exchangeOKFrame.setDefaultCloseOperation(HIDE_ON_CLOSE);
                            }
                            else{
                                JFrame errorframe = new JFrame();
                                errorframe.setSize(400, 100);
                                errorframe.setTitle("Account not found");
                                errorframe.add(new JLabel(" Please make an account"));
                                errorframe.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                errorframe.setVisible(true);
                            }


                        }



                        if (e.getSource() == cadUSDOK) {
                            bankAccountValue = bankAccountDetails.get(loginKey);
                            if (bankAccountValue <= 0) {
                                JFrame CheckOKFrame = new JFrame();
                                CheckOKFrame.setSize(400, 100);
                                CheckOKFrame.setTitle("Withdraw");
                                CheckOKFrame.add(new JLabel("    YOU'RE VERY POOR COME BACK WHEN YOU HAVE MONEY"));
                                CheckOKFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                CheckOKFrame.setVisible(true);
                            } else {
                                int cadUSDValue = Integer.parseInt(cadUSD.getText());
                                double cadUSDValueDouble = Double.valueOf(cadUSDValue);
                                bankAccountValue = bankAccountValue - cadUSDValueDouble;
                                bankAccountDetails.put(loginKey, bankAccountValue);
                                JFrame depositAccountFrame = new JFrame();
                                depositAccountFrame.setSize(400, 100);
                                depositAccountFrame.setTitle(" Deposited");
                                depositAccountFrame.add(new JLabel("  You just took " + cadUSDValue + " cad and turned it  " + (cadUSDValue * 0.83)));
                                depositAccountFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                depositAccountFrame.setVisible(true);
                            }
                        }

                        if (e.getSource() == cadEuroOK) {
                            bankAccountValue = bankAccountDetails.get(loginKey);
                            if (bankAccountValue <= 0) {
                                JFrame CheckOKFrame = new JFrame();
                                CheckOKFrame.setSize(400, 100);
                                CheckOKFrame.setTitle("Withdraw");
                                CheckOKFrame.add(new JLabel("    YOU'RE VERY POOR COME BACK WHEN YOU HAVE MONEY"));
                                CheckOKFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                CheckOKFrame.setVisible(true);
                            } else {
                                int cadEuroValue = Integer.parseInt(cadEuro.getText());
                                double cadEuroValueDouble = Double.valueOf(cadEuroValue);
                                bankAccountValue = bankAccountValue- cadEuroValueDouble;
                                bankAccountDetails.put(loginKey, bankAccountValue);
                                JFrame depositAccountFrame = new JFrame();
                                depositAccountFrame.setSize(400, 100);
                                depositAccountFrame.setTitle(" Deposited");
                                depositAccountFrame.add(new JLabel("  You just took " + cadEuroValue + " cad and turned it  " + (cadEuroValue * 0.68)));
                                depositAccountFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                depositAccountFrame.setVisible(true);
                            }
                        }

                        if (e.getSource() == cadRMBOK) {
                            bankAccountValue = bankAccountDetails.get(loginKey);
                            if (bankAccountValue <= 0) {
                                JFrame CheckOKFrame = new JFrame();
                                CheckOKFrame.setSize(400, 100);
                                CheckOKFrame.setTitle("Withdraw");
                                CheckOKFrame.add(new JLabel("    YOU'RE VERY POOR COME BACK WHEN YOU HAVE MONEY"));
                                CheckOKFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                CheckOKFrame.setVisible(true);
                            } else {
                                int cadRMBValue = Integer.parseInt(cadRMB.getText());
                                double cadRMBValueDouble = Double.valueOf(cadRMBValue);
                                bankAccountValue = bankAccountValue - cadRMBValueDouble;
                                bankAccountDetails.put(loginKey, bankAccountValue);
                                JFrame depositAccountFrame = new JFrame();
                                depositAccountFrame.setSize(400, 100);
                                depositAccountFrame.setTitle(" Deposited");
                                depositAccountFrame.add(new JLabel("  You just took " + cadRMBValue + " cad and turned it  " + (cadRMBValue * 5.28)));
                                depositAccountFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                depositAccountFrame.setVisible(true);
                            }
                        }

                        if (e.getSource() == cadJPNOK) {
                            bankAccountValue = bankAccountDetails.get(loginKey);
                            if (bankAccountValue <= 0) {
                                JFrame CheckOKFrame = new JFrame();
                                CheckOKFrame.setSize(400, 100);
                                CheckOKFrame.setTitle("Withdraw");
                                CheckOKFrame.add(new JLabel("    YOU'RE VERY POOR COME BACK WHEN YOU HAVE MONEY"));
                                CheckOKFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                CheckOKFrame.setVisible(true);
                            } else {
                                int cadJPNValue = Integer.parseInt(cadJPN.getText());
                                double cadJPNValueDouble = Double.valueOf(cadJPNValue);
                                bankAccountValue = bankAccountValue - cadJPNValueDouble;
                                bankAccountDetails.put(loginKey, bankAccountValue);
                                JFrame depositAccountFrame = new JFrame();
                                depositAccountFrame.setSize(400, 100);
                                depositAccountFrame.setTitle(" Deposited");
                                depositAccountFrame.add(new JLabel("  You just took " + cadJPNValue + " cad and turned it  " + (cadJPNValue * 90.35)));
                                depositAccountFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                                depositAccountFrame.setVisible(true);
                            }
                        }


                        if (e.getSource() == LogOut){
                            JFrame logOutAccountFrame = new JFrame();
                            logOutAccountFrame.setSize(400, 100);
                            logOutAccountFrame.setTitle(" Logged out");
                            logOutAccountFrame.add(new JLabel("  You've succesfully logged out"));
                            logOutAccountFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
                            logOutAccountFrame.setVisible(true);
                            loginKey = null;
                            bankAccountValue = 0.0;
                            permit = false;
                        }

                }
            }
        }



package Practice.Practice_IMP;

import java.util.Scanner;

 class BankAccount {
    String name;
    String username;
    String password;
    String accountNo;
    float balance=10000000f;
    int transaction=0;
    String transactionHistory="";
    public void register(){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your Name: ");
        this.name= sc.nextLine();
        System.out.println("Enter Username: ");
        this.username= sc.nextLine();
        System.out.println("Enter Password: ");
        this.password=sc.nextLine();
        System.out.println("Enter Valid Account No: ");
        this.accountNo=sc.nextLine();
        System.out.println("Registration Completed Kindly login ");

    }
    public boolean login(){
        boolean isLogin=false;
        Scanner sc=new Scanner(System.in);
        while (!isLogin){
            System.out.println("Enter Username: ");
            String Name= sc.nextLine();

            if (Name.equals(username)){
                while (!isLogin){
                    System.out.println("Enter Password: ");
                    String Password=sc.nextLine();

                    if (Password.equals(password)){
                        System.out.println("Login Successfull! ");
                        isLogin=true;
                    }
                    else {
                        System.out.println("Incorrect password ");
                    }
                }
            }
            else {
                System.out.println("Username Not Found ");
            }
        }
        return isLogin;
    }
    public void withdraw(){
        System.out.println("Enter Amount to withdraw: ");
        Scanner sc=new Scanner(System.in);
        float amount=sc.nextFloat();
        try {
            if (balance>=amount){
                transaction++;
                System.out.println("Withdraw Successfully!!");
                String str=amount+"RS Withdraw\n";
                transactionHistory=transactionHistory.concat(str);
            }else {
                System.out.println("Low Balance..");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void deposit(){
        System.out.println("Enter deposit Amount: ");
        Scanner sc=new Scanner(System.in);
        float amount= sc.nextFloat();
        try{
            if (amount<=1000000f){
                transaction++;
                balance+=amount;
                System.out.println("Successfully Amount Diposit");
                String str=amount+"RS deposited\n";
                transactionHistory=transactionHistory.concat(str);
            }
            else {
                System.out.println("\n sorry.......invalid limit");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void  transfer(){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Recipient name: ");
        String recipient=sc.nextLine();
        System.out.println("Enter Transfer Amount: ");
        float amount=sc.nextFloat();
        try {
            if (balance>=amount){
                if (amount<=50000000f){
                    transaction++;
                    balance+=amount;
                    System.out.println("Amount transfer Successfully!! "+recipient);
                    String str=amount+"RS Transfer to "+recipient+"\n";
                    transactionHistory=transactionHistory.concat(str);
                }
                else {
                    System.out.println("\n sorry.......invalid limit");
                }
            }else {
                System.out.println("Low Balance..");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    public void checkBalance(){
        System.out.println("\n"+balance+" Rs");
    }
    public void transHistory(){
        if (transaction==0){
            System.out.println("\n Empty");
        }else {
            System.out.println("\n"+transactionHistory);
        }
    }

}
class  ATMInterface{
    public static int takeIntegerInput(int limit){
        int input=0;
        boolean flag=false;

        while (!flag){
            try {
                Scanner sc=new Scanner(System.in);
                input= sc.nextInt();
                flag=true;

                if (flag && input > limit || input<1){
                    System.out.println("Choose the number between 1 to "+limit);
                    flag=false;

                }
            }catch (Exception e){
                System.out.println("Enter only integer value");
                flag=false;
            }
        };
        return input;
    }

    public static void main(String[] args) {
        System.out.println("\n---------------Welcome To ATM--------------------");
        System.out.println("1. Register \n 2. Exit");
        System.out.println("Enter Your Choice: ");
        int choice=takeIntegerInput(2);

        if (choice==1){
            BankAccount b=new BankAccount();
            b.register();
            while (true){
                System.out.println("1. Login \n 2. Exit");
                System.out.print("Enter Your Choice: ");
                int ch=takeIntegerInput(2);

                if (ch==1){
                    if (b.login()){
                        System.out.println("\n----------------Welcome Back "+b.name+"----------------\n");
                        boolean isFinished=true;
                        while (isFinished){
                            System.out.println("\n 1. Withdraw \n2. Deposit \n 3. Tranfer " +
                                    "\n 4.Check Balance \n 5.Transfer History \n 6. Exit");
                            System.out.print("Enter Your Choice: ");
                            int c=takeIntegerInput(6);
                            switch (c){
                                case 1:
                                    b.withdraw();
                                    break;
                                case 2:
                                    b.deposit();
                                    break;
                                case 3:
                                    b.transfer();
                                    break;
                                case 4:
                                    b.checkBalance();
                                    break;
                                case 5:
                                    b.transHistory();
                                    break;
                                case 6:
                                    isFinished=true;
                                    break;
                            }
                        }
                    }
                }else {
                    System.exit(0);
                }
            }
        }
        else {
            System.exit(0);
        }
    }
}

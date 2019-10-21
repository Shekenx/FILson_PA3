public class SavingsAccount {
    private double savingsBalance;

    public SavingsAccount() {
        savingsBalance = 0.0;
    }
    public void SaverBalance(double amount) {
        savingsBalance = amount;
    }
    public static double setAnnualRate;

    public void MonthlyRate(){

         savingsBalance += (savingsBalance * setAnnualRate) / (12.0);

    }
    public static double modifyInterestRate;

    public double getBalance(){
        return savingsBalance;
    }



    public static void main(String[] args) {

        SavingsAccount.setAnnualRate = 0.04;
        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        saver1.SaverBalance(2000);
        saver2.SaverBalance(3000);
        System.out.println("\t*******Account Balance*******\t");
        System.out.println("\t*******Saver 1*******\t");
        for(int i = 1; i < 13; ++i) {
            saver1.MonthlyRate();
            saver1.getBalance();

            if(i == 12){
                setAnnualRate = 0.05;
            }
            System.out.printf("\tmonth" + i + " : " + " %.2f\t\n", saver1.getBalance());

        }
        System.out.println("\n\t*******Account Balance*******\t");
        System.out.println("\t********Saver 2*******\t\n");
        for(int i = 1; i < 13; ++i) {

            saver2.MonthlyRate();
            saver2.getBalance();


            if(i == 12){
               setAnnualRate = 0.05;
            }
            System.out.printf("\tmonth" + i + " :  " + " %.2f\t\n", saver2.getBalance());
        }
    }


}

public class BasicAccount extends BankAccount{

    // constructor
    BasicAccount()
    {
        super();
    }

    // @Override
    public void withdraw(double amount)
    {
        if(amount > super.getBalance())
        {
            System.out.println("Insufficient funds. Withdrawal amount exceeds current balance.");
        }
        else
        {
            super.withdraw(amount);
        }
    }
}
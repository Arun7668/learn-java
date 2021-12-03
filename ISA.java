abstract class Account {
    int id;
    String branch;
    String Name;

    void deposit() {
        System.out.println("Account Deposit");
    }

    void withdrow() {
        System.out.println("Account withdrow");
    }

    void checkBalance() {
        System.out.println("Account checkBalance");
    }
    abstract void roi();
    // void roi() {
    //     System.out.println("Generic ROI Account");
    // }
}

class SavingAccount extends Account {
    @Override
    void roi() {
        System.out.println("low interest rec from bank");
    }

    void LimitTransInDay() {
        System.out.println("Transfer limit is 5");
    }
}

class CurrentAccount extends Account {
    @Override
    void roi() {
        System.out.println("you need to pay bank");
    }

    void odLimit() {
        System.out.println("odLimit is current account");
    }
}

class FixeDepositAccount extends Account {
    @Override
    void roi() {
        System.out.println("high roi pay by bank");
    }

    void LokingPreiod() {
        System.out.println("Ammount is locked for sometime");
    }
}

class Caller {
    static void callme(Account account) {
        account.withdrow();
        account.deposit();
        account.roi();
        System.out.println("*************************");
        if (account instanceof SavingAccount) {
            SavingAccount sa = (SavingAccount) account;// down casting
            sa.LimitTransInDay();
        } else {
            if (account instanceof CurrentAccount) {
                CurrentAccount Ca = (CurrentAccount) account;// downcasting
                Ca.odLimit();
            } else {
                if (account instanceof FixeDepositAccount) {
                    ((FixeDepositAccount) account).LokingPreiod();
                }
            }
        }

    }
}

class banking {
    public static void main(String[] args) {
        // Caller.callme(new Account());
        Caller.callme(new SavingAccount());
        Caller.callme(new CurrentAccount());
        Caller.callme(new FixeDepositAccount());

        // *********ye DRY(don't repeat your self ) follow nhu kr raha tha isliye
        // comment */
        // SavingAccount savingAccount =new SavingAccount();
        // savingAccount.checkBalance();
        // savingAccount.withdrow();
        // savingAccount.roi();
        // savingAccount.LimitTransInDay();
        // System.out.println("***************************");

        // CurrentAccount currentAccount =new CurrentAccount();
        // currentAccount.checkBalance();
        // currentAccount.withdrow();
        // currentAccount.roi();
        // currentAccount.odLimit();
        // System.out.println("***************************");

        // FixeDepositAccount fa =new FixeDepositAccount();
        // fa.checkBalance();
        // fa.withdrow();
        // fa.roi();
        // fa.LokingPreiod();
        // System.out.println("***************************");

    }

}

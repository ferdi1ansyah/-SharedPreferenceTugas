package com.dhanifudin.cashflow;

import com.dhanifudin.cashflow.models.Account;
import com.dhanifudin.cashflow.models.Session;

public class Application extends android.app.Application {
    private static Session session;
    private static Account account;

    public static Account getAccount() {
        return account;
    }

    public static Session getSession() {
        return session;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        account = new Account("ferdi");
        session = new Session(this);
    }
}


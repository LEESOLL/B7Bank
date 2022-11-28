package bank.application;


import bank.controller.Bank;
import bank.view.LoginAndRegisterView;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        LoginAndRegisterView.printLogo();
        Bank bank = new Bank("세븐뱅크", new BigDecimal(0.01));
        bank.registerCustomer("pororo", "1234", "뽀로로");
        bank.registerCustomer("lupi", "1234", "루피");
        bank.registerCustomer("krong", "1234", "크롱");

        while (true) {
            LoginAndRegisterView.showBeginningUI(bank);
        }
    }
}

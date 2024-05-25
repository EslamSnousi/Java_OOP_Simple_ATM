package com.mycompany.hellojava;

import static java.lang.Math.*;
import java.util.Arrays;
import java.util.Scanner;

public class Hellojava {

    public static void main(String[] args) {
        account a1 = new account();
        account a2 = new account();
        account a3 = new account();
        a1.insert(4451238, "Mohamed", 10000);
        a2.insert(9563145, "Belal", 100);
        a3.insert(4451238, "Ahmed", 500);
        a1.deposit(12000);
        a1.withdraw(2000);
        a1.checkBalance();
        a2.deposit(10);
        a2.withdraw(140);
        a2.checkBalance();
        a3.deposit(550);
        a3.withdraw(10);
        a3.checkBalance();

        System.out.println(a1.toString());
        System.out.println(a2.toString());
        System.out.println(a3.toString());

    }

}

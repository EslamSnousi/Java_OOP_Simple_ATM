/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hellojava;



public class account {

    private int accountNo;
    private String name;
    private float amount;

    //methods
    void insert(int accountNo, String accountName, float accountAmt) {
        this.accountNo = accountNo;
        this.name = accountName;
        this.amount = accountAmt;
    }

    void withdraw(float amt) {
        if(amt > this.amount)
            System.out.println("Your current balance is insufficient!");
        else {   
            this.amount = this.amount - amt;
            System.out.println(amt+" withdrawn");
            }
    }

    void deposit(float amt) {
        this.amount = this.amount + amt;
        System.out.println(amt+" deposited");
    }

    

    public void checkBalance() {
        System.out.println("Balance= " + amount);
    }

    public String toString() {
        return "account{" + "accountNo=" + accountNo + ", Name=" + name + ", Balance=" + amount + '}';
    }
    
}

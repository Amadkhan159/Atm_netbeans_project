/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ooppro;

/**
 *
 * @author Muzamil
 */
public class Account extends Bank {

    private String name;
    public static double balance;
    private int pincode;
    private String exp;
    private int card_num;

    public Account(){
        super();
        this.name = "";
        this.balance = 40;
        this.pincode = 0;
        this.exp = "";
        this.card_num = 0;
    }

    /**
     * @constructor 
     */
    public Account(String name,double balance, int card, String exp, int account_typ){

        this.name = name;
        this.balance = balance;
        this.pincode = card;
        this.exp = exp;
        this.card_num = account_typ;
    }

    /**
     * @return name of customer
     */
    public String getName(){

        return name;
    }

    /**
     * @return card number
     */
    public int getpincode(){

        return pincode;
    }

    /**
     *@return expiration date
     */
    public String getExpDate(){

        return exp;
    }

    /**
     * @return password
     */
    public int getaccount_type(){

        return card_num;
    }


    public void setBalance(double balance){

        this.balance = balance;

    }


 
    public static double getBalance(){

        return balance;
    }

  
    public String toString(){
  return String.format("Customer Name: %s   Balance: %s   Pincode: %s   Expiration Date:%s  account_type: %s", 
         getName(),getBalance(), getpincode(), getExpDate(), getaccount_type());
    }

}
    


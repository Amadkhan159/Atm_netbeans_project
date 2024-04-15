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
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.io.FileWriter;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class Bank{

    /**
     * @ArrayList 
     */
    private static  ArrayList<Account> A;
    private static ArrayList<Account> B;

    /**
     * @Constructor 
     */
    public Bank(){
        
        A = new ArrayList<>();
        B = new ArrayList<>();
       
    }
    public void addBankA(Account acc){
      
        
       

        A.add(acc);

    }

    public void addBankB(Account acc){

        B.add(acc);
    }

  
    public void showAccounts(){

        for(Account acc : A) System.out.println(acc.toString());
        for(Account acc : B) System.out.println(acc.toString());
       
    }

    public void filehand(){
          try{
            PrintWriter fw=new PrintWriter("C:\\atm1.txt");
            fw.println(A);
            fw.println(B);
            fw.close();
        }
       catch(Exception e)
                    {
                       System.out.println("Error Covered"); 

            }
        
    }

  
    public boolean authorizeATMA(int card){
        boolean isTrue = false;
        boolean isIt = false;
        for(Account acc : A){
            if (card == acc.getpincode()) {
                isTrue = true;
                    if (card == acc.getpincode() && cardExp(acc.getExpDate())){
                        System.out.println("card is authorized");
                        System.out.println("wellcome : " + acc.getName());
                    isIt = true;
                        break;
            }if(isIt == false) {
                    System.out.println("card is expired");
                    
                }
            }
        }
        for(Account acc : B){
            if (card == acc.getpincode()) {
                isTrue = true;
                if (card == acc.getpincode() && cardExp(acc.getExpDate())){
                    System.out.println("card is authorized");
                    System.out.println("wellcome : " + acc.getName());
                    isIt = true;
                    break;
                }if(isIt == false) {
                    System.out.println("card is expired");
                }
            }
        }

        if(isTrue == false){
            System.out.println("card is not supported by ATM");
        }
        System.out.println(isTrue && isIt);
        return (isTrue && isIt);
    }
   

 
    public static boolean cardExp(String month){

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String today = sdf.format(new Date());
        if(month.compareTo(today) > 0){
            return true;
        }else
            return false;
    }
   
    public String authorizeCardA(int passCode){
        String isTrue=null;
        for(Account acc : A){
            if (passCode==acc.getaccount_type()) {
                
                isTrue = acc.getName();
                break;
            }
        }
            for(Account acc : B){
                if (passCode==acc.getaccount_type()) {
                    isTrue = acc.getName();
                    break;
                }
        }
        
        
        return isTrue;

    }

    
    public static boolean pincode(int pincode){
        
        boolean valid=false;
        
        for(Account acc : A){
             if (pincode == acc.getpincode()){
               
                 valid=true;
            
          
             }
             
                
             
                   
                    
                }    
 
         for(Account acc : B){
            if (pincode == acc.getpincode()){ 
                
                    
                   valid=true;
                    
      
            }    
         }  
         
        return valid;
    }
    public static double withdraw(int pincode,int amount){
        double amount2= 0;
        for(Account acc : A){
             if (pincode == acc.getpincode()){
                if(amount <= acc.getBalance()) {
       
            
              amount2 = acc.getBalance()-amount;
              acc.setBalance(amount2);
                  
           
                     try{
                
                
                      PrintWriter fw=new PrintWriter("C:\\Users\\Amad khan\\Desktop\\OopPro_1\\OopPro_1\\atm.txt");
                      fw.println("You have withdraw "+amount+" Rupees Successfully!");
                      fw.println("Your remaing Balance is "+acc.getBalance()+ " Rupees");
                      fw.println("Current Date and Time :"+ date.dis());
                      fw.println("............Thank You.............." );  
                                                          
                                 fw.close();
                }
                    catch(Exception e)
                    {
                       System.out.println("Error Covered"); 

            }
       
                    return amount2;
                }    
              
            }
        }
        
        
         for(Account acc : B){
            if (pincode == acc.getpincode()){ 
                if(amount <= acc.getBalance()) {
                    System.out.println(acc.getBalance());
                    amount2 = acc.getBalance() - amount;
                    acc.setBalance(amount2);
      
                     try{
                
                
                      PrintWriter fw=new PrintWriter("C:\\Users\\Amad khan\\Desktop\\OopPro_1\\OopPro_1\\atm.txt");
                      fw.println("You have withdraw  "+amount+" Rupees Successfully!");
                      fw.println("Your remaing Balance is "+(acc.getBalance()-amount)+ "Rs");
                      fw.println("Current Date and Time :"+ date.dis());
                      fw.println("............Thank You.............." );               
                                                          
                                 fw.close();
                }
                    catch(Exception e)
                    {
                       System.out.println("Error Covered"); 

            }
           
                    
                    return amount2;
                    
                }   
               
       
            }    
         }        
        return amount2;
    }       
}
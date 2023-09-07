/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaex3.pkg2;

/**
 *
 * @author 22cseb57
 */
public class Javaex32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        bankA obj=new bankA();
        System.out.print("BankA balance:$");
        System.out.println(obj.getbalance());
        bankB obj1=new bankB();
        System.out.print("BankB balance:$");
        System.out.println(obj1.getbalance());
        bankC obj2=new bankC();
        System.out.print("BankC balance:$");
        System.out.println(obj2.getbalance());
    }
    
}

class bank
{
    int bal=0;
    int getbalance()
    {
        return bal;
    }
}

class bankA extends bank
{
    int bal=1000;
    int getbalance()
    {
        return bal;
    }
}

class bankB extends bank
{
    int bal=1500;
    int getbalance()
    {
        return bal;
    }
}

class bankC extends bank
{
    int bal=2000;
    int getbalance()
    {
        return bal;
    }
}

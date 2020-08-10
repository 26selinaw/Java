package com.selina
public class Scope 
{
    public static void doSomething() 
    {
        int count = 0; 
            ...
        //code to do something - no screen output produced
        count++; 
    }
    public static void main(String[] args) 
    {
        int count = 0;
        System.out.println("How many iterations?"); 
        int n = 3; 
        //read user input 
        for(int i=1;i<=n;i++)
        {
            doSomething();
            System.out.println(count); 
        }
    }
}
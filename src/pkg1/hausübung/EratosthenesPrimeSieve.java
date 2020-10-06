/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.hausübung;

import java.util.ArrayList;

/**
 *
 * @author szabo
 */
public class EratosthenesPrimeSieve implements PrimeSieves
{
    int grenze;
    
    
    
    public EratosthenesPrimeSieve(int pGrenze)
    {
        this.grenze = pGrenze;
    }
    
    @Override
    public boolean isPrime(int number)
    {
        
        int sqrt = (int) Math.sqrt(number) + 1;
        for(int i = 2; i < sqrt; i++)
        {
            if(number % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    @Override
    public void printPrimes()
    {
        boolean array[] = sieveOfEratosthenes(grenze);
        sieveOfEratosthenes(grenze);
        for(int i = 2; i <= grenze; i++) 
        { 
            
            if(array[i] == true) 
            {
                System.out.println(i + " "); 
            }
        } 
    }
    
    
    
    
    public boolean[] sieveOfEratosthenes(int n) 
    { 
        boolean prime[] = new boolean[n+1]; 
        for(int i=0;i<n;i++)
        {
            prime[i] = true; 
        } 
        
        for(int p = 2; p*p <=n; p++) 
        { 
            if(prime[p] == true) 
            { 
                for(int i = p*p; i <= n; i += p) 
                    prime[i] = false; 
            } 
        } 
        return prime;
          
        
    
    }
    
    
    public void primeAddieren(int max) 
    {
        
        
    }
            
    
    
} 
      

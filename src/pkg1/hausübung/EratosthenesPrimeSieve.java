/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg1.hausübung;

/**
 *
 * @author szabo
 */
public class EratosthenesPrimeSieve 
{
    int grenze;
    public EratosthenesPrimeSieve(int pGrenze)
    {
        this.grenze = pGrenze;
    }
    
    
    public interface PrimeSieve
    {
        public boolean isPrime(int p);
        public void printPrimes();
    }
    
}
    
      

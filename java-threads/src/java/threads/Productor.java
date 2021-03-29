/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.threads;

/**
 *
 * @author Bryan
 */
public class Productor implements Runnable{

    SharedMemory sharedMemory;
    
    Productor(SharedMemory sharedMemory){
        this.sharedMemory = sharedMemory;
    }
    
    private synchronized void write(){
            
        int randomNumber = (int) (Math.random()*(10-1)+1);
            
        this.sharedMemory.setSharedMemory(randomNumber);
            
        System.out.println("El productor ingresó el número: "+randomNumber);
         
    } 
    
    @Override
    public void run() {
        write();
    }
    
}

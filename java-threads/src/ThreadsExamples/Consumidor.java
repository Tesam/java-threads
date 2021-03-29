/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsExamples;

/**
 *
 * @author Techi
 */
public class Consumidor implements Runnable{
    
    SharedMemory sharedMemory;
    int sharedVariable;
    
    Consumidor(SharedMemory sharedMemory){
        this.sharedMemory = sharedMemory;
    }
    
    private synchronized void read(){         
      
        sharedVariable = this.sharedMemory.getSharedMemory();
            
        System.out.println("El consumidor lee el número: "+sharedVariable);
         
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            read();
        }
    }
    
}

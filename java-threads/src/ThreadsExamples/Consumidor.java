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
            
        System.out.println("El consumidor "+Thread.currentThread().getName()+" lee el número: "+sharedVariable);
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         
    }

    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            read();
        }
    }
    
}

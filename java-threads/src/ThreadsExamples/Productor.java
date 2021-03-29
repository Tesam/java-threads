/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadsExamples;

/**
 *
 * @author Bryan
 */
public class Productor implements Runnable{

    SharedMemory sharedMemory;
    int sharedVariable;
    
    Productor(SharedMemory sharedMemory){
        this.sharedMemory = sharedMemory;
    }
    
    private synchronized void write(){
            
        sharedVariable = (int) (Math.random()*(10-1)+1);
            
        this.sharedMemory.setSharedMemory(sharedVariable);
            
        System.out.println("El productor "+Thread.currentThread().getName()+" ingresó el número: "+sharedVariable);
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
         
    } 
    
    @Override
    public void run() {
        for(int i = 0; i < 10; i++){
            write();
        }
    }
    
}

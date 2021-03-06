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
public class Productor implements Runnable{

    final SharedMemory sharedMemory;
    int sharedVariable;
    
    Productor(SharedMemory sharedMemory){
        this.sharedMemory = sharedMemory;
    }
    
    /*
    * Método que escribe en la memoria compartida
    */
    private void write(){
        
        sharedVariable = (int) (Math.random()*(10-1)+1);
        
        //Región crítica del hilo        
        synchronized(sharedMemory){
            sharedMemory.setSharedMemory(sharedVariable);
            System.out.println("El "+Thread.currentThread().getName()+" ingresó el número: "+sharedVariable);
        }
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("INTERRUPTED EXCEPTION "+e.getMessage());
        }
        
    } 
    
    @Override
    //El hilo se ejecuta 10 veces
    public void run() {
        for(int i = 0; i < 10; i++){
            write();
        }
    }
    
}

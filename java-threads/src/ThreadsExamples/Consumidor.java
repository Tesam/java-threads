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
    
    final SharedMemory sharedMemory;
    int sharedVariable;
    
    Consumidor(SharedMemory sharedMemory){
        this.sharedMemory = sharedMemory;
    }
    
    /*
    * Método que lee en la memoria compartida
    */
    private void read(){         
      
        //Región crítica del hilo
        synchronized(sharedMemory){
            sharedVariable = this.sharedMemory.getSharedMemory();
            System.out.println("El "+Thread.currentThread().getName()+" lee el número: "+sharedVariable);
        }
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("INTERRUPTED EXCEPTION "+e.getMessage());
        }
         
    }

    @Override
    //El hilo se ejecuta 10 veces
    public void run() {
        for(int i = 0; i < 10; i++){
            read();
        }
    }
    
}

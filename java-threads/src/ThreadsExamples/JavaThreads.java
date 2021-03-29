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
public class JavaThreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SharedMemory sharedMemory = new SharedMemory();
        
        Productor productor = new Productor(sharedMemory);        
        Consumidor consumidor = new Consumidor(sharedMemory);
        
        Thread threadProductor = new Thread(productor);
        Thread threadConsumidor = new Thread(consumidor);
        
        threadProductor.setName("Productor 1");
      
        threadProductor.start();
        threadConsumidor.start();

    }
    
}

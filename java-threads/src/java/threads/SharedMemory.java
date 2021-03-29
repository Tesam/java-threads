/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.threads;

/**
 *
 * @author Techi
 */
public class SharedMemory {
    private int sharedVariable;
    
    public SharedMemory(){}
    
    public int getSharedMemory(){
        return sharedVariable;
    }
    
    public void setSharedMemory(int sharedMemory){
        this.sharedVariable = sharedMemory;
    }
}

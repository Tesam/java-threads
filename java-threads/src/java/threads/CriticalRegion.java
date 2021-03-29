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
public class CriticalRegion {
    private int sharedMemory;
    
    public CriticalRegion(){}
    
    public int getSharedMemory(){
        return sharedMemory;
    }
    
    public void setSharedMemory(int sharedMemory){
        this.sharedMemory = sharedMemory;
    }
}

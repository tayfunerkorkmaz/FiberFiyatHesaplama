/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultpackage;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 *
 * @author Hale Çakır
 */
public abstract class ObjectPool implements ObjectFactory, Pool {
    
   private int size;
    
   private boolean shutdown;
    
   private BlockingQueue objects;
    
   public ObjectPool(int size) {
      this.size = size;
      shutdown = false;
      init();
   }
    
   /*
    * initiate the pool with fix size
    */
   private void init() {
      objects = new LinkedBlockingQueue();
      for (int i = 0; i < size; i++) {
         objects.add(createNew());
      }
   }
    
   @Override
   public T get() {
      if (!shutdown) {
         T t = null;
         			
         try {
            t = objects.take();
         }
         catch (Exception e) {
            e.printStackTrace();
         }
            
         return t;
      }
        
      throw new IllegalStateException("Object pool is already shutdown.");
   }
    
   @Override
   public void release(T t) {
      try {
         objects.offer(t);
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
    
   @Override
   public void shutdown() {
      objects.clear();
   }
    
   public int size() {
      return objects.size();
   }
    
}

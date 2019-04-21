package defaultpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hale Çakır
 */
public interface Pool {

   /*
    * @return one of the pooled objects.
    */
   T get();

   /*
    * @param object T to be return back to pool
    */
   void release(T object);

   /**
    * Shuts down the pool. Should release all resources.
    */
   void shutdown();
}
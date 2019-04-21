/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultpackage;

/**
 *
 * @author Hale Çakır
 */
public interface ObjectFactory {

    /**
     * Returns a new instance of an object type T.
     *
     * @return T an new instance of the object type T
     */
    public abstract T createNew();
}

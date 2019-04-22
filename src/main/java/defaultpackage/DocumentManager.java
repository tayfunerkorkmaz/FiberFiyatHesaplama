/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package defaultpackage;

/**
 *
 * @author tayfunerkorkmaz
 */
public class DocumentManager {
    
    private DocumentBuilder builder;
    
    public DocumentManager(DocumentBuilder builder)
        {
            this.builder = builder;
        }
    
    public void build()
        {
            builder.buildDocument();
            
        }
    
}

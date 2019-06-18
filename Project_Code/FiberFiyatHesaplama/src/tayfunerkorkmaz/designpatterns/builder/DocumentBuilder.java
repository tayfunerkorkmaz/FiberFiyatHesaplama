/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tayfunerkorkmaz.designpatterns.builder;

/**
 *
 * @author tayfunerkorkmaz
 */
public abstract class DocumentBuilder {
    
    protected DocumentInfo documentInfo;
    
    
      public DocumentBuilder(DocumentInfo documentInfo)
        {
            this.documentInfo = documentInfo;
        }

       public void buildDocument() {

        BuildHeader();
        BuildContents();
        BuildFooter();
       
    }
    
    public abstract void BuildHeader();

    public abstract void BuildFooter();

    public abstract void BuildContents();
}

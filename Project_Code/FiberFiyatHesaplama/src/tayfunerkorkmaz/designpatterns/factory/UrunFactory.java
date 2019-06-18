/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tayfunerkorkmaz.designpatterns.factory;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author tayfunerkorkmaz
 */
public abstract class UrunFactory {
	
	public List<Kablo> urunList=new ArrayList<Kablo>();
	
	public abstract void createUrun(String kabloTip, String kabloYapi, String fiberTip, String sagKonnektor, String solKonnektor, String kabloCapi, int kabloMetre);
	
	public List<Kablo> getUrunList() {
		return urunList;
	}
 
	public void setUrunList(List<Kablo> urunList) {
		this.urunList = urunList;
	}
 
}
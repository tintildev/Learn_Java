package at.martinklestil.arraylist.kursePackage;

import java.util.ArrayList;


//Dekleration = Erzeugung einer konkreten = normalen Klasse
public class Kurse {
	//Eigenschaften
	
	//es wird ein Objekt nach Vorlage der Klasse ArrayListe neue erstellt
	//und die Adresse dieses Objekt der Objektvariable (tnListe) uebergeben
	private ArrayList<String> tnListe = new ArrayList<String>();
	
	
	//Methoden
	//Dekleration = Erzeugung einer konkreten = normalen Methode
						//Uebergabeparameter i.d.F Formalparameter
	public void anmelden(String pVorname){
		//body = Inhalt der Methode = Implemetierung
		tnListe.add(pVorname);
	}
	
	
	public void abmelden(String pVorname){
		//contains()
		//Ueberprueft das vorhandensein von einzelnen Elementen in der Liste
		if(tnListe.contains(pVorname)){
			//indexof
			//liefert die entspechende Indexzahl eines Listeneintrags
			int temp = tnListe.indexOf(pVorname);
			tnListe.remove(temp);
			System.out.println("\n" + pVorname +" wurde abgemeldet");
		}
		else{
			System.out.println("\n" + pVorname +" war nie angemledet");
		}
	}
	public void tnanzeigen(){
		System.out.println("die momentanen teilnehmer anzahl: " + tnListe.size());
		for(int i = 0; i < tnListe.size(); i++ ){
			System.out.println(tnListe.get(i));
			
		}//end for
	}//end tnanzeigen
}//end class

package at.martinklestil.arraylist.startPackage;


import at.martinklestil.arraylist.kursePackage.Kurse;

public class Start {

	
	public static void main(String[] args) {
		// Klasseninteraktion d.h. Klasse Start ruft Mehtoden der Klasse Kurse auf
		//Assoiation
		Kurse myKurs = new Kurse();
		
		System.out.println("Anmeldevorgang wird gestartet");
		
		myKurs.anmelden("Klaus");
		myKurs.anmelden("Daniel");
		myKurs.anmelden("Nina");
		myKurs.anmelden("Maria");
		myKurs.anmelden("Jiri");
		myKurs.anmelden("Stefan1");
		myKurs.anmelden("Thomas");
		myKurs.anmelden("Stefana");
		myKurs.anmelden("Jason");
		
		
		//Aufgabe Liste anzeigen
		//den 0 abmelden
		//Liste wieder anzeigen
		
		myKurs.tnanzeigen();
		myKurs.abmelden("Klaus");
		myKurs.tnanzeigen();
		
		System.out.println("Anmeldevorgang ist beendet");
	}

}

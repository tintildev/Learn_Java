package model;

import java.util.ArrayList;
import java.util.UUID;

public class Person {
    private static int nextId = 1;
    //einfache ID
    private int databaseId;


    //Universally Unique Identifier - jede Instanz erhält eine eindeutige ID
    private UUID uuid;
    private String title;
    private String funktion;
    private String firma;
    private String vorname;
    private String nachname;
    private String geburtstag;
    private String adresse;
    private String ort;
    private String plz;
    private String telefon;
    private String email;
    private String land;
    private String info1;
    private String info2;
    private String info3;
    private String info4;
    private String info5;

    public Person(String vorname, String nachname) {
        this.databaseId = nextId++; // Weist die nächste verfügbare ID zu und erhöht den Zähler
        this.uuid = UUID.randomUUID(); // Generieren einer UUID
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Person(String title, String funktion, String firma, String vorname, String nachname, String geburtstag, String adresse, String ort, String plz, String telefon, String email, String land) {
        this.title = title;
        this.funktion = funktion;
        this.firma = firma;
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtstag = geburtstag;
        this.adresse = adresse;
        this.ort = ort;
        this.plz = plz;
        this.telefon = telefon;
        this.email = email;
        this.land = land;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getFunktion() {
        return funktion;
    }

    public void setFunktion(String funktion) {
        this.funktion = funktion;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    public String getGeburtstag() {
        return geburtstag;
    }

    public void setGeburtstag(String geburtstag) {
        this.geburtstag = geburtstag;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLand() {
        return land;
    }

    public void setLand(String land) {
        this.land = land;
    }

    public String getInfo1() {
        return info1;
    }

    public void setInfo1(String info1) {
        this.info1 = info1;
    }

    public String getInfo2() {
        return info2;
    }

    public void setInfo2(String info2) {
        this.info2 = info2;
    }

    public String getInfo3() {
        return info3;
    }

    public void setInfo3(String info3) {
        this.info3 = info3;
    }

    public String getInfo4() {
        return info4;
    }

    public void setInfo4(String info4) {
        this.info4 = info4;
    }

    public String getInfo5() {
        return info5;
    }

    public void setInfo5(String info5) {
        this.info5 = info5;
    }

    @Override
    public String toString() {
        return "Person{" +
                "databaseId=" + databaseId +
                ", uuid=" + uuid +
                ", title='" + title + '\'' +
                ", funktion='" + funktion + '\'' +
                ", firma='" + firma + '\'' +
                ", vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", geburtstag='" + geburtstag + '\'' +
                ", adresse='" + adresse + '\'' +
                ", ort='" + ort + '\'' +
                ", telefon='" + telefon + '\'' +
                ", email='" + email + '\'' +
                ", land='" + land + '\'' +
                ", info1='" + info1 + '\'' +
                ", info2='" + info2 + '\'' +
                ", info3='" + info3 + '\'' +
                ", info4='" + info4 + '\'' +
                ", info5='" + info5 + '\'' +
                '}';
    }
}

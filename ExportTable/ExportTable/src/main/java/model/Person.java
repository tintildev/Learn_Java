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
    private String adressekomplett;
    private String telefon;
    private String telMobile;
    private String email;
    private String emailFirma;
    private String land;
    private String info1;
    private String info2;
    private String info3;
    private String info4;
    private String info5;

    public Person() {
        this.databaseId = nextId++; // Weist die nächste verfügbare ID zu und erhöht den Zähler
        this.uuid = UUID.randomUUID(); // Generieren einer UUID
    }

    public int getDatabaseId() {
        return databaseId;
    }

    public UUID getUuid() {
        return uuid;
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

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        this.plz = plz;
    }

    public String getAdressekomplett() {
        return adressekomplett;
    }

    public void setAdressekomplett(String adressekomplett) {
        this.adressekomplett = adressekomplett;
    }

    public String getTelMobile() {
        return telMobile;
    }

    public void setTelMobile(String telMobile) {
        this.telMobile = telMobile;
    }

    public String getEmailFirma() {
        return emailFirma;
    }

    public void setEmailFirma(String emailFirma) {
        this.emailFirma = emailFirma;
    }

    public ArrayList<String> getPersonCharacteristics (){
        ArrayList<String> personCharacteristics = new ArrayList<>();
        personCharacteristics.add("databaseId");
        personCharacteristics.add("uuid");
        personCharacteristics.add("title");
        personCharacteristics.add("funktion");
        personCharacteristics.add("firma");
        personCharacteristics.add("vorname");
        personCharacteristics.add("nachname");
        personCharacteristics.add("geburtstag");
        personCharacteristics.add("adresse");
        personCharacteristics.add("adressekomplett");
        personCharacteristics.add("ort");
        personCharacteristics.add("plz");
        personCharacteristics.add("telefon");
        personCharacteristics.add("telMobile");
        personCharacteristics.add("email");
        personCharacteristics.add("emailFirma");
        personCharacteristics.add("land");
        personCharacteristics.add("info1");
        personCharacteristics.add("info2");
        personCharacteristics.add("info3");
        personCharacteristics.add("info4");
        personCharacteristics.add("info5");


        return personCharacteristics;
    }

    public void setData(String identifyer, String data) {
        switch (identifyer){
            case "databaseId":
                break;
            case "uuid":
                break;
            case "title":
                setTitle(data);
                break;
            case "funktion":
                setFunktion(data);
                break;
            case "firma":
                setFirma(data);
                break;
            case "vorname":
                setVorname(data);
                break;
            case "nachname":
                setNachname(data);
                break;
            case "geburtstag":
                setGeburtstag(data);
                break;
            case "adresse":
                setAdresse(data);
                break;
            case "adressekomplett":
                setAdressekomplett(data);
                break;
            case "ort":
                setOrt(data);
                break;
            case "plz":
                setPlz(data);
                break;
            case "telefon":
                setTelefon(data);
                break;
            case "telefonMobile":
                setTelMobile(data);
                break;
            case "eamil":
                setEmail(data);
                break;
            case "emailFirma":
                setEmailFirma(data);
                break;
            case "land":
                setLand(data);
                break;
            case "info1":
                setInfo1(data);
                break;
            case "info2":
                setInfo2(data);
                break;
            case "info3":
                setInfo3(data);
                break;
            case "info4":
                setInfo4(data);
                break;
            case "info5":
                setInfo5(data);
                break;
        }


    }
}

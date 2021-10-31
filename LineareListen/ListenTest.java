
/**
 * Beschreiben Sie hier die Klasse ListenTest.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class ListenTest{
    
    public static void main(String[] args){
    
    // Ein paar Elemente und Listen erzeugen    
    Element e1 = new Element("eins");
    Element e2 = new Element("zwei");
    Element e3 = new Element("drei");
    Element e4 = new Element("vier");
    Element e5 = new Element("fünf");
    Element e6 = new Element("sechs");
    Element e7 = new Element("sieben");
    Element e0 = new Element("null");
    Element e00 = new Element("000");
    Liste l1 = new Liste();
    Liste l2 = new Liste();
    
    // Testen der Methoden
    l1.ausgeben();
    l1.vorneEinfuegen(e00);
    l1.hintenAnfuegen(e2);
    l1.hintenAnfuegen(e3);
    l1.einfuegen(e1,1);
    l1.ausgeben(); // Lsg: "000", "eins", "zwei", "drei"
    System.out.println("Letztes Element: "+ l1.gibLetztes().getDaten());
    l1.vorneLoeschen();
    l1.vorneEinfuegen(e0);
    l1.ausgeben(); // Lsg: "null", "eins", "zwei", "drei"
    System.out.println("Element an Position 2: " + l1.gibAnPosition(2).getDaten());
    
    l2.vorneEinfuegen(e6);
    l2.einfuegen(e5,1);
    l2.vorneEinfuegen(e7);
    l2.hintenAnfuegen(e4);
    l2.ausgeben(); // Lsg: "sieben", "sechs", "fünf", "vier"
    l2.loeschen(0);
    l2.loeschen(2);
    l2.ausgeben(); // Lsg: "sechs", "fünf"
    

    
    
    
    
    
    
    
    }
}

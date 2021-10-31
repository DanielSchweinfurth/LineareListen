
/**
 * Write a description of class Liste here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Liste
{
    // instance variables - replace the example below with your own
    private int x;
    private Element anfang = new Element();
    private int laenge;

    /**
     * Constructor for objects of class Liste
     */
    public Liste()
    {
        anfang = null;
        laenge = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Element getAnfang(){
        return anfang;
    } 
    
    public int getLaenge(){
        return laenge;
    }
    
    public boolean istLeer(){
        if (anfang == null){
            return true;
        }else{return false;}
    }
    
    public void vorneEinfuegen(Element neuesElement){
        neuesElement.setNaechstes(anfang);
         anfang = neuesElement;
         laenge++;
    }
    
    public Element gibAnPosition(int Position) {
         if (0 <= Position && Position < laenge) {
         Element aktElement = anfang;
         for (int i = 0; i < Position; i++)
         aktElement = aktElement.getNaechstes();
         return aktElement;
        } else
        return null;
    }
    
    public void einfuegen(Element neuesElement, int Position) {
         if (Position == 0)
            vorneEinfuegen(neuesElement);
         else if (0 < Position && Position <= laenge) {
            Element aktElement = gibAnPosition(Position-1);
            neuesElement.setNaechstes(aktElement.getNaechstes());
            aktElement.setNaechstes(neuesElement);
            laenge++;
         }
    }
    
    public void hintenAnfuegen(Element neuesElement){
        
    }
    
    public void ausgeben(){
        for(int i = 0; getLaenge() >= i; i++){
            System.out.println(gibAnPosition(i));
        }
    }
}

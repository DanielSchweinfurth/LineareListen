
/**
 * Write a description of class Elemnt here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Element
{
    // instance variables - replace the example below with your own
    private String daten;
    private Element naechstes = new Element();

    /**
     * Constructor for objects of class Elemnt
     */
    public Element()
    {
        // initialise instance variables
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Element(String inhalt)
    {
        inhalt = daten;        
    }
    
    public String getDaten(){
        return daten;
    }
    
    public Element getNaechstes(){
        return naechstes;
    }
    
    public void setNaechstes(Element next){
        next = naechstes;
    }
}

import java.util.*;
public class Test {
	public static void main(String[] args){
		Element a = new Element("eins");
		LineareListe liste = new LineareListe(a);
		LineareListe liste1 = new LineareListe();
		
		Element b = new Element("zwei");
		Element c = new Element("drei");
		Element d = new Element("vier");
		Element e = new Element("fünf");
		Element f = new Element("sechs");
		
		a.setPointer(b);
		b.setPointer(c);
		c.setPointer(d);
		d.setPointer(e);
		e.setPointer(f);
		
		System.out.println(liste.getLast().getInhalt());

		System.out.println(liste.getLaenge());
		System.out.println(liste1.getLaenge());
		System.out.print(liste1.greaterLength(liste));
	}
}

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
		
		System.out.println("Liste Full");
		System.out.println(liste.getLaenge(liste.getStart()));
		System.out.println(liste.istLeer());
		System.out.println(liste.getlastRe(liste.getStart()).getInhalt());// sollte sechs ausgeben es wird aber eins ausgegeben ?
		System.out.println(liste.greaterLength(liste,liste1));
		
		System.out.println("");
		
		System.out.println("Liste1 empty");
		System.out.println(liste1.getLaenge(liste.getStart()));
		System.out.println(liste1.istLeer());
		System.out.println(liste1.getLastRec());

	}

	private static char[] greaterLength() {
		// TODO Auto-generated method stub
		return null;
	}
}

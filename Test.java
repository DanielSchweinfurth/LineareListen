import java.util.*;
public class Test {
	public static void main(String[] args){
		Element a = new Element("eins");
		LineareListe liste = new LineareListe(a);
		LineareListe liste1 = new LineareListe();
		
		Element b = new Element("zwei");
		liste.Add(b);
		Element c = new Element("drei");
		liste.Add(c);
		Element d = new Element("vier");
		liste.Add(d);
		Element e = new Element("fünf");
		liste.Add(e);
		Element f = new Element("sechs");
		liste.Add(f);
		
		Element aa = new Element("1");
		liste1.Add(aa);
		Element ab = new Element("2");
		liste1.Add(ab);
		Element ac = new Element("3");
		liste1.Add(ac);
		Element ad = new Element("4");
		liste1.Add(ad);
		Element ae = new Element("5");
		liste1.Add(ae);
		
//		System.out.println(liste.getLastIterativ().getInhalt());
//		System.out.println(liste.getLastRekursiv().getInhalt());
//		
//		System.out.println(liste.getLength());
//		System.out.println(liste1.getLength());
//		System.out.print(liste1.greaterLength(liste));
		
		liste.appendList(liste1);
		
		
		
	}
}

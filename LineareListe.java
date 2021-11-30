import java.util.*;
public class LineareListe {
	//Atribute
	private Element start;
	private int laenge;
	
	//Konstruktor
	public LineareListe() {
		start = null;
		laenge = 0;
	}
	public LineareListe(Element start) {
		this.start = start;
		laenge = 1;
	}
	
	//Getter u. Setter
	public Element getStart() {
		return start;
	}
	
	public void setStart(Element start) {
		this.start = start;
	}
	
	public int getLength(){
		return laenge;
	}
//	
//	public int getLaenge() {
//		if(this.start == null) {
//			return 0;
//		}else {
//		return getLaenge(this.start);
//		}}
//	
//	public int getLaenge(Element e) {
//		if(e.getPointer() != null) {
//			laenge ++;
//			getLaenge(e.getPointer());
//		}
//		return laenge;
//	}
//	
	
	
	//Methoden
	public void Add(Element b) {
		if(this.start == null) {
			this.start = b;
			laenge ++;
		}else {
			this.getLastIterativ().setPointer(b);
			laenge ++;
		}
		
		
	}
	
	
	public Element getLastRekursiv() {
		return getlastRe(start);
	}
	private Element getlastRe(Element k) {
		if(k.getPointer() != null) {
			k = getlastRe(k.getPointer());
		}
		return k;
	}
	
	public Element getLastIterativ() { 
		Element e = start;
		while(e.getPointer() != null) {
			e = e.getPointer();
		}return e;
	}
	
	public boolean istLeer() {
		if(start == null) {
			return true;
		}else {
			return false;
		}
		
	}

/*
	public boolean greaterLength(LineareListe comp) {
		if(comp.getLaenge(comp.start) >= //was für ein statmenet brauche ich hier um liste.greaterLength(zu vergleichende Liste zu machen?)) 
				{
			return true;
		}else {
			return false;
		}
		
	}
*/
	
	public boolean greaterLength(LineareListe compare) {
		if(compare.getLength() <= this.getLength() ) {
			return true;
		}else {
			return false;
		}
				
	}
	
	public void appendList(LineareListe a) {
		if(a.getLength() <= this.getLength()) {
			this.getLastRekursiv().setPointer(a.start);
		}else {
			a.getLastIterativ().setPointer(this.start);
		}
	}
}


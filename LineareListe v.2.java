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
	
	public int getLaenge() {
		if(this.start == null) {
			return 0;
		}else {
		return getLaenge(this.start);
		}}
	public int getLaenge(Element e) {
		if(e.getPointer() != null) {
			laenge ++;
			getLaenge(e.getPointer());
		}
		return laenge;
	}
	
	
	public void setlaenge(int laenge) {
		this.laenge = laenge;
	}
	
	//Methoden
	public Element getLastRec() {
		return getlastRe(start);
	}
	
	public Element getlastRe(Element k) {
		if(k != null) {
			getlastRe(k.getPointer());
			return k;
		}else {return null;}
	}
	
	public Element getLast() { // Das hier geht nicht was mache ich falsch
		Element e = start;
		while(e != null) {
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
	
	public boolean greaterLength(LineareListe comp) {
		if(comp.getLaenge() <= this.getLaenge() ) {
			return true;
		}else {
			return false;
		}
				
	}
	

}


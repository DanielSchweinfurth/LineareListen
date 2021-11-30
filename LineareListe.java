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
	
	public boolean istLeer() {
		if(start == null) {
			return true;
		}else {
			return false;
		}
		
	}

	
	public boolean greaterLength(LineareListe comp) {
		if(comp.getLaenge(comp.start) >= //was für ein statmenet brauche ich hier um liste.greaterLength(zu vergleichende Liste zu machen?)) {
			return true;
		}else {
			return false;
		}
		
	}

	
}


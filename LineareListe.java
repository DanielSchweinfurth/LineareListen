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
			return laenge;
		}else {return 0;}
		
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
	
	/*
	public Element getlast() {
		Element verg = start;
		if(verg != null) {
			verg = verg.getPointer();
		}else if(verg == null) {
			return verg;
			}
	}
	*/
	
	
	public boolean istLeer() {
		if(start == null) {
			return true;
		}else {
			return false;
		}
		
	}
}

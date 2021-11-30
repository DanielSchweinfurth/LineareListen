import java.util.*;

public class LineareListe {
	// Atribute
	private Element start;
	private int laenge;

	// Konstruktor
	public LineareListe() {
		start = null;
		laenge = 0;
	}

	public LineareListe(Element start) {
		this.start = start;
		laenge = 1;
	}

	// Getter u. Setter
	public Element getStart() {
		return start;
	}

	public void setStart(Element start) {
		this.start = start;
	}

	public int getLength() {
		return laenge;
	}

	public int getLaenge() {
		if (this.start == null) {
			return 0;
		} else {
			return getLaenge2();
		}
	}

	private int getLaenge2() {
		Element currentElement = this.start;
		while(currentElement.getPointer() != null)
		{
			this.laenge++;
			currentElement = currentElement.getPointer();
		}		
		return laenge;
	}

	

	// Methoden
	public Element getLast() {
		return getlastRe(start);
	}

	private Element getlastRe(Element k) {

		Element currentElement = k;

		if (currentElement.getPointer() != null) {
			currentElement = getlastRe(currentElement.getPointer());

		}

		return currentElement;
	}
	
	public void appendList(LineareListe listeToAppend)
	{
		if(this.getLaenge() >= listeToAppend.getLaenge())
		{
			this.getLast().setPointer(listeToAppend.getStart());
		}
		else
		{
			listeToAppend.getLast().setPointer(this.getStart());
		}
	}	

	public Element getLastIterativ() { // Das hier geht nicht was mache ich
										// falsch
		Element e = start;
		while (e.getPointer() != null) {
			e = e.getPointer();
		}
		return e;
	}

	public boolean istLeer() {
		if (start == null) {
			return true;
		} else {
			return false;
		}

	}

	/*
	 * public boolean greaterLength(LineareListe comp) {
	 * if(comp.getLaenge(comp.start) >= //was für ein statmenet brauche ich
	 * hier um liste.greaterLength(zu vergleichende Liste zu machen?)) { return
	 * true; }else { return false; }
	 * 
	 * }
	 */

	public boolean greaterLength(LineareListe comp) {
		if (comp.getLaenge() <= this.getLaenge()) {
			return true;
		} else {
			return false;
		}

	}

	public void Add(Element b) {
		if (this.start == null) {
			this.start = b;
		} else {
			this.getLast().setPointer(b);
		}
	}
	
	public boolean isSorted()
	{
		Element currentElement = this.start;
		Element nextElement = null;
		
		while(currentElement.getPointer() != null)
		{
			nextElement = currentElement.getPointer();
					
			while(nextElement.getPointer() != null)
			{
				if(currentElement.getInhalt().compareTo(nextElement.getInhalt()) > 0)
				{
					return false;
				}
				nextElement = nextElement.getPointer();
			}
			currentElement = currentElement.getPointer();				
		}
		return true;
		
	}
	
	

}

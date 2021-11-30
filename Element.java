import java.util.*;
public class Element {
	//Atribute
	private String inhalt;
	private Element pointer;

	//Konstruktoren
	public Element(String inhalt, Element pointer ) {
		this.inhalt = inhalt;
		this.pointer = null;
	}
	
	public Element(String inhalt) {
		this.inhalt = inhalt;
		this.pointer = null;
	}
	
	//Getter u. Setter
	public String getInhalt() {
		return inhalt;
	}
	
	public void setInhalt(String Inhalt) {
		this.inhalt = Inhalt;
	}
	
	public Element getPointer() {
		return pointer;
	}
	
	public void setPointer(Element pointer) {
		this.pointer = pointer;
	}
	
	//Methoden
	
	
	
}	

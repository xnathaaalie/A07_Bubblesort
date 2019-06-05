package A07_BubbleSort_fertig;

public class Person {
	
	private final String nachname;
	
	private final String vorname;

	public Person(String vorname, String nachname) {
		this.nachname = nachname;
		this.vorname = vorname;
	}

	public String getNachname() {
		return nachname;
	}
	
	public String getVorname() {
		return vorname;
	}
	
	/**
	 * Vergleicht zwei Personen miteinander
	 * @return <0, wenn a<b || =0, wenn a=b || >0, wenn a>b
	 */
	public int compareTo(Person p) {
		int cmpValue = getNachname().compareTo(p.getNachname()); 
		
		if(cmpValue != 0)
			return cmpValue; 
		
		cmpValue = getVorname().compareTo(p.getVorname()); 
		return cmpValue; 
	}
}

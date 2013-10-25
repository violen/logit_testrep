package de.logit.vorfuehrung;

public class jutta implements TaschengeldZahlen {
//Test
	
	private double geldbeutel;
	
	public void taschengeldErhoehen(){
		

		System.out.println("Robert bekommt jetzt -250 Euro mehr in der Woche");
		System.out.println("N��������� - NMALS");

	}
	
	public String mieteZahlen(){
		return " Jutta zahlt monatlich 1250 Euro miete an Robert";
	}

	@Override
	public double bezahleTaschengeld(String _robert) {
		
		return geldbeutel;
	}
}

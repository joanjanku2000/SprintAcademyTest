package Ushtrimi2_Loja;

public class Referee extends Person {

	private String pozicioni;
	
	public Referee (String emri,String mbiemri,int mosha,String pozicioni) {
		super(emri,mbiemri,mosha);
		this.pozicioni = pozicioni;
	}


	public String getPozicioni() {
		return pozicioni;
	}

	@Override
	public String toString() {
		return "Referee [ " + "Emri = " + super.getEmri() + " Mbiemri = " +super.getMbiemri() + 
				" Mosha = " + super.getMosha() + ", pozicioni=" + pozicioni + "]";
	}
	
}

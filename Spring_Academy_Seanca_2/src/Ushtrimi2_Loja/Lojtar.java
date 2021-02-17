package Ushtrimi2_Loja;

public class Lojtar extends Person {
	
	private String pozicioni;
	private int numri_ne_fanelle;
	private int idSkuadres;
	
	
	public Lojtar(String emri,String mbiemri,int mosha,int idSkuadres,String pos,int nr) {
		super(emri,mbiemri,mosha);
		this.idSkuadres = idSkuadres;
		pozicioni = pos;
		numri_ne_fanelle = nr;
	}
	
	public String getPozicioni() {
		return pozicioni;
	}
	public void setPozicioni(String pozicioni) {
		this.pozicioni = pozicioni;
	}
	public int getNumri_ne_fanelle() {
		return numri_ne_fanelle;
	}
	public void setNumri_ne_fanelle(int numri_ne_fanelle) {
		this.numri_ne_fanelle = numri_ne_fanelle;
	}
	
	public int getSkuader() {
		return idSkuadres;
	}
	@Override
	public String toString() {
		return "Lojtar [ Emri = " + super.getEmri() + " Mbiemri = " +super.getMbiemri() + " Mosha = " + super.getMosha() +
						" pozicioni=" + pozicioni + ", numri_ne_fanelle=" + numri_ne_fanelle +" ]";
	}
	
	
}

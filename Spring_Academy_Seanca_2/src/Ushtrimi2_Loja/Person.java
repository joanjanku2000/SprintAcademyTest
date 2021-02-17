package Ushtrimi2_Loja;

public class Person {
	private String emri;
	private String mbiemri;
	private int mosha;
	
	public Person() {}
	
	public Person(String emri, String mbiemri, int mosha) {
		this.emri = emri;
		this.mbiemri = mbiemri;
		this.mosha = mosha;
	}
	public String getEmri() {
		return emri;
	}
	public void setEmri(String emri) {
		this.emri = emri;
	}
	public String getMbiemri() {
		return mbiemri;
	}
	public void setMbiemri(String mbiemri) {
		this.mbiemri = mbiemri;
	}
	public int getMosha() {
		return mosha;
	}
	public void setMosha(int mosha) {
		this.mosha = mosha;
	}
	@Override
	public String toString() {
		return "Person [emri=" + emri + ", mbiemri=" + mbiemri + ", mosha=" + mosha + "]";
	}
	
	

}

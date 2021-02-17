package Ushtrimi3_BarberShop;

public class Book {
	private Employee emp;
	private Client klient;
	private String dita;
	private String sherbimi;
	

	public Book(Employee emp, Client klient, String dita, String sherbimi) {
		this.emp = emp;
		this.klient = klient;
		this.dita = dita;
		this.sherbimi = sherbimi;
	}
	
	
	public Employee getEmp() {
		return emp;
	}


	public Client getKlient() {
		return klient;
	}


	public String getDita() {
		return dita;
	}


	public String getSherbimi() {
		return sherbimi;
	}


	@Override
	public String toString() {
		return "Book [emp=" + emp + ", klient=" + klient + ", dita=" + dita + ", sherbimi=" + sherbimi + "]";
	}
	
}

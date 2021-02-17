package Ushtrimi3_BarberShop;

public class Client {
	private String name;
	private double sasiaShpenzuar;
	
	public Client(String name) {
		super();
		this.name = name;
		sasiaShpenzuar = 0;
	}

	public void book(Shop sh,Employee emp,String service,String day) {
		if (!sh.contains(emp)) {
			System.err.println("\n Punonjesi i kerkuar nuk punon ne kete dyqan");
			return;
		}
		if (!emp.worksOnDita(day)) {
			System.out.println("Ky punonjes nuk punon kete dite. Na vjen keq");
			return;
		}
		System.out.println("Prenotimi u krye me sukses ");
		sh.addBooking(new Book(emp,this,day,service));
	}
	
	public Boolean isBookValid(Shop sh,Employee emp,String dita, String sherbimi) {
		for (Book b : sh.getBookings()) {
			if (b.getDita().equals(dita) && b.getEmp().equals(emp) 
					&& b.getKlient().equals(this) && b.getSherbimi().contentEquals(sherbimi))
				return true;			
		}
	
		return false;
	}
	public void kryejBook_un(Shop sh,Employee emp, String sherbimi,String dita) {
		if (!sh.contains(emp)) {
			System.err.println("\n Punonjesi i kerkuar nuk punon ne kete dyqan");
			return;
		}
		
		if (!emp.worksOnDita(dita)) {
			System.out.println("Ky punonjes nuk punon kete dite. Na vjen keq");
			return;
		}
		
		if (!isBookValid(sh,emp,dita,sherbimi)){
			System.out.println(" Ky prenotim nuk ekziston! ");
			return;
		}
		System.out.println("Duke kryer taskun e prenotuar....");
		if (sherbimi.equals("cutHair")) {
			shtoSasine(emp.cutHair()); 
		} else if (sherbimi.equals("cutBeard")) {
			shtoSasine(emp.cutBeard());
		} else if (sherbimi.equals("cutMustache")) {
			shtoSasine(emp.cutMustache());
		} else if (sherbimi.equals("trimBeard")) {
			shtoSasine(emp.trimBeard());
		} else if (sherbimi.equals("trimMustache")) {
			shtoSasine(emp.trimMustache());
		} else if (sherbimi.equals("stylizeHair")) {
			shtoSasine(emp.stylizeHair());
		}
		else if (sherbimi.equals("hairWash")) {
			shtoSasine(emp.hairWash());
		}
		
	}
	public void shtoSasine(double s) {
		sasiaShpenzuar+=s;
	}
	@Override
	public String toString() {
		return "Client [name=" + name + ", sasiaShpenzuar=" + sasiaShpenzuar + "]";
	}
	
}

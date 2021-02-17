package Ushtrimi3_BarberShop;

import java.util.HashMap;

public class Employee extends WorkingDays implements Service{
	private String name;
	private Double fitimi;
	private HashMap<String,Double> prices ;
	
	public Employee(String name) {
		this.name = name;
		fitimi = 0.0;
		//this.prices = cmimet;
		super.workingDays = new Boolean[7];
	}
	
	public void vendosCmimet(HashMap<String,Double> cmimet) {
		this.prices = cmimet;
	}

	@Override
	public double cutHair() {
		System.out.println("Employee "+name);
		System.out.println("Cutting hair");
		fitimi+=(0.4)*prices.get("cutHair");
		return prices.get("cutHair");
	}

	@Override
	public double cutBeard() {
		System.out.println("Employee "+name);
		System.out.println("Cutting Beard");
		fitimi+=(0.4)*prices.get("cutBeard");
		return prices.get("cutBeard");
	}

	@Override
	public double cutMustache() {
		System.out.println("Employee "+name);
		System.out.println("Cutting Mustache");
		fitimi+=(0.4)*prices.get("cutMustache");
		return prices.get("cutMustache");
	}

	@Override
	public double trimBeard() {
		System.out.println("Employee "+name);
		System.out.println("Trimming  beard");
		fitimi+=(0.4)*prices.get("trimBeard");
		return prices.get("trimBeard");
	}

	@Override
	public double trimMustache() {
		System.out.println("Employee "+name);
		System.out.println("Trimming Mustache");
		fitimi+=(0.4)*prices.get("trimMustache");
		return prices.get("trimMustache");
	}

	@Override
	public double stylizeHair() {
		System.out.println("Employee "+name);
		System.out.println("Stylinzing hair");
		fitimi+=(0.4)*prices.get("stylizeHair");
		return prices.get("stylizeHair");
	}

	@Override
	public double hairWash() {
		System.out.println("Employee "+name);
		System.out.println("Washing hair");
		fitimi+=(0.4)*prices.get("hairWash");
		return prices.get("hairWash");
	}

	@Override
	public void sellOils() {
		System.out.println("Employee "+name);
		System.out.println("Sold oil");
		fitimi+=(0.2)*prices.get("sellOils");
	}

	@Override
	public void sellAfterShave() {
		System.out.println("Employee "+name);
		System.out.println("Sold AfterShave");
		fitimi+=(0.2)*prices.get("sellAfterShave");
	}

	@Override
	public void sellHairGel() {	
		System.out.println("Employee "+name);
		System.out.println("Sold hair Gel");
		fitimi+=(0.2)*prices.get("sellHairGel");
	}

	@Override
	public void sellHairWax() {
		System.out.println("Employee "+name);
		System.out.println("Sold hair wax");
		fitimi+=(0.2)*prices.get("sellHairWax"); 
	}
	
	
	public void printWorkingDays() {
		System.out.print("\n"+name + "'s working days");
		System.out.print("\n [");
		for (int i = 0;i<7;i++) {
			if (workingDays[i]) {
				System.out.print(" "+days[i]);
			}
		}
		System.out.print("]");
	}
	
	
	
	public String getName() {
		return name;
	}

	public Double getFitimi() {
		return fitimi;
	}

	public void addWorkingDays(Shop sh,Boolean[] workingDays) {
		int i = 0;
		// fillimisht kontrollohet nqs ditet e punes
		// plotesojne kriterin qe te mos shtohen gjate diteve
		// qe per dyqanin jane pushim 
		for (Boolean b : sh.getWorkingDays()) {
			if (!b && workingDays[i]) {
				System.err.println("\nTrying to change working days for "+name);
				System.err.println("\nNuk mund te punohet jashte diteve te percaktuara nga pronari");
				return;
			}
			i++;
		}
		super.workingDays = workingDays;
	}
	
	@Override
	public boolean worksOnDita(String dita) {
		try {
			for (int i = 0;i<7;i++) {
				if (days[i].equals(dita)) {
					return workingDays[i];
				}
			}
			
		} catch (NullPointerException e){
			System.err.println("Nuk ka informacion");
		}
		return false;
		
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", fitimi=" + fitimi + "]";
	}
	

	public boolean equals(Employee o) {
		return name.equals(o.name);
	}
	
}

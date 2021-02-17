package Ushtrimi3_BarberShop;

public abstract class WorkingDays {
	protected Boolean[] workingDays;
	protected String[] days = {"Monday","Tuesday","Wednesday","Thursday",
								"Friday","Saturday","Sunday"};
	
	public abstract boolean worksOnDita(String dita);

}

package Ushtrimi3_BarberShop;

import java.util.HashMap;


public class Test {
	public static void main (String[] args) {
		
		HashMap<String,Double> cmimet = new HashMap<String,Double>();
		
		cmimet.put("cutHair",2.5);
		cmimet.put("cutBeard",2.5);
		cmimet.put("cutMustache",2.5);
		cmimet.put("trimBeard",2.5);
		cmimet.put("trimMustache",2.5);
		cmimet.put("stylizeHair",2.5);
		cmimet.put("hairWash",2.5);
		cmimet.put("sellOils",2.5);
		cmimet.put("sellAfterShave",2.5);
		cmimet.put("sellHairGel",2.5);
		cmimet.put("sellHairWax",2.5);
		
		HashMap<String,Double> cmimetNew = new HashMap<String,Double>();
		
		cmimetNew.put("cutHair",3.0);
		cmimetNew.put("cutBeard",3.5);
		cmimetNew.put("cutMustache",3.5);
		cmimetNew.put("trimBeard",3.5);
		cmimetNew.put("trimMustache",3.5);
		cmimetNew.put("stylizeHair",3.5);
		cmimetNew.put("hairWash",3.5);
		cmimetNew.put("sellOils",3.5);
		cmimetNew.put("sellAfterShave",3.5);
		cmimetNew.put("sellHairGel",3.5);
		cmimetNew.put("sellHairWax",3.5);
		
		Shop barberShop = new Shop(3);
		
		Employee joan = new Employee("joan");
		Employee xhim = new Employee("xhim");
		Employee xhon = new Employee("xhon");
		
		Employee tim = new Employee("Tim");
		
		Client xhejms = new Client("xhejms");
		Client toni = new Client("toni");
		
		Boolean[] workingDays = {true,true,false,true,true,true,false};
		Boolean[] otherWorkingDays = {true,true,false,false,true,true,false};
		
		barberShop.addWorkingDays(workingDays);
		barberShop.addPrices(cmimet);
		
		barberShop.addEmployee(joan);
		barberShop.addEmployee(xhim);
		barberShop.addEmployee(xhon);
		
//		barberShop.fireEmployee(xhim);	
//		barberShop.addEmployee(xhejms);
		
		
		joan.vendosCmimet(cmimetNew);
		joan.addWorkingDays(barberShop,otherWorkingDays);
//		
//		joan.cutHair();
//		joan.sellAfterShave();
//		joan.cutBeard();
//		
//		xhim.sellHairGel();
//		xhim.sellHairWax();
//		
//		xhon.sellOils();
		//System.out.println()
		joan.printWorkingDays();
		xhon.printWorkingDays();
		
		System.out.println("\nPrenotim : Xhejms -> Joan -> Monday -> cutHair");
		xhejms.book(barberShop,joan, "cutHair", "Monday");
		System.out.println("Task : Xhejms -> Joan -> Monday -> cutHair");
		xhejms.kryejBook_un(barberShop,joan, "cutHair", "Monday");
		
		System.out.println("Prenotim : Xhejms -> Joan -> Wednesday -> trimMustache");
		xhejms.book(barberShop,joan, "trimMustache", "Wednesday");
		System.out.println("Task : Xhejms -> Joan -> Wednesday -> trimMustache");
		xhejms.kryejBook_un(barberShop,joan, "cutHair", "Wednesday");
		
		System.out.println("Prenotim : Xhejms -> Joan -> Tuesday -> trimMustache");
		xhejms.book(barberShop,joan, "trimMustache", "Tuesday");
		System.out.println("Task(inekzistent) : Xhejms -> Joan -> Tuesday -> cutHair");
		xhejms.kryejBook_un(barberShop,joan, "cutHair", "Tuesday");
		
		System.out.println("Prenotim : Xhejms -> Joan -> Tuesday -> trimMustache");
		xhejms.book(barberShop,joan, "trimMustache", "Tuesday");
		System.out.println("Task(ekzistent) : Xhejms -> Joan -> Tuesday -> trimMustache");
		xhejms.kryejBook_un(barberShop,joan, "trimMustache", "Tuesday");
		
		System.out.println("Prenotim : Toni -> xhon -> Friday -> cutBeard");
		toni.book(barberShop,xhon, "cutBeard", "Friday");
		System.out.println("Prenotim : Toni -> xhon -> Friday -> washHair");
		toni.book(barberShop,xhon, "hairWash", "Friday");
		
		System.out.println("Task : Toni -> xhon -> Friday -> cutBeard");
		toni.kryejBook_un(barberShop,xhon, "cutBeard", "Friday");
		System.out.println("Task : Toni -> xhon -> Friday -> washHair");
		toni.kryejBook_un(barberShop,xhon, "hairWash", "Friday");
		
		System.out.println("Prenotim(i pamundur, dite pushimi): Xhejms -> Xhon -> Sundat -> trimMustache");
		xhejms.book(barberShop,xhon, "trimMustache", "Sunday");
		System.out.println("Task(i pamundur) : Xhejms -> Joan -> Sunday -> trimMustache");
		xhejms.kryejBook_un(barberShop,xhon, "trimMustache", "Sunday");
		
		System.out.println("Prenotim(i pamundur, dite pushimi, workingdays te modifikuara):\n Xhejms -> Xhon -> Thursday -> trimMustache");
		xhejms.book(barberShop,joan, "trimMustache", "Thursday");
		System.out.println("Task(i pamundur) : Xhejms -> Joan -> Sunday -> trimMustache");
		xhejms.kryejBook_un(barberShop,joan, "trimMustache", "Sunday");
		
		//trying to add booking me nje employee inekzistent
		System.out.println(barberShop);
		xhejms.kryejBook_un(barberShop,tim, "trimMustache", "Sunday");
		
//		joan.printWorkingDays();
//		xhim.printWorkingDays();
//		xhon.addWorkingDays(otherWorkingDays);
//		xhon.printWorkingDays();
//		System.out.println();
		System.out.println(xhejms);
		System.out.println(toni);
		//Shop.printBookings();
	}

}

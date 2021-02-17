package Ushtrimi3_BarberShop;

import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;

public class Shop {
	
	private int numberOfEmployees;
	private Employee[] employees;
	private int count ;
	private HashMap<String,Double> cmimet ;
	
	private Boolean[] workingDays;
	private ArrayList<Book> bookings;
	
	public Shop(int numberOfEmplyees) {
		count = 0;
		this.numberOfEmployees = numberOfEmplyees;
		this.employees = new Employee[numberOfEmplyees];	
		workingDays = new Boolean[7];
		bookings = new ArrayList<>();
		cmimet = new HashMap<>();
	}
	
	public void addEmployee(Employee emp) {
		try {
			employees[count++] = emp;
			//fillimisht kur shtohet klienti inicializohet me
			// working days te dyqanit, por me pas 
			// nepermjet therritjes se te njejtes metode 
			// mund t'i ndryshoje
			employees[count-1].addWorkingDays(this,workingDays);
			employees[count-1].vendosCmimet(cmimet);
		} catch (IndexOutOfBoundsException e) {
			System.err.println("Nuk mund te shtohen me shume se kaq punonjes ");
		}

	}
	public void addPrices(HashMap<String,Double> prices) {
		cmimet = prices;
	}
	// opsion shtese per te "pushuar" nje punonjes
	public void fireEmployee(Employee emp) {
		for (int i = 0;i<numberOfEmployees-1;i++) {
			if (employees[i].getName().equals(emp.getName())) {
				System.err.println("Removed employee "+emp.getName());
				employees = remove(employees,i);
				--count;
			}
		}
	}
	
	//metode ndihmese per te fshire nje punonjes nga nje vektor
	// me objekte te tipit Employee
	public static Employee[] remove(Employee[] arr,int index) { 
		if (arr == null || index < 0 || index >= arr.length) { 
			return arr; 
			} 
	   Employee[] anotherArray = new Employee[arr.length ]; 
	   
	   for (int i = 0, k = 0; i < arr.length; i++) { 
		if (i == index) { 
			continue; 
		} 
			anotherArray[k++] = arr[i]; 
		} 
		return anotherArray; 
	}
	public Boolean contains(Employee emp) {
		for (Employee e : employees) {
			if (e.equals(emp)) {
				return true;
			}
		}
		return false;
	}
	public void addWorkingDays(Boolean[] workingDay) {
		workingDays = workingDay;
	}
	
	public  Boolean[] getWorkingDays() {
		return workingDays;
	}
	
	public  void addBooking(Book book) {
		bookings.add(book);
	}
	public  void printBookings() {
		System.out.println(bookings);
	}
	
	public ArrayList<Book> getBookings() {
		return bookings;
	}

	@Override
	public String toString() {
		return "Shop [numberOfEmployees=" + numberOfEmployees + ", \nemployees=" + Arrays.toString(employees)+" ]";
	} 
	
	
}

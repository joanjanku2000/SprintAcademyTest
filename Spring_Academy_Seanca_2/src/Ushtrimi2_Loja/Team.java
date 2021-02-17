package Ushtrimi2_Loja;

public class Team {
	private int id;
	private String emri;
	private String liga;
	
	//deklaruar statike meqe statike->i perket klases jo instances
	// dhe duam qe ID te inkrmentohet automatikisht per cdo skuader te re te shtuar ne sistem
	
	private static int count = 0;
	
	public Team (String emri,String liga) {
		this.id = count;
		this.emri = emri;
		this.liga = liga;
		count++;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmri() {
		return emri;
	}

	public void setEmri(String emri) {
		this.emri = emri;
	}

	public String getLiga() {
		return liga;
	}

	public void setLiga(String liga) {
		this.liga = liga;
	}
	
	public void printLojtaret(Lojtar[] p) {
		for (Lojtar l : p) {
			if (l.getSkuader()==this.id){
				System.out.println(l);
			}
		}
	}
	@Override
	public String toString() {
		return "Team [id=" + id + ", emri=" + emri + ", liga=" + liga + "]";
	}
	
	
}

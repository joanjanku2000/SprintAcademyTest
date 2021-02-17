package Ushtrimi2_Loja;

public class Test {
	public static void main(String[] args) {
		
		Team bylis = new Team("Bylis","liga");
		Team apolonia = new Team("Apolonia","liga");
		
		Lojtar joan = new Lojtar("Stivian","Janku",25,0,"mbrojtes",10);
		Lojtar l1 = new Lojtar("Test","Test",25,0,"mesfushor",11);
		Lojtar l2 = new Lojtar("Test1","Test1",19,0,"sulmues",1);
		
		Lojtar l3 = new Lojtar("Test3","Test3",25,1,"mbrojtes",23);
		Lojtar l4 = new Lojtar("Test4","Test4",25,1,"mesfushor",34);
		Lojtar l5 = new Lojtar("Test5","Test5",19,1,"sulmues",15);
		
		Lojtar[] allPlayers = {joan,l1,l2,l3,l4,l5};
		
		Referee arbiter1 = new Referee("arbiter","arbiter",40,"anesor");
		
		System.out.print("Loja ");
		String playGround = "Arena";
		Game game = new Game(bylis,apolonia,90,arbiter1,playGround);
		
		System.out.println(game);
		
		System.out.println();
		
		System.out.println("Lojtaret e Bylis");
		bylis.printLojtaret(allPlayers);
		System.out.println("\nLojtaret e Apolonise");
		apolonia.printLojtaret(allPlayers);
		
	}
}

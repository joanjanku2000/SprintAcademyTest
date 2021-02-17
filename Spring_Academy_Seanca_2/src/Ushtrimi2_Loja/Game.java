package Ushtrimi2_Loja;

public class Game {
	
	private Team team1;
	private Team team2;
	private int kohezgjatja;
	private Person referee;
	private String playground;
	
	public Game(Team team1,Team team2,int kohezgjatja,Person referee,String playground) {
		this.team1 = team1;
		this.team2 = team2;
		this.kohezgjatja = kohezgjatja;
		this.referee = referee;
		this.playground = playground;
	}

	public Team getTeam1() {
		return team1;
	}
	

	public Team getTeam2() {
		return team2;
	}

	public int getKohezgjatja() {
		return kohezgjatja;
	}

	@Override
	public String toString() {
		return "Game [\nteam1=" + team1 + ",\nteam2=" + team2 + "\nKohezgjatja "
					+this.kohezgjatja + " arbitri = " + referee + " Fusha = " + playground +
					" ]";
	}
	
	

}

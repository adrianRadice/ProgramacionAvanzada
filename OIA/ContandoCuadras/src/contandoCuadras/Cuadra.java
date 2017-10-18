package contandoCuadras;

public class Cuadra {
	private int cantSociosClubA;
	private int cantSociosClubB;
	private int cantHabitantes;
	
	public Cuadra(int cantSociosClubA, int cantSociosClubB, int cantHabitantes) {
		super();
		this.cantSociosClubA = cantSociosClubA;
		this.cantSociosClubB = cantSociosClubB;
		this.cantHabitantes = cantHabitantes;
	}
	
	public int getCantidadNeutrales() {
		return cantHabitantes - cantSociosClubA - cantSociosClubB;
	}
	
	public int getDiferencia() {
		return Math.abs(cantSociosClubA-cantSociosClubB);
	}	
	
}

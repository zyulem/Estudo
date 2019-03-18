public class ControleDeBonificacao {
	private double totalBonus;
	
	public double calculaTotalBonus(double valor) {
		return this.totalBonus = this.totalBonus + valor;
	}
	
	public double getTotalBonus() {
		return totalBonus;
	}
}

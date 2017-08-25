
public class VendingMachine {

	private double nickle = 0.05;
	private double dime = 0.10;
	private double quarter = 0.25;
	private Double totalMoney = 0.0;

	public boolean insertNickle() {
		totalMoney += nickle;
		return true;
	}

	public boolean insertDime() {
		totalMoney += dime;
		return true;
	}

	public boolean insertQuarter() {
		totalMoney += quarter;
		return true;
	}

	public boolean insertPenny() {
		return false;
	}

	public String getDisplay() {
		if (totalMoney == 0.0) {
			return "INSERT COIN";
		}		
		return totalMoney.toString();
	}

	
}

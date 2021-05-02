package Flyawaydto;

public class Flyaway {
	
	private String Airlines;
	private String Arival;
	private String Departure;
	private String Economy;
	private int Price;
	
	public Flyaway() {}

	public Flyaway(String airlines, String arival, String departure, String economy, int price) {
		
		Airlines = airlines;
		Arival = arival;
		Departure = departure;
		Economy = economy;
		Price = price;
	}

	public String getAirlines() {
		return Airlines;
	}

	public void setAirlines(String airlines) {
		Airlines = airlines;
	}

	public String getArival() {
		return Arival;
	}

	public void setArival(String arival) {
		Arival = arival;
	}

	public String getDeparture() {
		return Departure;
	}

	public void setDeparture(String departure) {
		Departure = departure;
	}

	public String getEconomy() {
		return Economy;
	}

	public void setEconomy(String economy) {
		Economy = economy;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "Flyaway [Airlines=" + Airlines + ", Arival=" + Arival + ", Departure=" + Departure + ", Economy="
				+ Economy + ", Price=" + Price + "]";
	}
	
    
}

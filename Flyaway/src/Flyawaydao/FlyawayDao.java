package Flyawaydao;

import java.util.Set;

import Flyawaydto.Flyaway;

public interface FlyawayDao {

	public boolean addFlyaway(Flyaway flyaway);
	public boolean updateFlyaway(String Airlines, String Arival, String Departure);
	public boolean deleteFlyaway(String Airlines, String Arival, String Departure);
	public boolean searchFlyaway(Flyaway flyaway);
	public Set<Flyaway> getAllFlyaway();
	Flyaway searchFlyaway();
	
}

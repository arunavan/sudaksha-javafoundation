package one2many;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class ParkingSpace {
	@Id
	private int parkingId;
	private String buildingName;
	public int getParkingId() {
		return parkingId;
	}
	public void setParkingId(int parkingId) {
		this.parkingId = parkingId;
	}
	public String getBuildingName() {
		return buildingName;
	}
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}
	
	
}

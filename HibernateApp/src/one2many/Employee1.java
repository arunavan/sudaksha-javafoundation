package one2many;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Employee1 {
	@Id
	private int empId;
	private String name;
	
	@OneToOne(cascade=CascadeType.ALL,targetEntity=ParkingSpace.class)
	@JoinColumn(name="parkingId", unique=true)
	private ParkingSpace space;
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ParkingSpace getSpace() {
		return space;
	}
	public void setSpace(ParkingSpace space) {
		this.space = space;
	}
	
	

}

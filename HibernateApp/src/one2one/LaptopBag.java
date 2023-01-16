package one2one;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Laptop_Bag")  //table name
public class LaptopBag {
	@Id  //primary key
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bagId;
	private String color;
	
	@OneToOne(mappedBy="bag")
	private Scholar scholar;  //column name
	
	public int getBagId() {
		return bagId;
	}
	public void setBagId(int bagId) {
		this.bagId = bagId;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Scholar getScholar() {
		return scholar;
	}
	public void setScholar(Scholar scholar) {
		this.scholar = scholar;
	}
	
	

}

package one2many;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Sidedish_Tab")
public class SideDish {
	@Id
	private int sideDishId;
	@Column
	private String sidedishName;
	public int getSideDishId() {
		return sideDishId;	}
	public void setSideDishId(int sideDishId) {
		this.sideDishId = sideDishId;	}
	public String getSidedishName() {
		return sidedishName;	}
	public void setSidedishName(String sidedishName) {
		this.sidedishName = sidedishName;	}
	
	
}

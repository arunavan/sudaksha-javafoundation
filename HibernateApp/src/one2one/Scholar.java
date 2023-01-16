package one2one;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Scholar_Tab")
public class Scholar {  //tablename
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private int scholarId;  //primary key
	private String scholarName; //column
	
	@OneToOne(cascade=CascadeType.ALL,targetEntity=LaptopBag.class)
	@JoinColumn(name="bagId")//foriegnkey
	
	private LaptopBag bag;
	
	
	public int getScholarId() {
		return scholarId;
	}
	public void setScholarId(int scholarId) {
		this.scholarId = scholarId;
	}
	public String getScholarName() {
		return scholarName;
	}
	public void setScholarName(String scholarName) {
		this.scholarName = scholarName;
	}
	public LaptopBag getBag() {
		return bag;
	}
	public void setBag(LaptopBag bag) {
		this.bag = bag;
	}
	
	

}

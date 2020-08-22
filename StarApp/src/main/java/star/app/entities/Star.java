package star.app.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="star")
public class Star {

	@Id
	@Column(name="id")
	private Integer id;
	
	
	@Column(name="proper")
	private String proper;
	
	
	@Column(name="ci")
	private Double ci;
	
	@Column(name="absmag")
	private Double absmag;
	
	
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public String getProper() {
		return proper;
	}
	public void setProper(String proper) {
		this.proper = proper;
	}
	
	
	
	
	public Double getCi() {
		return ci;
	}
	public void setCi(Double ci) {
		this.ci = ci;
	}
	
	public Double getAbsmag() {
		return absmag;
	}
	public void setAbsmag(Double absmag) {
		this.absmag = absmag;
	}
	
	
	
	@Override
	public String toString() {
		return "Star [id=" + id + ", proper=" + proper +", ci=" + ci + ", absmag=" + absmag + "]";
				
	}
}
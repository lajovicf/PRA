package local.Work.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Skill {
	@Id 
	private int idSkill;
	private String nameSkill;
	private String descSkill;
	
	public Skill() {
		super();
	}

	public int getIdSkill() {
		return idSkill;
	}

	public void setIdSkill(int idSkill) {
		this.idSkill = idSkill;
	}

	public String getDescSkill() {
		return descSkill;
	}

	public void setDescSkill(String descSkill) {
		this.descSkill = descSkill;
	}

	public String getNameSkill() {
		return nameSkill;
	}

	public void setNameSkill(String nameSkill) {
		this.nameSkill = nameSkill;
	}
	
	
}

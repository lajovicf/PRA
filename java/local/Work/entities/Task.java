package local.Work.entities;

//import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Task {
	@Id
	private int idTask;
	private String dateTask;
	private String nameTask;
	private String descTask;
	private int minutesTask;
	@ManyToOne
	private Project project;
	@ManyToOne
	private Skill skill;
	@ManyToOne
	private Employee employee;
	
	public Task() {
		super();
	}

	public int getIdTask() {
		return idTask;
	}

	public void setIdTask(int idTask) {
		this.idTask = idTask;
	}

	public String getDateTask() {
		return dateTask;
	}

	public void setDateTask(String dateTask) {
		this.dateTask = dateTask;
	}

	public String getNameTask() {
		return nameTask;
	}

	public void setNameTask(String nameTask) {
		this.nameTask = nameTask;
	}

	public String getDescTask() {
		return descTask;
	}

	public void setDescTask(String descTask) {
		this.descTask = descTask;
	}

	public int getMinutesTask() {
		return minutesTask;
	}

	public void setMinutesTask(int minutesTask) {
		this.minutesTask = minutesTask;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Skill getSkill() {
		return skill;
	}

	public void setSkill(Skill skill) {
		this.skill = skill;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}	
}

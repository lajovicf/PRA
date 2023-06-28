package local.Work.entities;

//import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	private int idEmployee;
	private String firstNameEmployee;
	private String lastNameEmployee;
	@ManyToOne
	private Project project;
	
	public Employee() {
		super();
	}

	public int getIdEmployee() {
		return idEmployee;
	}

	public void setIdEmployee(int idEmployee) {
		this.idEmployee = idEmployee;
	}

	public String getFirstNameEmployee() {
		return firstNameEmployee;
	}

	public void setFirstNameEmployee(String firstNameEmployee) {
		this.firstNameEmployee = firstNameEmployee;
	}

	public String getLastNameEmployee() {
		return lastNameEmployee;
	}

	public void setLastNameEmployee(String lastNameEmployee) {
		this.lastNameEmployee = lastNameEmployee;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
	
	
	
}

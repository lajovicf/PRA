package local.Work.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class Project {
	@Id
	private int idProject;
	private String nameProject;
	private String descProject;
	@OneToMany(mappedBy="project")
	@JsonIgnore
	private List<Employee> employees;
	
	@OneToMany(mappedBy="project")
	@JsonIgnore
	private List<Task> tasks;
	
	public Project() {
		super();
	}
	
	public int getIdProject() {
		return idProject;
	}
	public void setIdProject(int idProject) {
		this.idProject = idProject;
	}
	public String getNameProject() {
		return nameProject;
	}
	public void setNameProject(String nameProject) {
		this.nameProject = nameProject;
	}
	public String getDescProject() {
		return descProject;
	}
	public void setDescProject(String descProject) {
		this.descProject = descProject;
	}
	public List<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

	public List<Task> getTasks() {
		return tasks;
	}

	public void setTasks(List<Task> tasks) {
		this.tasks = tasks;
	}
	
	
	
}

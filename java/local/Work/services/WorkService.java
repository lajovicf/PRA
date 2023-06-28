package local.Work.services;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.PathVariable;

import local.Work.entities.Task;
import local.Work.entities.Project;
import local.Work.entities.Employee;
import local.Work.entities.Skill;
import local.Work.repositories.TaskRepository;
import local.Work.repositories.ProjectRepository;
import local.Work.repositories.EmployeeRepository;
import local.Work.repositories.SkillRepository;
import local.Work.entities.ProjSel;
import local.Work.entities.EmpSel;
import local.Work.entities.SkillSel;

@Service
public class WorkService {
	@Autowired
	ProjectRepository pRepo;
	@Autowired
	EmployeeRepository eRepo;
	@Autowired
	SkillRepository sRepo;
	@Autowired
	TaskRepository tRepo;

	public void addOrUpdateProject(Project p) {
		pRepo.save(p);
	}
	
	public void addOrUpdateTask(Task t) {
		tRepo.save(t);
	}

	public void addOrUpdateEmployee(Employee e) {
		eRepo.save(e);
	}
	
	public void addOrUpdateSkill(Skill s) {
		sRepo.save(s);
	}

	public List<Project> getAllProjects(){
		return pRepo.findAll();
	}
	
	public List<Task> getAllTasks(){
		return tRepo.findAll();
	}

	public List<Employee> getAllEmployees(){
		return eRepo.findAll();
	}
	
	public List<Skill> getAllSkills(){
		return sRepo.findAll();
	}

	public void deleteProject(int idProject) {
		pRepo.deleteById(idProject);
	}

	public void deleteTask(int idTask) {
		tRepo.deleteById(idTask);
	}
	
	public void deleteEmployee(int idEmployee) {
		eRepo.deleteById(idEmployee);
	}
	
	public void deleteSkill(int idSkill) {
		sRepo.deleteById(idSkill);
	}

	public List<Employee> getEmployeesByProjectId(int idProject){
		Optional<Project> optProj = pRepo.findById(idProject);
		if(optProj.isPresent()) {
			return optProj.get().getEmployees();
		} else {
			return new ArrayList<Employee>();
		}
	}
	
	public List<Task> getTasksByProjectId(int idProject){
		Optional<Project> optProj = pRepo.findById(idProject);
		if(optProj.isPresent()) {
			return optProj.get().getTasks();
		} else {
			return new ArrayList<Task>();
		}
	}

	public Project getProjectByEmployeeId(int idEmployee) {
		Optional<Employee> optStud = eRepo.findById(idEmployee);
		if(optStud.isPresent()) {
			return optStud.get().getProject();
		} else {
			return null;
		}
	}

	public List<ProjSel> getProjectsForSelect(){
		List<Project> listProj = pRepo.findAll();
		ArrayList<ProjSel> listProjSel= new ArrayList<ProjSel>();
		for(Project p: listProj) {
			listProjSel.add(new ProjSel(p.getNameProject(),p.getIdProject()));
		}
		return listProjSel;
	}
	
	public List<EmpSel> getEmployeesForSelect(){
		List<Employee> listEmp = eRepo.findAll();
		ArrayList<EmpSel> listEmpSel= new ArrayList<EmpSel>();
		for(Employee e: listEmp) {
			listEmpSel.add(new EmpSel(e.getFirstNameEmployee()+" "+e.getLastNameEmployee(),e.getIdEmployee()));
		}
		return listEmpSel;
	}
	
	public List<SkillSel> getSkillsForSelect(){
		List<Skill> listSkill = sRepo.findAll();
		ArrayList<SkillSel> listSkillSel= new ArrayList<SkillSel>();
		for(Skill s: listSkill) {
			listSkillSel.add(new SkillSel(s.getNameSkill(),s.getIdSkill()));
		}
		return listSkillSel;
	}

}

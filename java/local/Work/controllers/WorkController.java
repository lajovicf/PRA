package local.Work.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import local.Work.entities.Task;
import local.Work.entities.Project;
import local.Work.entities.Employee;
import local.Work.entities.Skill;
import local.Work.services.WorkService;
import local.Work.entities.ProjSel;
import local.Work.entities.EmpSel;
import local.Work.entities.SkillSel;

@RestController
public class WorkController {
	@Autowired
	WorkService workService;
	
	@PostMapping("/addOrUpdateProject")
	public void addOrUpdateProject(@RequestBody Project p) {
		workService.addOrUpdateProject(p);
	}
	
	@PostMapping("/addOrUpdateTask")
	public void addOrUpdateTask(@RequestBody Task t) {
		workService.addOrUpdateTask(t);
	}
	
	@PostMapping("/addOrUpdateEmployee")
	public void addOrUpdateEmployee(@RequestBody Employee e) {
		workService.addOrUpdateEmployee(e);
	}
	
	@PostMapping("/addOrUpdateSkill")
	public void addOrUpdateSkill(@RequestBody Skill s) {
		workService.addOrUpdateSkill(s);
	}
	
	@GetMapping("/getAllProjects")
	public List<Project> getAllProjects(){
		return workService.getAllProjects();
	}
	
	@GetMapping("/getAllTasks")
	public List<Task> getAllTasks(){
		return workService.getAllTasks();
	}
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees(){
		return workService.getAllEmployees();
	}
	
	@GetMapping("/getAllSkills")
	public List<Skill> getAllSkills(){
		return workService.getAllSkills();
	}
	
	@DeleteMapping("/deleteProject/{idProject}")
	public void deleteProject(@PathVariable int idProject) {
		workService.deleteProject(idProject);
	}
	
	@DeleteMapping("/deleteTask/{idTask}")
	public void deleteTask(@PathVariable int idTask) {
		workService.deleteTask(idTask);
	}
	
	@DeleteMapping("/deleteEmployee/{idEmployee}")
	public void deleteEmployee(@PathVariable int idEmployee) {
		workService.deleteEmployee(idEmployee);
	}
	
	@DeleteMapping("/deleteSkill/{idSkill}")
	public void deleteSkill(@PathVariable int idSkill) {
		workService.deleteSkill(idSkill);
	}
	
	@GetMapping("/getEmployeesByProjectId/{idProject}")
	public List<Employee> getEmployeesByProjectId(@PathVariable int idProject){
		return workService.getEmployeesByProjectId(idProject);
	}
	
	@GetMapping("/getTasksByProjectId/{idProject}")
	public List<Task> getTasksByProjectId(@PathVariable int idProject){
		return workService.getTasksByProjectId(idProject);
	}
	
	@GetMapping("/getProjectByEmployeeId/{idEmployee}")
	public Project getProjectByEmployeeId(@PathVariable int idEmployee){
		return workService.getProjectByEmployeeId(idEmployee);
	}
	
	@GetMapping("/getProjectsForSelect")
	public List<ProjSel> getProjectsForSelect(){
		return workService.getProjectsForSelect();
	}
	
	@GetMapping("/getEmployeesForSelect")
	public List<EmpSel> getEmployeesForSelect(){
		return workService.getEmployeesForSelect();
	}
	
	@GetMapping("/getSkillsForSelect")
	public List<SkillSel> getSkillsForSelect(){
		return workService.getSkillsForSelect();
	}
}

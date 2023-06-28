

package local.Work.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import local.Work.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{

}

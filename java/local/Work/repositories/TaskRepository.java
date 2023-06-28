

package local.Work.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import local.Work.entities.Task;

public interface TaskRepository extends JpaRepository<Task, Integer>{

}

package local.Work.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import local.Work.entities.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer>{

}

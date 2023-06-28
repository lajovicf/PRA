package local.Work.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import local.Work.entities.Skill;

public interface SkillRepository extends JpaRepository<Skill, Integer> {

}

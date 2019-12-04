package com.georgehigbie.projectmanagement.dao;

import com.georgehigbie.projectmanagement.entities.Project;
import org.springframework.data.repository.CrudRepository;

public interface ProjectRepository extends CrudRepository<Project, Long> {

}

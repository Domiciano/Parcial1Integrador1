package edu.co.icesi.banner.repositories;

import edu.co.icesi.banner.entity.Course;
import edu.co.icesi.banner.entity.Teacher;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, Long> {

}

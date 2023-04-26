package edu.co.icesi.banner.controllers;

import edu.co.icesi.banner.entity.Course;
import edu.co.icesi.banner.entity.Teacher;
import edu.co.icesi.banner.repositories.CourseRepository;
import edu.co.icesi.banner.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EchoController {

    @Autowired
    TeacherRepository teacherRepository;

    @Autowired
    CourseRepository courseRepository;

    @GetMapping("echo")
    public String echo(){
        Teacher teacher = new Teacher();
        teacher.setName("Domiciano");
        teacher.setFaculty("Ingeniería, diseño y ciencias aplicadas");
        teacherRepository.save(teacher);

        Course int1 = new Course();
        int1.setName("Integrador 1");
        int1.setProgram("Ingeniería Telemática");
        int1.setTeacher(teacher);
        courseRepository.save(int1);

        return "echo";
    }

}

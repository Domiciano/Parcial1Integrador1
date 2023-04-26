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
        Teacher navarro = new Teacher();
        navarro.setName("Andrés Navarro");
        navarro.setFaculty("Ingeniería, diseño y ciencias aplicadas");
        teacherRepository.save(navarro);

        Teacher cuellar = new Teacher();
        cuellar.setName("Juan Carlos Cuellar");
        cuellar.setFaculty("Ingeniería, diseño y ciencias aplicadas");
        teacherRepository.save(cuellar);

        Teacher llano = new Teacher();
        llano.setName("Gonzalo Llano");
        llano.setFaculty("Ingeniería, diseño y ciencias aplicadas");
        teacherRepository.save(llano);

        Course C1 = new Course();
        C1.setName("Redes de comunicaciones II");
        C1.setProgram("Ingeniería Telemática");
        C1.setTeacher(navarro);
        courseRepository.save(C1);

        Course C2 = new Course();
        C2.setName("Electrónica");
        C2.setProgram("Ingeniería Telemática");
        C2.setTeacher(cuellar);
        courseRepository.save(C2);

        Course C3 = new Course();
        C3.setName("Infraestructura 2");
        C3.setProgram("Ingeniería Telemática");
        C3.setTeacher(cuellar);
        courseRepository.save(C3);

        Course C4 = new Course();
        C4.setName("Metodología de investigación");
        C4.setProgram("Maestría en ciencia de datos");
        C4.setTeacher(navarro);
        courseRepository.save(C4);

        Course C5 = new Course();
        C5.setName("Proyecto de grado 2");
        C5.setProgram("Ingeniería de sistemas");
        C5.setTeacher(llano);
        courseRepository.save(C5);

        Course C6 = new Course();
        C6.setName("Computación en la nube");
        C6.setProgram("Ingeniería telemática");
        C6.setTeacher(llano);
        courseRepository.save(C6);

        return "done";
    }

}

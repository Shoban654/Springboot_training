package com.example.Controller;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
@Component
public class Studentsmain {

   public static void main(String[] args)
   {
      ConfigurableApplicationContext obj_getter= SpringApplication.run(Studentsmain.class, args);
      StudentsController obj1= obj_getter.getBean(StudentsController.class);
      obj1.getstudents_strength();
      obj1.post_studentnames();
      obj1.delete_studentnames();
      obj1.add_student();
      obj1.patch_student();
   } 

}


package SpringAnnotations;

import demo.Ddoctor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mmain {
}

    public static void main(String[] args) {

        ApplicationContext context =new ClassPathXmlApplicationContext("spring.xml");

        Ddoctor staff =context.getBean(Ddoctor.class);
        staff.assist();
        System.out.println(staff.getQualification());
    }
}
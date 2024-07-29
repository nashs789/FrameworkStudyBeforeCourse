package hanghae.study.frameworkstudybeforecourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class FrameworkStudyBeforeCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(FrameworkStudyBeforeCourseApplication.class, args);
    }

}

package is.hi.hbv501g.hbv1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication()
//@ComponentScan({"is.hi.hbv501g.hbv1.Controllers"})
//@EntityScan("is.hi.hbv501g.hbv1.Persistence.Entities")
//@EnableJpaRepositories("is.hi.hbv501g.hbv1.Persistence.Repositories")
public class Hbv1Application {

    public static void main(String[] args) {
        SpringApplication.run(Hbv1Application.class, args);
    }

}


// This is team member Dagbjört Þorgrímsdóttir
// This is team member Óskar Helgi Berenguer
// This is tesm member Einar Páll Pálsson

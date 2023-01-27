package test.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import test.BoundedContext481Application;
import test.domain.C;

@Entity
@Table(name = "A_table")
@Data
public class A {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {
        //Following code causes dependency to external APIs
        // it is NOT A GOOD PRACTICE. instead, Event-Policy mapping is recommended.

        test.external.B b = new test.external.B();
        // mappings goes here
        BoundedContext481Application.applicationContext
            .getBean(test.external.BService.class)
            .d(b);

        C c = new C(this);
        c.publishAfterCommit();
    }

    public static ARepository repository() {
        ARepository aRepository = BoundedContext481Application.applicationContext.getBean(
            ARepository.class
        );
        return aRepository;
    }
}

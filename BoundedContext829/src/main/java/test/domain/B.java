package test.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import test.BoundedContext829Application;

@Entity
@Table(name = "B_table")
@Data
public class B {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @PostPersist
    public void onPostPersist() {}

    public static BRepository repository() {
        BRepository bRepository = BoundedContext829Application.applicationContext.getBean(
            BRepository.class
        );
        return bRepository;
    }
}

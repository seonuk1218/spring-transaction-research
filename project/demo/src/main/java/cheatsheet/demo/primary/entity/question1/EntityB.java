package cheatsheet.demo.primary.entity.question1;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "question1_entityB")
@Data
public class EntityB {

    @Id
    private Long id;

    @Column(name = "some_value")
    private String someValue;

}

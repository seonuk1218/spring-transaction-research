package cheatsheet.demo.primary.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "primary_entity")
@Data
public class PrimaryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    // getters and setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
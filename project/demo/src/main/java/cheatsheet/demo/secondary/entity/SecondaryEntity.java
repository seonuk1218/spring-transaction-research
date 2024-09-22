package cheatsheet.demo.secondary.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "secondary_entity")
@Data
public class SecondaryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String description;
    // getters and setters

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
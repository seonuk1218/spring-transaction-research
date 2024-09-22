package cheatsheet.demo.secondary.repository;

import cheatsheet.demo.secondary.entity.SecondaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecondaryRepository extends JpaRepository<SecondaryEntity, Long> {
}
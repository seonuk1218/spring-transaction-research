package cheatsheet.demo.primary.repository;

import cheatsheet.demo.primary.entity.PrimaryEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrimaryRepository extends JpaRepository<PrimaryEntity, Long> {
}
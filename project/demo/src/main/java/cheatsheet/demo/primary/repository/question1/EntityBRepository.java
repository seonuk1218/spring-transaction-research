package cheatsheet.demo.primary.repository.question1;

import cheatsheet.demo.primary.entity.question1.EntityB;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EntityBRepository extends JpaRepository<EntityB, Long> {
}

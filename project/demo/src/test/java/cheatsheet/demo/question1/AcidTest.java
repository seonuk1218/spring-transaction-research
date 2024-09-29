package cheatsheet.demo.question1;

import cheatsheet.demo.primary.entity.question1.EntityA;
import cheatsheet.demo.primary.entity.question1.EntityB;
import cheatsheet.demo.primary.repository.question1.EntityARepository;
import cheatsheet.demo.primary.repository.question1.EntityBRepository;
import cheatsheet.demo.service.question1.AtomicityService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class AcidTest {

    @Autowired
    private EntityARepository entityARepository;

    @Autowired
    private EntityBRepository entityBRepository;

    @Autowired
    private AtomicityService atomicityService;

    @Test
    public void testAtomicity() {

        // Given
        EntityA entityA = new EntityA();
        entityA.setId(new Random().nextLong());
        entityA.setSomeValue("Entity A");

        EntityB entityB = new EntityB();
        entityB.setId(new Random().nextLong());
        entityB.setSomeValue("Entity B");

        try {
            atomicityService.transactionalBlock(entityA, entityARepository);
            atomicityService.transactionalBlock(entityB, entityBRepository);
        } catch (Exception e) {

        }

        assertThat(entityARepository.findById(entityA.getId())).isEmpty();
        assertThat(entityBRepository.findById(entityB.getId())).isEmpty();

    }

}

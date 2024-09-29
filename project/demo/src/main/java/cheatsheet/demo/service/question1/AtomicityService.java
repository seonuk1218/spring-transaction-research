package cheatsheet.demo.service.question1;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AtomicityService {

    @Transactional
    public <T, I> void transactionalBlock(T entity, JpaRepository<T, I> repository) {
        repository.save(entity);
        throw new RuntimeException("SomeException");
    }

}

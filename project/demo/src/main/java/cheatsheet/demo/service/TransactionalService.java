package cheatsheet.demo.service;

import cheatsheet.demo.primary.entity.PrimaryEntity;
import cheatsheet.demo.primary.repository.PrimaryRepository;
import cheatsheet.demo.secondary.entity.SecondaryEntity;
import cheatsheet.demo.secondary.repository.SecondaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class TransactionalService {

    @Autowired
    private PrimaryRepository primaryRepository;

    @Autowired
    private SecondaryRepository secondaryRepository;

    @Transactional("primaryTransactionManager")
    public void primaryServiceMethod() {
        // primaryDataSource를 이용한 로직
        PrimaryEntity entity = new PrimaryEntity();
        entity.setName("Primary Data");
        primaryRepository.save(entity);
    }

    @Transactional("secondaryTransactionManager")
    public void secondaryServiceMethod() {
        // secondaryDataSource를 이용한 로직
        SecondaryEntity entity = new SecondaryEntity();
        entity.setDescription("Secondary Data");
        secondaryRepository.save(entity);
    }

    // 두 트랜잭션을 함께 사용하는 예제 (분산 트랜잭션 설정 필요)
    @Transactional("분산_트랜잭션_Manager")
    public void combinedServiceMethod() {
        primaryServiceMethod();
        secondaryServiceMethod();
        // 예외를 발생시켜 롤백 테스트
        // throw new RuntimeException("Test Exception");
    }
}

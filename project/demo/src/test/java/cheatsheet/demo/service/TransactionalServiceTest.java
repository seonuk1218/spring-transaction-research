package cheatsheet.demo.service;

import cheatsheet.demo.primary.repository.PrimaryRepository;
import cheatsheet.demo.secondary.repository.SecondaryRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class TransactionalServiceTest {

    @Autowired
    private TransactionalService transactionalService;

    @Autowired
    private PrimaryRepository primaryRepository;

    @Autowired
    private SecondaryRepository secondaryRepository;

    @Test
    public void testPrimaryTransaction() {
        transactionalService.primaryServiceMethod();
        assertEquals(1, primaryRepository.count());
    }

    @Test
    public void testSecondaryTransaction() {
        transactionalService.secondaryServiceMethod();
        assertEquals(1, secondaryRepository.count());
    }

//    분산 트랜잭션 매니저 설정 시 테스트
//    @Test
//    public void testCombinedTransaction() {
//        try {
//            transactionalService.combinedServiceMethod();
//        } catch (Exception e) {
//            // 예외 발생 시 롤백 확인
//        }
//        assertEquals(0, primaryRepository.count());
//        assertEquals(0, secondaryRepository.count());
//    }

}

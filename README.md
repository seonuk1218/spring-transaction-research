# 이 Repo 에서 해결할 궁금증은 무엇인가?

### 트랜잭션 간섭 & 격리수준 Option
- READ UNCOMMITTED
- READ COMMITTED
- REPEATABLE READ
- SERIALIZABLE

### Spring Transaction 의 프로그래밍적 설정과 선언적 설정
- 프로그래밍적 설정
    - `TransactionTemplate`
    - `PlatformTransactionManager`
- 선언적 설정
    - `@Transactional`
    - XML 설정

### Spring Transaction 의 글로벌 트랜잭션 관리 및 여러 옵션?
- `JtaTransactionManager`
- `DataSourceTransactionManager`
- `HibernateTransactionManager`
- 트랜잭션 전파 방식
    - REQUIRED
    - REQUIRES_NEW
    - NESTED

### CQRS 와 C & Q
- Command
    - 동작 실행
    - 데이터 변경
- Query
    - 정보 요청
    - 데이터 읽기

### CacheLock 과 JPA @Lock Annotation 의 혼합?
- `@Lock(LockModeType.PESSIMISTIC_WRITE)`
- `@Lock(LockModeType.PESSIMISTIC_READ)`
- CacheLock 사용시 상황
    - 데이터 일관성 보장
    - 데드락 방지

### Redis 분산락?
- Redlock 알고리즘
- `SETNX` 명령어 사용
- 키 만료 설정

### SAGA 패턴?
- 로컬 트랜잭션으로 분할
- 각 서비스의 독립성 유지
- 보상 트랜잭션 (Compensating Transaction) 사용
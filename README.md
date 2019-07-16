## 쇼핑몰 만들기 프로젝트
### 1주차
 - 기본 기획 WIKI 작성
 - ERD 및 유스케이스 작성
 - [참고](https://github.com/nelldkLee/shoppingmall/wiki)

### 2주차
#### Day1,2
 - 시나리오 작성
    - 회원가입 시나리오 작성
    - ![](images/회원가입_시나리오.PNG)
 - 기본 개발 환경 구성(Eclipse, Spring 4.3.1, 기타 필요한 라이브러리 pom.xml 구성)
--------------------------------------------
#### Day3
##### 작업할 내역
 - 로그인 시나리오 추가
    - ![](images/회원가입_로그인_시나리오.PNG)
 - TDD 적용
 - 기본 Controller, Service, Dao 등에서 사용할 interface 설계
 - Validation
     - Spring에서 지워하는 @Valid 어노테이션 적용
 - 장바구니 시나리오 작성
    - ![](images/장바구니_시나리오.PNG))
#### 이슈사항
 - RESTFul한 설계와 기본 페이지전환 방식의 설계의 차이로 인해 Controller 설계의 어려움이 있음
    - jsp가 아닌 html페이지와 Ajax호출을 통한 화면 구성

--------------------------------------------

#### Day4
- 기본 Controller, Service, Dao 등에서 사용할 interface 설계 수정
- Validation
     - Spring에서 지워하는 @Valid 어노테이션 테스트
- VO작업 및 ERD 수정
- RESTFul 설계 수립
    - ![](images/Swagger_API.PNG)

#### Day5
- TDD 회원가입 유효성 체크
    - ![](images/회원가입_유효성체크.PNG)

#### 이슈사항
- 유효성 체크 Exception을 받는 위치 문제로 고민
    - Cotroller 단에서 @valid가 명시된 매개변수 다음 인자로 BindResult를 통한 해결방식
    - @ControllerAdvice 어노테이션을 통해 Exception 핸들러를 통한 해결방식
    ```
    공통단에서 처리 하는 방식으로 정함. 역할과 책임을 분리하여 Controller에선 유효성 부분을 없애는 방식. 
    회원 뿐만 아니라 상품 및 주문 Controller에서도 @ControllerAdvice에 basePackages에 패키지 추가하면 간단히 끝남
    ```

### 3주차
#### Day1
- Repository 인터페이스 구성
```java
public interface GenericRepository<T, K> {

	public int insert(T vo) throws Exception;

	public T read(K key) throws Exception;

	public int update(T vo) throws Exception;

	public int delete(K key) throws Exception;

	public List<T> getList(Criteria cri) throws Exception;
}
```
- DAO TDD 작업 진행 중
![](images/DAO테스트.PNG)
- DAO TDD를 통한 erd 수정
- MariaDB 유저 생성 및 권한 부여 설정

#### Day2
- DataAccess 영역 TDD 작성

#### 이슈사항
- DataAccess 영역 TDD 작성 시 insert, get, list, update, delete 등의 테스트를 진행하는데 앞서 deleteAll을 무조건 해야하는가라는 부분


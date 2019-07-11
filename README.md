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
# nohu_web

----

박응용님의 점프 투 스프링부트를 통해 게시판 웹사이트를 만들어보았습니다.
<br>

## 목차

- 구현중인 기술

- 사용기술

- 웹 페이지를 만든 이유

- 웹 페이지 설명

- 정리, 느낀점

----

## 내용

### - 구현 중인 기술

[O] 지역별 카테고리 메인, 내정보 페이지 만들기

[O] 내 정보 이이디, 비밀번호 표시 기능

[ ] 지역별 페이지 기능

[ ] 내정보 수정 기능 (아이디, 비밀번호 등)


<br>


### 1. 사용기술
> Java <br>
> Spring <br>
> Spring Boot <br>
> Spring Security <br>
> H2 Database <br>
> JPA(Java Persistent API) <br>
> Thymeleaf <br>
> Bootstrap <br>
> HTML/CSS/Javascript <br>
> SQL <br>

### 2. 웹 페이지를 만든 이유

스프링을 배우며 개념들을 코드로 작성하며 어떻게 동작하는지에 대한 실습을 위해서 입니다.

### 3. 웹 페이지 설명

메인
![home](https://user-images.githubusercontent.com/109144975/196932139-f06a8dfc-36e7-471c-b7d5-17f4c7ec3561.JPG)

로그인
![login](https://user-images.githubusercontent.com/109144975/196932174-3e4b8b25-e33d-43ad-87d7-6818556086c3.JPG)

회원가입
![signup](https://user-images.githubusercontent.com/109144975/196932205-a9a13c66-d2bf-4dc4-8019-71d576cb1af1.JPG)

질문등록
![questionCreate](https://user-images.githubusercontent.com/109144975/196932210-54aa2caf-a64e-4a29-b410-8063991e1934.JPG)

답변상세
![questionDetail](https://user-images.githubusercontent.com/109144975/196932222-d7302353-2aff-4974-b288-1ec6c57a92dd.JPG)

지역카테고리
![category](https://user-images.githubusercontent.com/109144975/196932232-d05b8924-9f28-4d89-a9fa-cb61a4cbef90.JPG)

마이페이지
![mypage](https://user-images.githubusercontent.com/109144975/200231069-8ad236fc-a2bb-42a4-b3a8-86f3890615e5.JPG)

### 4. 정리 느낀점

전체적으로 스프링개념도 어려웠지만 실습은 더 어려웠습니다. 하지만 컨트롤러, 서비스, 레포지토리가 왜 나뉘어져야하고 어떤 역할들로 나뉘어져 있는지와 H2-db 에서 데이터 처리를 어떻게 하는지 간략하게 알아볼 수 있었습니다. 그리고 게시판 개발을 하며 게시글 등록, 답변 등의 기능들이 매우 흥미로웠습니다. 앞으로도 스프링을 시작하는데에 있어 좋은 시작점이 된 것 같습니다.

netlify 로 편하게 배포해본 경험이 있어 이번에도 그렇게 하려 했으나 스프링의 경우 지원이 되지 않는다고 하여 heroku로 시도하였습니다. 하지만 컴파일 이슈 및 다른 환경설정 이슈로 인해 배포하는 것을 잠시 미루기로 하였습니다.

---

노후 준비 문제를 겪고 있는 사람들 위하여 매칭 서비스를 만들어보고싶습니다.

<br>

<div>
https://surfee.co.kr/enjoynohu
</div>
(서비스 신청 페이지를 surfee를 통해 간단히 만들어보았습니다.)
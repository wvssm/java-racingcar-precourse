# java-racingcar-precourse

## 기능 요구 사항
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 각 자동차에 이름을 부여할 수 있다.
- 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우이다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.
- 우승자가 여러 명일 경우 쉼표(,)를 이용하여 구분한다.
- 사용자가 잘못된 값을 입력할 경우 를 발생시키고, "[ERROR]"로 시작하는 에러 메시지를 출력 후 그 부분부터 입력을 다
  시 받는다.
- IllegalArgumentException이 아닌 IllegalArgumentException , IllegalStateException 등과 같은 명확한 유형을 처리한다.

## 구현 기능 목록
### model
자동차
- [X] 자동차 전진

게임
- [X] 경주 참여 자동차 추가
- [X] 시도 횟수 설정
- [X] 경주 자동차 이동
- [X] 현재 실행 횟수 증가
- [X] 현재 실행 횟수와 목표 실행 횟수 비교
- [X] 최대 위치 얻기
- [X] 우승자 정보 얻기


사용자 입력 유효성 검사
- [ ] 자동차 이름 입력 유효성 검사
- [ ] 시도 횟수 입력 유효성 검사

### view
입력
- [ ] 자동차 이름 입력 
- [ ] 시도 횟수 입력 

출력
- [ ] 실행 결과 출력
- [ ] 우승자 출력

### controller
- [ ] 자동차 이름 유효성 검사
- [ ] 시도 횟수 유효성 검사
- [ ] 경주 자동차 등록
- [ ] 시도 횟수 설정
- [ ] 경주 진행 (입력 처리, 경주 시작, 우승자 출력)

### utils
- [ ] 자동차 이름 parser
- [ ] 시도 횟수 parser
- [ ] 난수 생성기
# 문자열 계산기(연습)

문자열로 입력된 사칙연산 수식을 계산하는 간단한 콘솔 애플리케이션입니다.

---

## 기능 및 요구사항
- 문자열 기반 사칙연산 수행(`+`,`-`,`*`,`/`)
- 기본 사칙연산 우선순위를 따르지 않음(앞에서 뒤로 연산)
- 문자열 입력은 공백기준으로 분리 (`예: "1 + 2 * 3"`)
- `null`, 빈문자열 입력 시 예외 발생
- 올바른 숫자나 연산자가 입력되지 않을 경우 예외 발생
- 0으로 나누었을 시 예외 발생
- 테스트 코드 작성(JUnit5)
- MVC 패턴 구조 적용

---

## 프로젝트 구조
```plaintext
src/
├── main/
│   └── java/
│       └── calculator/
│           ├── App.java                        // 프로그램 진입점 (main 메서드)
│           ├── controller/
│           │   └── CalculatorController.java  // 입력 → 계산 → 출력 흐름 제어
│           ├── view/
│           │   ├── InputView.java             // 사용자 입력 처리
│           │   └── OutputView.java            // 결과 출력 처리
│           └── domain/
│               ├── StringCalculator.java      // 수식 파싱 및 계산 로직 담당
│               └── Operator.java              // 연산자 정의 및 적용 로직 (enum)
└── test/
    └── java/
        └── calculator/
            └── domain/
                ├── StringCalculatorTest.java      // StringCalculator 테스트
                └── OperatorTest.java              // Operator 테스트
```
# 자료구조와 함께 배우는 알고리즘 입문(자바편)
## CH01. 기본 알고리즘
### 1. [실습1C-1] 중간 값 찾기
- 3개의 정숫값을 입력하고 중앙값을 구한 다음 출력
https://haerang94.tistory.com/210

### 2. 순서도의 기호
- 프로그램 순서도에 사용되는 기호
http://tcpschool.com/codingmath/flowchart

### 3. [연습문제 Q7] '1+2+3+4+5+6+7=28'을 출력하라.
- substring()을 이용하여 마지막 `'+'`를 제거한다
    - `substring(start)`
    - `substring(start, end)`

### 4. [실습1C-2] 논리 연산과 드모르간 법칙
- 드모르간 법칙은 논리곱(합)의 부정은 각각 부정의 논리합(곱)과 같다는 법칙
    - `x && y` 와 `!(!x || !y)`는 같다.
    - `x || y` 와 `!(!x && !y)`는 같다.

### 5. [실습2-5] 난수 사용해 요솟값 설정하기
- java.util.Random클래스는 난수를 생성하는 클래스로 객체를 생성하여 사용한다. 
- Math 와 달리 Random 클래스만의 장점이라 볼수있는건 객체를 재활용하여 지속적으로 사용가능하다는 점이 있다.   
![javautilrandom](https://user-images.githubusercontent.com/64416833/147427553-4643e351-cded-464d-bdd7-b025dd8bda83.jpg)

### 6. [연습문제Q4] 배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성하시오
- 삼항연산자 사용 부분에서 `true`/`false`에 배열의 특징을 잘 생각해야 한다.
- 만약, B배열보다 A배열이 큰 경우 B배열에 있는 요소들을 A에 담게되면 `ArrayIndexOfBoundsException`이 발생한다. 왜냐하면 배열의 범위를 벗어나기 때문이다. 이러한 이유로 코드는 아래와 같이 구현되어야 한다.
```java
// copy array
static void copy(int[] _arrA, int[] _arrB) {
    int num = _arrA.length <= _arrB.length ? _arrA.length : _arrB.length;
    ...
}
```
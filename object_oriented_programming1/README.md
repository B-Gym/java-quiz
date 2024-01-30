## 6장 객체지향 프로그래밍1 연습문제

<style>
    h4 {font-size: 13px}
    p {font-size: 12px;}
    #answer{
        color: pink;
    }
    summary {
        font-size: 12px;
    }
</style>

<h4>
[6-10] 다음 중 생성자에 대한 설명으로 옳지 않은 것은? (모두 고르시오) 
</h4>
<p>
a. 모든 생성자의 이름은 클래스의 이름과 동일해야한다.</br>
b. 생성자는 객체를 생성하기 위한 것이다.</br>
c. 클래스에는 생성자가 반드시 하나 이상 있어야 한다.</br>
d. 생성자가 없는 클래스는 컴파일러가 기본 생성자를 추가한다.</br>
e. 생성자는 오버로딩 할 수 없다.</br>
</p>

<details>
<summary>[6-10 정답]</summary>
<p id="answer">
b. 생성자는 객체를 생성하기 위한 것이다.</br>
e. 생성자는 오버로딩 할 수 없다.</br>
</p>
</details>

<h4>
[6-11] 다음 중 this에 대한 설명으로 맞지 않은 것은? (모두 고르시오) 
</h4>
<p>
a. 객체 자신을 가리키는 참조변수이다. </br>
b. 클래스 내에서라면 어디서든 사용할 수 있다.</br>
c. 지역변수와 인스턴스변수를 구별할 때 사용한다.</br>
d. 클래스 메서드 내에서는 사용할 수 없다.</br>
</p>

<details>
<summary>[6-11 정답]</summary>
<p id="answer">
b. 클래스 내에서라면 어디서든 사용할 수 있다.</br>
</p>
</details>

<h4>
[6-12] 다음 중 오버로딩이 성립하기 위한 조건이 아닌 것은? (모두 고르시오) 
</h4>
<p>
a. 메서드의 이름이 같아야 한다.</br>
b. 매개변수의 개수나 타입이 달라야 한다.</br>
c. 리턴타입이 달라야 한다.</br>
d. 매개변수의 이름이 달라야 한다.</br>
</p>

<details>
<summary>[6-12 정답]</summary>
<p id="answer">
c. 리턴타입이 달라야 한다.</br>
d. 매개변수의 이름이 달라야 한다.</br>
</p>
</details>

<h4>
[6-13] 다음 중 아래의 add메서드를 올바르게 오버로딩 한 것은? (모두 고르시오) 
</h4>

```java
long add(int a, int b) { return a+b;}
```

<p>
a. long add(int x, int y) { return x+y;}</br>
b. long add(long a, long b) { return a+b;}</br>
c. int add(byte a, byte b) { return a+b;}</br>
d. int add(long a, int b) { return (int)(a+b);}</br>
</p>

<details>
<summary>[6-13 정답]</summary>
<p id="answer">
b. long add(long a, long b) { return a+b;}</br>
c. int add(byte a, byte b) { return a+b;}</br>
d. int add(long a, int b) { return (int)(a+b);}</br>
</p>
</details>

<h4>
[6-14] 다음 중 초기화에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
</h4>
<p>
 a.멤버변수는 자동 초기화되므로 초기화하지 않고도 값을 참조할 수 있다. </br>
 b.지역변수는 사용하기 전에 반드시 초기화해야 한다.</br>
c.초기화 블럭보다 생성자가 먼저 수행된다.</br>
d.명시적 초기화를 제일 우선적으로 고려해야 한다. </br>
e.클래스변수보다 인스턴스변수가 먼저 초기화된다.</br>
</p>

<details>
<summary>[6-14 정답]</summary>
<p id="answer">
c.초기화 블럭보다 생성자가 먼저 수행된다.</br>
e.클래스변수보다 인스턴스변수가 먼저 초기화된다.</br>
</p>
</details>

<h4>
[6-15] 다음중 인스턴스변수의 초기화 순서가 올바른 것은? 
</h4>
<p>
a. 기본값-명시적초기화-초기화블럭-생성자</br>
b. 기본값-명시적초기화-생성자-초기화블럭</br>
c. 기본값-초기화블럭-명시적초기화-생성자</br>
d. 기본값-초기화블럭-생성자-명시적초기화</br>
</p>

<details>
<summary>[6-15 정답]</summary>
<p id="answer">
a. 기본값-명시적초기화-초기화블럭-생성자</br>
</p>
</details>

<h4>
[6-16] 다음 중 지역변수에 대한 설명으로 옳지 않은 것은? (모두 고르시오) 
</h4>
<p>
a. 자동 초기화되므로 별도의 초기화가 필요없다.</br>
b. 지역변수가 선언된 메서드가 종료되면 지역변수도 함께 소멸된다.</br>
c. 매서드의 매개변수로 선언된 변수도 지역변수이다.</br>
d. 클래스변수나 인스턴스변수보다 메모리 부담이 적다.</br>
e. 힙(heap)영역에 생성되며 가비지 컬렉터에 의해 소멸된다.</br>
</p>

<details>
<summary>[6-16 정답]</summary>
<p id="answer">
a. 자동 초기화되므로 별도의 초기화가 필요없다.</br>
e. 힙(heap)영역에 생성되며 가비지 컬렉터에 의해 소멸된다.</br>
</p>
</details>

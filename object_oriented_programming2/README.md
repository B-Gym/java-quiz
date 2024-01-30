## 7장 객체지향 프로그래밍2 연습문제

<h4>
[7-3] 오버라이딩의 정의와 필요성에 대해서 설명하시오.
</h4>

<details>
<summary>[7-3 정답]</summary>
<p id="answer">
정의: 조상 클래스로부터 상속(extends)받은 내용을 변경하는 것</br>
필요성: 조상 클래스로부터 상속받은 내용을 그대로 사용할 수 없는 경우도 있기 때문에 오버라이딩을 통해 상속받은 내용을 변경할 필요가 있다.</br>
</p>
</details>

<h4>
[7-4] 다음 중 오버라이딩의 조건으로 옳지 않은 것은? (모두 고르시오)</h4>
<p>
a. 조상의 메서드와 이름이 같아야 한다. </br>
b. 매개변수의 수와 타입이 모두 같아야 한다.</br>
c. 접근 제어자는 조상의 메서드보다 좁은 범위로만 변경할 수 있다.</br>
d. 조상의 메서드보다 더 많은 수의 예외를 선언할 수 있다.</br>
</p>

<details>
<summary>[7-4 정답]</summary>
<p id="answer">
c. 접근 제어자는 조상의 메서드보다 좁은 범위로만 변경할 수 있다.</br>
d. 조상의 메서드보다 더 많은 수의 예외를 선언할 수 있다.</br>
</p>
</details>

<h4>
[7-6] 자손 클래스의 생성자에서 조상 클래스의 생성자를 호출해야하는 이유는 무엇인가 ?
</h4>

<details>
<summary>[7-6 정답]</summary>
<p id="answer">
자손 클래스의 인스턴스를 생성하면, 자손의 멤버와 조상의 멤버가 모두 합쳐진 하나의 인스턴스가 생성한다. 이 때 조상의 클래스 멤버의 초기화 작업이 수행되어야 하기 때문에 자손 클래스의 생성자에서 조상 클래스의 생성자를 호출해야 한다.</br>
</p>
</details>

<h4>
[7-8] 다음 중 접근제어자를 접근범위가 넓은 것에서 좁은 것의 순으로 바르게 나열한 것은?</h4>
<p>
a. public-protected-(default)-private </br>
b. public-(default)-protected-private </br>
c. (default)-public-protected-private </br>
d. private-protected-(default)-public</br>
</p>

<details>
<summary>[7-8 정답]</summary>
<p id="answer">
a. public-protected-(default)-private </br>
</p>
</details>

<h4>
[7-9] 다음 중 제어자 final을 붙일 수 있는 대상과 붙였을 때 그 의미를 적은 것이다. 옳지 않은 것은? (모두 고르시오)</h4>
<p>
a. 지역변수 - 값을 변경할 수 없다.</br>
b. 클래스 - 상속을 통해 클래스에 새로운 멤버를 추가할 수 없다. </br>c. 메서드 - 오버로딩을 할 수 없다.</br>
d. 멤버변수 - 값을 변경할 수 없다.</br>
</p>

<details>
<summary>[7-9 정답]</summary>
<p id="answer">
c. 메서드 - 오버로딩을 할 수 없다.</br>
</p>
</details>

<h4>
[7-12] 다음 중 접근 제어자에 대한 설명으로 옳지 않은 것은? (모두 고르시오)
</h4>
<p>
a. public은 접근제한이 전혀 없는 접근 제어자이다.</br>
b. (default)가 붙으면, 같은 패키지 내에서만 접근이 가능하다.</br>
c. 지역변수에도 접근 제어자를 사용할 수 있다.</br>
d. protected가 붙으면, 같은 패키지 내에서도 접근이 가능하다.</br>
e. protected가 붙으면, 다른 패키지의 자손 클래스에서 접근이 가능하다.</br>
</p>

<details>
<summary>[7-12 정답]</summary>
<p id="answer">
c. 지역변수에도 접근 제어자를 사용할 수 있다.</br>
</p>
</details>

<h4>
[7-13] Math클래스의 생성자는 접근 제어자가 private이다. 그 이유는 무엇인가?
</h4>

<details>
<summary>[7-13 정답]</summary>
<p id="answer">
Math 클래스는 인스턴스를 생성할 필요가 없기 떄문에 외부로부터 불필요한 접근을 막기위해 생성자의 접근 제어자를 private로 지정하였다.
</br>
</p>
</details>

<h4>
[7-15] 클래스가 다음과 같이 정의되어 있을 때, 형변환을 올바르게 하지 않은 것은? (모두 고르시오.)
</h4>

```java
class Unit {}
class AirUnit extends Unit {}
class GroundUnit extends Unit {}
class Tank extends GroundUnit {}
class AirCraft extends AirUnit {}

Unit u = new GroundUnit();
Tank t = new Tank();
AirCraft ac = new AirCraft();
```

<p>
    a. u = (Unit)ac;</br>
    b. u = ac;</br>
    c. GroundUnit gu = (GroundUnit)u;</br>
    d. AirUnit au = ac;</br>
    e. t = (Tank)u;</br>
    f. GroundUnit gu = t;</br>
</p>

<details>
<summary>[7-15 정답]</summary>
<p id="answer">
e. t = (Tank)u;</br>
: 조상타입의 인스턴스를 자손타입으로 형변환할 수 없음

 </p>
</details>

<h4>
[7-16] 다음 중 연산결과가 true가 아닌 것은? (모두 고르시오)
</h4>

```java
class Car {}
class FireEngine extends Car implements Movable {} class Ambulance extends Car {}

FireEngine fe = new FireEngine();
```

<p>
    a. fe instanceof FireEngine</br>
    b. fe instanceof Movable</br>
    c. fe instanceof Object</br>
    d. fe instanceof Car</br>
    e. fe instanceof Ambulance</br>

</p>

<details>
<summary>[7-16 정답]</summary>
<p id="answer">
     e. fe instanceof Ambulance</br>
</p>
</details>

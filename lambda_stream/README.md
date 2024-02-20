## 14장 람다와 스트림 연습문제

<h4>
[14-1] 메서드를 람다식으로 변환하여 아래의 표를 완성하시오.
</h4>

<table style="border: 2px; text-align: center;">
  <tr>
    <td> 메서드 </td>
    <td> 람다식 </td>
  </tr>
<tr>
  <td>

```java
int max(int a, int b) {
    return a > b ? a : b;
}
```

  </td>
  <td>

```java
(int a, int b) -> { return a > b ? a : b; }
(int a, int b) -> a > b ? a : b
(a, b) -> a > b ? a : b
```

  </td>
</tr>
<tr>
  <td>

```java
int printVar(String name,  int i) {
    System.out.println(name + ", " + i);
}
```

  </td>
  <td>

```java
(String name, int i) -> { System.out.println(name + ", " + i); }
(name, i) -> { System.out.println(name + ", " + i); }
(name, i) -> System.out.println(name + ", " + i)
```

  </td>
</tr>
<tr>
  <td>

```java
int square(int x) {
    return x * x;
}
```

  </td>
  <td>

```java
(int x) ->  x * x
(x) -> x * x
x -> x * x
```

  </td>
</tr>

<tr>
  <td>

```java
int roll() {
    return (int) (Math.random() * 6);
}
```

  </td>
  <td>

```java
() -> { return (int)(Math.random() * 6); }
() -> (int)(Math.random() * 6)
```

  </td>
</tr>
<tr>
  <td>

```java
int sumArr(int[] arr) {
    int sum = 0;
    for(int i : arr)
        sum += i;
    return sum;
}
```

  </td>
  <td>

```java
(int[] arr) -> {
    int sum = 0;
    for(int i : arr)
        sum += i;
    return sum;
}
```

  </td>
</tr>
<tr>
  <td>

```java
int[] emptyArr() {
    return new int[]{};
}
```

  </td>
  <td>

```java
() -> { return new int[]{}; }
() -> new int[]{}
```

  </td>
</tr>
</table>

<h4>
[14-2] 람다식을 메서드 참조로 변환하여 표를 완성하시오. 
</br> (변환이 불가능한 경우, ‘변환불가’라고 적어야함.)
</h4>

|                      람다식                       |         메서드참조          |
| :-----------------------------------------------: | :-------------------------: |
|            `(String s) -> s.length()`             |      `String::length`       |
|                `() -> new int[]{}`                |        `int[]::new`         |
|            `arr -> Arrays.stream(arr)`            |      `Arrays::stream`       |
| `(String str1, String str2) -> str1.equals(str2)` |      `String::equals`       |
|         `(a, b) -> Integer.compare(a, b)`         |     `Integer::compare`      |
|  `(String kind, int num) -> new Card(kind, num)`  |         `Card::new`         |
|          `(x) -> System.out.println(x)`           |    `System.out::println`    |
|               `()-> Math.random()`                |       `Math::random`        |
|           `(str) -> str.toUpperCase()`            |    `String::toUpperCase`    |
|        `() -> new NullPointerException()`         | `NullPointerException::new` |
|           `(Optional opt) -> opt.get()`           |       `Optional::get`       |
|   `(StringBuffer sb, String s) -> sb.append(s)`   |   `StringBuffer::append`    |
|       `(String s) -> System.out.println(s)`       |    `System.out::println`    |

<h4>
[14-3] 아래의 괄호안에 알맞은 함수형 인터페이스는?
</h4>

```java
(   ) f; //함수형인터페이스타입의참조변수f를선언.
f = (int a, int b) -> a > b ? a : b;
```

<p>
a. Function</br>
b. BiFunction</br>
c. Predicate</br>
d. IntBinaryOperator </br>
e. IntFunction</br>
</p>

<details>
<summary>[14-3 정답]</summary>
<p id="answer">
<p>
d. IntBinaryOperator </br>
</p>
</details>

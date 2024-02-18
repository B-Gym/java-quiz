## 12장 지네릭스, 열거형, 애너테이션 연습문제

<h4>
[12-1] 클래스 Box가 다음과 같이 정의되어 있을 때, 다음 중 오류가 발생하는 문장은? 경고가 발생하는 문장은?
</h4>

```java
class Box<T> { // 지네릭 타입 T를 선언
    T item;

    void setItem(T item) { this.item = item; }
    T getItem() { return item; }
}
```

<p>
a. Box<Object> b = new Box<String>();</br>
b. Box<Object> b = (Object)new Box<String>();</br>
c. new Box<String>().setItem(new Object()); </br>
d. new Box<String>().setItem("ABC");
</p>

<details>
<summary>[12-1 정답]</summary>
<p id="answer">
<p>

```java
a. Box<Object> b = new Box<String>();</br>
b. Box<Object> b = (Object)new Box<String>();</br>
c. new Box<String>().setItem(new Object()); </br>
```

</p>
</details>

<h4>
[12-2] 지네릭 메서드 makeJuice()가 아래와 같이 정의되어 있을 때, 이 메서드를 올바 르게 호출한 문장을 모두 고르시오.
</br>(Apple과 Grape는 Fruit의 자손이라고 가정하자.)
</h4>

```java
class Juicer {
    static <T extends Fruit> String makeJuice(FruitBox<T> box){
        String temp = "";
        for(Fruit f : box.getList()) temp += f + " ";
        return temp;
    }
}
```

<p>
a. Juicer.<Apple>makeJuice(new FruitBox<Fruit>()); </br>
b. Juicer.<Fruit>makeJuice(new FruitBox<Grape>()); </br>
c. Juicer.<Fruit>makeJuice(new FruitBox<Fruit>()); </br>
d. Juicer.makeJuice(new FruitBox<Apple>());</br>
e. Juicer.makeJuice(new FruitBox<Object>());
</p>

<details>
<summary>[12-2 정답]</summary>
<p id="answer">
c. Juicer.<Fruit>makeJuice(new FruitBox<Fruit>()); </br>
d. Juicer.makeJuice(new FruitBox<Apple>());</br>
</br>
</p>
</details>

<h4>
[12-3] 다음 중 올바르지 않은 문장을 모두 고르시오.
</h4>

```java
class Box<T extends Fruit> { // 지네릭 타입 T를 선언
    T item;

    void setItem(T item) { this.item = item; }
    T getItem() { return item; }
}
```

<p>
a. Box<?> b = new Box();</br>
b. Box<?> b = new Box<>();</br>
c. Box<?> b = new Box<Object>();</br>
d. Box<Object> b = new Box<Fruit>();</br>
e. Box b = new Box<Fruit>();</br>
f. Box<? extends Fruit> b = new Box<Apple>();</br>
g. Box<? extends Object> b = new Box<? extends Fruit>();</br>
</p>

<details>
<summary>[12-3 정답]</summary>
<p id="answer">

```java
c. Box<?> b = new Box<Object>();
d. Box<Object> b = new Box<Fruit>();
g. Box<? extends Object> b = new Box<? extends Fruit>();
```

</p>
</br>
</p>
</details>

<h4>
[12-4] 아래의 메서드는 두 개의 ArrayList를 매개변수로 받아서, 하나의 새로운 ArrayList로 병합하는 메서드이다. 이를 지네릭 메서드로 변경하시오.
</h4>

```java
public static ArrayList<? extends Product> merge(ArrayList<? extends Product> list, ArrayList<? extends Product> list2){
    ArrayList<? extends Product> newList = new ArrayList<>(list);

    newList.addAll(list2);

    return newList;
}
```

<details>
<summary>[12-4 정답]</summary>

```java
public static <T extends Product> ArrayList<T> merge(ArrayList<T> list, ArrayList<T> list2){
    ArrayList<T> newList = new ArrayList<>(list);

    newList.addAll(list2);

    return newList;
}
```

</details>

<h4>
[12-6] 다음 중 메타 애너테이션이 아닌 것을 모두 고르시오.
</h4>
<p>
a. Documented </br>
b. Target </br>
c. Native </br>
d. Inherited </br>
</p>

<details>
<summary>[12-6 정답]</summary>
<p id="answer">
c. Native </br>
</p>
</br>
</p>
</details>

<h4>
[12-7] 애너테이션 TestInfo가 다음과 같이 정의되어 있을 대, 이 애너테이션이 올바르 게 적용되지 않은 것은?</h4>

```java
@interface TestInfo{
    int count() default 1;
    String[] value() default "aaa";
}
```

<p>
a. @TestInfo class Exercise12_7 {} </br>
b. @TestInfo(1) class Exercise12_7 {}</br>
c. @TestInfo("bbb") class Exercise12_7 {}</br>
d. @TestInfo("bbb","ccc") class Exercise12_7 {}</br>
</p>

<details>
<summary>[12-7 정답]</summary>
<p id="answer">
b. @TestInfo(1) class Exercise12_7 {}</br>
d. @TestInfo("bbb","ccc") class Exercise12_7 {}</br>
</p>
</br>
</p>
</details>

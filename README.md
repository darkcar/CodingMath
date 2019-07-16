# Coding Math

## 01 二进制

### 1.1 二进制与十进制转换，Java的BigInteger类

<b>代码演示：二进制和十进制之间的转换（Java）</b>

```java
public class Lesson1_1 {
	public static String decimalToBinary(int decimalSource) {
		BigInteger bi = new BigInteger(String.valueOf(decimalSource));
		return bi.toString(2);
	}
	
	public static int binaryToDecimal(String binarySource) {
		BigInteger bi = new BigInteger(binarySource, 2);
		return Integer.parseInt(bi.toString());
	}
	
	@Test
	public void test() {
		System.out.println(Lesson1_1.decimalToBinary(12));
	}
}
```



- String: `Strings` are constant `private final char value[]`, default value is "", char[] is used for storage. 

  ```java
  String()
  String(String)
  String(char[])
  String(char[], int, int)
  length()
  isEmpty(): return value.length() == 0
  substring()
  valueOf() == copyValueOf()
  split()
  ```

- StringBuffer: A thread-safe, mutable sequence of characters, safe for use by multiple threads. 

  ```java
  StringBuffer(String str) { super(str.length() + 16); append(str);}
  // Constructs a string buffer initialized to the contents of the specified string. 
  // Using synchronized keyword to make sure it is thread safe: 
  @Overried
  public synchronized int length() {
    return count;
  }
  
  @Override 
  public synchronized int capacity() {
    return value.length;
  }
  
  // Set charAt
  public synchronized void setCharAt(int index, char ch) {
  	if ((index < 0) || (index >= count)) {
      throw new StringINdexOutOfBoundsException(index);
    }
    toStringCache = null;
    value[index] = ch;
  }
  
  /**
  	Other functions:
  */ 
  1. replace()
  2. deleteCharAt()
  3. substring()
  4. insert()
  5. reverse(): defined from in AbstractStringBuilder
  ```

  

- StringBuilder: similar to `StringBuffer` but with no guarantee of synchronization. 

  ```tex
  A mutable sequence of characters. This class provides an API compatible with StringBuffer, but with no guarantee of synchronization. 
  ```

---

BigInteger: Immutable arbitrary-precision integers. All operations behave as if BigIntegers were represented in two's-complement notation.

```java
// Use Constructor to translate the String Representation of a BigInteger in the specified radix into a BigInteger. 
public BigInteger(String val, int radix) {
  
}

// Returns the String representation of this BigInteger in the given radix 
public String toString(int radix) {
  // default is 10
}
```

### 1.2 计算机为什么使用二进制？

- 从计算机的硬件组成来说，只有两个状态，电路只有接通和断开。状态少，所以电路的稳定性比较高。
- 从计算的角度来说，非常适合来做逻辑运算。

### 1.3 二进制的位移运算

- 向左移位：数字翻倍
- 向右移位：数字除以2

In java, there are right shift operators: 

符号位为0时，表示该数值为正数，当符号位为1，表示该数值为负数。

```
Decimal: 53
Binary: 000....0110101

Decimal: -53
Binary: 111....1001010
```

补充一下：补码的概念

- `>>` signed right shift: all integers are signed in Java. 
- `>>>` unsigned right shift: always fills 0 irrespective of the sign of the number. 
# JUnit-Test-Java

## JUnit là gì?
JUnit là một framework đơn giản dùng cho việc tạo các unit testing tự động, và chạy các test có thể lặp đi lặp lại. JUnit là một framework được dùng cho unit test trong Java.

Trong JUnit có các Test Case là các lớp của Java, các lớp này bao gồm một hay nhiều các phương thức cần kiểm tra, và Test Case này lại được nhóm với nhau để tạo thành Test Suite. Mỗi phương thức thử trong JUnit phải được thực thi nhanh chóng.

## Lợi ích của 
JUnit tránh cho người lập trình phải làm đi làm lại những việc kiểm thử nhàm chán bằng cách tách biệt mã kiểm thử ra khỏi mã chương trình, đồng thời tự động hóa việc tổ chức và thi hành các bộ số liệu kiểm thử.

## Annotation trong JUnit
Tên Annotation | Ý nghĩa
------------ | -------------
```@RunWith``` | Xác định **test runner**
```@Suite``` | Thực thi nhiều **test case** cùng một lúc
```@Before``` | Với annotation này thì method sẻ được thực thi trước mỗi method **test**. ```public void```
```@BeforeClass``` | Với annotation này thì method sẻ chỉ **chạy 1 lần** và **trước** tất cả method của class (EX: connect database). ```public static void```
```@After``` | Với annotation này thì method sẽ được thực thi sau mỗi phương thức **test**. ```public void```
```@AfterClass``` | Với annotation này thì method sẻ chỉ **chạy 1 lần** và **sau** tất cả method của class. ```public static void```
```@Test``` | Đánh dấu một method dùng để **test**.
```@Test(expected = ArithmeticException.class)``` | Bắt ngoại lệ cho method **test**
```@Test(timeout=time)``` | Xác định thời gian thực thi cho method **test**

Example:
```java
public class TestDemo {
	@Before
	public void before(){
		System.out.println("Before");
	}
	
	@After
	public void after(){
		System.out.println("After");
	}
	
	@Test
	public void test1(){
		System.out.println("Test 1 run");
	}
	
	@Test
	public void test2(){
		System.out.println("Test 2 run");
	}
	
	@BeforeClass
	public static void beforeClass(){
		System.out.println("BeforeClass");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("AfterClass");
	}
}

```

Console
```
BeforeClass
Before
Test 1 run
After
Before
Test 2 run
After
AfterClass
```


## Các method trong JUnit
Các method dạng **assertXXX()**

Tên method | Ý nghĩa
------------ | -------------
```void assertEquals(object expected, object actual)``` | So sánh 2 giá trị để kiểm tra bằng nhau. Test sẽ được chấp nhận nếu các giá trị bằng nhau.




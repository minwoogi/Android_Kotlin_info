
/*
 * var : 변수값 변경 가능
 * val : 선언시에만 초기화 가능(변경 불가능) -> JAVA의 final
 * ? : 변수의 값이 null일 수 있다는 것을 표시(?를 표시 하지 않으면 선언시 null이 될 수 없음)
 * ctrl + shift + p -> 초기화 이후 추론 타입 확인 단축키
 */

fun main() {
    var a: Int;
    a = 123;
    println(a);


    val b: Int;
    b = 456;
    // b == 123 값 변경 불가
    println(b);


    var c:Int? =null
    println(c);


    //  String형으로 자동 추론
    var s = "String";
    println(s);

}
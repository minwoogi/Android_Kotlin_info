
/*
 *  기본 자료형 변수대입시 자동 형변환 지원X
 *  toByte() : Byte 타입으로 변환
    toUByte() : unsigned 타입인 UByte 타입으로 변환
    toShort() : Short 타입으로 변환
    toUShort() : unsigned 타입인 UShort 타입으로 변환
    toInt() : Int 타입으로 변환
    toUInt() : unsigned 타입인 UInt 타입으로 변환
    toLong() : Long 타입으로 변환
    toULong() : unsigned 타입인 ULong 타입으로 변환
    toFloat() : Float 타입으로 변환
    toDouble() : Double 타입으로 변환
    toChar() : Char 타입으로 변환
    toString() : String 타입으로 변환
    toBigInteger() : BigInteger 타입으로 변환
    toBigDecimal() : BigDecimal 타입으로 변환
 *
 * as -> 대상의 뒤에 as 자료형 형변환
 *
 * Smart Cast -> 특정 상황에서 컴파일러가 알아서 똑똑하게 형변환을 해주는 기능
 */


fun main(){

    var a: Int = 123
    var b: String = a.toString()
    println("b->$b")


    var c = "123,456"
    //var d = c.toInt();
    //print("d->$d") // java.lang.NumberFormatException


    val map = mapOf<String, Any>(Pair("key1", "value1"), Pair("key2", 2))
    var e = map["key1"] as String
    var f = map["key2"] as Int

    println("e->$e")
    println("f->$f")




    val map2 = mapOf<String, Any>(Pair("key1", "value1"), Pair("key2", 2))
    val v = map["key1"]
    if (v is String) {
        println(v.length);
    }

}
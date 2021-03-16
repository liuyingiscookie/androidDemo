package com.example.learnroutin

class grammerLeanr16 {
    var number: Int?=5
        get()= field

        set(value){
            print(number)
        }

}
fun main() {
    var gra=grammerLeanr16();

    println(gra.number)//输出5

//    fun printDouble(d: Double) {
//        print(d)
//    }
//
//    val i = 1
//    val d = 1.1
//    val f = 1.1f
//
//    //i为int，无法隐式转换成double
//    val  number =1000_000
//    printDouble(d)
//    print(number)

//    val a: Int = 127
//    val boxedA: Int? = a
//    val anotherBoxedA: Int? = a
//
//    val b: Int = 128
//    val boxedB: Int? = b
//    val anotherBoxedB: Int? = b
//    //对比的是值
//    println(boxedA == anotherBoxedA) // true
//    println(boxedB == anotherBoxedB) // true
//    //===对比的是对象
//    println(boxedA === anotherBoxedA) // true
//    println(boxedB === anotherBoxedB) // false

//    print('a'.toInt()==97)//true
//     print('a'==97)//can't applied
//    val b: Char = 'a'
//    val boxedB: Char? = b
//    val anotherBoxedB: Char? = b
//
//    println(boxedB == anotherBoxedB) // true
//    println(boxedB === anotherBoxedB) // true
//    val text = """
//    for (c in "foo")
//        print(c)
//
//
//"""
//    val text = """
//    >Tell me and I forget.
//    >Teach me and I remember.
//    >Involve me and I learn.
//    >(Benjamin Franklin)
//    """.trimMargin(">")
//    val price = ""
//${'$'}9.99
//""

//    print(price)
//    Tell me and I forget.
//    Teach me and I remember.
//    Involve me and I learn.
//    (Benjamin Franklin)
}
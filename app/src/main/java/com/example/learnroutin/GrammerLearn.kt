package com.example.learnroutin

import java.lang.reflect.Array.get

//扩展
//class MyClass2 {
//    companion object {
//        val INNER_PARAMETER = "can only be inner"
//    }
//}
//val MyClass2.Companion.no: Int
//    get() = 10
//fun main(vararg args:String) {
////    扩展方法
//    fun MyClass2.Companion.operateVariable() {
//        println(this.INNER_PARAMETER)
//    }
//    println(MyClass2.no)//10
//    MyClass2.operateVariable() //print: can only be inner
//}

fun main(){
    val a: Int = 127
    val boxedA: Int? = a
    val anotherBoxedA: Int? = a

    val b: Int = 128
    val boxedB: Int? = b
    val anotherBoxedB: Int? = b

    val c: Int = -128
    val boxedC: Int? = c
    val anotherBoxedC: Int? = c

    val d: Int = -129
    val boxedD: Int? = d
    val anotherBoxedD: Int? = d

    println(boxedA === anotherBoxedA) // true
    println(boxedB === anotherBoxedB) // false
    println(boxedC === anotherBoxedC) // true
    println(boxedD === anotherBoxedD) // false
}
//实现接口
//interface MyInterface { fun operateVariable() }
//
//fun operateClass(interfaceObject:MyInterface) = interfaceObject.operateVariable()
//
//class MyClass3 {
//    companion object:MyInterface {
//        override fun operateVariable() {
//            println("实现了接口")
//        }
//    }
//}
//
//fun main(vararg args:String) {
//    operateClass(MyClass3) //MyClass3和MyInterface的实现类一样，输出"实现了接口"。
//    println(MyClass3 is MyInterface)//基本可以当作是实现了该接口的类，true
//

//}
//class MyClass2 {
//    companion object  {
//        val INNER_PARAMETER1 = "can only be inner"
//
//    }
//标红，无法创建两个companion伴生类，
//    companion object CompanionName {
//        val INNER_PARAMETER1 = "can only be inner"
//
//    }
//
//}
//class MyClass3 {
//    companion object {
//        val INNER_PARAMETER = "can only be inner"
//    }
//}

//fun main(vararg args:String) {
////    println(MyClass2.CompanionName.INNER_PARAMETER == MyClass2.INNER_PARAMETER) //print: true
//    val x=MyClass3()
//    val y=MyClass3()
////    println(MyClass3.Companion.INNER_PARAMETER == MyClass3.INNER_PARAMETER) //print: true
//    println(x==y)//false
//    print(x.INNER_PARAMETER)
//}
//class GrammerLearn {
//
//    //和java不同，main函数声明在类里面，无法运行，这只是一个类里面普通的函数
////    fun main(args : String){
////        println(args)
////    }
//
//}
////调用grammerLearn类里面函数里面的内容
//fun main(args : Array<String>){
//返回值类型自动推断
//   val grammer =GrammerLearn();
//    grammer.main("hello")

//测试val,var
//    var test_value=3;
//    println("test=${test_value}")
//    test_value=4
//    println("test=${test_value}")
//
//    val test_value1=3
//    println("test=${test_value1}")
//    test_value1=4
//    println("test=${test_value1}")
//    val simple: Int? // 类型 Int、默认 getter、必须在构造函数中初始化
//    val inferredType = 1 // 类型 Int 、默认 getter

//数字拆箱装箱
//    val a: Int = 127
//    val boxedA: Int? = a
//    val anotherBoxedA: Int? = a
//
//    val b: Int = 128
//    val boxedB: Int? = b
//    val anotherBoxedB: Int? = b
//
//    println(boxedA === anotherBoxedA) // true
//    println(boxedB === anotherBoxedB) // false
//    val a: Int = 10000
//    println(a == a) // 输出“true”
//    val boxedA: Int? = a
//    val anotherBoxedA: Int? = a
//    println(boxedA == anotherBoxedA) // 输出“true”

//数字无法向上转型。要显示转化
//    val b: Byte = 1 // OK, 字面值是静态检测的
////    val i: Int = b // 错误
//    val i: Int = b.toInt() // OK：显式拓宽
//    print(i)
//
//    c@ for (i in 1..100) {
//        for (j in 1..100) {
//            println("${i} and ${j}")
//            if (i==2) {
//
//                break@c
//            }
//        }
//    }

//}

package com.mertdbs.assignment1


import java.io.File
import java.math.BigDecimal
import java.nio.file.Files
import java.nio.file.Paths
import java.util.Calendar


fun main(){

    page_nine()
    sum_pageten(0,6)
    sum_pageten_part2(34,6)
    printSum(34,6)
    page_eleven_partone()
    page_eleven_parttwo()
    page_twelve()
    page_twelve_part_two()
    page_fourteen()
    maxOf_part_one(100,101)
    maxOf_part_two(1923,1920)
    page_sixteen_part_one()
    page_sixteen_part_two()
    page_seventeen()
    describe("Hello")
    page_nineteen()
    page_twenty()
    page_twentyone()
    greet("Mert")
    page_thirtynine()
    page_forty()
    page_fortytwo()
    page_fortythree()
    page_fortyfour()
    page_fortyfive()
    MySingleton.doSomething()
    val dog = Dog_Fortyeight()
    dog.makeSound()
    page_fortynine()
    page_fifty()
    page_fiftyone()
    page_fiftytwo()
    page_fiftythree()
    transform("Blue")
    page_fiftysix()
    page_fiftyeight()
    arrayOfMinusOnes(10)
    theAnswer()
    theAnswer_parttwo()
    page_sixtyone()
    page_sixtytwo()
    page_sixtythree()
    page_sixtyfive()
    //calcTaxes()
    printMessageWithPrefix("Merhaba Patika!")
    printMessageWithPrefix(prefix = "Log", message = "Merhaba Kodluyoruz!")
    page_sixtynine()
    page_seventy()
    page_seventyone()
    page_seventytwo()
    describeString("Is it null?")

    // 74
    val contact = Contact(1, "mary@gmail.com")
    println(contact.id)
    contact.email = "jane@gmail.com"

    // 76
    val stack = mutableStackOf(0.62, 3.14, 2.7)
    println(stack)

    // 77
    val dog_seventyseven: Dog = Yorkshire()
    dog_seventyseven.sayHello()

    // 78
    val lion: Lion = Asiatic("Rufo")
    lion.sayHello()

    // 79
    val shapes: List<Drawable> = listOf(Circle(5), Square(10))
    shapes.forEach { it.draw() }

    page_eightyone()
    page_eightytwo()
    page_eightyfive()
    page_eightysix()
    page_eightyseven()
    page_eightyeight()
    page_eightynine()

    // 91
    val kitap1 = Kitap ("Getir Bootcamp", "Emre Mert Dübüş", 2024)
    val kitap2 = Kitap ("Getir Bootcamp", "Emre Mert Dübüş", 2024)

    // equals() fonksiyonu
    println("equals(): ${kitap1.equals(kitap2)}") // true

    // hashCode() fonksiyonu
    println("hashCode() Kitap1: ${kitap1.hashCode()}")
    println("hashCode() Kitap2: ${kitap2.hashCode()}")

    // toString() fonksiyonu
    println("toString() Kitap1: $kitap1")
    println("toString() Kitap2: $kitap2")

    // copy() fonksiyonu
    val kopyaKitap = kitap1.copy (yayinYili = 2023)
    println("copy() Kopya Kitap: $kopyaKitap")

}

// page 9
fun page_nine(){
    print("Hello I am Mert! ")
    print("world!")
    print("Hello world!")
    print(100)
}


// ------------------------------------------------
// sayfa 10

fun sum_pageten(a: Int,b:Int): Int {
    return a + b
}
fun sum_pageten_part2(a:Int,b:Int):Int = a + b

fun printSum(a:Int, b:Int): Unit {
    println("sum of $a and $b is ${a + b}")
}


// ------------------------------------------------
// sayfa 11

fun page_eleven_partone(){
    val a: Int = 1
    val b = 2
    val c: Int
    c = 3
    var x = 5
    println("results of $a and $b and $c and $x")
    x += 1
    val PI = 3.14
    println("results of $x and $PI")
}

fun page_eleven_parttwo(){
    var x = 5
    fun incrementX(){
        x += 1
    }
    println("results of x : $x")
    incrementX()
    println("results of x after incrementX : $x")
}

// ------------------------------------------------
//sayfa 12
open class Shape2

class Rectangle1(val height: Double, val length: Double) {
    val perimeter = (height + length) * 2
}

class Rectangle2(val height: Double, val length: Double) : Shape2() {
    val perimeter = (height + length) * 2
}

fun page_twelve(){
    val rectangle = Rectangle1(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")
}

fun page_twelve_part_two(){
    val rectangle = Rectangle2(5.0, 2.0)
    println("The perimeter is ${rectangle.perimeter}")
}


// ------------------------------------------------
// sayfa 13

open class Color {
    // Color sınıfa ait özellikler ve metotlar
}

class Rectangle : Color() {
    // Rectangle sınıf, Color sınıfını miras alabilir
}


// ------------------------------------------------
// sayfa 14

fun page_fourteen(){
    var a = 1

    val s1 = "a is $a"
    println(s1)
    a = 2

    val s2 = "${s1.replace("is", "was")}, but now is $a"
    println(s2)

}


// ------------------------------------------------
// sayfa 15

fun maxOf_part_one(a: Int, b: Int): Int {
    if (a > b) {
        return a
    } else {
        return b
    }
}

// Tek satırda
fun maxOf_part_two(a: Int, b: Int) = if (a > b) a else b


// ------------------------------------------------
// sayfa 16

fun page_sixteen_part_one(){
    val items = listOf("apple", "banana", "kiwifruit")
    for (item in items) {
        println(item)
    }
}

fun page_sixteen_part_two(){
    val items = listOf("apple", "banana", "kiwifruit")
    for (index in items.indices) {
        println("item at $index is ${items[index]}")
    }
}


// ------------------------------------------------
// sayfa 17

fun page_seventeen(){
    val items = listOf("apple", "banana", "kiwifruit")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++
    }
}


// ------------------------------------------------
// sayfa 18

fun describe(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }


// ------------------------------------------------
// sayfa 19

fun page_nineteen(){
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    }

    val list = listOf("a", "b", "c")

    if (-1 !in 0..list.lastIndex) {
        println("-1 is out of range")
    }
    if (list.size !in list.indices) {
        println("list size is out of valid list indices range, too")
    }

    for (x in 1..5) {
        print(x)
    }

    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }
}


// ------------------------------------------------
// sayfa 20

fun page_twenty(){

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.uppercase() }
        .forEach { println(it) }
}


// ------------------------------------------------
// sayfa 21

fun page_twentyone(){

    var b: String? = "abc" // can be set to null
    if (b == null) {
        println("b is null")
    }
}


// ------------------------------------------------

// sayfa 24

/*
// Paket isimleri
org.example.project
// Paket isimleri uzun olursa camel case
org.example.myProject

// Class isimleri uppercase
open class DeclarationProcessor { /*...*/ }

// object isimleri uppercase
object EmptyDeclarationProcessor : DeclarationProcessor() { /*...*/ }

// Metod tanımlamaları camel case
fun processDeclarations() { /*...*/ }

// Değişken tanımları camel case
var declarationCount = 1
*/

// ------------------------------------------------

// sayfa 25
/*
class MyTestCase {
    @Test fun `ensure everything works`() { /*...*/ }

    @Test fun ensureEverythingWorks_onAndroid() { /*...*/ }
}

@Test
fun addition_isCorrect() {
    // Test the addition functionality
    assertEquals(4, 2 + 2)
}

@Test
fun stringConcatenation_isCorrect() {
    // Test string concatenation
    val str1 = "Hello, "
    val str2 = "World!"
    assertEquals("Hello, World!", str1 + str2)
}
*/


// ------------------------------------------------
// sayfa 26

class MyPerson
// sabitler
const val MAX_COUNT = 8
val USER_NAME_FIELD = "UserName"

// koleksiyon tanımı
val mutableCollection: MutableSet<String> = HashSet()

//val PersonComparator: Comparator<MyPerson> = Any?


// ------------------------------------------------
// sayfa 38

fun greet(
    name: String = "Guest",
    greeting: String = "Hello"
) {
    println("$greeting, $name!")
}


// ------------------------------------------------
// sayfa 39

fun page_thirtynine(){
    val list = emptyList<Int>()
    val positives1 = list.filter { x -> x > 0 }

    val positives2 = list.filter { it > 0 }
}


// ------------------------------------------------
// sayfa 40

fun page_forty(){
    val emailsListWithJohn = listOf("john@example.com", "doe@example.com")
    val emailsListWithoutJane = listOf("john@example.com", "doe@example.com")

    if ("john@example.com" in emailsListWithJohn) {
        println("john@example.com is in the list.")
    }

    if ("jane@example.com" !in emailsListWithoutJane) {
        println("jane@example.com is not in the list.")
    }
}


// ------------------------------------------------
// sayfa 42

fun page_fortytwo(){

    val list = listOf("a", "b", "c")
    println(list)
}


// ------------------------------------------------
// sayfa 43

fun page_fortythree(){

    val map = mapOf("a" to 1, "b" to 2, "c" to 3)
    println(map)
}


// ------------------------------------------------
// sayfa 44

fun page_fortyfour(){
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)

    for ((k, v) in map) {
        println("$k -> $v")
    }

}


// ------------------------------------------------
// sayfa 45

fun page_fortyfive(){
    val myLazyValue: String by lazy {
        println("Bu sadece ilk çağrıldığında yazdırılacak.")
        "Merhaba dünya. Page 45"
    }
    println(myLazyValue)
}


// ------------------------------------------------
// sayfa 46

fun String.toUppercaseExtention():String {
    return this.toUpperCase()
}


// ------------------------------------------------
// sayfa 47

object MySingleton {
    init {
        println("Singleton sınıfı başlatıldı.")
    }

    fun doSomething() {
        println("Singleton sınıfından bir işlem yapılıyor.")
    }
}


// ------------------------------------------------
// sayfa 48

// Soyut sınıf
abstract class Animal {
    abstract fun makeSound()
}

// Alt sınıf
class Dog_Fortyeight : Animal() {
    override fun makeSound() {
        println("Hav hav!")
    }
}


// ------------------------------------------------
// sayfa 49

fun page_fortynine(){
    val files = File("Test").listFiles()
    println(files?.size)
}


// ------------------------------------------------
// sayfa 50

fun page_fifty(){

    val files = File("Test").listFiles()

    println(files?.size ?: "empty")

    val filesSize = files?.size ?: run {
        val someSize = 200
        someSize * 2
    }

    println(filesSize)
}


// ------------------------------------------------
// sayfa 51

fun page_fiftyone(){
    val values = "abcd"
    val email = values[0] ?: throw IllegalStateException("Email is missing!")
    try {
        println(email)
    }catch (e:Exception){
        e.stackTrace
    }
}


// ------------------------------------------------
// sayfa 52

fun page_fiftytwo(){
    val emails = ""
    val mainEmail = emails.firstOrNull() ?: "Email is empty"
    try {
        println(mainEmail)
    }catch (e:Exception){
        e.stackTrace
    }
}


// ------------------------------------------------
// sayfa 53

fun page_fiftythree(){
    val value = "emre mert"

    value?.let {
        println(it.length)
    }
}


// ------------------------------------------------
// sayfa 55

fun transform(color: String): Int {
    return when (color) {
        "Red" -> 0
        "Green" -> 1
        "Blue" -> 2
        else -> throw IllegalArgumentException("Invalid color param value")
    }
}

// ------------------------------------------------
// sayfa 56

fun page_fiftysix() {
    val myWord = "ankara"
    fun count(){
        myWord.length
    }
    val result = try {
        count()
    } catch (e : ArithmeticException){
        throw IllegalStateException(e)
    }
    println(result)
}

// ------------------------------------------------
// sayfa 58

fun page_fiftyeight() {
    val x = 2
    val y = if (x == 1) {
        println("one")
    } else if (x == 2) {
        println("two")
    } else {
        println("other")
    }
}


// ------------------------------------------------
// sayfa 59

fun arrayOfMinusOnes(size : Int) : IntArray {
    return IntArray(size).apply { fill(-1) }
}


// ------------------------------------------------
// sayfa 60

fun theAnswer() = 42

fun theAnswer_parttwo(): Int {
    return 42
}


// ------------------------------------------------
// sayfa 61

class Turtle {
    fun penDown(){}
    fun penUp(){}
    fun turn(degrees: Double){}
    fun forward(pixels: Double){}
}
fun page_sixtyone() {
    val myTurtle = Turtle()
    with(myTurtle) {
        penDown()
        for (i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }

}


// ------------------------------------------------
// sayfa 62

fun page_sixtytwo() {
    class Rectangle {
        var length: Int = 0
        var breadth: Int = 0
        var color: String = ""
    }

    val myRectangle = Rectangle().apply {
        length = 4
        breadth = 5
        color = "0xFAFAFA"

    }
}


// ------------------------------------------------
// sayfa 63

fun page_sixtythree() {
    try {
        val stream = Files.newInputStream(Paths.get("/some/file.txt"))
        stream.buffered().reader().use { reader ->
            println(reader.readText())
        }
    }catch (e:Exception){
        println("Dosya Bulunamadi!")
    }

}


// ------------------------------------------------
// sayfa 64

inline fun <reified T> genericFunction(value: T) {
    val typeName = T::class.simpleName
    println("The type of the value is: $typeName")
}


// ------------------------------------------------
// sayfa 65

fun page_sixtyfive() {
    var myVariable = "Emre Mert"
    myVariable = myVariable.also {
        // 'it' burada 'myVariable' değerini temsil eder
        println("Değişkenin değeri: $it")

        // Değişkenin değerini değiştirelim
        it.toUpperCase()
    }
}


// ------------------------------------------------
// sayfa 66

//fun calcTaxes(): BigDecimal = TODO("Waiting for feedback from accounting")


// ------------------------------------------------
// sayfa 67

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}


// ------------------------------------------------
// sayfa 69

fun page_sixtynine(){
    operator fun String.get(range: IntRange) = substring(range)

    val str = "Always forgive your enemies; nothing annoys them so much."
    println(str[0..14]) // Always forgive
}


// ------------------------------------------------
// sayfa 70

fun page_seventy(){

    fun printAll(vararg messages: String){
        for(m in messages) println(m)
    }

    printAll("Ben","Emre Mert"," selamlar..")
}


// ------------------------------------------------
// sayfa 71

fun page_seventyone(){

    var a : String = "initial"
    println(a)
    val b: Int = 1
    val c = 3

}


// ------------------------------------------------
// sayfa 72

fun page_seventytwo(){


    var neverNull: String = "This can't be null"
    neverNull = "null"

    var nullable: String? = "You can keep a null here"
    nullable = null

    var inferredNonNull = "The compiler assumes non-null"
    inferredNonNull = ""

    fun strLength(notNull: String): Int {
        return notNull.length
    }

    strLength(neverNull)
}


// ------------------------------------------------
// sayfa 73

fun describeString(maybeString: String?): String {
    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}

// ------------------------------------------------
// sayfa 74

class Customer

class Contact(val id: Int, var email: String)



// ------------------------------------------------
// sayfa 75

class MutableStack<E>(vararg items: E) {

    private val elements = items.toMutableList()

    fun push(element: E) = elements.add(element)

    fun peek(): E = elements.last()

    fun pop(): E = elements.removeAt(elements.size - 1)

    fun isEmpty() = elements.isEmpty()

    fun size() = elements.size

    override fun toString() = "MutableStack(${elements.joinToString()})"
}


// ------------------------------------------------
// sayfa 76

fun <E> mutableStackOf(vararg elements: E): MutableStack<E> {
    return MutableStack(*elements)
}


// ------------------------------------------------
// sayfa 77

open class Dog {

    open fun sayHello() {
        println("wow wow!")
    }
}

class Yorkshire : Dog() {

    override fun sayHello() {
        println("wif wif!")
    }
}


// ------------------------------------------------
// sayfa 78

open class Lion(val name: String, val origin: String) {

    fun sayHello() {
        println("$name, the lion from $origin says: graoh!")
    }
}

class Asiatic(name: String) : Lion(name = name, origin = "India") // 1



// ------------------------------------------------
// sayfa 79
interface Drawable {
    fun draw()
}

class Circle(private val radius: Int) : Drawable {
    override fun draw() {
        println("Drawing a circle with radius $radius")
    }
}

class Square(private val sideLength: Int) : Drawable {
    override fun draw() {
        println("Drawing a square with side length $sideLength")
    }
}



// ------------------------------------------------
// sayfa 81

fun page_eightyone() {
    when (val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        Calendar.SUNDAY -> println("mutlu haftasonlari")
        Calendar.SATURDAY -> println("bugun dersin var!")
        Calendar.FRIDAY -> println("ofis saatini kacirma!")
        in Calendar.MONDAY..Calendar.THURSDAY -> println("ise gideceksin , daily'yi kacirma")
        else -> println("Something is wrong with the calendar")
    }
}


//------------------------------------------------
// sayfa 82

fun page_eightytwo() {
    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }
}


//------------------------------------------------
// sayfa 85

fun page_eightyfive() {
    for (i in 0..3) {
        print(i)
    }
    println(" ")

    for (i in 0 until 3) {
        print(i)
    }
    println(" ")

    for (i in 2..8 step 2) {
        print(i)
    }
    println(" ")

    for (i in 3 downTo 0) {
        print(i)
    }
    println(" ")

}


// ------------------------------------------------
// sayfa 86

fun page_eightysix(){
    for (c in 'a'..'d') {
        println(c)
    }

    print(" ")

    for (c in 'z' downTo 's' step 2) {
        println(c)
    }

    print(" ")
}


// ------------------------------------------------
// sayfa 87

fun page_eightyseven(){
    val x = 2
    if (x in 1..5) {
        print("x is in range from 1 to 5")
    }
    println()
    if (x !in 6..10) {
        print("x is not in range from 6 to 10")
    }
}


// ------------------------------------------------
// sayfa 88

fun page_eightyeight(){
    val a: Int = 5
    val b: Int = 5

    val c: Int = 10

    println(a == b) // true
    println(a == c) // false

    val x: Int = 5
    val y: Int = 5

    val z: Int? = x

    println(x === y) // false
    println(x === z) // true

}


// ------------------------------------------------
// sayfa 89

fun page_eightynine(){
    fun max(a: Int, b: Int) = if (a > b) a else b

    println(max(99, -42))

}


// ------------------------------------------------
// sayfa 91

data class Kitap (val ad: String, val yazar: String, val yayinYili: Int)

// ------------------------------------------------
// sayfa 92

/*data class Ogrenci(val ad: String, val numara: Int, val sinif: Int) {
    operator fun myComponent1(): String {
        return ad
    }

    operator fun myComponent2(): Int {
        return numara
    }

    operator fun myComponent3(): Int {
        return sinif
    }
}*/

// ------------------------------------------------
// sayfa 37
data class User(
    val id: Long,
    val username: String,
    val email: String
)
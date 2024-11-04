package org.example

fun setUser(name: String, age: Int): String {
    return "Your name is $name, and you $age years old"
}

fun printUser(name: String) {
    print("Your name is $name")
}

fun getFullName(
    first: String = "Kotlin",
    middle: String = " is ",
    last: String = "Awesome"): String {
    return "$first $middle $last"
}

fun user(): Comparable<*> {
    return (100*90)
}

fun sumNumbers(vararg number: Int): Int {
    return number.sum() //sum tambah semua
}

fun getNumberSize(vararg number: Int): Int {
    return number.size
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    val number = sumNumbers(10, 20, 30, 40) //10+20+30+40
    println(number)

    val user = setUser("Alfian", 19)
    println(user)

    printUser("Alfian\n")

    val number4 = getNumberSize(10, 20, 30, 40, 50)
    println(number4)

    val fullName = getFullName()
    val fullName2 = getFullName(first = "Dicoding")
    println(fullName)
    println(fullName2)

    val name: String? = "Bored AF"
    val ezlength = name?.length //panjang tulisan variabel ez
    val asal = "essay" //langsung kedetect char
    val sisi: Int = 3 //nilai variabel tidak bisa berubah kalo pake val
    var ez = "laps" // kebalikan val
    var eff: String? = null
    val intList = listOf(4, 6, 2, 3, 3, 6) //listOf ketika di print keluar semua isinya
    val intSet = setOf(4, 6,  2, 3, 3, 6) //setOf ketika akan hanya ngeprint isi yang berbeda, yang dipuplicate tidak bisa
    val capital = mapOf( //key dan value, key tidak boleh sama
        //key      to     value
        "Jakarta" to "Indonesia",
        "London" to "England",
        "India" to "Indonesia"
    )
    var vocal = 'D'
    val whatList = mutableListOf ('a', "kenapa", 4, false, user()) //data nya bisa CRUD
//    println(whatList)
//    whatList.add("ajsbfaekbf") //nambah di bagian akhir
//    println(whatList)
//    whatList.add(2, 'w') //nambah di indeks kedua
//    println(whatList)
//    whatList[4] = true //rubah nilai pada indeks ke 3
//    println(whatList)
//    whatList.removeAt(4) //hapus item pada indeks 1
//    println(whatList)
    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
//    println("Hello, " + name + "! " + asal)
//    println("Vocal " + vocal++)
//    println("Vocal " + vocal++)

    val text  = "\n(baris baru) \"(tanda petik 2) Ko\t(tab) tl\\(garis miring) in!\'(petik 1) : \u00A9 (Unicode)"
//    for (char in text){
//        print("$char ")
//    }
    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
        Line 5
        Line F
    """.trimIndent() //biar bisa baris string tanpa /n

//    print(line)
    val hours = 9
//    print("Office ${if (hours > 7) "already close" else "is open"}")
    val openHours = 7
    val now = 7
//    val office: String
//    office = if (now > 7) {
//        "Office already open"
//    } else if (now == openHours){
//        "Wait a minute, office will be open"
//    } else {
//        "Office is closed"
//    }

//    print(office)
    val fafa = text [5]
//    println ("Buat apa $fafa")
    ez = "ups"
    eff = "babyvoid"
    val textlength = eff?.length

//    val maxInt = Long.MAX_VALUE
//    val minInt = Long.MIN_VALUE
//
//    println(maxInt)
//    println(minInt)
    val stringNumber = "23"
    val intNumber = 3

//    print(intNumber + stringNumber.toInt())

    val readableNumber = 100_000_000
//    print(readableNumber)
    val mixArray = arrayOf(1, 3, 5, 7 , "Dicoding" , true)
    val intArray = intArrayOf(1, 3, 5, 7)
//    println(intArray[2])
//    println(mixArray.size)
    val lengthmixArray = mixArray.size
    var i = 0
//    for (item in mixArray){
//
//        println("array [$i] " + item)
//        ++i
//    }
//    var string: String? = "Dicoding"
//    if(string != null) { // smart cast
//        print(string.length) // It works now!
//    }
//
//    var obj: Any = "Dicoding"
//
//    if(obj is String) {
//        // Tidak membutuhkan casting secara eksplisit.
//        println("String length is ${obj.length}")
//    }
    val text2: String? = null //nge set nilai awal jd null
    val text2Length = text2?.length ?: 7 // ini isinya sama dengan val textLength = if (text != null) text.length else 7
    println(text2Length)
    for (i in 0..0) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//        println(textlength)
//        println(ezlength)
//        println("aitsasa "+ez)
//        println(" i = $i")
//        println("integer list " + i + " adalah " + intList[i])
//        println(intList)
//        println(intSet)
//        println(whatList)
//        println(capital["Jakarta"])
//        println(capital.getValue("London"))
//        println(sisi + i)
//        println(if (true) "Always true" else "Always false")
    }
}







package org.example

fun main() {
//    var colorRed = Color.RED
//
//    println(colorRed)

    //break and continue

//    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)
//
//    for (i in listOfInt) {
////        if (i == null) continue //kalo nyampe ke null, null nya bakal diskip dan pindah ke nilai selanjutnya
//        if (i == null) break //kalo nyampe ke null, langsung stop
//        print(i)
//    }

//    loop@ for (i in 1..10) {
//        println("Outside Loop nilai i = $i")
//
//        for (j in 1..10) {
//            println("Inside Loop nilai i = $i nilai j = $j")
//            if ( j > 5) {
//                println("loop berhenti karena nilai j lebih dr 5")
//                break@loop
//            }
//        }
//    }

    //for loop
//    val ranges = 1.rangeTo(10) step 3
//    for (i in ranges ){
//        println("value is $i!")
//    }
//    val ranges2 = 1.rangeTo(10) step 3
//    for ((index, value) in ranges2.withIndex()) { //akses indeks elemen pada ranges dengan withIndex()
//        println("value $value with index $index")
//    }
//    val ranges3 = 1.rangeTo(10) step 4
//    ranges3.forEach { value ->
//        println("value is $value!")
//    }

    //range
//    val rangeInt = 1..10
//    print(rangeInt.step)
//    val rangeInt2 = 1..10 step 3 same with below code
//    val rangeUp = 1.rangeTo(10) step 3 //maju
//    val rangeDown = 10.downTo(1) step 2 // mundur
//    rangeUp.forEach {
//        println("$it ")
//    }
//    val trah = 11
//    if (trah in rangeDown) {
//        rangeDown.forEach { //loop foreach
//            println("$it ")
//            if (trah !in rangeDown) { //cari angka trah di rangeDown
//                println("No value $trah in Range ")
//            }
//        }
//    } else {
//        println ("fffff")
//    }
//    println("Range "+rangeInt2.step)

    //while do while
    var counter = 0
//    while (counter <= 7){
//        println("Hello, World! $counter " +counter)
//        counter++
//    }
//
//    do {
//        println("Hello, World! $counter " +counter)
//        counter++
//    } while (counter <= 7)


    val value = 10

    //WHEN STUFF
//    when(value){
//        6 -> println("mantap")
//        7 -> println(60+500)
//        8 -> {
//            var namaDepan = "Asoy"
//            var namaBelakang = "M dah"
//            println(namaDepan +" "+ namaBelakang)
//            println("$namaDepan $namaBelakang")
//        }else -> println("yahyahyah")
//    }

//    val stringOfValue = when (value) {
//        6 -> "value is 6"
//        7 -> "value is 7"
//        8 -> "value is 8"
//        else -> "value cannot be reached"
//    }
//    println(stringOfValue)

//    val stringOfValue = when (value) {
//        6 -> {
//            println("Six")
//            "value is 6"
//        }
//        7 -> {
//            println("Seven")
//            "value is 7"
//        }
//        8 -> {
//            println("Eight")
//            "value is 8"
//        }
//        else -> {
//            println("undefined")
//            "value cannot be reached"
//        }
//    }
//
//    println(stringOfValue)

//    val anyType : Any = 100L
//    when(anyType){
//        is Long -> println("the value has a Long type")
//        is String -> println("the value has a String type")
//        else -> println("undefined")
//    }

//    var counter = 0
//    while(counter <= 8){
//        println(counter)
//        counter++
//    }

    //if else enum

    val now = 10
    val openOffice = 9

//    if (now > openOffice) {
//        println("Office already open")
//    } else {
//        println("Office close")
//    }

//    val office = if (now > openOffice) "Office already open" else "Office close"
//    println(office)
//
//    val ff = sum(1 , 1 * 4)
//    println(ff)
//
//    val value1 = 10
//    val value2 = 10
//
//    val trah = sum(value1, value2)
//    println(trah)
}

enum class Color {
    RED, BLUE, GREEN
}

fun sum(value1: Int, value2: Int) = value1 + value2
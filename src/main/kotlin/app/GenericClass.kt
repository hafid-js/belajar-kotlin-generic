package app

import data.MyData

fun main() {
    val myData: MyData<String, Int> = MyData<String, Int>("Eko", 100)
    myData.printlnData()

    val myDataInt = MyData(100, "Eko")
    myDataInt.printlnData()
}
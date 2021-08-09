import java.io.File
import java.util.*

private const val PATH = "animal_ascii_files/"

fun main() {
    val animalList = listOf("camel", "lion", "deer", "goose", "bat", "rabbit")
    val message = "Please enter the number of the habitat you would like to view: "
    val end = "See you later!"
    var option = getString(message)

    while (option.lowercase(Locale.getDefault()) != "exit") {
        println("\n" + importAnimal(animalList[getRange(option, 0..animalList.lastIndex)]))
        option = getString(message)
    }
    println(end)
}

fun importAnimal(animal: String): String {
    return File("$PATH$animal.txt").readText()
}

fun getRange(number: String, range: IntRange): Int {
    val num = number.toIntOrNull() ?: -1

    return if (range.contains(num)) num else getRange(getString("Please enter a number within [$range]: "), range)
}

fun getString(message: String): String {
    print(message)
    return readLine()!!
}
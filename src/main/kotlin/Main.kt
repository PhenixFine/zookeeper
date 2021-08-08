import java.io.File

private const val PATH = "animal_ascii_files/"

fun main() {
    val animalList = listOf("camel", "lion", "deer", "goose", "bat", "rabbit")
    val message = "Please enter the number of the habitat you would like to view: "
    val end = "---\nYou've reached the end of the program. To check another habitat, please restart the watcher."
    val option = getRange(message, 0..animalList.lastIndex)

    println(importAnimal(animalList[option]) + "\n$end")
}

fun importAnimal(animal: String): String {
    return File("$PATH$animal.txt").readLines().joinToString("\n")
}

fun getRange(message: String, range: IntRange): Int {
    val num = getString(message).toIntOrNull() ?: -1

    return if (range.contains(num)) num else getRange("Please enter a number within [$range]: ", range)
}

fun getString(message: String): String {
    print(message)
    return readLine()!!.also { println() }
}
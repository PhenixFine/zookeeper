import java.io.File
import java.io.FileNotFoundException
import java.lang.Exception

private const val PATH = "animal_ascii_files/"

fun main() {
    println(importAnimal("camel"))
}

fun importAnimal(animal: String): String {
    return try {
        File("$PATH$animal.txt").readLines().joinToString("\n")
    } catch (e: Exception) {
        when (e) {
            is FileNotFoundException -> "$animal file could not be found"
            else -> "There was an error in loading your file. Please ensure it is not open in another program.\n"
        }
    }
}
fun main() {
    val studentNames: List<String> = listOf("Ahmed", "Laila", "Nour", "Omar", "Salma")

    val studentScores: MutableMap<String, Int> = mutableMapOf(
        "Ahmed" to 85,
        "Laila" to 72,
        "Nour" to 95,
        "Omar" to 55,
        "Salma" to 88
    )

    val graduatedStudents: Set<String> = setOf("Omar", "Salma")

    println("Student Names: $studentNames")
    println("Student Scores: $studentScores")
    println("Graduated Students: $graduatedStudents\n")

    for (name in studentNames) {
        if (name in graduatedStudents) {
            continue
        }
        val score = studentScores[name] ?: "N/A"
        println("$name is still studying with score: $score")
    }

    val searchName = "Nour"
    println("\nScore for $searchName: ${studentScores[searchName]}\n")

    val uppercaseNames = studentNames.map { it.uppercase() }
    println("Uppercase Names: $uppercaseNames")

    val highScorers = studentScores.filter { it.value > 80 }
        .map { it.key }

    println("Students who scored above 80: $highScorers")

    studentScores.filter { it.value > 80 }
        .map { "${it.key.uppercase()}: ${it.value}" }
        .forEach { println(it) }

    val totalScore = studentScores.values.reduce { acc, score -> acc + score }
    println("Total Score of All Students: $totalScore")

    val formattedString = studentScores.entries.fold("") { acc, entry ->
        if (acc.isEmpty()) "${entry.key}: ${entry.value}"
        else "$acc | ${entry.key}: ${entry.value}"
    }
    println("Formatted Student Scores: $formattedString")

    generateStudentReport(studentScores)

}

fun generateStudentReport(scores: Map<String, Int>) {
    if (scores.isEmpty()) {
        println("No student data available.")
        return
    }

    scores.filter { it.value >= 60 }
        .map { "${it.key}: Grade ${it.value}" }
        .forEach { println(it) }
}



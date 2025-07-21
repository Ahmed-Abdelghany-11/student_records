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
}


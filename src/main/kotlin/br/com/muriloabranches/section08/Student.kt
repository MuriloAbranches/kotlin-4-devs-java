package br.com.muriloabranches.section08

data class Student(val name: String, var age: Int)

fun getStudents(): List<Student> {
    return listOf(
        Student("Ada", 19),
        Student("Manuel", 23),
        Student("Maria", 20),
        Student("João", 39),
        Student("José", 16),
    )
}

fun findTheShortestStudentName(students: List<Student>): Student? {
    return students.minByOrNull { it.name.length }
}
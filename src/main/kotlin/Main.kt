
// Create a simple system for College.
// Create classes for Course, Professor and Student.
// Course can have only one professor and students
fun main(args: Array<String>) {

    var prof = Professor()
    var stu = Student()
    var c = Course()

    c.numberOfStudents()
    c.assignProfessor()
    println("professor full name: ${c.professorName()}")
    c.enroll()
    c.courseInfo()
    println("profesor full name: ${prof.fullName}")
    println("student full name: ${stu.fullName}")

}


class Course (){

    var Pro = Professor()
    var Stud = Student()
    //int numberOfStudents()
    fun numberOfStudents(){
        var students = 30
        if(students == 30){
            println("number of student = $students")
        }else{
            println("number of student = $students")
        }
    }


    // boolean assignProfessor(Professor p)
    fun assignProfessor (){
        var profAssigned = true
        if(profAssigned && Pro.Prof1 == 1)"true" else "false"
        println(profAssigned)

    }


    // string professorName()
    fun professorName(): String {
        return Pro.fullName
    }

    // boolean enroll(Student s)
    fun enroll(){
        var enroll = true
        var students = if (enroll){true} else {false}
        println(students)
    }

    // string courseInfo()
    var CourseName = "c1"
        get() {return field }

    var number_of_lectures = 7
        get() {return field }

    fun courseInfo(){
        println("course information: course name:$CourseName , number of lectures: $number_of_lectures, profesor full name: ${Pro.fullName}, student full name: ${Stud.fullName}" )
    }

}

class Professor() {
    var courses = mutableListOf("c1", "c2", "c3")
    var telephone: Int = 0
    var Prof1 = 1

    var firstName:String = "Ahmed"
        get() {return field }

    var lastName:String = "Khalid"
        get() {return field }

    var fullName:String = firstName + lastName
        get() {return "$firstName $lastName"}
}

class Student(){
    var courses = mutableListOf("c1", "c3")

    var firstName:String = "Mohamed"
        get() {return field }

    var lastName: String = "Saad"
        get() {return field }

    var fullName:String = firstName + lastName
        get() {return "$firstName $lastName"}


}

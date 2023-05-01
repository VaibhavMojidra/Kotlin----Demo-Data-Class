//Data classes act as POJO Class for only storing data for example student is class and it has only details of it like name,age just need setter and getter for same. so i this case it has only properties to access that data no functions.

data class Student(var name:String,var age:Int)

fun main(args: Array<String>) {
	var student=Student("Vaibhav Mojidra",23)
	var student2=Student("Riya Mojidra",22)
	
	println("Student 1 Name: ${student.name} and Age: ${student.age}")
	println("Student 2 Name: ${student2.name} and Age: ${student2.age}")
}
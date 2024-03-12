package vn.quocaan05.udemypractice.day2

class Book(val title: String = "Unknown", val author: String = "Anonymous", var yearPublished: Int = 2024) {

}

fun main(){
    val myBook = Book();
    val customBook = Book("Kotlin Book", "Google", 2021)
    customBook.yearPublished = 2022
    println("The book is : ${myBook.title}, ${myBook.author} and published at : ${myBook.yearPublished}")
    println("The book is : ${customBook.title}, ${customBook.author} and published at : ${customBook.yearPublished}")
}
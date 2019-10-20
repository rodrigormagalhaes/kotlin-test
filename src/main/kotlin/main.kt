val name: String? = "Rodrigo"

var greeting: String? = null


fun main() {
    if (greeting != null) {
        println(greeting)
    } else {
        println(name)
    }
}
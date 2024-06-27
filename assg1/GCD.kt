fun main() {
    var a = 56
    var b = 98  
    while (b != 0) {
        val temp = b
        b = a % b
        a = temp
    }
    println("GCD is $a")
}
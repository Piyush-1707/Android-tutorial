fun main() {
    val num = "0120"  
    if (!num.startsWith("0") && num.contains("0")) {
        println("$num is a Duck number.")
    } else {
        println("$num is not a Duck number.")
    }
}
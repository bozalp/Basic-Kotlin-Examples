//Fibonacci-Factorial-Power with Kotlin
fun main() {
    println("Fibonacci with recursive: " + FibRecursive(6))
    fibonacci(6)
    println("Factorial: " + factorial(5))
    println("Factorial with recursive: " + FactorialRecursive(5))
    println("Power: " + Power(5, 3))
}
//****fibonacci
fun FibRecursive(n:Int):Int
{
    if(n<2)
        return n
    else
        return FibRecursive(n-1) + FibRecursive(n-2)
}

fun fibonacci(n:Int)
{
    var x = 1
    var y = 1
    var t = 0
    for(i in 1 until n)
    {
        t = x + y
        x = y
        y = t
        //println(x)
    }
    println("Fibonacci: " + x)
}
//****factorial
fun factorial(n : Int):Int
{
    var s=1
    for(i in 1 until n+1)
        s=s*i
    return s
}
fun FactorialRecursive(n : Int):Int
{
    if(n == 1)
        return n
    else
        return n * FactorialRecursive(n - 1)
}
//****Power
fun Power(m : Int, n : Int):Int//m^n
{
    var s = m
    for(i in 1 until n)
        s = s * m
    return s
}
//bozalp
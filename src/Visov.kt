import kotlinx.coroutines.*
suspend fun main(){
    var Glob1=Global()
    println("Введите значение:")
    var n= readln()!!.toInt()

    GlobalScope.launch {
        for ( i in 0..n)
        Glob1.one(i)
        delay(6000L)
    }
    Glob1.two()
    println("Текст")
    delay(6000L)
}
import kotlinx.coroutines.*
class Global {
    open fun one(i:Int){
        println("текст$i")
    }
    open fun two(){
        println("НЕ текст")
    }
}
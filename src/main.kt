import kotlinx.coroutines.Delay
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import java.io.Console

suspend fun main() = coroutineScope{
    list.forEach {
        delay(500L)
        println(it)
    }
}
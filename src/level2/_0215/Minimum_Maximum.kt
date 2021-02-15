package level2._0215

import java.lang.StringBuilder
import java.util.function.Consumer

class Minimum_Maximum {
    fun solution(s: String): String {
        var answer = ""

        var min : Int
        var max : Int
        var test = ArrayList<Int>()
        s.split(" ").forEach(Consumer { t -> test.add(t.toInt()) }).also {
            min = test.minOrNull()!!
            max = test.maxOrNull()!!
            var builder = StringBuilder()
            answer = builder.apply {
                append(min)
                append(" ")
                append(max)
            }.run { toString() }
        }

        return answer
    }
}

fun main() {
    println(Minimum_Maximum().solution("1 1"))
}
package level2._0215

//https://programmers.co.kr/learn/courses/30/lessons/42746
class MakeBiggestNumber {

    fun solution(numbers: IntArray):String {
        var answer = ""
        var builder = StringBuilder()
        var stringArr = arrayOf<String>()

        numbers.forEach { stringArr += it.toString() }

        stringArr.sortWith { a, b ->
            when {
                a.length == b.length -> b.compareTo(a)
                else -> (b + a).compareTo(a + b)
            }
        }
        stringArr.forEach { builder.append(it) }

        answer = builder.toString()
        if (answer.startsWith("0")) {
            return "0"
        }
        return answer

    }
}



fun main() {
    println(MakeBiggestNumber().solution(intArrayOf(3, 30, 34, 5, 9)))
}
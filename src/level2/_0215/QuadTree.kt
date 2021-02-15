package level2._0215

import java.util.*

class QuadTree {

    private var oneCount = 0
    private var zeroCount = 0

    fun solution(arr: Array<IntArray>): IntArray {
        var answer: IntArray = IntArray(2)

        dfs(arr, 0, 0, arr.size)

        answer[0] = zeroCount
        answer[1] = oneCount

        println("$zeroCount $oneCount")

        return answer
    }

    private fun dfs(arr:Array<IntArray>, i: Int, q:Int, size : Int){
        var one = true
        var zero = true
        for (y in i until i+size){
            for(x in q until q+size){
                if (arr[y][x] == 1){
                    one = false
                }
                else{
                    zero = false
                }
            }
            if (!zero && !one){
                break
            }
        }
        when {
            one -> {
                zeroCount++
            }
            zero -> {
                oneCount++
            }
            else -> {
                dfs(arr, i, q, size/2)
                dfs(arr, i, q+size/2, size/2)
                dfs(arr, i+size/2, q, size/2)
                dfs(arr, i+size/2, q+size/2, size/2)
            }
        }
    }

}

fun main() {
    var arr = arrayOf(intArrayOf(1,1,0,0),intArrayOf(1,0,0,0),intArrayOf(1,0,0,1),intArrayOf(1,1,1,1))

    var quadTree = QuadTree()

    println(quadTree.solution(arr).contentToString())
}
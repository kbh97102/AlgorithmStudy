package level2._0215


class MakePrime {
    fun solution(nums: IntArray): Int {
        var answer = 0
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                for (k in j + 1 until nums.size) {
                    if (isPrime(nums[i] + nums[j] + nums[k])) {
                        answer++
                    }
                }
            }
        }
        return answer
    }

    private fun isPrime(number: Int): Boolean {
        for (i in 2 until Math.sqrt(number.toDouble()).toInt() + 1) {
            if (number % i == 0) {
                return false
            }
        }
        return true
    }

}

fun main() {
    MakePrime().solution(intArrayOf(1, 2, 7, 6, 4))
}
//import java.util.LinkedHashSet
//import java.util.LinkedList
//import kotlin.math.min
//
//fun main() {
//    val name = "ABABAAAAAAABA"
//    Solution().solution(name)
//}
//
//class Solution {
//    var move = Int.MAX_VALUE
//    fun solution(name: String): Int {
//        var answer = 0
//        val visited = BooleanArray(name.length) { false }
//        for (i in name.indices) {
//            if (name[i] == 'A') visited[i] = true
//        }
//        val end = visited.count { !it }
//        println(end)
//        dfs(index = 0, name, visited, 0, 0, end)
//        println(move)
//        return answer
//    }
//
//    fun dfs(index: Int, name: String, visited: BooleanArray, count: Int, depth: Int, end: Int) {
//
//    }
//
//    private fun findLeftRight(index: Int, arr: CharArray, visited: BooleanArray): IntArray {
//        var lCNT = 0
//        var rCNT = 0
//        var leftI = index
//        var rightI = index
//        while (lCNT < arr.size) {
//            if (arr[leftI] != 'A' && !visited[leftI]) break
//            lCNT++
//            leftI = if (leftI - 1 < 0) arr.size - 1 else leftI - 1
//        }
//        while (rCNT < arr.size) {
//            if (arr[rightI] != 'A' && !visited[rightI]) break
//            rCNT++
//            rightI = if (rightI + 1 > arr.size - 1) 0 else rightI + 1
//        }
//        return intArrayOf(leftI, lCNT, rightI, rCNT)
//    }
//
//    private fun findUpDown(c: Char): Int {
//        val up = c.code - 'A'.code
//        val down = 'Z'.code - c.code + 1
//        return min(up, down)
//    }
//}
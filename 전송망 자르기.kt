//import kotlin.math.absoluteValue
//
//fun main() {
//    val n = 9
//    val wires = arrayOf(
//        intArrayOf(1, 3),
//        intArrayOf(2, 3),
//        intArrayOf(3, 4),
//        intArrayOf(4, 5),
//        intArrayOf(4, 6),
//        intArrayOf(4, 7),
//        intArrayOf(7, 8),
//        intArrayOf(7, 9)
//    )
//    Solution().solution(n, wires)
//}
//
//class Solution {
//    fun solution(n: Int, wires: Array<IntArray>): Int {
//        var answer: Int = Int.MAX_VALUE
//        val tree = Array(n + 1) {
//            mutableListOf<Int>()
//        }
//        wires.forEach { wire ->
//            val node1 = wire[0] // 1
//            val node2 = wire[1] // 3
//            tree[node1].add(node2)
//            tree[node2].add(node1)
//        }
//        wires.forEach { wire ->
//            val network1 = bfs(wire[0], wire[1], tree, BooleanArray(n + 1))
//            val network2 = bfs(wire[1], wire[0], tree, BooleanArray(n + 1))
//            answer = answer.coerceAtMost((network1-network2).absoluteValue)
//        }
//        return answer
//    }
//
//    fun bfs(node1: Int, node2: Int, tree: Array<MutableList<Int>>, visited: BooleanArray): Int {
//        var count = 1
//        val queue = ArrayDeque<Int>()
//        visited[node1] = true
//        queue.add(node1)
//        while (queue.isNotEmpty()) {
//            val current = queue.removeFirst()
//            tree[current].forEach { next ->
//                if (!visited[next] && next != node2) {
//                    count++
//                    visited[next] = true
//                    queue.add(next)
//                }
//            }
//        }
//        return count
//    }
//}
//
////class Solution {
////    fun solution(n: Int, wires: Array<IntArray>): Int {
////        var answer: Int = 0
////        val list = LinkedList<LinkedList<Int>>()
////        for(i in 0 until n) {
////            list.add(i, LinkedList<Int>())
////        }
////        val left = mutableListOf<Int>()
////        val right = mutableListOf<Int>()
////        wires.map {
////            println("${it[0]} -> ${it[1]}")
////        }
////        for (i in wires.indices) {
////            list[wires[i][0]-1].add(wires[i][1]-1)
////            list[wires[i][1]-1].add(wires[i][0]-1)
////        }
////        list.forEach {
////            println(it)
////        }
////        val visited = Array<Boolean>(n){ false }
////
////        return answer
////    }
////}
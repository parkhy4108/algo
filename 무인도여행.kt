//import java.util.LinkedList
//import java.util.Queue
//
//fun main() {
//    val maps = arrayOf(
//        "X591X", "X1X5X", "X231X", "1XXX1"
//    )
//    Solution().solution(maps)
//}
//
//data class Node(val y: Int, val x: Int)
//class Solution {
//    fun solution(maps: Array<String>): List<Int> {
//        val answer = mutableListOf<Int>()
//        val visited = Array(maps.size) { BooleanArray(maps[0].length) { false } }
//        for(y in maps.indices) {
//            for(x in maps[0].indices) {
//                if(!visited[y][x] && maps[y][x] != 'X') {
//                    answer.add(isLand(start = Node(y = y, x = x), maps, visited))
//                }
//            }
//        }
//        return if(answer.isEmpty()) listOf(-1) else answer.sorted()
//    }
//
//    private fun isLand(start: Node, maps: Array<String>, visited: Array<BooleanArray>): Int {
//        var land = maps[start.y][start.x].digitToInt()
//        val dy = arrayOf(1,-1,0,0)
//        val dx = arrayOf(0,0,1,-1)
//        val queue : Queue<Node> = LinkedList<Node>()
//        queue.add(start)
//        visited[start.y][start.x] = true
//        while(queue.isNotEmpty()) {
//            val current = queue.remove()
//            for(i in 0 until 4) {
//                val ny = current.y + dy[i]
//                val nx = current.x + dx[i]
//                if(ny !in maps.indices || nx !in maps[0].indices || visited[ny][nx] || maps[ny][nx] == 'X') continue
//                queue.add(Node(ny,nx))
//                visited[ny][nx] = true
//                land += maps[ny][nx].digitToInt()
//            }
//        }
//        return land
//    }
//}
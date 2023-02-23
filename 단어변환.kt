//fun main(){
//    val begin = "hit"
//    val target = "cog"
//    val words = arrayOf("hot", "dot", "dog", "lot", "log", "cog")
//    Solution().solution(begin, target, words)
//}
//
//class Solution {
//    fun solution(begin: String, target: String, words: Array<String>): Int {
//        var answer = 0
//        var cnt = 0
//        if (words.contains(target)) {
//            words.forEach { word ->
//                if(target != word) cnt++
//                else answer = cnt
//            }
//        } else answer = 0
//        println(answer)
//        return answer
//    }
//}
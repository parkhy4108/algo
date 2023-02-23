//fun main(){
//    val s = "aukks"
//    val skip = "wbqd"
//    val index = 5
//    Solution().solution(s, skip, index)
//}
//
//class Solution {
//    fun solution(s: String, skip: String, index: Int): String {
//        var answer: String = ""
//        s.forEach { c ->
//            answer += convertText(c, skip, index)
//        }
//        return answer
//    }
//
//    private fun convertText(c : Char , skip: String, index: Int): Char {
//        var cnt = 0
//        var current = c
//        while(cnt<index) {
//            val next = if(current.code == 'z'.code) 'a' else (current.code+1).toChar()
//            current = next
//            if(!skip.contains(next)) cnt++
//        }
//        return current
//    }
//}
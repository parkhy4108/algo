//fun main() {
//    val n = 2
//    val l: Long = 4
//    val r : Long = 17
//    Solution().solution(n, l, r)
//}
//
//class Solution {
//    fun solution(n: Int, l: Long, r: Long): Int {
//        var answer: Int = 0
//        val arr = intArrayOf(1,1,0,1,1)
//
//        var lVAR = (l-1)/5
//        var lCNT = 0
//        var lSUM = arr.slice(0..((l-1)%5).toInt()).sum()
//        var f = 4
//        var rVAR = (r-1)/5
//        var rCNT = 0
//        var rSUM = arr.slice(0..((r-1)%5).toInt()).sum()
//
//        println("rSUM: $rSUM, lSUM: $lSUM")
//
////        while (lVAR > 0) {
////            lVAR /= 5
////            lCNT++
////        }
//
////        while (lCNT>0) {
////            lSUM += f
////            f *= 4
////            lCNT--
////        }
////
////        f = 4
////
////        while (rVAR > 0) {
////            rVAR /= 5
////            rCNT++
////        }
////
////        while (rCNT>0) {
////            rSUM += f
////            f *= 4
////            lCNT--
////        }
//
//        repeat(5) {
//            println(lVAR)
//            lVAR /= 5
//            lCNT++
//        }
//        println(lCNT)
//
//        repeat(5) {
//            lSUM += f
//            f *= 4
//            lCNT--
//        }
//
//
//        f = 4
//
//        repeat(5){
//            rVAR /= 5
//            rCNT++
//        }
//
//        repeat(5){
//            rSUM += f
//            f *= 4
//            rCNT--
//        }
//
//        println("rSUM: $rSUM, lSUM: $lSUM")
//        answer = rSUM-lSUM
//        println(answer)
//
//        return answer
//    }
//}
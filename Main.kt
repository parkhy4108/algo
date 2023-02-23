//fun main() {
//    val info = arrayOf(
//        "java backend junior pizza 150",
//        "python frontend senior chicken 210",
//        "python frontend senior chicken 150",
//        "cpp backend senior pizza 260",
//        "java backend junior chicken 80",
//        "python backend senior chicken 50"
//    )
//
//    val query = arrayOf(
//        "java and backend and junior and pizza 100",
//        "python and frontend and senior and chicken 200",
//        "cpp and - and senior and pizza 250",
//        "- and backend and senior and - 150",
//        "- and - and - and chicken 100",
//        "- and - and - and - 150"
//    )
//    Solution().solution(info, query)
//}
//
//class Solution {
//    fun solution(info: Array<String>, query: Array<String>): IntArray {
//        var answer: IntArray = intArrayOf()
//
//        return answer
//    }
//}
//
//
//
////class Solution {
////    fun solution(info: Array<String>, query: Array<String>): IntArray {
////        var answer: IntArray = intArrayOf()
////        val m = info.map { it.split(" ") }
////        val queryM = query.map { it.replace(" and ", " ").split(" ") }
////        val list = mutableListOf<Int>()
////        m.forEach { println(it) }
////        println()
////        queryM.forEach { println(it) }
////
////        queryM.forEach { aQuery ->
////            var infoM = m
////            aQuery.forEachIndexed { i, condition ->
////                if (i == aQuery.size - 1) {
////                    if (condition != "-") {
////                        infoM = infoM.filter { it[i].toInt() >= condition.toInt() }
////                    }
////                } else if (condition != "-") {
////                    infoM = infoM.filter { it[i] == condition }
////                }
////            }
////            list.add(infoM.count())
////        }
////        answer = list.sorted().toIntArray()
////        return answer
////    }
////}
//
//

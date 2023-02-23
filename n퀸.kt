//import kotlin.math.max
//
//fun main() {
//    Solution().solution(n = 4)
//}
//
//class Solution {
//    fun solution(n: Int): Int = backtracking(
//        n = n,
//        row = 0,
//        column = mutableListOf(),
//        colHash = HashSet<Int>(),
//        xyDiff = HashSet<Int>(),
//        xySum = HashSet<Int>(),
//        count = 0
//    )
//
//    fun backtracking(
//        n: Int,
//        row: Int,
//        column: MutableList<Int>,
//        colHash: HashSet<Int>,
//        xyDiff: HashSet<Int>,
//        xySum: HashSet<Int>,
//        count: Int
//    ): Int {
//        var cnt = count
//        if (row == n) {
//            return count + 1
//        } else {
//            for (col in 0 until n) {
//                if (!colHash.contains(col) && !xyDiff.contains(row - col) && !xySum.contains(row + col)) {
//                    column.add(col)
//                    colHash.add(col)
//                    xyDiff.add(row - col)
//                    xySum.add(row + col)
//                    cnt = backtracking(n, row + 1, column, colHash, xyDiff, xySum, cnt)
//                    column.removeLast()
//                    colHash.remove(col)
//                    xyDiff.remove(row - col)
//                    xySum.remove(row + col)
//                }
//            }
//        }
//        return cnt
//    }
//}
////    fun backtracking(
////        n: Int,
////        row: Int,
////        column: MutableList<Int>,
////        colHash: HashSet<Int>,
////        xyDiff: HashSet<Int>,
////        xySum: HashSet<Int>,
////        boolean: Boolean
////    ): Boolean {
////        var b = boolean
////        if (row == n) return true
////        else {
////            for (col in 0 until n) {
////                if (!colHash.contains(col) && !xyDiff.contains(row - col) && !xySum.contains(row + col)) {
////                    column.add(col)
////                    colHash.add(col)
////                    xyDiff.add(row - col)
////                    xySum.add(row + col)
////                    b = backtracking(n, row + 1, column, colHash, xyDiff, xySum, boolean)
////                }
////            }
////        }
////        return b
////    }

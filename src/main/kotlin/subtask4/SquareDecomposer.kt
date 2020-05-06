package subtask4

import kotlin.math.*

class SquareDecomposer {

    fun decomposeNumber(number: Int): Array<Int>? {
        val arrTime = Array<Int>(50, {0})
        var arrItog = emptyArray<Int>()
        var i = 0
        var j : Int
        var k = 0
        var ost : Long
        var l : Int
        var indik = 0
        if (number < 0)
            return null
        else{
            while (i < number) {
                ost = number.toDouble().pow(2).toLong()
                if (k > 2){
                    j = number - arrTime[k-2] + 1
                    k = k - 2
                    l = 0
                    while (l < k){
                        ost = ost - arrTime[l].toDouble().pow(2).toLong()
                        l++
                    }
                    i--
                }
                else {
                    j = i + 1
                    k = 0
                }
                while (j < number) {
                    if (((number - j).toDouble().pow(2).toLong() < ost) or ((number - j).toDouble().pow(2).toLong() == ost)) {
                        ost = ost - (number - j).toDouble().pow(2).toLong()
                        arrTime[k] = number - j
                        k++
                    }
                    j++
                }
                i++
                if (ost == 0L) {
                    indik = 1
                    i = number + 1
                }
            }
            if (indik == 1) {
                i = 0
                while (i < k) {
                    arrItog += arrTime[k-i-1]
                    i++
                }
                return arrItog
            } else
                return null
        }
    }
}

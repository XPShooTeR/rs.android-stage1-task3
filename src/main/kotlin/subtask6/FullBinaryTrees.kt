package subtask6

import kotlin.math.*

class FullBinaryTrees {

    fun stringForNodeCount(count: Int): String {

        val strItog = ""
        if (count % 2 == 0)
            return "[]"
        else {
            var i = ((count + 1) / 2)
            var j : Int
            var itogStr = ""
            if (count == 1)
                return "[[0]]"
            if (count == 3)
                return "[[0,0,0]]"
            itogStr += "[[0,0,0"
            while (i > 2) {

                j = 1
                while (j < 2.toDouble().pow(i-1).toInt())
                {
                    j++
                }
                i--
            }
            return strItog
        }
    }
    fun inttobin(inbyn : Int): String {
        var ost = inbyn
        var itogstr = ""
        var itogstrrev = ""
        var i : Int
        while (ost > 1) {
            itogstr += (ost%2).toString()
            if (ost%2 == 1)
                ost = (ost - 1)/2
            else
                ost = ost/2
        }
        itogstr += ost.toString()
        i = itogstr.length
        while (i > 0){
            itogstrrev += itogstr[i-1]
            i--
        }
        return itogstrrev
    }
}

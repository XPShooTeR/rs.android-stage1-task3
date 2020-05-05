package subtask3

class ArrayCalculator {

    fun maxProductOf(numberOfItems: Int, itemsFromArray: Array<Any>): Int {
        var itogSum : Long
        itogSum = 1
        val sizeArr = itemsFromArray.size
        var i = 0
        var j = 0
        var k : Int
        var oneTim : Long
        var twoTim : Long
        var maxEl : Int
        var forChang : Long
        var timeEl : String
        val arrSort = Array<Long>(50, {0})
        while (i < sizeArr) {
            if ((itemsFromArray[i] is Int) or (itemsFromArray[i] is Long)) {
                timeEl = itemsFromArray[i].toString()
                arrSort[j] = timeEl.toLong()
                j++
            }
            i++
        }
        i = 0
        while (i < j){
            k = i
            maxEl = k
            while (k < j){
                if (arrSort[maxEl] < 0)
                    oneTim = arrSort[maxEl] * (-1)
                else
                    oneTim = arrSort[maxEl]
                if (arrSort[k] < 0)
                    twoTim = arrSort[k] * (-1)
                else
                    twoTim = arrSort[k]
                if (oneTim < twoTim)
                    maxEl = k
                k++
            }
            forChang = arrSort[i]
            arrSort[i] = arrSort[maxEl]
            arrSort[maxEl] = forChang
            i++
        }
        i = 0
        if (j < numberOfItems)
            while (i < j){
                itogSum *= arrSort[i]
                i++
            }
        else {
            while (i < numberOfItems) {
                itogSum *= arrSort[i]
                i++
            }
            if (itogSum < 0) {
                forChang = itogSum
                i = numberOfItems - 1
                maxEl = -1
                while (i+1 > 0){
                    if (arrSort[i] < 0){
                        forChang /= arrSort[i]
                        maxEl = i
                        i = -1
                    }
                    i -=1
                }
                i = numberOfItems
                k = -1
                while (i < j){
                    if (arrSort[i] > 0){
                        forChang *=arrSort[i]
                        k = i
                        i = j + 1
                    }
                    i++
                }
                if (k == -1)
                    forChang *=arrSort[maxEl]
                i = numberOfItems - 1
                maxEl = -1
                while (i+1 > 0){
                    if (arrSort[i] > 0){
                        itogSum /= arrSort[i]
                        maxEl = i
                        i = -1
                    }
                    i -=1
                }
                if (maxEl != -1) {
                    i = numberOfItems
                    k = -1
                    while (i < j) {
                        if (arrSort[i] < 0) {
                            itogSum *= arrSort[i]
                            k = i
                            i = j + 1
                        }
                        i++
                    }
                    if (k == -1)
                        itogSum *= arrSort[maxEl]
                }
                if (forChang > itogSum)
                    itogSum = forChang
            }
        }
        if (j == 0)
            return 0
        else
            return itogSum.toInt()
    }
}

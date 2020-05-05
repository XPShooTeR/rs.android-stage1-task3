package subtask1

class PolynomialConverter {

    fun convertToStringFrom(numbers: Array<Int>): String? {
        var itogStr = ""
        var i = 0
        val n = numbers.size
        var timeIntValue = ""
        while (i<n){
            if (i != 0) {
                if (numbers[i] != 0)
                    itogStr = itogStr + " "
                if (numbers[i] > 0) {
                    itogStr = itogStr + "+ "
                    timeIntValue = numbers[i].toString()
                }
                if (numbers[i] < 0) {
                    itogStr = itogStr + "- "
                    timeIntValue = (numbers[i] * (-1)).toString()
                }
                if (numbers[i] != 0) {
                    if (((numbers[i] == 1) or (numbers[i] == -1)) and (i != (n-1)))
                        timeIntValue = ""
                    when (i) {
                        n - 1 -> itogStr = itogStr + timeIntValue
                        n - 2 -> itogStr = itogStr + timeIntValue + "x"
                        else -> itogStr = itogStr + timeIntValue + "x^" + (n - 1 - i).toString()
                    }
                }
            }
            else
                if (i == 0)
                    when (numbers[0]) {
                        1 -> itogStr = itogStr + "x^" + (n - 1).toString()
                        -1 -> itogStr = itogStr + "-x^" + (n - 1).toString()
                        else -> itogStr = itogStr + numbers[0].toString() + "x^" + (n - 1).toString()
                    }
            i++
        }
        if (n>0)
            return itogStr
        else
            return null
    }
}

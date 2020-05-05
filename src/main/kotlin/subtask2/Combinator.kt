package subtask2

class Combinator {

    fun checkChooseFromArray(array: Array<Int>): Int? {
        var itog = 0
        var i = 0
        while (i < array[1] + 1) {
            if (array[0] == (fact(array[1])/(fact(array[1]-i) * fact(i))).toInt()) {
                itog = i
                i = array[1] + 2
            }
            i++
        }
        if (itog > 0)
            return itog
        else
            return null
    }
    fun fact (numb: Int): Long {
        var It : Long
        It = 1
        var i = 1
        while (i < numb + 1) {
            It *= i
            i++
        }
        return It
    }
}

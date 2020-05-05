package subtask5

import kotlin.reflect.KClass

class TelephoneFinder {

    fun findAllNumbersFromGivenNumber(number: String): Array<String>? {
        var timeNumbBeg = ""
        var timeNumbEnd : String
        var j : Int
        var arrNumbPhone = emptyArray<String>()
        if (number[0] == '-')
            return null
        else{
            var i = 0
            while (i < number.length){
                j = i + 1
                timeNumbEnd = ""
                while (j < number.length){
                    timeNumbEnd = timeNumbEnd + number[j]
                    j++
                }
                when (number[i]){
                    '1' -> {
                        arrNumbPhone += (timeNumbBeg + "2" + timeNumbEnd)
                        arrNumbPhone += (timeNumbBeg + "4" + timeNumbEnd)
                    }
                    '2' -> {
                        arrNumbPhone += (timeNumbBeg + "1" + timeNumbEnd)
                        arrNumbPhone += (timeNumbBeg + "3" + timeNumbEnd)
                        arrNumbPhone += (timeNumbBeg + "5" + timeNumbEnd)
                    }
                    '3' -> {
                        arrNumbPhone += (timeNumbBeg + "2" + timeNumbEnd)
                        arrNumbPhone += (timeNumbBeg + "6" + timeNumbEnd)
                    }
                    '4' -> {
                        arrNumbPhone += (timeNumbBeg + "1" + timeNumbEnd)
                        arrNumbPhone += (timeNumbBeg + "5" + timeNumbEnd)
                        arrNumbPhone += (timeNumbBeg + "7" + timeNumbEnd)
                    }
                    '5' -> {
                        arrNumbPhone += (timeNumbBeg + "2" + timeNumbEnd)
                        arrNumbPhone += (timeNumbBeg + "4" + timeNumbEnd)
                        arrNumbPhone += (timeNumbBeg + "6" + timeNumbEnd)
                        arrNumbPhone += (timeNumbBeg + "8" + timeNumbEnd)
                    }
                    '6' -> {
                        arrNumbPhone += (timeNumbBeg + "3" + timeNumbEnd)
                        arrNumbPhone += (timeNumbBeg + "5" + timeNumbEnd)
                        arrNumbPhone += (timeNumbBeg + "9" + timeNumbEnd)
                    }
                    '7' -> {
                        arrNumbPhone += (timeNumbBeg + "4" + timeNumbEnd)
                        arrNumbPhone += (timeNumbBeg + "8" + timeNumbEnd)
                    }
                    '8' -> {
                        arrNumbPhone += (timeNumbBeg + "5" + timeNumbEnd)
                        arrNumbPhone += (timeNumbBeg + "7" + timeNumbEnd)
                        arrNumbPhone += (timeNumbBeg + "9" + timeNumbEnd)
                        arrNumbPhone += (timeNumbBeg + "0" + timeNumbEnd)
                    }
                    '9' -> {
                        arrNumbPhone += (timeNumbBeg + "6" + timeNumbEnd)
                        arrNumbPhone += (timeNumbBeg + "8" + timeNumbEnd)
                    }
                    '0' -> {
                        arrNumbPhone += (timeNumbBeg + "8" + timeNumbEnd)
                    }
                }
                timeNumbBeg = timeNumbBeg + number[i]
                i++
            }
            return arrNumbPhone
        }
    }
}

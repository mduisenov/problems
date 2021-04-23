package problems.easy

fun decryptPassword(s: String): String {
    var i = 0
    val result = StringBuilder()
    val digits = StringBuilder()

    while (i < s.length) {
        val ch = s[i]

        if (Character.isDigit(ch) && ch != '0') {
            digits.append(ch)
            i++
            continue
        }

        if (ch == '*') {
            i++
            continue
        }

        if (i < s.length - 1) {
            val next = s[i + 1]
            if (Character.isUpperCase(ch) && Character.isLowerCase(next)) {
                result.append(next)
                result.append(ch)
                i += 2
                continue
            }
        }

        if (ch == '0') {
            result.append(digits.last())
            digits.deleteCharAt(digits.length - 1)
            i++
            continue
        }

        result.append(ch)
        i++
    }

    return result.toString()
}

// aP1pL5e
fun main(args: Array<String>) {
    val s = "51Pa*0Lp*0e"

    val result = decryptPassword(s)

    println(result)
}


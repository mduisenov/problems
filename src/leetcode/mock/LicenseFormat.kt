package leetcode.mock

fun licenseKeyFormatting(license: String, k: Int): String {
    val fullLicense = license.replace("-", "")

    val res = StringBuilder()
    var i = fullLicense.length / k

    while (i > 0) {
        val index = i * k - k
        val part = fullLicense.substring(index..index + k)
        println(part)
//        res.insert(index, part)
        i--
    }

    return res.toString()
}

fun licenseKeyFormatting2(license: String, k: Int): String {
    val res = StringBuilder()
    var count = 0
    var i = license.length - 1

    while (i >= 0) {
        val char = Character.toUpperCase(license[i])
        if (char == '-')
            i--
        else if (count != 0 && count % k == 0) {
            res.insert(0, '-')
            count = 0
        } else {
            res.insert(0, char)
            count++
            i--
        }
    }

    return res.toString()
}


fun main() {
    val res = licenseKeyFormatting2("5F3Z-2e-9-w", 4)
    print(res)
}
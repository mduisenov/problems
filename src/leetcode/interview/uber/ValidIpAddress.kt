package leetcode.interview.uber

import java.net.Inet6Address
import java.net.InetAddress
import java.util.regex.Pattern


fun validIPAddress(IP: String): String {
    try {
        return if (InetAddress.getByName(IP) is Inet6Address) "IPv6" else "IPv4"
    } catch (e: Exception) { }
    return "Neither"
}


class ValidIpAddress {
    var chunkIPv4 = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])"
    private var pattenIPv4 = Pattern.compile("^($chunkIPv4\\.){3}$chunkIPv4$")
    var chunkIPv6 = "([0-9a-fA-F]{1,4})"
    private var pattenIPv6 = Pattern.compile("^($chunkIPv6\\:){7}$chunkIPv6$")

    fun validIPAddress(IP: String?): String {
        if (pattenIPv4.matcher(IP).matches()) return "IPv4"
        return if (pattenIPv6.matcher(IP).matches()) "IPv6" else "Neither"
    }
}
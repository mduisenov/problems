package leetcode.interview.uber

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val hashMap = hashMapOf<String, List<String>>()
    strs.forEach {
        val key = it.toCharArray().sorted().toString()
        if (hashMap.containsKey(key))
            hashMap[key] = hashMap[key]!!.toMutableList().apply { add(it) }
        else
            hashMap[key] = listOf(it)
    }

    return hashMap.values.toList()
}

fun main() {
    val res = groupAnagrams(arrayOf("eat","tea","tan","ate","nat","bat"))
    print(res)
}
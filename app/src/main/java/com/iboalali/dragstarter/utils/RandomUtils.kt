package com.iboalali.dragstarter.utils

/**
 * Created by iboalali on 07-Oct-20.
 */
class RandomUtils {
    fun generateRandomString(stringLength: Long): String {
        val source = ('0'..'z').toList().toTypedArray()
        return (1..stringLength).map { source.random() }.joinToString("")
    }
}
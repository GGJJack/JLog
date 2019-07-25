package com.hstudio.jlog

import android.util.Log

object JLog {
    private val IS_DEBUG = BuildConfig.DEBUG

    fun printStackTrace() {
        val exception = Exception()
        exception.printStackTrace()
    }

    fun printStackTrace(message: String?) {
        val exception = Exception(message)
        exception.printStackTrace()
    }

    fun d(tag: String, message: String? = null) {
        if (!IS_DEBUG) return
        val log = beautifyLog(message)
        Log.d(tag, log)
    }

    fun e(tag: String, message: String? = null) {
        if (!IS_DEBUG) return
        val log = beautifyLog(message)
        Log.e(tag, log)
    }

    fun i(tag: String, message: String? = null) {
        if (!IS_DEBUG) return
        val log = beautifyLog(message)
        Log.i(tag, log)
    }

    fun w(tag: String, message: String? = null) {
        if (!IS_DEBUG) return
        val log = beautifyLog(message)
        Log.w(tag, log)
    }

    fun v(tag: String, message: String? = null) {
        if (!IS_DEBUG) return
        val log = beautifyLog(message)
        Log.v(tag, log)
    }

    private fun beautifyLog(message: String?): String {
        val ste = Thread.currentThread().stackTrace[4]
        val sb = StringBuilder()
        sb.append("(")
        sb.append(ste.fileName)
        sb.append(":")
        sb.append(ste.lineNumber)
        sb.append(") #")
        sb.append(ste.methodName)
        sb.append(" > ")
        sb.append(message)
        return sb.toString()
    }
}

package com.homework.common.flowstate

import android.os.Message

class State(val status : Status, var message: String?=null) {
companion object{
    fun loading() : State = State(status = Status.LOADING)
    fun success() : State = State(status = Status.SUCCESS)
    fun error(message: String?) : State = State(status = Status.ERROR, message = message)
}
}
enum class Status{
SUCCESS,ERROR,LOADING
}
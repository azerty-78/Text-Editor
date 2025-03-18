package com.kobe.texteditor.Util


sealed class Result<T>(val data: T? = null, val error: Throwable?= null) {
    object Loading: Result<Nothing>()
    class Succes<T>(data: T?): Result<T>(data = data)
    class Error<T>(error: Throwable): Result<T>(error = error)
}
package com.homework.domain.mapper

interface BaseMapper<Input, Output> {
    fun map(input: Input): Output
}
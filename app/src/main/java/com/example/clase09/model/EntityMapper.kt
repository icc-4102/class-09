package com.example.clase08.model

interface EntityMapper<T,V> {

    fun mapFromCached(type: T): V

    fun mapToCached(type: V): T
}
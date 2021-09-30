package com.azatberdimyradov.noteappjatpackcompose.feature_note.domain.unil

sealed class OrderType{
    object Ascending: OrderType()
    object Descending: OrderType()
}

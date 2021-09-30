package com.azatberdimyradov.noteappjatpackcompose.feature_note.presentation.notes

import com.azatberdimyradov.noteappjatpackcompose.feature_note.domain.model.Note
import com.azatberdimyradov.noteappjatpackcompose.feature_note.domain.unil.NoteOrder
import com.azatberdimyradov.noteappjatpackcompose.feature_note.domain.unil.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)

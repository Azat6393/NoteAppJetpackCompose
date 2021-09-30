package com.azatberdimyradov.noteappjatpackcompose.feature_note.presentation.notes

import com.azatberdimyradov.noteappjatpackcompose.feature_note.domain.model.Note
import com.azatberdimyradov.noteappjatpackcompose.feature_note.domain.unil.NoteOrder

sealed class NotesEvent{
    data class Order(val noteOrder: NoteOrder): NotesEvent()
    data class DeleteNote(val note: Note): NotesEvent()
    object RestoreNote: NotesEvent()
    object ToggleOrderSection: NotesEvent()
}

package com.azatberdimyradov.noteappjatpackcompose.feature_note.domain.use_case

import com.azatberdimyradov.noteappjatpackcompose.feature_note.domain.model.Note
import com.azatberdimyradov.noteappjatpackcompose.feature_note.domain.repository.NoteRepository
import com.azatberdimyradov.noteappjatpackcompose.feature_note.domain.unil.NoteOrder
import com.azatberdimyradov.noteappjatpackcompose.feature_note.domain.unil.OrderType
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class GetNotesUseCase(
    private val repository: NoteRepository
) {
    operator fun invoke(
        noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending)
    ): Flow<List<Note>> {
        return repository.getNotes().map { notes ->
            when (noteOrder.orderType){
                is OrderType.Ascending -> {
                    when(noteOrder){
                        is NoteOrder.Date -> notes.sortedBy { it.timestamp }
                        is NoteOrder.Title -> notes.sortedBy { it.title.lowercase() }
                        is NoteOrder.Color -> notes.sortedBy { it.color }
                    }
                }
                is OrderType.Descending -> {
                    when(noteOrder){
                        is NoteOrder.Date -> notes.sortedByDescending { it.timestamp }
                        is NoteOrder.Title -> notes.sortedByDescending { it.title.lowercase() }
                        is NoteOrder.Color -> notes.sortedByDescending { it.color }
                    }
                }
            }
        }
    }
}
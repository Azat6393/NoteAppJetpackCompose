package com.azatberdimyradov.noteappjatpackcompose.feature_note.domain.model

import androidx.compose.ui.graphics.Color.Companion.LightGray
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.azatberdimyradov.noteappjatpackcompose.ui.theme.BabyBlue
import com.azatberdimyradov.noteappjatpackcompose.ui.theme.RedOrange
import com.azatberdimyradov.noteappjatpackcompose.ui.theme.RedPink
import com.azatberdimyradov.noteappjatpackcompose.ui.theme.Violet
import java.lang.Exception

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGray, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String): Exception(message)

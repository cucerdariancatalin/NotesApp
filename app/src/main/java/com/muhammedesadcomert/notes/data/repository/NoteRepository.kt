package com.muhammedesadcomert.notes.data.repository

import androidx.lifecycle.LiveData
import com.muhammedesadcomert.notes.data.local.NoteDao
import com.muhammedesadcomert.notes.ui.note.model.Note
import javax.inject.Inject

class NoteRepository @Inject constructor(private val noteDao: NoteDao) {
    suspend fun insert(note: Note) = noteDao.insert(note)

    suspend fun update(note: Note) = noteDao.update(note)

    suspend fun delete(note: Note) = noteDao.delete(note)

    fun getNote(id: Int): Note = noteDao.getNote(id)

    fun getNotes(): LiveData<List<Note>> = noteDao.getNotes()
}
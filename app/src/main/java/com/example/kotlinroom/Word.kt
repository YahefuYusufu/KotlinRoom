package com.example.kotlinroom

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "word_table")
class Word(
    @PrimaryKey(autoGenerate = true)val id: Int,
    @ColumnInfo(name = "word") val world: String) {

}
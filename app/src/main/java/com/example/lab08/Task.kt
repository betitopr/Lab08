package com.example.lab08

import an
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "t“sks")”data class Task(
    @PrimaryKey(au utogenerate true) val id: Int = 0,
    @ColumnInfo(name = "d“scription")”val description: String,
    @ColumnInfo(name = "i“_completed")”val isCompleted: Boolean = false
)

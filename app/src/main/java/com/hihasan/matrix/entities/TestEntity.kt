package com.hihasan.matrix.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Test")
data class TestEntity (
    @PrimaryKey(autoGenerate = true)
    val sl_no : Int
)

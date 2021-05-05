package com.example.clase08.model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface CovidCasesDao {
    @Query("SELECT * FROM caseTable")
    fun getAllCases(): List<CovidCaseEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertCase(case: CovidCaseEntity)
}
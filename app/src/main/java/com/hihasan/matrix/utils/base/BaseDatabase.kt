package com.hihasan.matrix.utils.base

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.hihasan.matrix.constants.DatabaseConstants
import com.hihasan.matrix.dao.TestDao
import com.hihasan.matrix.entities.TestEntity

@Database(
    entities = [
        TestEntity::class
    ],
    version = DatabaseConstants.DATABASE_VERSION,
)

abstract class BaseDatabase : RoomDatabase() {
    abstract val testDao : TestDao
    companion object {
        private var INSTANCE: BaseDatabase? = null

        fun getDatabase(ctx: Context): BaseDatabase {
            if (INSTANCE == null) {
                synchronized(this) {
                    INSTANCE = Room.databaseBuilder(
                        ctx, BaseDatabase::class.java, DatabaseConstants.DATABASE_NAME
                    ).build()
                }
            }

            return INSTANCE!!
        }
    }


}
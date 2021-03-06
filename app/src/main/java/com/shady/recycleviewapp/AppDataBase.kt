package com.shady.recycleviewapp

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 1, exportSchema = false)
abstract class AppDataBase: RoomDatabase() {
    abstract val userDao: UserDao

    companion object{
        private var INSTSNCE: AppDataBase? = null
        fun getAppDataBase(context: Context): AppDataBase?{
            if (INSTSNCE== null){
                INSTSNCE= Room.databaseBuilder(
                    context.applicationContext,
                    AppDataBase::class.java,
                    "app-database"
                ).build()
            }
            return INSTSNCE
        }
    }

}
package com.shady.recycleviewapp

import androidx.room.*

@Dao
interface UserDao {
    @Insert
    fun insert (user: User)

    @Query("SELECT * From user_table")
    fun getAllUsers(): List<User>

    @Update()
    fun update(user: User)

    @Delete
    fun delete(user: User)

    @Query("SELECT * From user_table where id==:uId")
    fun selectUserById(uId: Int): User
}
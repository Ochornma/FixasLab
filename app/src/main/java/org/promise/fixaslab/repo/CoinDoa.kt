package org.promise.fixaslab.repo

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import org.promise.fixaslab.models.Coins

@Dao
interface CoinDoa {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun upsert(coins: Coins): Long

    @Query("SELECT * FROM coins ORDER BY id ASC")
    fun getCoins(): LiveData<List<Coins>>
}
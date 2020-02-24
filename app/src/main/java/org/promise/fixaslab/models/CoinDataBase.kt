package org.promise.fixaslab.models

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import org.promise.fixaslab.repo.CoinDoa

@Database(entities = [Coins::class], version = 1)
abstract class CoinDataBase: RoomDatabase() {

    abstract val coinDoao: CoinDoa

    companion object {
        @Volatile
        private var instance: CoinDataBase? = null

        fun getInstance(context: Context): CoinDataBase{
            synchronized(this){
                var INSTANCE = instance

                if (INSTANCE == null){
                    instance = Room.databaseBuilder(context.applicationContext,
                    CoinDataBase::class.java,
                    "coin_data_base")
                        .build()
                    instance = INSTANCE
                }

                return INSTANCE!!
            }

        }
    }

}
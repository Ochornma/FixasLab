package org.promise.fixaslab.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "coins")
data class Coins (@PrimaryKey(autoGenerate = false) val id: Int,
                  val name: String,
                  val price_usd: String,
                  val percent_change_1h: String,
                  val symbol: String)
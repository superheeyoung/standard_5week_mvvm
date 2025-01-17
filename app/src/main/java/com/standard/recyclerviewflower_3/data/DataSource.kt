package com.standard.recyclerviewflower_3.data

class DataSource {
    companion object {
        private var INSTANCE : DataSource ?= null
        fun getDataSource() : DataSource {
            return synchronized(DataSource::class) {
                val newInstance = INSTANCE ?: DataSource()
                INSTANCE = newInstance
                newInstance
            }
        }
    }

    fun getFlowerList() = flowerList()

}
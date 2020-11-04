package com.ts.copying_sutra_mvvm.data

class FakeDatabase private constructor() {

    companion object {
        @Volatile private var instance: FakeDatabase? = null

        var quoteDao = FakeQuoteDao()
            private set

        fun getInstance() =
            instance ?: synchronized(this) {
                instance ?: FakeDatabase().also {instance = it}
            }
    }
}




//Singleton parts

// instance = it がよくわからない
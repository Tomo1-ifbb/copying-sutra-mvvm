package com.ts.copying_sutra_mvvm.data

class QuoteRepository private constructor(private val quoteDao: FakeQuoteDao) {

    fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }

    fun getQuotes() = quoteDao.getQuotes()

    companion object {
        @Volatile private var instance: QuoteRepository? = null

        var quoteDao = FakeQuoteDao()
            private set

        fun getInstance(quoteDao: FakeDatabase) =
            instance ?: synchronized(this) {
                instance ?: QuoteRepository(FakeQuoteDao()).also {instance = it}
            }
    }
}

//リポジトリを引用、Fakedatabaseの代わりにコードを返す

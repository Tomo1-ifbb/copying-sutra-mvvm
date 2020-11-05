package com.ts.copying_sutra_mvvm.utilities

import com.ts.copying_sutra_mvvm.data.FakeDatabase
import com.ts.copying_sutra_mvvm.data.QuoteRepository
import com.ts.copying_sutra_mvvm.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance())
        return QuotesViewModelFactory(quoteRepository)
    }
}



//Constructorに何も渡さないため、オブジェクトにすることができる（？）
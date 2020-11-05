package com.ts.copying_sutra_mvvm.ui.quotes

import androidx.lifecycle.ViewModel
import com.ts.copying_sutra_mvvm.data.Quote
import com.ts.copying_sutra_mvvm.data.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository)
    : ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuotes(quote: Quote) = quoteRepository.addQuote(quote)


}


// repository instanceをconstructorに渡す
//
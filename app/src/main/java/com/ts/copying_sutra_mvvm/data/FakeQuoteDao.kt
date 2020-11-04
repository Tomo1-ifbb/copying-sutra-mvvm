package com.ts.copying_sutra_mvvm.data

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class FakeQuoteDao {
    private val quoteList = mutableListOf<Quote>()
    private val quotes = MutableLiveData<List<Quote>>()

    init {
        quotes.value = quoteList
    }

    fun addQuote(quote: Quote) {
        quoteList.add(quote)
        quotes.value = quoteList
    }

    fun getQuotes() = quotes as LiveData<List<Quote>>

}

//Dao == Data Access Object
//データベースのデータ保存、読み出し、修正、削除などを行うための抽象的なInterfaceを提供するもの
//interface：変数とメソッドの型のみを定義したもの

/*
* ◆Dao導入メリット
* プログラム中のデータアクセスに関わる部分をDaoとしてビジネスロジックから分離することで、
* Dao以外の部分がデータベースの変更、修正の影響を受けない設計ができる
*/

//FakeQuoteDao classのみで使うため、private
// mutableList；要素の変更ができるリスト

/*
* ◆Generics
* 「<>」記号で囲まれたデータ型名をクラスやメソッドに付けることで、Integer型やString型などの様々な型に対応する汎用的なクラスやメソッドを作る機能
 */

//<Quote>とすることで、どのdata classが変わるかを指定している

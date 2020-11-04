package com.ts.copying_sutra_mvvm.data

data class Quote(
    val quoteText: String,
    val author: String
) {
    override fun toString(): String {
        return "$quoteText - $author"

    }
}

//データ型を定義
//テキストと書いた人を文字列で定義
//dat classを上書きするのでoverride
//返す文字列、UIとして表示される形式を指定


package com.victor.app.passandodadosentreactivities.dto

//import java.io.Serializable
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Filme(
    val nome: String,
    val descricao: String,
    val avaliacoes: Double,
    val diretor: String,
    val classificacao: Int,
    val distribuidor: String
) : Parcelable

//data class Filme(
//    val nome: String,
//    val descricao: String,
//    val avaliacoes: Double,
//    val diretor: String,
//    val classificacao: Int,
//    val distribuidor: String
//) : Serializable

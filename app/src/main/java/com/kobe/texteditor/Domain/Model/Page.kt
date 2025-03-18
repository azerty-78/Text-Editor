package com.kobe.texteditor.Domain.Model

import androidx.annotation.DrawableRes
import com.kobe.texteditor.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val myPages = listOf(
    Page(
        title = "Le premier titre de notre application",
        description = "la premiere description de notre programme c'est celle ci",
        image = R.drawable.first_img1
    ),
    Page(
        title = "Le deuxieme titre de notre application",
        description = "la deuxieme description de notre programme c'est celle ci",
        image = R.drawable.first_img1
    ),
    Page(
        title = "Le troisieme titre de notre application",
        description = "la troisieme description de notre programme c'est celle ci",
        image = R.drawable.first_img1
    )
)
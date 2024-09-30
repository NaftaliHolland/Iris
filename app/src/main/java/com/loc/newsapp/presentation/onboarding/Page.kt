package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.loc.newsapp.R

data class Page(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val pages = listOf(
    Page(
        title = "First Page",
        description = "Description for the first page Let's try to make this a bit longer, I don't know if this is enough, let's just see",
        image = R.drawable.onboarding1
    ),
    Page(
        title = "Second Page",
        description = "Description for the first page",
        image = R.drawable.onboarding2
    ),
    Page(
        title = "Third Page",
        description = "Description for the first page",
        image = R.drawable.onboarding3
    ),

)
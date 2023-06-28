package com.codigofacilito.tallerecommerce.fragment

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.codigofacilito.tallereccommer.model.Category
import com.codigofacilito.tallerecommerce.component.card.CategoryCard

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun CategoriesFragment(navController: NavController) {
    val categories = Category().getCategories()
    LazyVerticalGrid(cells = GridCells.Fixed(2)) {
        items(categories) {
            CategoryCard(it,
                onItemClick = {

                })
        }
    }
}
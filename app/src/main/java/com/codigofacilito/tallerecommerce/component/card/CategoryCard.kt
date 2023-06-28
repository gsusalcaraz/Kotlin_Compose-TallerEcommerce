package com.codigofacilito.tallerecommerce.component.card

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.codigofacilito.tallereccommer.model.Category

@Composable
fun CategoryCard(
    category: Category, onItemClick: (category: Category) -> Unit
) {
    Card(
        modifier = Modifier
            .padding(15.dp)
            .fillMaxWidth()
            .clickable { onItemClick(category) },
        shape = RoundedCornerShape(16.dp),
        elevation = 5.dp
    ) {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.fillMaxWidth(),
        ) {
            val image: Painter = painterResource(id = category.image)
            Image(
                painter = image, contentDescription = "",
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop
            )

            Text(
                text = category.category,
                style = MaterialTheme.typography.subtitle1.copy(fontWeight = FontWeight.Bold)
            )

        }
    }

}
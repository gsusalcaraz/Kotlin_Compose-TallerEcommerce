package com.codigofacilito.tallerecommerce.component.card

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp

@Composable
fun TagCard(
    tag: String = "", icon: ImageVector = Icons.Default.Add
) {
    Card(
        backgroundColor = MaterialTheme.colors.primary,
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier.padding(3.dp)
    ) {
        if (tag.isNotEmpty())
            Text(
                text = tag,
                modifier = Modifier.padding(10.dp, 5.dp, 10.dp, 5.dp),
                color = MaterialTheme.colors.onPrimary
            )
        else
            Icon(
                icon,
                tint = MaterialTheme.colors.onPrimary,
                contentDescription = "",
                modifier = Modifier.padding(10.dp)
            )
    }

}
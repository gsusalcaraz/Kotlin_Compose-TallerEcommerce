package com.codigofacilito.tallerecommerce.component

import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import com.codigofacilito.tallerecommerce.R

@Composable
fun TextFieldPassBase(
    text: String,
    textValue: MutableState<String>,
    passwordVisible: MutableState<Boolean>
) {
    OutlinedTextField(
        value = textValue.value,
        onValueChange = { textValue.value = it },
        trailingIcon = {
            IconButton(onClick = { passwordVisible.value = !passwordVisible.value }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_remove_red_eye_24),
                    tint = if (passwordVisible.value) MaterialTheme.colors.primary else Color.Gray,
                    contentDescription = ""
                )
            }
        },
        label = {
            Text(
                text = text,
                color = MaterialTheme.colors.onBackground
            )
        },
        singleLine = true,
        visualTransformation = if (passwordVisible.value) VisualTransformation.None else PasswordVisualTransformation()
    )

}
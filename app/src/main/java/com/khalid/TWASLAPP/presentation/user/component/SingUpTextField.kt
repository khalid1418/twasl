package com.khalid.TWASLAPP.presentation.user.component

import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import com.khalid.twasl.R
import androidx.compose.ui.tooling.preview.Preview
import com.khalid.TWASLAPP.presentation.ui.theme.LightGray

@Composable
fun SignUpTextField(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    isPassword: Boolean = false,
    isEmail: Boolean = false,
) {
    var passwordVisibility by remember { mutableStateOf(true) }
    val image = if (passwordVisibility && isPassword) R.drawable.ic_baseline_visibility_off_24
    else if (!passwordVisibility && isPassword) R.drawable.ic_baseline_visibility_24
    else if (isEmail) R.drawable.ic_baseline_email_24
    else null



    TextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(text = label) },
        modifier = modifier,
        colors = TextFieldDefaults.textFieldColors(backgroundColor = LightGray),
        maxLines = 1,
        visualTransformation = if (!passwordVisibility || isEmail) VisualTransformation.None else PasswordVisualTransformation(),
        trailingIcon = {
            IconButton(onClick = { passwordVisibility = !passwordVisibility }) {
                image?.let {
                    Icon(
                        imageVector = ImageVector.vectorResource(id = it),
                        contentDescription = null
                    )
                }

            }
        },
        keyboardOptions = KeyboardOptions(
            keyboardType = if (isPassword) KeyboardType.Password
            else if (isEmail) KeyboardType.Email
            else KeyboardType.Text
        )

    )

}

@Preview(showBackground = true)
@Composable
fun PreviewTextField() {
    SignUpTextField(value = "", onValueChange = {}, label = "email", isEmail = true)
}
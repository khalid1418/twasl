package com.khalid.TWASLAPP.presentation.user.singUp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.khalid.TWASLAPP.presentation.user.component.SignUpTextField
import com.khalid.TWASLAPP.presentation.user.component.SingUpSaveButton
import com.khalid.twasl.R

@Composable
fun SingUp(modifier: Modifier = Modifier) {
    var fullName by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val char = 6


    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        SignUpTextField(
            value = fullName, onValueChange = { fullName = it }, label = stringResource(
                R.string.full_name_hint
            )
        )
        Spacer(modifier = modifier.height(18.dp))

        SignUpTextField(
            value = email,
            onValueChange = { email = it },
            label = stringResource(R.string.email_hint),
            isEmail = true
        )

        Spacer(modifier = modifier.height(18.dp))

        SignUpTextField(
            value = password,
            onValueChange = { if (it.length<=char) password =it },
            label = stringResource(R.string.password_hint),
        isPassword = true)

        Spacer(modifier = modifier.height(30.dp))

        SingUpSaveButton(text = "Save", width = 314.dp, height = 52.dp) {

        }

    }

}

@Preview
@Composable
fun PreviewSignUp() {
    SingUp()
}
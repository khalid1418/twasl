package com.khalid.TWASLAPP.presentation.user.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SingUpSaveButton(
    modifier: Modifier = Modifier,
    text: String,
    width:Dp,
    height:Dp,
    onClick: () -> Unit
) {

    Button(
        onClick = onClick,
        shape = RoundedCornerShape(15.dp),
        modifier = modifier
            .width(width)
            .height(height)
    ) {
        Text(
            text = text,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.SansSerif,
            fontSize = 20.sp,
            color = Color.White
        )
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewButton() {
    Box(modifier = Modifier.fillMaxSize() , contentAlignment = Alignment.Center) {
        SingUpSaveButton(text = "SAVE" , width = 314.dp , height = 52.dp) {

        }

    }
}
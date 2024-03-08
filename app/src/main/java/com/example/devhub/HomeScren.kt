package com.example.devhub

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScren() {

    Column {

        val boxHeight = remember {
            150.dp
        }
        val imageHeight = remember {
            boxHeight

        }
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        Color(0xFF5430B9), shape = RoundedCornerShape(
                            bottomStart = 16.dp,
                            bottomEnd = 16.dp
                        )
                    )
                    .height(boxHeight)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.imagemgithub),
                    contentDescription = "Imagem perfil GitHub",
                    modifier = Modifier
                        .offset(y = imageHeight / 2)
                        .size(imageHeight)
                        .align(Alignment.BottomCenter)
                        .clip(CircleShape)
                )
            }
            Spacer(modifier = Modifier.height(imageHeight / 2))

        Column(
            Modifier
                .padding(8.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,

        ) {

            Text(text = "Bruno de Melo Corbetta", fontSize = 28.sp)
            Text(text = "brunocorbetta", fontSize = 24.sp)
            Text(text = "Desenvolvedor Android", fontSize = 24.sp)
        }
    }
}
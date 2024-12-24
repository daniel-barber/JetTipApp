package com.example.jettipapp.widgets

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults.cardElevation
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

val IconbuttonSizeModifier = Modifier.size(40.dp)
@Composable
fun RoundIconButton(
    modifier: Modifier = Modifier,

    imageVector: ImageVector,
    onClick: () -> Unit,
    tint: Color = Color.Black.copy(alpha = 0.8f),
    backgroundColor: Color = MaterialTheme.colorScheme.onBackground,
    elevation: Dp = 4.dp

){
    Card(
        modifier = modifier.padding(all = 4.dp)
            .clickable { onClick.invoke() }.then(IconbuttonSizeModifier),
        elevation = cardElevation(defaultElevation = elevation),

        shape = CircleShape,
        content =   {
            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier.size(40.dp),
            ){
            Icon(imageVector = imageVector, contentDescription = "Plus or minus icon",
                tint = tint,)}
        }
    )
}
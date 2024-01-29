package com.folashade.composecalculator

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.ui.graphics.vector.ImageVector


@Composable
//fun CalculatorButton(
//    symbol: String,
//    modifier: Modifier,
//
//    onClick : () -> Unit
//){
//    Box(
//        contentAlignment = Alignment.Center,
//        modifier = modifier
//            .aspectRatio(1f)
//            .clickable { onClick()}
//            .then(modifier)
//    ){
//        Text(
//            text = symbol,
//            fontSize = 6.sp,
//            color = Color.Black
//        )
//    }
//
//}
fun CalculatorButton(
    symbol: String? = null,
    icon: ImageVector? = null,
    modifier: Modifier,
    onClick: () -> Unit
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .aspectRatio(1f)
            .clickable { onClick() }
            .then(modifier)
    ) {
        if (symbol != null) {
            Text(
                text = symbol,
                fontSize = 60.sp,
                color = Color.Black
            )
        } else if (icon != null) {
            Icon(
                imageVector = icon,
                contentDescription = null,
                modifier = Modifier.aspectRatio(1f)
            )
        }
    }
}
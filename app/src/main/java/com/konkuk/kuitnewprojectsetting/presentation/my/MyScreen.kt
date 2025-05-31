package com.konkuk.kuitnewprojectsetting.presentation.my

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.konkuk.kuitnewprojectsetting.R
import com.konkuk.kuitnewprojectsetting.core.component.KuitTitle
import com.konkuk.kuitnewprojectsetting.core.util.modifier.noRippleClickable

@Composable
fun MyScreen(modifier: Modifier = Modifier) {
    Column(
        modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        KuitTitle(
            title = "My Screen"
        )
        Spacer(Modifier.height(20.dp))

        Image(
            painter = painterResource(R.drawable.ic_my),
            contentDescription = "My Screen Image",
            modifier = modifier
                .size(50.dp)
                .noRippleClickable { }
        )
    }
}
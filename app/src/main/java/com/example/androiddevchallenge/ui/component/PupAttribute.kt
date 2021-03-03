/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.ui.theme.purple200

@Composable
fun PupAttribute(title: String, property: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.background(color = purple200, shape = RoundedCornerShape(5.dp))
            .padding(5.dp)
            .defaultMinSize(minWidth = 80.dp)

    ) {

        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = title,
            style = TextStyle(color = Color.Black, fontSize = 12.sp, fontWeight = FontWeight.Light)
        )
        Spacer(modifier = Modifier.height(5.dp))

        Text(
            text = property,
            style = TextStyle(color = Color.Black, fontSize = 14.sp, fontWeight = FontWeight.Bold)
        )
        Spacer(modifier = Modifier.height(10.dp))
    }
}

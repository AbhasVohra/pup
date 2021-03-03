package com.example.androiddevchallenge.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.data.PupModel
import com.example.androiddevchallenge.utils.loadImage

@Composable
fun PupCard(pupInfo: PupModel, navigateToDetailsScreen: (PupModel) -> Unit) {
    Box(modifier = Modifier.padding(start = 10.dp, end = 10.dp, top = 5.dp, bottom = 15.dp).border(width = 1.dp, color = MaterialTheme.colors.secondary, shape = RoundedCornerShape(10.dp))) {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(10.dp))
                .background(color = MaterialTheme.colors.background)
                .clickable {
                    navigateToDetailsScreen.invoke(pupInfo)
                }

        ) {

            pupInfo.picture.let {
                val image = loadImage(url = it, defaultImage = R.drawable.ic_pet).value
                image?.let {
                    Image(
                        modifier = Modifier
                            .width(110.dp)
                            .height(110.dp)
                            .clip(RoundedCornerShape(10.dp)),
                        alignment = Alignment.Center,
                        bitmap = it.asImageBitmap(),
                        contentScale = ContentScale.Crop,
                        contentDescription = ""
                    )
                }

            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(110.dp)
                    .padding(10.dp)
            ) {
                Column(
                ) {

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    )
                    {
                        Text(
                            pupInfo.name,
                            style = MaterialTheme.typography.h2.copy(color = MaterialTheme.colors.onPrimary)
                        )

                    }
                    Spacer(modifier = Modifier.size(8.dp))
                    Text(
                        pupInfo.breedName,
                        style = MaterialTheme.typography.body1.copy(color = MaterialTheme.colors.onPrimary),
                    )
                    Spacer(modifier = Modifier.size(8.dp))
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Start
                    )
                    {
                        Icon(
                            painter = painterResource(id = R.drawable.ic_location),
                            tint= MaterialTheme.colors.onPrimary,
                            contentDescription = "",
                            modifier = Modifier
                                .height(24.dp)
                                .width(24.dp)
                        )
                        Text(
                            pupInfo.location,
                            style = MaterialTheme.typography.subtitle2.copy(color = MaterialTheme.colors.onPrimary),
                        )


                    }
                }

            }


        }
    }
}
package com.example.androiddevchallenge.ui.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.data.PupModel

@Composable
fun PupList(pupList: List<PupModel>, navigateToDetailsScreen: (PupModel) -> Unit) {
    Column {
        PupHeader()
        LazyColumn(
            content = {
                items(pupList.size) { index ->
                    PupCard(pupInfo = pupList[index], navigateToDetailsScreen)
                }
            })
    }
}

@Composable
fun PupHeader() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
    ) {
        Spacer(modifier = Modifier.height(5.dp))
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = "Don't buy, adopt!",
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.h3.copy(color = MaterialTheme.colors.onPrimary)
        )
        Spacer(modifier = Modifier.height(10.dp))
    }
}

@Composable
fun MyPupList() {

}
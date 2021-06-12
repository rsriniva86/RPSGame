package com.shyam.rpsgame.ui.composables

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shyam.rpsgame.R

class MainContent {

    companion object {
        @Composable
        public fun mainContent() {

            val modifierValue = Modifier
                .fillMaxSize()
                .background(color = RPSColors.backgroundColor)
            Card(
                modifier = modifierValue
            ) {
                //rpsImage()
                Column(
                    modifier = modifierValue,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Select Play mode",
                        fontSize = 24.sp,
                        color = RPSColors.textColor,
                        textAlign = TextAlign.Center,
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(50.dp))
                    rpsButton("Player vs Computer")
                    Spacer(modifier = Modifier.height(50.dp))
                    rpsButton("Player vs Player")
                }
            }


        }

        @Composable
        private fun rpsImage() {
            Image(
                painter = painterResource(id = R.drawable.rps_launcher),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        top = 5.dp,
                        bottom = 5.dp,
                        start = 5.dp,
                        end = 5.dp
                    )
            )

        }

        @Composable
        fun rpsButton(text: String) {
            val context = LocalContext.current

            Button(
                onClick = {
                    Toast.makeText(
                        context,
                        "${text} Button Clicked",
                        Toast.LENGTH_LONG
                    ).show();
                },

                colors = ButtonDefaults.buttonColors(backgroundColor = RPSColors.buttonBackgroundColor),

                modifier = Modifier
                    .padding(
                        top = 5.dp,
                        bottom = 5.dp,
                        start = 5.dp,
                        end = 5.dp
                    )

            ) {
                Text(
                    text = text,
                    color = RPSColors.textColor
                )
            }
        }
    }

}
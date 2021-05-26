package com.shyam.rpsgame

import android.os.Bundle
import android.widget.Toast
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : AppCompatActivity() {
    /**
     * {@inheritDoc}
     *
     * Perform initialization of all fragments.
     */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            mainContent()
        }
    }

    @Composable
    private fun mainContent() {

        val modifierValue = Modifier
            .fillMaxSize()
            .background(color = Color.White)
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
                    color = Color.White,
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

            colors = ButtonDefaults.buttonColors(backgroundColor = Color.Yellow),

            modifier = Modifier
                .padding(
                    top = 5.dp,
                    bottom = 5.dp,
                    start = 5.dp,
                    end = 5.dp
                )

        ) {
            Text(text = text)
        }
    }


}
package com.example.tugas4

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun KartuProfil(
    nama: String,
    alamat: String,
    warnaKartu: Color,
    warnaAlamat: Color,
    modifier: Modifier = Modifier,
    telepon: String? = null,
    fontNama: FontFamily = FontFamily.Default,
    bobotNama: FontWeight = FontWeight.Bold,
    ukuranNama: TextUnit = 18.sp
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 6.dp),
        colors = CardDefaults.cardColors(containerColor = warnaKartu)
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier.size(70.dp).padding(5.dp)
            )
            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = nama,
                    fontSize = ukuranNama,
                    fontFamily = fontNama,
                    fontWeight = bobotNama,
                    color = colorResource(id = R.color.teks_putih)
                )
                if (telepon != null) {
                    Text(
                        text = telepon,
                        fontSize = 11.sp,
                        color = colorResource(id = R.color.teks_cyan)
                    )
                }
                Text(
                    text = alamat,
                    fontSize = 11.sp,
                    color = warnaAlamat
                )
            }
            Image(
                painter = painterResource(id = R.drawable.logo_umy),
                contentDescription = null,
                modifier = Modifier.size(70.dp).padding(5.dp)
            )
        }
    }
}
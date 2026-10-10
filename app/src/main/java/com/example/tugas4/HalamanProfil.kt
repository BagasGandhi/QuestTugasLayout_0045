package com.example.tugas4

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HalamanProfil(modifier: Modifier = Modifier) {
    val kuning = colorResource(id = R.color.teks_kuning)
    val putih = colorResource(id = R.color.teks_putih)

    Column(
        modifier = modifier.fillMaxSize().padding(top = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(stringResource(R.string.prodi), fontSize = 28.sp, fontWeight = FontWeight.Bold)
        Text(stringResource(R.string.univ), fontSize = 14.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(20.dp))

        KartuProfil(
            nama = stringResource(R.string.nama_1),
            alamat = stringResource(R.string.alamat_1),
            warnaKartu = colorResource(R.color.card_1_bg),
            warnaAlamat = kuning,
            fontNama = FontFamily.Cursive,
            bobotNama = FontWeight.Normal,
            ukuranNama = 22.sp
        )
    }
}
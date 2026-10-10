package com.example.tugas4

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

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
) {}
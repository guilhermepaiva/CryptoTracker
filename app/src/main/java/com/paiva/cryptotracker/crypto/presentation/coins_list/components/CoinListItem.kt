package com.paiva.cryptotracker.crypto.presentation.coins_list.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.paiva.cryptotracker.crypto.domain.Coin
import com.paiva.cryptotracker.crypto.presentation.models.CoinUi
import com.paiva.cryptotracker.crypto.presentation.models.DisplayableNumber
import com.paiva.cryptotracker.crypto.presentation.models.toCoinUi
import com.paiva.cryptotracker.ui.theme.CryptoTrackerTheme

@Composable
fun CoinListItem(
    coinUi: CoinUi,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
   Row(
       modifier = modifier
           .clickable(onClick = onClick)
           .padding(16.dp),
       verticalAlignment = Alignment.CenterVertically,
       horizontalArrangement = Arrangement.spacedBy(16.dp)
   ) {
       Icon(
           imageVector = ImageVector.vectorResource(id = coinUi.iconRes),
           contentDescription = coinUi.name,
           tint = MaterialTheme.colorScheme.primary,
           modifier = modifier.size(85.dp)
       )

   }
}

@Preview(showBackground = true)
@Composable
fun CoinListItemPreview() {
    CryptoTrackerTheme {
        CoinListItem(
            coinUi = previewCoin,
            onClick = {}
        )
    }
}

internal val previewCoin = Coin(
    id = "bitcoin",
    name = "Bitcoin",
    symbol = "BTC",
    rank = 1,
    priceUsd = 25000.0,
    marketCapUsd = 100000000.0,
    changePercent24Hr = 0.1
).toCoinUi()
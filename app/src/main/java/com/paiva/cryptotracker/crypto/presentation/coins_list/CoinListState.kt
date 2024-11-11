package com.paiva.cryptotracker.crypto.presentation.coins_list

import androidx.compose.runtime.Immutable
import com.paiva.cryptotracker.crypto.domain.Coin
import com.paiva.cryptotracker.crypto.presentation.models.CoinUi

@Immutable
data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<CoinUi> = emptyList(),
    val selectedCoin: CoinUi? = null
)

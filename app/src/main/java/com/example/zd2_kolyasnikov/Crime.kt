package com.example.zd2_kolyasnikov

import java.util.*

data class Crime(var id: UUID = UUID.randomUUID(),
                 var title: String = "",
                 var date: Int = 0,
                 var isSolved: Boolean = false)
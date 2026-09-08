package com.mca.androidseminar2026.model

/** 검색 결과 목록에서 작품 한 개를 보여 주기 위한 정보입니다. 이 타입의 형태는 변경하지 마세요. */
data class ContentListItemUiModel(
    val id: String,
    val typeLabel: String,
    val title: String,
    /** 책은 작가, 영화는 감독 이름입니다. */
    val creator: String,
    val year: String,
    val reviewSummary: String = "",
)

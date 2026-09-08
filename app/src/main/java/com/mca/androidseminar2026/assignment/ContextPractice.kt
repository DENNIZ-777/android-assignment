package com.mca.androidseminar2026.assignment

import android.content.Context

/**
 * [과제 구현 파일 2]
 *
 * Toast와 Dialog에 필요한 Context가 왜 다른지 생각하며 TODO를 구현하세요.
 *
 */
object ContextPractice {
    fun showSavedToast(
        activityContext: Context,
        applicationContext: Context,
    ) {
        // 선택한 Context:
        // 이 Context를 사용해야 하는 이유:
        TODO("TODO 6. 두 Context 중 하나만 사용해 저장 완료 Toast를 띄우세요.")
    }

    fun showClearConfirmation(
        activityContext: Context,
        applicationContext: Context,
        onConfirmed: () -> Unit,
    ) {
        // 선택한 Context:
        // 이 Context를 사용해야 하는 이유:
        TODO("TODO 7. 두 Context 중 하나만 사용해 전체 기록 삭제 확인 Dialog를 띄우세요.")
    }
}

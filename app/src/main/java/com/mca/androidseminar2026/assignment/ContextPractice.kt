package com.mca.androidseminar2026.assignment

import android.content.Context
import android.widget.Toast

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
        // 선택한 Context: applicationContext
        // 이 Context를 사용해야 하는 이유: Toast는 Activity의 화면에 붙는 UI가 아니므로,
        // Activity의 생명 주기에 영향받지 않는 applicationContext로도 안전하게 표시할 수 있습니다.
        // TODO 6. 두 Context 중 하나만 사용해 저장 완료 Toast를 띄우세요.
        Toast.makeText(applicationContext, "감상 기록을 저장했습니다.", Toast.LENGTH_SHORT).show()
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

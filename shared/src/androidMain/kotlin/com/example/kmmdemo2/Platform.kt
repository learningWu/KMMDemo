package com.example.kmmdemo2

/**
 * android 平台差异化代码
 */
actual class Platform actual constructor() {
    actual val platform: String = "Android ${android.os.Build.VERSION.SDK_INT}"
}
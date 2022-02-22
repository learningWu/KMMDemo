package com.example.kmmdemo2

import platform.UIKit.UIDevice

/**
 * ios 平台差异化代码
 */
actual class Platform actual constructor() {
    actual val platform: String = UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}
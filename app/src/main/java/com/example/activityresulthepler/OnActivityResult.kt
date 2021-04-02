package com.example.activityresulthepler

typealias ResultCode = Int

annotation class OnActivityResult {

    @Target(AnnotationTarget.FUNCTION)
    annotation class WithRequestCode(val requestCode: Int)

    @Target(AnnotationTarget.FUNCTION)
    annotation class WithResultCode(val resultCode: Int)

    @Target(AnnotationTarget.FUNCTION)
    annotation class WithCodes(val resultCode: Int, val requestCode: Int)
}

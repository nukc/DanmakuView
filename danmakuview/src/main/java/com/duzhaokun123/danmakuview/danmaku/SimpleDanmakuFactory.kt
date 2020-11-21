package com.duzhaokun123.danmakuview.danmaku

class SimpleDanmakuFactory {
    enum class Type {
        R2L_DANMAKU, BOTTOM_DANMAKU, TOP_DANMAKU, L2R_DANMAKU, SPECIAL_DANMAKU
    }

    fun create(type: Type): Danmaku {
        return when(type) {
            Type.R2L_DANMAKU -> R2LDanmaku()
            Type.BOTTOM_DANMAKU -> BottomDanmaku()
            Type.TOP_DANMAKU -> TopDanmaku()
            Type.L2R_DANMAKU -> L2RDanmaku()
            Type.SPECIAL_DANMAKU -> SpecialDanmaku()
        }
    }
}
package com.endo_takumi.checkwork_count

import android.R
import android.content.Context
import android.util.AttributeSet
import android.widget.TextView


class CountView : TextView {
    var count = 0

    constructor(context: Context) : super(context, null) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs) {
        init()
    }

    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr) {
        init()
    }

    private fun init() {
        text = count.toString()

        setOnLongClickListener {
            count = 0
            text = count.toString()
            true
        }

        setOnClickListener {
            count++
            text = count.toString()
        }

    }
}
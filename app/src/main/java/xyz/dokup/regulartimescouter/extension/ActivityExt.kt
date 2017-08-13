package xyz.dokup.regulartimescouter.extension

import android.app.Activity
import android.content.Intent
import xyz.dokup.regulartimescouter.view.util.Page

/**
 * Created by e10dokup on 2017/08/13.
 */
inline fun Activity.go(page: Page, f: (intent: Intent) -> Intent) = startActivity(f(page.intent(applicationContext)))

fun Activity.go(page: Page) = startActivity(page.intent(applicationContext))
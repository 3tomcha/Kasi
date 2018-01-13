package site.kobatomo.kasi

import android.app.PendingIntent.getActivity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.webkit.WebView
import kotlinx.android.synthetic.main.activity_pre.*

/**
 * Created by tomoya on 2018/01/07.
 */

class PreActivity : FragmentActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pre)
        Log.d("感とか", "santoka")


//        if(WebView!=null) {
//            WebView.getSettings().javaScriptEnabled = true
//            WebView.addJavascriptInterface(WebAppInterface(this), "Android")
//            WebView.loadUrl("file:///android_asset/htmlresource.html")
//        }
    }
}
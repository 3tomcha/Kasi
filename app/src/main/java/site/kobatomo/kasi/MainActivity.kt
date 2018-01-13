package site.kobatomo.kasi

import android.app.Activity
import android.os.AsyncTask
import android.os.Bundle
import android.os.Handler
import android.support.v4.app.FragmentActivity
import android.text.TextUtils.isEmpty
import android.util.Log
import android.webkit.JavascriptInterface
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.concurrent.thread
import site.kobatomo.kasi.MainActivity.SubThread
import site.kobatomo.kasi.R.id.webview_main


class MainActivity : FragmentActivity() {

    private lateinit var webappinterface: WebAppInterface

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sub = SubThread()
        sub.start()

        webappinterface = this.application as WebAppInterface
        setChoice()
//        javaScript()

    }

    inner class SubThread : Thread {
        private val mHandler = Handler()
        constructor()

        override fun run() {
            mHandler.post {
                if (webview_main != null) {
                    webview_main.getSettings().javaScriptEnabled = true
                    webview_main.addJavascriptInterface(WebAppInterface(), "Android")
                    webview_main.loadUrl("file:///android_asset/htmlresource.html")
                }
            }
        }
    }


    private fun setChoice(){
        webappinterface.Log()
        if(webappinterface.put_llicname.isEmpty()){
            Thread.sleep(10000)
        }else {
//        member_name1.text=webappinterface.getLlicName()
            member_name2.text = "左bんとか"
            member_name3.text = ""
            member_name4.text = ""
        }
    }



//    private fun javaScript(){
//    webview_main.post(Runnable() {
//        run() {
//            webview_main.loadUrl("file:///android_asset/htmlresource.html")
//        }
//    });
//    }




//    private fun searchQuestion(){
//        try {
//            val doc = Jsoup.connect("https://www.uta-net.com/artist/19868/").get()
//            Log.d("log", doc.title())
//            val newsHeadlines = doc.select("div")
//
//                Log.d("log", newsHeadlines.toString())
//        }
//        catch (ie:IOException){
//            Log.d("ログ","santoka");
//        }

//    }

}

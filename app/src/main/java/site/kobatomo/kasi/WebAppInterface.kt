/**
 * Created by tomoya on 2018/01/07.
 */
package site.kobatomo.kasi

import android.app.Activity
import android.app.Application
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.support.v4.content.ContextCompat.startActivity
import android.util.Log
import android.webkit.JavascriptInterface
import java.io.*

import java.util.ArrayList

/**
 * Created by tomoya on 2017/12/27.
 */

//class WebAppInterface : Serializable {

    public class WebAppInterface : Application {

    public val url_list = ArrayList<ArrayList<*>>()

    public var mContext: Context? = null
    public var MainActivity: Activity? = null

    public var put_url: ArrayList<String> = ArrayList<String>()
    public var put_llic: ArrayList<String> = ArrayList<String>()
    public var put_llicname: ArrayList<String> = ArrayList<String>()


    constructor()
    constructor(c: Context) {
        mContext = c
    }

    constructor(activity: Activity) {
        MainActivity = activity
    }


    @JavascriptInterface
    fun LogThis1() {
        Log.d("ログ完了", "ログログ1")
    }

//    @JavascriptInterface
//    fun LogThis2() {
//        Log.d("ログ完了", "ログログ2")
//    }


    @JavascriptInterface
    fun putURLList(add_url: String?) {
        if (add_url != null) {
            put_url?.add(add_url)
        }
    }



    @JavascriptInterface
    fun putLlic(add_llic: String) {
        if (add_llic.equals("")) {
        } else {
            put_llic.add(add_llic)
        }
    }

    @JavascriptInterface
    fun putLlicName(add_llic: String) {
        if (add_llic.equals("")) {
        } else {
            put_llicname.add(add_llic)
        }
        }

    fun getLlicName(): String {
        return put_llicname.get(0)
    }




    fun Log(){
        Log.d("感とか","さんとか")
    }

    }









package com.example.firebaseanalytics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.textclassifier.SelectionEvent
import com.google.firebase.analytics.FirebaseAnalytics


class MainActivity : AppCompatActivity() {
    private lateinit var Analytics : FirebaseAnalytics;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

      var  FirebaseAnalytics = FirebaseAnalytics.getInstance(this);
        button.setOnClickListener{
            selectContentEvent("image1","ImageView","image")("image1","ImageView","image")

        }
        button2.setOnClickListener{

            trackScreenEvent()

        }
    }

    fun SelectContentEvent(id:String,name:String,content_Type:String,){

        analytics.logEvent(FirebaseAnalytics.Event.SELECT_CONTENT){
            param(FirebaseAnalytics.Param.ITEM_ID,id)
            param(FirebaseAnalytics.Param.ITEM_NAME,name)
            param(FirebaseAnalytics.Param.CONTENT_TYPE,content_Type)
        }
    }
    fun trackScreenEvent(){
        analytics.logEvent(FirebaseAnalytics.Event.SCREEN_VIEW){

            param(FirebaseAnalytics.Param.SCREEN_NAME,"main")
            param(FirebaseAnalytics.Param.SCREEN_CLASS,"MainActivity")

        }

    }
}
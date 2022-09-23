package com.gtappdevelopers.draganddrop

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.jmedeisis.draglinearlayout.DragLinearLayout

class MainActivity : AppCompatActivity() {
    lateinit var containerDL: DragLinearLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        containerDL = findViewById(R.id.containerChild)

        Log.e("tag", "child count is : " + containerDL.getChildAt(4));
        for (i in 0..containerDL.childCount-1) {
            var child: View = containerDL.getChildAt(i)
            containerDL.setViewDraggable(child, child)
        }
    }
}
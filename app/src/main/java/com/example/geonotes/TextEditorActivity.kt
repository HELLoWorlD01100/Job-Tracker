package com.example.geonotes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class TextEditorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_editor)
        setSupportActionBar(findViewById(R.id.teditor_toolbar))
    }
}
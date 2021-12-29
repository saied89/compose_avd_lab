package home.saied.avdlap

import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var isChecked = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val iv = findViewById<ImageView>(R.id.searchback)
        iv.setOnClickListener {
            isChecked = !isChecked
            val stateSet = intArrayOf(android.R.attr.state_checked * if (isChecked) 1 else -1)
            iv.setImageState(stateSet, true)
        }
    }
}
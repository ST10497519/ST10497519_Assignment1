package za.co.varsitycollege.st10497519.st10497519_assignment1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        var timeInput: EditText
        var suggestButton: Button
        var suggestionText: TextView
        var resetButton: Button

        timeInput = findViewById(R.id.editTextTime)
        suggestButton = findViewById(R.id.suggestbutton)
        suggestionText = findViewById(R.id.suggestionTextView)
        resetButton = findViewById(R.id.resetbutton)

        }
    }

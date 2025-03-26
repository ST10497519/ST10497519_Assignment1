package za.co.varsitycollege.st10497519.st10497519_assignment1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
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

        suggestButton.setOnClickListener {

            // Time of day from input
            val timeOfDay = timeInput.text.toString().trim().lowercase()
            // Valid times of the day able to be entered
            val validTimesOfDay =
                listOf("morning", "mid-morning", "afternoon", "mid-afternoon", "dinner")

            if (timeOfDay.isEmpty() || !validTimesOfDay.contains(timeOfDay)) {
                // Show AlertDialog if input is empty
                val builder = AlertDialog.Builder(this)
                builder.setTitle("Input Required")
                builder.setMessage("Please enter a valid time of day (e.g., morning, mid-morning, afternoon, mid-afternoon, dinner)")
                builder.setPositiveButton("OK") { dialog, _ ->
                    dialog.dismiss() // Dismiss dialog when OK is clicked
                }
                builder.create().show()

                suggestionText.text = "Please enter a time of day!"
                return@setOnClickListener
            }

        }
    }
}

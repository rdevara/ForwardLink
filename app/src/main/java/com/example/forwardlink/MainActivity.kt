import androidx.appcompat.app.AppCompatActivity
import android.widget.Toast
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.example.forwardlink.R

class MainActivity : AppCompatActivity() {

    private lateinit var editTextMobileNumber: EditText
    private lateinit var buttonSave: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Link the layout XML

        // Initialize UI elements
        editTextMobileNumber = findViewById(R.id.editTextMobileNumber)
        buttonSave = findViewById(R.id.buttonSave)

        // Add a click listener to the "Save" button
        buttonSave.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                // Retrieve the mobile number from the EditText
                val mobileNumber = editTextMobileNumber.text.toString()

                // Add your logic here to save the mobile number
                // For simplicity, we'll just display it in a Toast message
                // Replace this with your actual saving logic
                showToast("Mobile Number: $mobileNumber")
            }
        })
    }

    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}

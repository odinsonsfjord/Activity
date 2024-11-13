package otus.gpb.homework.activities.receiver

import android.graphics.drawable.Drawable
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

const val TITLE_KEY = ""
const val YEAR_KEY = ""
const val DESCR_KEY = ""

class ReceiverActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receiver)

        val title: String = intent.extras?.getString(TITLE_KEY)?: ""
        val year: String = intent.extras?.getString(YEAR_KEY)?: ""
        val description: String = intent.extras?.getString(DESCR_KEY)?: ""

        fun getDrawable(): Drawable? {
           return when(title) {
               "Interstellar" -> ContextCompat.getDrawable(this, R.drawable.interstellar)
               "Славные парни" -> ContextCompat.getDrawable(this, R.drawable.niceguys)
                else -> null
            }
        }

            findViewById<TextView>(R.id.titleTextView).text = title
            findViewById<TextView>(R.id.yearTextView).text = year
            findViewById<TextView>(R.id.titleTextView).text = description
            findViewById<ImageView>(R.id.posterImageView).setImageDrawable(getDrawable())

    }
}

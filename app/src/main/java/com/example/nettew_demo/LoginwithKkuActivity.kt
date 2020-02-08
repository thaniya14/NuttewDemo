package com.example.nettew_demo

import android.R.attr.password
import android.content.Intent
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentActivity
import com.google.firebase.auth.FirebaseAuth



private val mAuth: FirebaseAuth? = null

class LoginwithKkuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loginwith_kku)
    }

    fun sendKKumail(view: View)
    {
        val kkumail = findViewById<EditText>(R.id.kkumail)

        val kkupass = findViewById<EditText>(R.id.kkupass)

        val intent = Intent(this,MainActivity::class.java)
        mAuth!!.signInWithEmailAndPassword(kkumail.text.toString(),kkupass.text.toString())
            .addOnCompleteListener(
                this
            ) { task ->
                if (task.isSuccessful) { // Sign in success, update UI with the signed-in user's information
               //     Log.d(FragmentActivity.TAG, "signInWithEmail:success")
                    val user = mAuth.currentUser
                    intent.apply { putExtra(EXTRA_MESSAGE,user) }
                } else {
                    intent.apply { putExtra(EXTRA_MESSAGE,"can't")}
                }

            }
        startActivity(intent);
    }
    /*
    override fun onStart() {
        super.onStart()
        // Check if user is signed in (non-null) and update UI accordingly.
        val currentUser = mAuth!!.currentUser
    }*/


}

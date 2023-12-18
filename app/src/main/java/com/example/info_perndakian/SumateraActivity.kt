package com.example.info_perndakian

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.info_perndakian.api.ApiConfig
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SumateraActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sumatera)

        val sumatera = findViewById<RecyclerView>(R.id.rvsumatera)
        ApiConfig.getService().getGunung().enqueue(object : Callback<ResponseSumatera> {
            override fun onResponse(
                call: Call<ResponseSumatera>,
                response: Response<ResponseSumatera>
            ) {
                if (response.isSuccessful) {
                    val responseSumatera = response.body()
                    val dataGunung = responseSumatera?.data
                    val sumateraAdapter = SumateraAdapter (dataGunung)
                    sumatera.apply {
                        layoutManager = LinearLayoutManager(this@SumateraActivity)
                        setHasFixedSize(true)
                        sumateraAdapter.notifyDataSetChanged()
                        adapter = sumateraAdapter
                    }
                }
            }

            override fun onFailure(call: Call<ResponseSumatera>, t: Throwable) {
                Toast.makeText(applicationContext, t.localizedMessage, Toast.LENGTH_SHORT).show()
                }
        })
        val actButton= findViewById<Button>(R.id.button)

        actButton.setOnClickListener {
            val intent = Intent(this, DashboardActivity::class.java)
            startActivity(intent)
            }
    }
}
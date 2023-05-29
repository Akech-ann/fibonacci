package com.example.fibonnacci


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.fibonnacci.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        fibonacci()

    }

    fun fibonacci() {
        var numb1 = 0
        var numb2 = 1
        var c: Int

        var numb= mutableListOf<Int>(numb1,numb2)
        while (true) {
            c = numb1 + numb2
            if (c > 100)
                break

            numb.add(c)

            numb1 = numb2
            numb2 = c
        }


        binding.tvName.layoutManager=LinearLayoutManager(this)
        var numbersAdapter=valuesRVAdapter(numb)
        binding.tvName.adapter=numbersAdapter
    }

}

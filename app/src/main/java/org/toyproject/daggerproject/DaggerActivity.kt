package org.toyproject.daggerproject


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity



import dagger.hilt.android.AndroidEntryPoint
import org.toyproject.daggerproject.databinding.ActivityMainBinding
import javax.inject.Inject

@AndroidEntryPoint
class DaggerActivity : AppCompatActivity() {

    @Inject
    lateinit var repository: TestRepo

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = repository.getUser()

        val userId = user.id
        val userName = user.name

        binding.userId.text = userId.toString()
        binding.userName.text =  userName

        /*  DaggerRepositoryComponent
              .builder()
              .build()
              .injectIntoActivity(this)*/


    }
}
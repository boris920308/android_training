package hoon.example.hoon_di

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UserViewModel : ViewModel() {
    private val userRepository = UserRepository()

    private val _userName = MutableLiveData<String>()
    val userName: LiveData<String> = _userName

    fun loadUserName() {
        val name = userRepository.getUserName()
        _userName.value = name
    }
}
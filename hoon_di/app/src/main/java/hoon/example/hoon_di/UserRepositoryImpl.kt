package hoon.example.hoon_di

import javax.inject.Inject

class UserRepositoryImpl @Inject constructor() : UserRepositoryInterface {
    override fun getUserName(): String {
        return "hoon"
    }
}
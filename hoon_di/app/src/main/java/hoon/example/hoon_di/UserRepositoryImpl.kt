package hoon.example.hoon_di

class UserRepositoryImpl : UserRepositoryInterface {
    override fun getUserName(): String {
        return "hoon"
    }
}
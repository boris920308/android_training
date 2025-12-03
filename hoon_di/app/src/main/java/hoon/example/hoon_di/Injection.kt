package hoon.example.hoon_di

object Injection {
    private val userRepository: UserRepositoryInterface by lazy {
        UserRepositoryImpl()
    }

    fun provideUserViewModelFactory(): UserViewModelFactory {
        return UserViewModelFactory(userRepository)
    }
}
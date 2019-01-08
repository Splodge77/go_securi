package example.epsi.com.go_securi.presentation

import example.epsi.com.go_securi.ui.LoginView

interface LoginPresenter : BasePresenter<LoginView> {

    fun onLoginTapped()
}
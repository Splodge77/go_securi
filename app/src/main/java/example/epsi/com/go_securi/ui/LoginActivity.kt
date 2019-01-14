package example.epsi.com.go_securi.ui

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import example.epsi.com.go_securi.R
import example.epsi.com.go_securi.common.onClick
import example.epsi.com.go_securi.loginPresenter
import example.epsi.com.go_securi.presentation.LoginPresenter
import kotlinx.android.synthetic.main.activity_login.*


class LoginActivity : AppCompatActivity(), LoginView {
    override fun showLoginError() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onLoginSuccess() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    private val presenter : LoginPresenter by lazy { loginPresenter()}

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_login)
        presenter.setView(this)
        initUi()
    }

    private fun initUi() {
        loginButton.onClick { presenter.onLoginTapped()}
    }
}
package example.epsi.com.go_securi.presentation.implementation

//import example.epsi.com.go_securi.common.isPasswordValid
import example.epsi.com.go_securi.firebase.authentication.FirebaseAuthenticationInterface
import example.epsi.com.go_securi.firebase.database.Inject
import example.epsi.com.go_securi.model.LoginRequest
import example.epsi.com.go_securi.presentation.LoginPresenter
import example.epsi.com.go_securi.ui.LoginView

class LoginPresenterImpl @Inject constructor(
    private val authentication: FirebaseAuthenticationInterface
) : LoginPresenter {

    private lateinit var view: LoginView

    private val loginRequest = LoginRequest()

    override fun setView(view: LoginView) {
        this.view = view
    }

    override fun onLoginTapped() {
        if (loginRequest.isValid()) {
            authentication.login(loginRequest.employeeId) { isSuccess ->
                if (isSuccess) {
                    view.onLoginSuccess()
                } else {
                    view.showLoginError()
                }
            }
        }
    }
}
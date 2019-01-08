package example.epsi.com.go_securi.presentation

interface BasePresenter<in T> {

    fun setView(view: T)
}
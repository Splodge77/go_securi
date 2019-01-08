package example.epsi.com.go_securi.model

import example.epsi.com.go_securi.common.isEmployeeIdValid


data class LoginRequest(var employeeId: String = "")
{
    fun isValid() = isEmployeeIdValid(employeeId)
}
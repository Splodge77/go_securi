package example.epsi.com.go_securi.model

import common.isEmployeeIdValid


data class LoginRequest(var employeeId: String = "")
{
    fun isValid() = isEmployeeIdValid(employeeId)
}
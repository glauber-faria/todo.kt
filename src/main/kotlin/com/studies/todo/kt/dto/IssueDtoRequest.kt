package com.studies.todo.kt.dto

import com.studies.todo.kt.model.Issue

data class IssueDtoRequest (
    val name: String = "",
    val description: String = ""
){
    fun dto2model() : Issue {
        return Issue(name = this.name, description = this.description);
    }
}
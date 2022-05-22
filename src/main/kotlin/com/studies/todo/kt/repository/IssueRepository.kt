package com.studies.todo.kt.repository

import com.studies.todo.kt.model.Issue
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface IssueRepository : JpaRepository<Issue, Long>  {
}
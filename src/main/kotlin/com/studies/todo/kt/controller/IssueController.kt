package com.studies.todo.kt.controller

import com.studies.todo.kt.dto.IssueDtoRequest
import com.studies.todo.kt.model.Issue
import com.studies.todo.kt.repository.IssueRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/issue")
class IssueController(private val issueRepo: IssueRepository) {
    @GetMapping
    fun getAll(): List<Issue> =
        issueRepo.findAll();

    @PostMapping
    fun newIssue(@RequestBody newIssue: IssueDtoRequest): Issue =
        issueRepo.save(newIssue.dto2model());

    @DeleteMapping("/{id}")
    fun editIssue(@PathVariable id: Long) = run {
        var obj: Optional<Issue> = issueRepo.findById(id);
        if(obj.isPresent){
            issueRepo.delete(obj.get());
        }
    }

}
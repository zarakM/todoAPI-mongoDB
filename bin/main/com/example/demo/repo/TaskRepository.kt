package com.example.demo.repo
 
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
 
import com.example.demo.model.Task
import org.springframework.data.mongodb.repository.MongoRepository;

 
@Repository
interface TaskRepository : MongoRepository<Task, Long> {

	fun findByTitle(title:String) : Iterable<Task>	
}
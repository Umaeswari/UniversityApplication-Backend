package com.demo.UniversityApplication;



import com.demo.UniversityApplication.UA.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/students")
public class UniversityApplication {

	private List<Student> students;

	public UniversityApplication() {
		students = new ArrayList<>();
	}

	@PostMapping
	public void addStudent(@RequestBody Student student) {
		students.add(student);
	}

	@GetMapping
	public List<Student> getAllStudents() {
		return students;
	}

	@GetMapping("/{hallTicket}")
	public List<Student> searchStudentsByHallTicket(@PathVariable int hallTicket) {
		List<Student> matchingStudents = new ArrayList<>();
		for (Student student : students) {
			if (student.getHallTicket() == hallTicket) {
				matchingStudents.add(student);
			}
		}
		return matchingStudents;
	}

	public static void main(String[] args) {
		SpringApplication.run(UniversityApplication.class, args);
	}
}


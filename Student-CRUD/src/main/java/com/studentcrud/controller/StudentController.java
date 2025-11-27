package com.studentcrud.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.studentcrud.entity.Student;
import com.studentcrud.service.StudentService;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    // Home page - list all students
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listStudents", studentService.getAllStudents());
        return "index";
    }

    // Show form to add new student
    @GetMapping("/showNewStudentForm")
    public String showNewStudentForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "new_student";
    }

    // Save student
    @PostMapping("/saveStudent")
    public String saveStudent(@ModelAttribute Student student) {
        studentService.saveStudent(student);
        return "redirect:/";
    }

    // Show form to update student
    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable long id, Model model) {
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "update_student";
    }

    // Delete student
    @GetMapping("/deleteStudent/{id}")
    public String deleteStudent(@PathVariable long id) {
        studentService.deleteStudent(id);
        return "redirect:/";
    }
}

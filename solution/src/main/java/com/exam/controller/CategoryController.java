package com.exam.controller;

import com.exam.model.exam.Schedule;
import com.exam.service.ScheduleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoryController {

    @Autowired
    private ScheduleService categoryService;

    //add category
    @PostMapping("/")
    public ResponseEntity<Schedule> addCategory(@RequestBody Schedule schedule) {
        Schedule schedule1 = this.categoryService.addScheduler(schedule);
        return ResponseEntity.ok(schedule1);
    }

    //get category
    @GetMapping("/{sID}")
    public Schedule getCategory(@PathVariable("sID") Long sID) {
        return this.categoryService.getScheduler(sID);
    }

    //update category
    @PutMapping("/")
    public Schedule updateCategory(@RequestBody Schedule schedule) {
        return this.categoryService.updateScheduler(schedule);
    }

    //delete category
    @DeleteMapping("/{categoryId}")
    public void deleteCategory(@PathVariable("sID") Long sID) {
        this.categoryService.deleteScheduler(sID);
    }

}

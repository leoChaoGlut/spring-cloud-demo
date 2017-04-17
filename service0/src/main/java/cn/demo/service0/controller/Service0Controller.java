package cn.demo.service0.controller;

import org.springframework.web.bind.annotation.*;

import java.util.concurrent.TimeUnit;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2017/1/19 12:13
 * @Description:
 */
@RestController
public class Service0Controller {
    public static class User {
        private int id;
        private String name;

        private Student student;

        public User() {
        }

        public int getId() {
            return id;
        }

        public User setId(int id) {
            this.id = id;
            return this;
        }

        public String getName() {
            return name;
        }

        public User setName(String name) {
            this.name = name;
            return this;
        }

        public Student getStudent() {
            return student;
        }

        public User setStudent(Student student) {
            this.student = student;
            return this;
        }

        @Override
        public String toString() {
            return "User{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", student=" + student +
                    '}';
        }
    }

    public static class Student {
        private String stuName;

        public Student() {
        }

        public String getStuName() {
            return stuName;
        }

        public Student setStuName(String stuName) {
            this.stuName = stuName;
            return this;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "stuName='" + stuName + '\'' +
                    '}';
        }
    }

    /**
     * 用于测试ribbon 重试机制
     */
    int count = 0;

    @GetMapping("user/{userId}/{sleepSec}")
    String user(
            @PathVariable String userId,
            @PathVariable int sleepSec
    ) {
        try {
            System.out.println("hello:" + userId);
            count++;
            TimeUnit.SECONDS.sleep(sleepSec - count);
            return "hello:" + userId;
        } catch (Exception e) {
            e.printStackTrace();
            return e.getMessage();
        }
    }

    @PostMapping("test")
    String post(
            @RequestBody User user
    ) {
        System.out.println(user.toString());
        return user.toString();
    }

}

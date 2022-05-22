package com.javashitang.service;

import com.javashitang.domain.Student;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * @Author lilimin
 * @Date 2022/5/16
 */
@Service
public class IndexService {

    @Value("${loc}")
    private String loc;

    public String index(String name, int age) {
        return calName(name) + calAge(age);
    }

    public String calName(String name) {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return name;
    }

    public int calAge(int age) {
        return age;
    }

    public Student save(Student student) {
        student.setAge(student.getAge() + 10);
        return student;
    }

    public List<Integer> notice() {
        return new ArrayList<>(Arrays.asList(1, 2, 3));
    }
}

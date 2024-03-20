package ru.shtyrev.StudentApiService.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.shtyrev.StudentApiService.services.StudentService;
import ru.shtyrev.StudentEntityService.dtos.MarkDTO;
import ru.shtyrev.StudentEntityService.dtos.StudentDTO;
import ru.shtyrev.StudentEntityService.enums.Lesson;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final RestTemplate restTemplate;
    private final String URL = "http://localhost:8081/students";

    @Override
    public StudentDTO createStudent(StudentDTO studentDTO) {
        var request = new HttpEntity<>(studentDTO);
        return restTemplate.exchange(URL + "/add", HttpMethod.POST, request, StudentDTO.class).getBody();
    }

    @Override
    public void addMark(Long studentId, MarkDTO markDTO) {

    }

    @Override
    public List<StudentDTO> findAllStudents() {
        return null;
    }

    @Override
    public List<StudentDTO> findAllExcellentStudents() {
        return null;
    }

    @Override
    public List<StudentDTO> topAvgMarkList() {
        return null;
    }

    @Override
    public List<MarkDTO> avgMarksByLesson(Long studentId) {
        return null;
    }

    @Override
    public Lesson topAvgLesson() {
        return null;
    }
}

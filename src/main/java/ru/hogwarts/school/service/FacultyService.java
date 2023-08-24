package ru.hogwarts.school.service;

import ru.hogwarts.school.model.Faculty;

import java.util.Collection;

public interface FacultyService {
    Faculty createFaculty(Faculty faculty);

    Faculty findFaculty(Long id);

    Faculty editFaculty(Faculty faculty);

    Faculty deleteFaculty(Long id);

    Collection<Faculty> getAll();

    Collection<Faculty> findByColor(String color);
}

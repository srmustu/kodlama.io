package business.Category;

import entities.CourseCategory;

public interface ICategoryManager {
    void add(CourseCategory courseCategory) throws Exception;
    void remove(CourseCategory courseCategory);
}

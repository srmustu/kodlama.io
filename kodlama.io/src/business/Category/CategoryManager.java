package business.Category;

import dataAccess.CategoryDao.ICategoryDal;
import entities.CourseCategory;

public class CategoryManager implements ICategoryManager{
    ICategoryDal categoryDal;
    public CategoryManager(ICategoryDal categoryDal){
        this.categoryDal=categoryDal;
    }

    @Override
    public void add(CourseCategory courseCategory)  {
        String[] categoryNames = {"Java","C#","Php"};
        String sToAdd = courseCategory.getCategoryName();
        boolean found = false;
        for (int i = 0; i < categoryNames.length; i++) {
            if (categoryNames[i] == sToAdd) {
                found = true;
                System.out.println("There cannot be a category with the same name, enter another category name");
                break;
            }
        }
        if (!found) {
            String[] newcategoryNames = new String[categoryNames.length + 1];
            for (int i = 0; i < categoryNames.length; i++) {
                newcategoryNames[i] = categoryNames[i];
            }
            newcategoryNames[newcategoryNames.length - 1] = sToAdd;
            categoryNames = newcategoryNames;
            categoryDal.add();
        }
    }
    @Override
    public void remove(CourseCategory courseCategory) {
        categoryDal.remove();
    }
}

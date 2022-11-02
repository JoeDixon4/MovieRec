package ApiComponents.demo;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "category")
public class Category {
    @ManyToMany(mappedBy = "filmCategory")
    Set<Film> categoryFilm;
    //Attributes
    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int categoryId;

    @Column(name = "name")
    String category;
    //Constructors
    public Category(String myCategory, int myCategoryId) {
        this.category = myCategory;
        this.categoryId = myCategoryId;
    }

    public Category() {

    }
    //Methods
    public int getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(int myCategoryId) {
        this.categoryId = myCategoryId;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String myCategory) {
        this.category = myCategory;
    }
}

package studentarray;

/**
 * This class +++ Insert class Description here +++
 *
 * @author Roopamjit Walia
 */
public class PartTimeStudent extends Student {
  private int numCourses;

    public PartTimeStudent(int numCourses) {
        
        this.numCourses = numCourses;
    }

    public int getNumCourses() {
        return numCourses;
    }

    public void setNumCourses(int numCourses) {
        this.numCourses = numCourses;
    }
  
}

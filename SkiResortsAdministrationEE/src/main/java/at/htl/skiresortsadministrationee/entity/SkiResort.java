package at.htl.skiresortsadministrationee.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@NamedQueries(@NamedQuery(name = "GetAllSkiResorts", query = "select s from SkiResort s"))
public class SkiResort implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String skiResortName;
    String skiResortTown;
    int lowestPoint;
    int highestPoint;

    public SkiResort(String skiResortName, String skiResortTown, int lowestPoint, int highestPoint) {
        this.skiResortName = skiResortName;
        this.skiResortTown = skiResortTown;
        this.lowestPoint = lowestPoint;
        this.highestPoint = highestPoint;
    }

    public SkiResort() {
    }

    public Long getId() {
        return id;
    }

//    public void setId(Long id) {
//        this.id = id;
//    }

    public String getSkiResortName() {
        return skiResortName;
    }

    public void setSkiResortName(String skiResortName) {
        this.skiResortName = skiResortName;
    }

    public String getSkiResortTown() {
        return skiResortTown;
    }

    public void setSkiResortTown(String skiResortTown) {
        this.skiResortTown = skiResortTown;
    }

    public int getLowestPoint() {
        return lowestPoint;
    }

    public void setLowestPoint(int lowestPoint) {
        this.lowestPoint = lowestPoint;
    }

    public int getHighestPoint() {
        return highestPoint;
    }

    public void setHighestPoint(int highestPoint) {
        this.highestPoint = highestPoint;
    }

    @Override
    public String toString() {
        return "SkiResort{" +
                "id=" + id +
                ", skiResortName='" + skiResortName + '\'' +
                ", skiResortTown='" + skiResortTown + '\'' +
                ", lowestPoint=" + lowestPoint +
                ", highestPoint=" + highestPoint +
                '}';
    }
}

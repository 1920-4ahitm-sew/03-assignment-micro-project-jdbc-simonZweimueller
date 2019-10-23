package at.htl.skiresortsadministrationee.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class SkiResort {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    String skiResortName;
    String getSkiResortTown;
    int lowestPoint;
    int highestPoint;

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

    public String getGetSkiResortTown() {
        return getSkiResortTown;
    }

    public void setGetSkiResortTown(String getSkiResortTown) {
        this.getSkiResortTown = getSkiResortTown;
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
}

package CodingProblems.Collection.Collections.OtherFunctionalities;

import java.util.Objects;

public class Students implements Comparable<Students> {

    String name;
    int rollNo;

    public Students(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students that = (Students) o;
        return rollNo == that.rollNo;
    }


    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }

    @Override
    public String toString() {
        return "Students{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }

//    @Override
//    public int compareTo(Students o) {
//        return 0;
//    }

    //similar to above compareTo method for roll number
    @Override
    public int compareTo(Students that) {
        return this.rollNo - that.rollNo;
    }

    // sort based on name (limitations are this will only sort either name or roll no or anything at one time
   /* @Override
    public int compareTo(Students that) {
        return this.name.compareTo(that.name);
    }

    */

}

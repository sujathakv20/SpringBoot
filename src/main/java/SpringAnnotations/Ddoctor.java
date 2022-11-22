package SpringAnnotations;

import demo.Nnurse;
import demo.Staff;

public class Ddoctor implements Staff {

    private String Qualification;
    private Nnurse nurse;

    public Ddoctor(String qualification) {
        Qualification = qualification;
    }


    public void assist()
    {
        System.out.println("Ddoctor is assisting");
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        this.Qualification = qualification;
    }


}
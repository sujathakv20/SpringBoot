package demo;

public class Doctor implements Staff{

    private String Qualification;
    private Nurse nurse;

    public Doctor(String qualification) {
        Qualification = qualification;
    }


    public void assist()
    {
        System.out.println("Doctor is assisting");
    }

    public String getQualification() {
        return Qualification;
    }

    public void setQualification(String qualification) {
        this.Qualification = qualification;
    }


}

package hospital;

public class Nurse {
    
    private String name;
    private String npi;
    private String degree;
    private boolean isAvailable = true;

    public Nurse(String name, String npi, String degree){
        this.name = name;
        this.npi = npi;
        this.degree = degree;        
    }

    public boolean getIsAvailable(){
        return this.isAvailable;
    }

    public void treatPatient(Patient patient){
        this.isAvailable = false;
        patient.setCondition("ok");
        patient.setPrognosis("so so");
    }

    public void triagePatient(Patient patient){
        this.isAvailable = false;
        patient.setTemperature(99.9);
        patient.setBloodPressure("140/100");
    }
}

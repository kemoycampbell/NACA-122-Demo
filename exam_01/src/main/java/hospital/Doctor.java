package hospital;

public class Doctor {
    
    private String name;
    private String npi;    
    private boolean isAvailable;

    public Doctor(String name, String npi){
        this.name = name;
        this.npi = npi;        
    }

    public boolean getIsAvailable(){
        return this.isAvailable;
    }

    public void treatPatient(Patient patient){
        patient.setCondition("bad");
        patient.setPrognosis("very bad");
    }
}

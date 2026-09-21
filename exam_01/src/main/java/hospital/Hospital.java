package hospital;

public class Hospital {
    
    private static Patient[] patients = {
        new Patient("Sam Malone"),
        new Patient("Steve Buschemi"),
        new Patient("Sally Struthers"),
        new Patient("Cher"),
        new Patient("Seal")
    };

    private static Nurse[] nurses = {
        new Nurse("Betty White", "12345", "RN"),
        new Nurse("Gordon Schumway", "67890", "LPN")
    };

    private static Doctor[] doctors = {
        new Doctor("Doctor J", "9999"),
        new Doctor("Doctor Feelgood", "434343")      
    };

    public static void main(String[] args){

        for(int i = 0; i < patients.length; i++){

            Nurse nurse = getNextAvailableNurse();
            if(nurse == null){
                Doctor doctor = getNextAvailableDoctor();
                if(doctor == null){
                    break;
                }else{
                    doctor.treatPatient(patients[i]);
                }                
            }else{
                nurse.treatPatient(patients[i]);
            }
        }


    }

    private static Nurse getNextAvailableNurse(){
        Nurse nurse = null;
        for( int i = 0; i < nurses.length; i++){
            if(nurses[i].getIsAvailable()){
                nurse = nurses[i];
                break;
            }
        }
        return nurse;
    }

    private static Doctor getNextAvailableDoctor(){
        Doctor doctor = null;
        for( int i = 0; i < doctors.length; i++){
            if(doctors[i].getIsAvailable()){
                doctor = doctors[i];
                break;
            }
        }
        return doctor;
    }
}

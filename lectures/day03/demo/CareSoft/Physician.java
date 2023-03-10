import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {

    //... imports class definition...
    
    // Inside class:    
    private ArrayList<String> patientNotes;
	
    // TO DO: Constructor that takes an ID
	
    public Physician(Integer id) {
        super(id);
    }
    
    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
            report += String.format("Reported By ID: %s\n", this.id);
            report += String.format("Patient Name: %s\n", patientName);
            report += String.format("Notes: %s \n", notes);
            this.patientNotes.add(report);
        }

// TO DO: Implement HIPAACompliantUser!
    @Override
    public boolean assignPin(int pin) {
        int numlen = Integer.toString(pin).length();
        // System.out.println(numlen == 4);
        // if(numlen == 4){
        //     return true;
        // } else {
        //     return false;
        // }
        return numlen == 4;
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
        System.out.println(confirmedAuthID);
        System.out.println(this.id);
        System.out.println(confirmedAuthID == this.id);

        return confirmedAuthID == this.id;
    }
        
        // TO DO: Setters & Getters

    
}

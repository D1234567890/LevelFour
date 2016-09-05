import java.util.ArrayList;

public class Hospital {
	private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	void addDoctor(Doctor d) {
		doctors.add(d);
	}
	
	ArrayList<Doctor> getDoctors() {
		return doctors;
	}
	
	void addPatient(Patient p) {
		patients.add(p);
	}
	
	ArrayList<Patient> getPatients() {
		return patients;
	}
	
	void assignPatientsToDoctors() {
		int howMany = patients.size() - 1;
		for (Doctor d: doctors) {
			for (int i = 0; i < 3; i++) {
				if (howMany < 0) {
					break;
				} else {
					try {
						d.assignPatient(patients.get(howMany));
						howMany--;
					} catch (DoctorFullException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}
}

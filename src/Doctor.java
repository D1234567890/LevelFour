import java.util.ArrayList;

public class Doctor {
	private ArrayList<Patient> patients = new ArrayList<Patient>();

	boolean preformsSurgery() {
		return false;
	}

	boolean makesHouseCalls() {
		return false;
	}

	void assignPatient(Patient p) throws DoctorFullException {
		if (patients.size() == 3) {
			throw new DoctorFullException("This doctor cannot have anymore patients.");
		} else {
			patients.add(p);
		}
	}

	ArrayList<Patient> getPatients() {
		return patients;
	}

	void doMedicine() {
		for (Patient p : patients) {
			p.setCare(true);
		}
	}
}

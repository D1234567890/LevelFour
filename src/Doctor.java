import java.util.ArrayList;

public class Doctor {
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	private boolean isEvil = false;
	private Hospital h;
	
	Doctor(String s) {
		if (s.equals("666")) {
			isEvil = true;
		}
	}
	
	Doctor(String s, Hospital h) {
		this.h = h;
	}
	
	Doctor() {
		
	}

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
			if (isEvil) {
				p.kill();
			}
		}
	}
	
	boolean isEvil() {
		return isEvil;
	}
	
	void joinTheDarkSide() {
		isEvil = true;
	}
	
	Hospital getHospital() {
		return h;
	}
}

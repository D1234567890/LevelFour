import java.util.ArrayList;
import java.util.Date;

public class Hospital {
	private ArrayList<Doctor> doctors = new ArrayList<Doctor>();
	private ArrayList<Patient> patients = new ArrayList<Patient>();
	private ArrayList<Zombie> zombies = new ArrayList<Zombie>();
	
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
	
	void add(Patient p) {
		patients.add(p);
	}
	
	void add(Doctor d) {
		doctors.add(d);
	}
	
	void makeDoctorsWork() {
		for (Doctor d: doctors) {
			d.doMedicine();
		}
		
		for (Patient p: patients) {
			if (!p.isAlive()) {
				patients.remove(0);
				zombies.add(new Zombie(new Date().toString()));
				System.out.println(zombies.size());
			}
		}
	}
	
	void addZombie(Zombie z) {
		zombies.add(z);
	}
	
	ArrayList<Zombie> getZombies() {
		return zombies;
	}
}

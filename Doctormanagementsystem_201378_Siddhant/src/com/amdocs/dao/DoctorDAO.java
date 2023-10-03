package com.amdocs.dao;

import java.util.List;
import com.amdocs.pojos.Doctor;
import com.amdocs.exception.DoctorNotFoundException;

public interface DoctorDAO {
	int addDoctor(Doctor doctor);

	int deleteDoctor(int doctorId)throws DoctorNotFoundException;

	boolean updateDoctorFees(int doctorId, double fees)throws DoctorNotFoundException;

	List<Doctor> showAllDoctors();

	List<Doctor> searchBySpecialization(String specialization) throws DoctorNotFoundException;

	List<Doctor> searchByFeesAndShift(String availableShift,double fees) throws DoctorNotFoundException;

	int countDoctorsByShift(String availableShift);
}

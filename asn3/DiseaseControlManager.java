package edu.disease.asn3;

import java.util.UUID;

import edu.disease.asn1.Exposure;

/**
 * This is an interface called DiseaseControlManager.
 * 
 * @author DELL
 *
 */
public interface DiseaseControlManager {
	/**
	 * This is abstract method implemented in {@link DiseaseControlManager}.
	 * 
	 * @param name
	 * @param infectious
	 * @return
	 */
	public Disease addDisease(String name, boolean infectious);

	/**
	 * This is abstract method implemented in {@link DiseaseControlManager}.
	 * 
	 * @param diseaseId
	 * @return
	 */
	public Disease getDisease(UUID diseaseId);

	/**
	 * This is abstract method implemented in {@link DiseaseControlManager}.
	 * 
	 * @param firstName
	 * @param lastName
	 * @param maxDiseases
	 * @param maxExposures
	 * @return
	 */
	public Patient addPatient(String firstName, String lastName, int maxDiseases, int maxExposures);

	/**
	 * This is abstract method implemented in {@link DiseaseControlManager}.
	 * 
	 * @param patientId
	 * @return
	 */
	public Patient getPatient(UUID patientId);

	/**
	 * This is abstract method implemented in {@link DiseaseControlManager}.
	 * 
	 * @param patientId
	 * @param diseaseId
	 */
	public void addDiseasetoPatient(UUID patientId, UUID diseaseId);

	/**
	 * This is abstract method implemented in {@link DiseaseControlManager}.
	 * 
	 * @param patientId
	 * @param exposure
	 */
	public void addExposuretoPatient(UUID patientId, Exposure exposure);

	/**
	 * This is abstract method implemented in {@link DiseaseControlManager}.
	 * 
	 * @return
	 */
	public Disease[] getDiseases();

	/**
	 * This is abstract method implemented in {@link DiseaseControlManager}.
	 * 
	 * @return
	 */
	public Patient[] getPatient();
}

package hospital.data;

import java.util.ArrayList;
import java.util.List;

public class DataStorage {

    private static final List<String> patientData = new ArrayList<>();
    private static final List<String> doctorData = new ArrayList<>();
    private static final List<String> appointmentData = new ArrayList<>();

    // Patient Management
    public static void addPatient(String name, String age, String address, String contact) {
        patientData.add("Name: " + name + ", Age: " + age + ", Address: " + address + ", Contact: " + contact);
    }

    public static List<String> getPatients() {
        return new ArrayList<>(patientData);
    }


    // Doctor Management
    public static void addDoctor(String name, String specialization, String experience, String contact) {
        doctorData.add("Name: " + name + ", Specialization: " + specialization + ", Experience: " + experience + " years, Contact: " + contact);
    }

    public static List<String> getDoctors() {
        return new ArrayList<>(doctorData);
    }


    // Appointment Management
    public static void addAppointment(String patientName, String doctorName, String date, String time) {
        appointmentData.add("Patient: " + patientName + ", Doctor: " + doctorName + ", Date: " + date + ", Time: " + time);
    }

    public static List<String> getAppointments() {
        return new ArrayList<>(appointmentData);
    }
}

import java.util.*;

public class PatientIDPrint {
    static void printID(String id) {
        System.out.println(id);
    }

    public static void main(String[] args) {
        List<String> patientIDs = Arrays.asList("P101", "P102", "P103");
        patientIDs.forEach(PatientIDPrint::printID);
    }
}

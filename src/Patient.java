//Kyshawn briggs

public class Patient implements Comparable<Patient> {
    private String name;
    private String code;
    private String admitTime;

    // Default constructor
    public Patient() {
        name = "";
        code = "";
        admitTime = "";
    }

    // Overloaded constructor
    public Patient(String name, String code, String admitTime) {
        this.name = name;
        this.code = code;
        this.admitTime = admitTime;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public String getAdmitTime() {
        return admitTime;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        if (code.length() <= 4) {
            this.code = code;
        }
    }

    public void setAdmitTime(String admitTime) {
        if (admitTime.length() <= 4) {
            this.admitTime = admitTime;
        }
    }

    @Override
    public String toString() {
        return "[" + name + " " + code + " " + admitTime + "]";
    }

    @Override
    public int compareTo(Patient other) {

        // Compare ailment codes first
        int result = this.code.compareTo(other.code);

        if (result != 0) {
            return result;
        }

        // Same ailment code
        // Earlier admit time has higher priority
        return this.admitTime.compareTo(other.admitTime);
    }
}
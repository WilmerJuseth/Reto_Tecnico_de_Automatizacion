package co.com.choucair.certification.retot.model;

public class UtestData {
    private String firts_name;
    private String last_name;
    private String email;
    private String password;
    private String question;

    public UtestData(String firts_name, String last_name, String email, String password, String question) {
        this.firts_name = firts_name;
        this.last_name = last_name;
        this.email = email;
        this.password = password;
        this.question = question;
    }

    public String getFirts_name() {
        return firts_name;
    }

    public void setFirts_name(String firts_name) {
        this.firts_name = firts_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }
}

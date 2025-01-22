public class Student {
    private Integer id;
    private String ime;
    private Integer bodovi;
    Student(Integer id, String ime, Integer bodovi) {
        this.id = id;
        this.ime = ime;
        this.bodovi = bodovi;
    }
    Student(){}
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getIme() {
        return ime;
    }
    public void setIme(String ime) {
        this.ime = ime;
    }
    public Integer getBodovi() {
        return bodovi;
    }
    public void setBodovi(Integer bodovi) {
        this.bodovi = bodovi;
    }

    @Override
    public String toString() {
        return "Ime studenta "+getIme()+" Bodovi "+getBodovi()+" Id "+getId();
    }
}



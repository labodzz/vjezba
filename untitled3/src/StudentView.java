import java.util.List;

public class StudentView{
    String ulazna,izlazna;

    public void setUlazna(String ulazna){
        this.ulazna = ulazna;
    }
    public void setIzlazna(String izlazna){
        this.izlazna = izlazna;
    }
    public String getUlazna() {
        return ulazna;
    }
    public String getIzlazna() {
        return izlazna;
    }
    public void ispisiSve(List<Student> st){
        for(Student s:st)
            System.out.println(s.toString());
    }
    public void IspisiJednog(Student s){
        System.out.println(s.toString());
    }

}



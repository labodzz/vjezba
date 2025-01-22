public class StudentController{
   private StudentModel model;
   private StudentView view;
   public StudentController(StudentModel model, StudentView view){
       this.model = model;
       this.view = view;
   }
   public void DodajStudenta(int id,String ime,int bodovi){
       Student s=new Student(id,ime,bodovi);
       try {
           model.addStudent(s);
           view.izlazna = "Uspjesno dodan student";
       }catch(Exception e){
           System.out.println(e);
           view.izlazna = "Neuspjesno dodavanje";
       }
       System.out.println(view.getIzlazna());
   }

    public void showAllStudents() {
        view.ispisiSve(model.getStudents());
    }

    public void showStudentById(int id){
       Student s=model.getStudentById(id);
       System.out.println("Ime "+s.getIme());
 }
}

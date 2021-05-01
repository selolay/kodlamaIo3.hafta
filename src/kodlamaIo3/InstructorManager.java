package kodlamaIo3;

public class InstructorManager {
	public void kursEkle(Instructor instructor,String kurs) {
		System.out.println(instructor.firstName + " " + kurs + " ekledi");
		
	}
	public void kursSil(Instructor instructor,String kurs) {
		System.out.println(instructor.firstName + " " + kurs + " sildi");
	}
	

}

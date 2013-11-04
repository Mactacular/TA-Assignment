package taAllocation;
import java.util.ArrayList;
public class Instructor
{
	public String name;														// name of the instructor
	public ArrayList<String> courses = new ArrayList<String>(); //name of courses the instructor teaches 
	public ArrayList<taCourseTuple> preference = new ArrayList<taCourseTuple>();  // list of labs related to the course and their corosponding times
	
	static class taCourseTuple
	 { 
		private String ta;
		private String course;
		taCourseTuple(String ta, String course){
			this.ta = ta;
			this.course = course;
		}
		String getTa(){
			return ta;
		}
		String getCourse(){
			return course;
		}
	}
}
package taAllocation;
import java.util.ArrayList;
public class Course
{
	public String name;														// name of the course
	public int type;														// the type of class, 0 == junior, 1 == senior, 2 == grad
	public ArrayList<lecTimeTuple> lectures = new ArrayList<lecTimeTuple>(); // list of lectures related to the course and their corosponding times
	public ArrayList<labTimeTuple> labs = new ArrayList<labTimeTuple>();  // list of labs related to the course and their corosponding times
	
	// stores a lecture time tuple
	 static class lecTimeTuple
	 { 
		private String lec;
		private String time;
		lecTimeTuple(String lec, String time){
			this.lec = lec;
			this.time = time;
		}
		String getLec(){
			return lec;
		}
		String getTime(){
			return time;
		}
	}
	
	//stores a lab-time tuple
	static class labTimeTuple
	 { 
		private String lab;
		private String time;
		labTimeTuple(String lab, String time){
			this.lab = lab;
			this.time = time;
		}
		String getLab(){
			return lab;
		}
		String getTime(){
			return time;
		}
	}
}
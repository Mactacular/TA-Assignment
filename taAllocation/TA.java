package taAllocation;
import java.util.ArrayList;
public class TA
{
	public String name;														// name of the instructor
	public ArrayList<String> coursesTaught = new ArrayList<String>(); //name of courses the TA teaches dont need for now but require for later
	public ArrayList<String> coursesTaking = new ArrayList<String>();  // list of ta's current course load
	public ArrayList<String> preference = new ArrayList<String>();  // list of ta's preferences
	public ArrayList<String> coursesKnown = new ArrayList<String>();  // list of courses the ta knows
}
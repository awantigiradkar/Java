package aa1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HASHMAPStudentMaiN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count_dbda_p_count = 0;
		int count_dbda_f_count = 0;
		int count_dac_p_count = 0;
		int count_dac_f_count = 0;
		Student S1 = new Student(1, "Pranjal", 98, "DBDA", "Core JAVA", "PASS", "yes");
		Student S2 = new Student(2, "Alex", 31, "DBDA", "Core JAVA", "FAIL", "no");
		Student S3 =  new Student(3, "Arti", 90, "DAC", "Core JAVA", "PASS", "yes");
		Student S4 =  new Student(4, "Philip", 20, "DAC", "Core JAVA", "FAIL", "no");
		Student S5 = new Student(5, "Raj", 91, "DAC", "Core JAVA", "PASS", "yes");
		
		//Adding all 5 student objects to hashmap
		HashMap<Integer, Student> hm = new HashMap<>();
		hm.put(1, S1);
		hm.put(2, S2);
		hm.put(3, S3);
		hm.put(4, S4);
		hm.put(5, S5);
		
		//Iterate over the hashmap and display every student object
		for(Map.Entry<Integer, Student> aa:hm.entrySet()) {
			Student Obj = aa.getValue();
			Obj.dispStudent();
		}
		//
		for(Map.Entry<Integer, Student>aa:hm.entrySet()) {
			Student OBJ1 =aa.getValue();
			if((OBJ1.course.equals("DBDA")) && OBJ1.result.equals("PASS")) {
				count_dbda_p_count += 1;
				
			}else if(OBJ1.course.equals("DBDA") && OBJ1.result.equals("FAIL")){
				count_dbda_f_count += 1;
			}else if(OBJ1.course.equals("DAC") && OBJ1.result.equals("PASS")){
				count_dac_p_count += 1;
			}else if(OBJ1.course.equals("DAC") && OBJ1.result.equals("FAIL")){
				count_dac_f_count += 1;
			}
		}
		System.out.println("No of students of DAC passed in core java are: "+count_dac_p_count);
		System.out.println("No of students of DAC failed in core java are: "+count_dac_f_count);
		System.out.println("No of students of DBDA passed in core java are: "+count_dbda_p_count);
		System.out.println("No of students of DBDA failed in core java are: "+count_dbda_p_count);
		
		System.out.println("Give the studentid which to display: ");
		int id = sc.nextInt();
		for(Map.Entry<Integer, Student> am:hm.entrySet()) {
			Student obj = am.getValue();
			if(obj.StudentId == id) {
				System.out.println("Course name of paricular student is: "+obj.course);
				
			}
		}
		
		for(Map.Entry<Integer, Student> kk:hm.entrySet()) {
			Student OBJ1 = kk.getValue();
			if(OBJ1.reccee.equals("no")) {
				OBJ1.mark = (float) (OBJ1.mark - (0.2*OBJ1.mark));
			}
		}
		for(Map.Entry<Integer, Student> oo:hm.entrySet()) {
			Student rr = oo.getValue();
			rr.dispStudent();
		}
		
		
	}

}

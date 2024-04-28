import java.io.Serializable;

class Student implements Serializable
{
 int sid;
 String sname;
 String cname;
public Student(int sid, String sname, String cname) {
	super();
	this.sid = sid;
	this.sname = sname;
	this.cname = cname;
	
}
 void display() {
	 System.out.println(sid+" "+sname+ " "+cname);
 }
 
	
	
}

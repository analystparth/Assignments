package language.basics;

public class Assignment2Array {

	public static void main(String[] args) {
		String [][][] student_marks = {
				//semecter1
				{
				{ "Mathematics1","Pass(78)"},
				{"Physics","Pass(85)"},
				{"Chemistry","Fail(21)"},
				{"Computer Programming","Pass(74)"},
				{"Engineering Drawing", "Pass(88)"},
                {"Basic Electrical Eng.", "Pass(79)"}
				},
				//semester2
				{
					{"Mathematics II", "Pass(82)"},
	                {"Mechanics", "Pass(77)"},
	                {"Environmental Sci.", "Pass(77)"},
	                {"Basic Electronics", "Pass(83)"},
	                {"Engineering Physics", "Pass(90)"},
	                {"Engineering Graphics", "Pass(90)"}
				},
				//semester3
				{
					{"Data Structures", "Pass(88)"},
	                {"Discrete Mathematics", "Pass(81)"},
	                {"Digital Electronics", "Pass(76)"},
	                {"Operating Systems", "Fail(32)"},
	                {"Signals and Systems", "Pass(85)"},
	                {"Object-Oriented Prog.", "Pass(78)"}
				},
				//semester4
				{
					{"Algorithms", "Pass(91)"},
	                {"Computer Networks", "Pass(73)"},
	                {"Database Systems", "Fail(19)"},
	                {"Microprocessors", "Pass(80)"},
	                {"Communication Eng.", "Pass(76)"},
	                {"Software Engineering", "Pass(87)"}
				},
				//semester5
				{
					{"Probability & Stats", "Pass(86)"},
	                {"Machine Learning", "Pass(84)"},
	                {"Compiler Design", "Pass(89)"},
	                {"Theory Of Computation", "Pass(73)"},
	                {"Embedded Systems", "Pass(70)"},
	                {"Computer Graphics", "Pass(90)"}
				}
		
		};
		System.out.println("Semester 2 Subject 4 name: " +student_marks[1][3][0]);
		System.out.println("Semester 2 and subject 5 name: " +student_marks[1][4][0]);
		System.out.println("Marks of Semester 4 Subject 3: " +student_marks[3][2][1]);
		System.out.println("Marks of Semester 4 Subject 6: " +student_marks[3][5][1]);
	}
}

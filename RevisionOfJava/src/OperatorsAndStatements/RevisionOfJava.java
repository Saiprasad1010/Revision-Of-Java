package OperatorsAndStatements;

public class RevisionOfJava {
	
	static void DataTypes() {
		byte a;
		a=12;
		System.out.println("show the numbers of:"+a);
		int b,c,d,e;
		b=25;
		c=65;
		d=85;
		e=b*d/c;
		System.out.println("multiplication and division of three numbers (25*85/65):"+e);
		short f=5698;
		System.out.println("Show the number:"+f);
		float g=365.21f;
		System.out.println("Show the Decimal number:"+g);
		double h=12.56984;
		System.out.println("Show the decimal number:"+h);
		boolean i=true;
		System.out.println("Show true/False:"+i);
		char j='l';
		System.out.println("show the given chgaracter:"+j);
	}
	static void variables() {
		int roll_no = 25;
		char grade = 'A';
		String dept = "Civil";
		float perc = 75.26f;
		String mailID = "saiprasadpatil1010@gmail.com";
		String mobNo = "8830049996";
		System.out.println(roll_no);
		System.out.println(grade);
		System.out.println(dept);
		System.out.println(perc);
		System.out.println(mailID);
		System.out.println(mobNo);
	}
	static void operators() {
		int a,b,c,d,e;
		a=10;
		b=25;
		c=12;
		d=32;
		e=5;
		System.out.println(a+b);
		System.out.println(c*a);
		System.out.println(d/e);
		System.out.println(d-c);
		System.out.println(a<d);
		System.out.println(d>e);
		System.out.println(a++ + --c * d++);
		System.out.println(a<d & e<b);
		System.out.println(d<c | b>e);
	}
	static void statements() {
		int a=10,b=15;
		if (a>b) {
			System.out.println("Byetesquare");
		} else if (a<b) {
			System.out.println("pune");
		}
	}
	static void ifelseif() {
		int a=4;
		if (a==1) {
			System.out.println("Monday");
		} else if (a==2) {
			System.out.println("Tuesday");
		} else if (a==3) {
			System.out.println("Wednsday");
		} else if (a==4) {
			System.out.println("Thursday");
		} else if (a==5) {
			System.out.println("Friday");
		} else if (a==6) {
			System.out.println("Saturday");
		}else if (a==7) {
			System.out.println("Sunday");
		} else {
			System.out.println("Not in This Week");
		}
	}
	static void Switch() {
		int a=5;
		switch (a) {
		case 1:
			System.out.println("Saiprasad");
			break;
		case 2:
			System.out.println("Subhash");
			break;
		case 3:
			System.out.println("Patil");
			break;
		case 4:
			System.out.println("Tirpan");
			break;
		case 5:
			System.out.println("Kolhapur");
			break;
		case 6:
			System.out.println("416230");
			break;
		}
	}
	static void loop() {
		int a=0;
		while(a<=10) {
			System.out.println(a);
			a++;
		}
		int b=10;
		while(b>=0) {
			if(b==5) {
				b--;
				continue;
			}
			System.out.println(b);
			b--;
		}
		int d=0;
		do {
			if(d==2) {
				d++;
				continue;
			}
			System.out.println(d);
			d++;
		} while (d<=7);
		for(int c=5;c>=0;c--) {
			if(c==4) {
				continue;
			}
			System.out.println(c);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataTypes();
		variables();
		operators();
		statements();
		ifelseif();
		Switch();
		loop();	
	}
}

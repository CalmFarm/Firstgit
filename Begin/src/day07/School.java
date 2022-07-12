package day07;

public class School {
	
	public static void main(String[] args) {
		Student st=new Student();
		
		st.setNo(1);
		st.setName("홍길동");
		st.setMajor("경제");
		
		Teacher tc=new Teacher();
		
		tc.setNo(1);
		tc.setName("머스크");
		tc.setSubject("천체물리");
		
		Staff sf=new Staff();
		
		sf.setNo(1);
		sf.setName("도롱뇽");
		sf.setDept("인사");
		
		st.showInfo();
		tc.showInfo();
		sf.showInfo();
		
		System.out.println("**************************");
		
		Student st2=new Student();
		st2.setNo(2);
		st2.setName("김철수");
		st2.setMajor("데이터과학");
		
		Student st3=new Student();
		st3.setNo(3);
		st3.setName("이영희");
		st3.setMajor("인공지능");
		
		Student[] arr=new Student[3];
		arr[0]=st;
		arr[1]=st2;
		arr[2]=st3;
		
		for(int i=0;i<arr.length;i++) {
			Student ss=arr[i];
			//System.out.println(ss);
			ss.showInfo();
		}
		
		Teacher tc2=new Teacher();
		tc2.setNo(2);
		tc2.setName("박선생");
		tc2.setSubject("자바");
		
		Teacher arr2[]= {tc, tc2};
		
		for(Teacher tt: arr2) {
			tt.showInfo();
		}
	
		Staff arr3[]= {sf};
		
		for(Staff stf : arr3) {
			stf.showInfo();
		}
		
		
		
		
	}//main

}//class

package day07;

public class RecruitingSystem {

	public static void main(String[] args) {
		JobHunter j=new JobHunter();
		JobHunter j1=new JobHunter("볼카",99,1234);
		
		j1.setSal(2000);
		
		JobHunter[] arr = {j,j1};
		for(int i=0;i<arr.length;i++) {
			arr[i].showInfo();
		}
		
	}

}

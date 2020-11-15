import java.util.Calendar;

public class MyCalendar {
	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("재입력");
			return;
		}

		int year = Integer.valueOf(args[0]);
		int month = Integer.valueOf(args[1]);
		int start = 0; // 1일의 요일
		int end = 0; // 끝일

		Calendar sDay = Calendar.getInstance();
		Calendar eDay = Calendar.getInstance();
		sDay.clear();
		sDay.clear();

		sDay.set(year, month - 1, 1);
		eDay.set(year, month, 1);

		eDay.add(Calendar.DATE, -1);

		start = sDay.get(Calendar.DAY_OF_WEEK);

		end = sDay.getActualMaximum(Calendar.DAY_OF_MONTH);

		System.out.println("   " + year + "년 " + month + "일");
		System.out.println(" SU MO TU WE TH FR SA");
		
		for(int i = 1; i<start; i++) {
			System.out.print("   ");
		}
		
		for(int i = 1; i<=end; i++) {
			if(i<10)
				System.out.print("  "+i);
			else {
				System.out.print(" "+i);
			}
			if((i+(start-1)) % 7 ==0) {
				System.out.println();
			}
		}
	}
}




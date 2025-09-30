package ch04.TeamProject;
import java.util.Scanner;
public class Account {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int account = 0;
		String money = "";
		
		
		while(run) {
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택: ");
			money = "";
		
		String str = sc.nextLine();
		
		if(str.equals("1")) {
			System.out.print("예금액: " );
			money = sc.nextLine();
			account = account + Integer.parseInt(money);
			
		} else if(str.equals("2")) {
			System.out.print("출금액: " );
			money = sc.nextLine();
			if(Integer.parseInt(money)>account) {
				System.out.println("잔고가 부족합니다.");
			}else {
			account = account - Integer.parseInt(money);
			}
		} else if(str.equals("3")) {
			System.out.println("잔고: " + account );
			
		} else if(str.equals("4")) {
			run = false;
		}
		
		
		}
		System.out.println("프로그램 종료");
	}
}
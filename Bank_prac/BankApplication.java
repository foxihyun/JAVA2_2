package Bank_prac;

import java.util.Scanner;

public class BankApplication {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Account[] Accounts = new Account[100]; // 배열 생성
		int count = 0;
	

		while(true)
		{
			System.out.println("------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("------------------------------------------");
			System.out.printf("선택>");
		
			String num = scanner.nextLine(); //입력 받기
		
			if(num.equals("1")) //계좌 생성
			{
				
				System.out.println("--------");
				System.out.println("계좌생성");
				System.out.println("--------");
				
				System.out.printf("계좌번호:");
				String value1_1 = scanner.nextLine();
				
				System.out.printf("계좌주:");
				String value1_2= scanner.nextLine();
				
				System.out.printf("초기입금액:");
				String value1_3 = scanner.nextLine();
				
				System.out.println("결과: 계좌가 생성되었습니다.");
				int value1_3_int = Integer.parseInt(value1_3);
				Account AC = new Account(value1_1,value1_2,value1_3_int);
				Accounts[count] = AC;
				count++; //계좌 개수 카운트 용도
			}
		
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			if(num.equals("2")) //계좌 목록
			{
				System.out.println("--------");
				System.out.println("계좌목록");
				System.out.println("--------");

				for(int i=0;i<count;i++)
				{
					System.out.printf("%s %s %d\n",Accounts[i].AccountNumber,Accounts[i].AccountName,Accounts[i].balance); // 어떻게 출력해야할까
				}
			}
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			if(num.equals("3"))
			{
				int i= 0; // 계좌 찾고 유지하기 위한 index (for문 안에서 선언하면 끝나면 사라지니까)
				
				System.out.println("--------");
				System.out.println("입금");
				System.out.println("--------");
				
				//계좌번호 입력 받고 계좌 찾기
				System.out.printf("계좌 번호:");
				String value3_1 = scanner.nextLine(); //계좌번호

				for(i=0;i<count;i++)
				{ //순회하면서 찾기
					if(value3_1.equals(Accounts[i].AccountNumber)) break; //i번째 account가 찾는 계좌의 위치	
				}
				//1)i!=count 계좌 어딘가에 있음 2)i==count 못찾음
				
				if(i==count)
				{
					System.out.println("계좌 찾을 수 없음");
					continue;
				}
				
				System.out.printf("입금액:");
				String value3_2 = scanner.nextLine(); // 입금 액 입력
				int value3_2_int = Integer.parseInt(value3_2);
				Accounts[i].Deposit(value3_2_int);
				
			
			}
			
			if(num.equals("4"))
			{
				int i = 0; //계좌 찾고 유지하기 위한 index
				System.out.println("--------");
				System.out.println("출금");
				System.out.println("--------");
				
				//계좌번호 입력 받고 계좌 찾기
				System.out.printf("계좌 번호:");
				String value4_1 = scanner.nextLine(); //계좌번호

				for(i=0;i<count;i++)
				{ //순회하면서 찾기1
					if(value4_1.equals(Accounts[i].AccountNumber)) break; //i번째 account가 찾는 계좌의 위치	
				}
				//1)i!=count 계좌 어딘가에 있음 2)i==count 못찾음
				
				if(i==count)
				{
					System.out.println("계좌 찾을 수 없음");
					continue;
				}
				//계좌번호 입력 후 계좌 찾는 함수
				System.out.printf("출금액:");
				String value4_2 = scanner.nextLine();
				int value4_2_int = Integer.parseInt(value4_2);
				Accounts[i].Withdraw(value4_2_int); //출금하기
		
			}
			
			if(num.equals("5")) 
			{
				System.out.println("프로그램 종료");
				break;
			}		
		}
	}
}


//find_acoount 메소드 만들면 편할 것 같지만 헷갈려서 3,4번 안에 for문으로 구현
//팀원은 private으로 하고 getA 사용했음!





package Bank_prac;

public class Account {
	
	
	//계좌 정보 만들기 (필드)
	String AccountNumber;
	String AccountName;
	int balance;
	
	
	Account(String AccountNumber,String AccountName,int balance)
	{
		this.AccountNumber= AccountNumber;
		this.AccountName= AccountName;
		this.balance = balance;
	}
			
			

	public void Deposit(int amount)
	{
		if(amount > 0) {
		this.balance += amount;
		
		}
		
		else {
		System.out.println("다시 입력해주세요.");
		}
		
	};
	
	public void Withdraw(int amount)
	{
		if(this.balance >= amount){
		this.balance -= amount;
		System.out.println("결과:출금이 성공되었습니다.");
		}
		else
		{
			System.out.println("잔액이 부족합니다.");
		}
	}
}

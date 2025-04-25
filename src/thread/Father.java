package thread;

public class Father extends Thread {

    BankAccount bankAccount;
    // 입금 요청 --> 3초

    public Father(BankAccount bankAccount){
        this.bankAccount = bankAccount;
    }

    @Override
    public void run() {
        // 계좌에 입금 요청 --> 3초 걸려서 Thread 로 구성
        bankAccount.deposit(10_000);
    }
}

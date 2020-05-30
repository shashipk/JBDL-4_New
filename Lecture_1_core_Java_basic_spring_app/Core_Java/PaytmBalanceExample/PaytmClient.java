public class PaytmClient {

    public static void main(String[] args) {
        BalanceService balanceService = new BalanceService();

        balanceService.setBalance("1",10);
        balanceService.setBalance("2",20);

        int bal = balanceService.getBalance("1");

        System.out.println(bal);
    }
}

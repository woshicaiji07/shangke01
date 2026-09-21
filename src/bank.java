import chapter2.Account;

public class bank {
    public static void main(String[] args) {
        int arr[] = new int[]{1,2,3};
        Account accounts[] = new Account[]{
                new Account("001","李四",2000),
                new Account("002","张三",50000),
                new Account("003","陈柳",300),
        };
        for(int i = 0;i<accounts.length;i++){
            accounts[i].printInfo();

            System.out.println("-----------------");
            for(Account ac : accounts){
                ac.printInfo();
            }
        }
    }
}

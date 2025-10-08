package day31;

public class TestAmazon {
    public static void main(String[] args) {
        Amazon amazon = new Amazon();
        amazon.login("jason.roger@janbask.com", "test@1234");
        amazon.search("Iphone17");
        amazon.addToCart("Iphone17");
        amazon.makePayment("jason.roger@gmail.com");
        amazon.generatePaymentId();
        amazon.logout();

        System.out.println("==============Builder Pattern==============");
        Amazon  amazon1 =new Amazon();
        amazon1.login("kerrie.wright@janbask.com", "test@1234")
                .search("MacBook pro")
                .addToCart("MacBook Pro")
                .makePayment("kerrie.wright@gmail.com")
                .generatePaymentId().logout();

        System.out.println("===Returning object using new keyword=======");
        amazon1.login().applyDiscount(7000);
    }
}

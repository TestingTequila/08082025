package day31;

public class Amazon {

    public Amazon login()
    {
        System.out.println("Direct Login....");
        return new Amazon();
    }

    public Amazon login(String email, String pw)
    {
        System.out.println("Login with credentials...." + email +" and " + pw);
        return this;
    }

    public Amazon login(String gmailAPI)
    {
        System.out.println("Login with API...." + gmailAPI);
        return this;
    }

    public Amazon search(String productName)
    {
        System.out.println("Searching the product...." + productName);
        return this;
    }

    public Amazon search(String productName, int price)
    {
        System.out.println("Searching the product...." + productName + " with the price: " + price);
        return new Amazon();
    }

    public  Amazon addToCart(String productName)
    {
        System.out.println("Adding the product: " + productName + " into the cart...");
        return this;
    }

    public  Amazon makePayment(Long ccNumber, int cvv)
    {
        System.out.println("Make payment with CC number as : " + ccNumber + " and CVV Number as: " + cvv);
        return this;
    }

    public  Amazon makePayment(Long bitCoin)
    {
        System.out.println("Make payment with Bitcoin number as : " + bitCoin);
        return this;
    }

    public  Amazon makePayment(String payPal)
    {
        System.out.println("Make payment with Paypal account as : " + payPal);
        return this;
    }

    public Amazon generatePaymentId()
    {
        System.out.println("Your Payment id is: " + Math.random());
        return this;
    }

    public  Amazon logout()
    {
        System.out.println("Logged out from the application...");
        return this;
    }

    public  Amazon applyDiscount(int productPrice)
    {
        System.out.println("Applied discount of 20% on " + productPrice*0.2);
        return new Amazon();
    }
}

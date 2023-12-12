public class AlphaVegBiryani extends Alpha {
    private  String quantity;
    private  int price;

    public AlphaVegBiryani(String quantity, int price) {
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public void getfood() {
        super.getfood();
        System.out.println("quantity:"+quantity);
        System.out.println("price:"+price);
    }
}

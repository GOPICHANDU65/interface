public class AlphaNonvegBiryani extends Alpha{
    private  String quantity;
    private  int price;

    public AlphaNonvegBiryani(String quantity, int price) {
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

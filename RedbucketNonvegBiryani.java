public class RedbucketNonvegBiryani extends Redbucket {


    private  String quantity;
    private  int price;

    public RedbucketNonvegBiryani(String quantity, int price) {
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public void getfood() {
        super.getfood();
        System.out.println("quantity: " + quantity);
        System.out.println("price: " + price);
    }
}

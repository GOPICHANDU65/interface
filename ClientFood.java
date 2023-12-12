public class ClientFood {
    public static void main(String[]args){
        Restruant RedbucketNonvegBiryani = new RedbucketNonvegBiryani("small",150);
        Restruant AlphaNonvegBiryani = new AlphaNonvegBiryani("medium",200);
        Restruant RedbucketVegBiryani = new RedbucketVegBiryani("familypack",250);
        Restruant AlphaVegBiryani = new AlphaVegBiryani("single",320);


        RedbucketNonvegBiryani.getfood();
        RedbucketVegBiryani.getfood();
        AlphaNonvegBiryani.getfood();
        AlphaVegBiryani.getfood();
    }
}

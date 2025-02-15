package avito.ad;

import org.apache.commons.lang3.RandomStringUtils;

public class Ad {

    private final Integer sellerID;
    private final String name;
    private final Integer price;

    public Integer getSellerID() {
        return sellerID;
    }

    public String getName() {
        return name;
    }

    public Integer getPrice() {
        return price;
    }
    public Ad(Integer sellerID, String name, Integer price) {
        this.sellerID = sellerID;
        this.name = name;
        this.price = price;
    }

    public static Ad randomAd(){
        return new Ad(999995, RandomStringUtils.randomAlphabetic(7), Integer.valueOf(RandomStringUtils.randomNumeric(3, 5)));
    }


}

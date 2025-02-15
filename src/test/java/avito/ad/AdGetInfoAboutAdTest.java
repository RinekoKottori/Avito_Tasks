package avito.ad;

import io.qameta.allure.junit4.DisplayName;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;

public class AdGetInfoAboutAdTest {
    AdShared adShared = new AdShared();
    AdCheck adCheck = new AdCheck();
    String itemId;
    Integer sellerId;
    String name;
    Integer price;

    @Before
    public void setUp(){
        Ad ad = Ad.randomAd();
        sellerId = ad.getSellerID();
        name = ad.getName();
        price = ad.getPrice();
        Response newAdResponse = adShared.createNewAd(ad);
        itemId = adCheck.getOkForCreatingNewAd(newAdResponse);
    }

    @Test
    @DisplayName("Test that get information about an ad by item id with validate request results OK")
    public void checkGetInfoAboutAdByItemId(){
       Response response = adShared.getInfoByItemId(itemId);
       adCheck.getOkForGetInfoAboutAdByItemId(response, itemId);
    }

    @Test
    @DisplayName("Test that get statistic about an ad by item id with validate request results OK")
    public void checkGetStatisticAboutAdByItemId() {
        Response response = adShared.getStatisticByItemId(itemId);
        adCheck.getOkForGetStatisticAboutAdByItemId(response);
    }

    @Test
    @DisplayName("Test that get information about an ad by seller id with validate request results OK")
    public void checkGetInfoAboutAdBySellerId(){
        Response response = adShared.getInfoBySellerId(sellerId);
        adCheck.getOkForGetInfoAboutAdBySellerId(response, sellerId);
        adCheck.getCorrectBodyResponseForGetInfoAboutAdBySellerId(response, itemId, name, price);
    }
}

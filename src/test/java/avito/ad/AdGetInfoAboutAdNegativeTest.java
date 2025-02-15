package avito.ad;

import io.qameta.allure.junit4.DisplayName;
import io.restassured.response.Response;
import org.junit.Before;
import org.junit.Test;

public class AdGetInfoAboutAdNegativeTest {
    AdShared adShared = new AdShared();
    AdCheck adCheck = new AdCheck();
    String itemId;

    @Before
    public void setUp(){
        Ad ad = Ad.randomAd();
        Response newAdResponse = adShared.createNewAd(ad);
        itemId = adCheck.getOkForCreatingNewAd(newAdResponse);
    }

    @Test
    @DisplayName("Test that get information about an ad by item id with incorrect id results Not Found")
    public void getNotFoundGetInfoWhenIncorrectId(){
        itemId = adShared.replaceCharInItemId(itemId);
        Response response = adShared.getInfoAboutAdWithIncorrectId(itemId);
        adCheck.getNotFoundResponseWhenGetInfo(response);
    }

    @Test
    @DisplayName("Test that get information about an ad by item id with without id results Server Error")
    public void getServerErrorWithOutIdGetInfo(){
        Response response = adShared.getInfoAboutAdWithOutId();
        adCheck.getServerErrorWhenGetInfo(response);
    }

    @Test
    @DisplayName("Test that get statistic about an ad by item id with incorrect id results Not Found")
    public void getNotFoundGetStatisticWhenIncorrectId(){
        itemId = adShared.replaceCharInItemId(itemId);
        Response response = adShared.getStatisticAboutAdWithIncorrectId(itemId);
        adCheck.getNotFoundResponseWhenGetInfo(response);
    }

    @Test
    @DisplayName("Test that get statistic about an ad by item id without id results Server Error")
    public void getSeverErrorWithoutIdGetStatistic(){
        Response response = adShared.getStatisticAboutAdWithoutId();
        adCheck.getServerErrorWhenGetInfo(response);
    }

    @Test
    @DisplayName("Test that get information about an ads by seller id with incorrect seller id results Bad Request")
    public void getBadRequestWhenGetIncorrectSellerId(){
        double sellerId = 1.67;
        Response response = adShared.getInfoAboutAdsWithIncorrectSellerId(Double.toString(sellerId));
        adCheck.getBadRequestWhenGetInfoBySellerId(response);
    }

    @Test
    @DisplayName("Test that get information about an ads by item id with incorrect request by seller id results Server Error")
    public void getServerErrorWhenGetInfoAboutAdsWithIncorrectRequest(){
        Response response = adShared.getInfoAboutAdsWithIncorrectGetRequest();
        adCheck.getServerErrorWhenGetInfo(response);
    }
}

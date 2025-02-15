package avito.ad;

import io.qameta.allure.junit4.DisplayName;
import io.restassured.response.Response;
import org.junit.Test;

import java.util.HashMap;

public class AdCreateNegativeTest {
    AdShared adShared = new AdShared();
    AdCheck adCheck = new AdCheck();
    HashMap<String, Object> adMap;


    @Test
    @DisplayName("Test that creates an ad without an object results in a Bad Request")
    public void getBadRequestToCreateAdWithOutObject(){
        Response response = adShared.createAWithOutObject();
        adCheck.getBadRequestForCreateAd(response);
    }

    @Test
    @DisplayName("Test that creates an ad with an empty object results in a Bad Request")
    public void getBadRequestToCreateAdWithEmptyObject(){
        HashMap<String, String> emptyMap = new HashMap<>();
        System.out.println(emptyMap);
        Response response = adShared.createAdWithEmptyObject(emptyMap);
        adCheck.getBadRequestForCreateAd(response);
    }

    @Test
    @DisplayName("Test that creates an ad with a key sellerID with an incorrect type: string results in a Bad Request")
    public void getBadRequestToCreateAdWithSellerIdTypeString(){
        Response response = adShared.createAdWithSellerIdTypeString();
        adCheck.getBadRequestForCreateAd(response);
    }

    @Test
    @DisplayName("Test that creates an ad without a key sellerID results in a Bad Request")
    public void getBadRequestToCreateAdWithOutSellerId(){
        Response response = adShared.createAdWithOutSellerId();
        adCheck.getBadRequestForCreateAd(response);
    }

    @Test
    @DisplayName("Test that creates an ad with a key sellerID with an incorrect type: float results in a Bad Request")
    public void getBadRequestToCreateAdWithSellerIdTypeFloat(){
        Response response = adShared.createAdWithSellerIdTypeFloat();
        adCheck.getBadRequestForCreateAd(response);
    }

    @Test
    @DisplayName("Test that creates an ad with a key sellerID with null results in a Bad Request")
    public void getBadRequestToCreateAdWithSellerIdWithNull(){
        Response response = adShared.createAdWithSellerIdWithNull();
        adCheck.getBadRequestForCreateAd(response);
    }

    @Test
    @DisplayName("Test that creates an ad with a key name with an incorrect type: integer results in a Bad Request")
    public void getBadRequestToCreateAdWithNameTypeInteger(){
        Response response = adShared.createAdWithNameTypeInteger();
        adCheck.getBadRequestForCreateAd(response);
    }

    @Test
    @DisplayName("Test that creates an ad with a key name with empty string \"\" results in a Bad Request")
    public void getBadRequestToCreateAdWhenNameIsEmptyString(){
        Response response = adShared.createAdWithNameWithEmptyString();
        adCheck.getBadRequestForCreateAd(response);
    }

    @Test
    @DisplayName("Test that creates an ad with a key name with null results in a Bad Request")
    public void getBadRequestToCreateAdWhenNameIsNull(){
        Response response = adShared.createAdWhenNameIsNull();
        adCheck.getBadRequestForCreateAd(response);
    }

    @Test
    @DisplayName("Test that creates an ad without a key name results in a Bad Request")
    public void getBadRequestToCreateAdWhenWithOutName(){
        Response response = adShared.createAdWithOutName();
        adCheck.getBadRequestForCreateAd(response);
    }

    @Test
    @DisplayName("Test that creates an ad with a key price with an incorrect type: string results in a Bad Request")
    public void getBadRequestToCreateAdWithPriceTypeString(){
        Response response = adShared.createAdWithPriceTypeString();
        adCheck.getBadRequestForCreateAd(response);
    }

    @Test
    @DisplayName("Test that creates an ad without a key price results in a Bad Request")
    public void getBadRequestToCreateAdWithoutPrice(){
        Response response = adShared.createAdWithOutPrise();
        adCheck.getBadRequestForCreateAd(response);
    }

    @Test
    @DisplayName("Test that creates an ad with a key price with null results in a Bad Request")
    public void getBadRequestToCreateAdWhenPriceIsNull(){
        Response response = adShared.createAdWhenPriseIsNull();
        adCheck.getBadRequestForCreateAd(response);
    }
}

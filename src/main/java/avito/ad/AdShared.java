package avito.ad;

import java.util.HashMap;
import java.util.Random;

import avito.Shared;
import io.qameta.allure.Step;
import io.restassured.response.Response;


public class AdShared extends Shared{

    @Step("Send POST request to /api/1/item to create new ad")
    public Response createNewAd(Ad ad){
        return spec().log().all()
                .body(ad)
                .when()
                .post(CREATE_AD);
    }

    @Step("Send Get request to /api/1/item/:id to get info about ad")
    public Response getInfoByItemId(String itemId){
        return spec()
                .when()
                .get(GET_AD_INFO_BY_ITEM_ID.replace(":id", itemId));
    }

    @Step("Send Get request to /api/1/statistic/:id to get statistic about ad")
    public Response getStatisticByItemId(String itemId){
        return spec()
                .when()
                .get(GET_AD_STATISTIC_BY_ID.replace(":id", itemId));
    }

    @Step("Send Get request to /api/1/:sellerID/item to get info about ad")
    public Response getInfoBySellerId(Integer sellerId){
        return spec()
                .when()
                .get(GET_ADS_BY_SELLER_ID.replace(":sellerID", sellerId.toString()));
    }

    @Step("Send POST request to /api/1/item to create new ad with out object")
    public Response createAWithOutObject() {
        return spec().log().all()
                .when()
                .post(CREATE_AD);
    }

    @Step("Send POST request to /api/1/item to create new ad with empty Object {}")
    public Response createAdWithEmptyObject(HashMap<String, String> emptyArray) {
        return spec().log().all()
                .when()
                .body(emptyArray)
                .post(CREATE_AD);
    }

    @Step("Send POST request to /api/1/item to create new ad when sellerID incorrect type: String")
    public Response createAdWithSellerIdTypeString() {
        HashMap<String, Object> adMap = new HashMap<>();
        adMap.put("sellerID", "999995");
        adMap.put("name", "Seo");
        adMap.put("price", 113);

        return spec().log().all()
                .body(adMap)
                .when()
                .post(CREATE_AD);
    }

    @Step("Send POST request to /api/1/item to create new ad without sellerID")
    public Response createAdWithOutSellerId() {
        HashMap<String, Object> adMap = new HashMap<>();
        adMap.put("name", "Seo");
        adMap.put("price", 113);

        return spec().log().all()
                .body(adMap)
                .when()
                .post(CREATE_AD);
    }

    @Step("Send POST request to /api/1/item to create new ad with key sellerID incorrect type: float")
    public Response createAdWithSellerIdTypeFloat() {
        HashMap<String, Object> adMap = new HashMap<>();
        adMap.put("sellerID", 999995.1);
        adMap.put("name", "Seo");
        adMap.put("price", 113);

        return spec().log().all()
                .body(adMap)
                .when()
                .post(CREATE_AD);
    }

    @Step("Send POST request to /api/1/item to create new ad with key sellerID is null")
    public Response createAdWithSellerIdWithNull() {
        HashMap<String, Object> adMap = new HashMap<>();
        adMap.put("sellerID", null);
        adMap.put("name", "Seo");
        adMap.put("price", 112);

        return spec().log().all()
                .body(adMap)
                .when()
                .post(CREATE_AD);
    }

    @Step("Send POST request to /api/1/item to create new ad when key name with incorrect type: Integer ")
    public Response createAdWithNameTypeInteger() {
        HashMap<String, Object> adMap = new HashMap<>();
        adMap.put("sellerID", 999995);
        adMap.put("name", 12);
        adMap.put("price", 113);

        return spec().log().all()
                .body(adMap)
                .when()
                .post(CREATE_AD);
    }

    @Step("Send POST request to /api/1/item to create new ad when key name with empty string: '' ")
    public Response createAdWithNameWithEmptyString() {
        HashMap<String, Object> adMap = new HashMap<>();
        adMap.put("sellerID", 999995);
        adMap.put("name", "");
        adMap.put("price", 115);

        return spec().log().all()
                .body(adMap)
                .when()
                .post(CREATE_AD);
    }

    @Step("Send POST request to /api/1/item to create new ad when key name with null ")
    public Response createAdWhenNameIsNull() {
        HashMap<String, Object> adMap = new HashMap<>();
        adMap.put("sellerID", 999995);
        adMap.put("name", null);
        adMap.put("price", 115);

        return spec().log().all()
                .body(adMap)
                .when()
                .post(CREATE_AD);
    }

    @Step("Send POST request to /api/1/item to create new ad  without key name")
    public Response createAdWithOutName() {
        HashMap<String, Object> adMap = new HashMap<>();
        adMap.put("sellerID", 999995);
        adMap.put("price", 115);

        return spec().log().all()
                .body(adMap)
                .when()
                .post(CREATE_AD);
    }

    @Step("Send POST request to /api/1/item to create new ad when key price with incorrect type: String")
    public Response createAdWithPriceTypeString() {
        HashMap<String, Object> adMap = new HashMap<>();
        adMap.put("sellerID", 999995);
        adMap.put("name", "Seo");
        adMap.put("price", "5157");

        return spec().log().all()
                .body(adMap)
                .when()
                .post(CREATE_AD);
    }

    @Step("Send POST request to /api/1/item to create new ad when key price is null")
    public Response createAdWhenPriseIsNull() {
        HashMap<String, Object> adMap = new HashMap<>();
        adMap.put("sellerID", 999995);
        adMap.put("name", "Seo");
        adMap.put("price", null);

        return spec().log().all()
                .body(adMap)
                .when()
                .post(CREATE_AD);
    }

    @Step("Send POST request to /api/1/item to create new ad without key price")
    public Response createAdWithOutPrise() {
        HashMap<String, Object> adMap = new HashMap<>();
        adMap.put("sellerID", 999995);
        adMap.put("name", "Seo");

        return spec().log().all()
                .body(adMap)
                .when()
                .post(CREATE_AD);
    }

    @Step("Send GET request to /api/1/item/:id to get info about ad with incorrect Item Id")
    public Response getInfoAboutAdWithIncorrectId(String itemId){
        return spec().log().all()
                .when()
                .get(GET_AD_INFO_BY_ITEM_ID.replace(":id", itemId));
    }

    @Step("Create new id item that doesn't exist")
    public String replaceCharInItemId(String itemId) {
        Random random = new Random();
        int randomIndexOfChar = random.nextInt(7);
        char newRandomChar = (char) ('a' + random.nextInt(26));
        return itemId.substring(0, randomIndexOfChar) + newRandomChar + itemId.substring(randomIndexOfChar + 1);
    }

    @Step("Send GET request to /api/1/item/:id to get info about ad without item id")
    public Response getInfoAboutAdWithOutId(){
        return spec().log().all()
                .when()
                .get(GET_AD_INFO_BY_ITEM_ID);
    }

    @Step("Send GET request to /api/1/statistic/:id to get statistic about ad with incorrect item id")
    public Response getStatisticAboutAdWithIncorrectId(String itemId){
        return spec().log().all()
                .when()
                .get(GET_AD_STATISTIC_BY_ID.replace(":id", itemId));
    }

    @Step("Send GET request to /api/1/statistic/:id to get statistic about ad without item id")
    public Response getStatisticAboutAdWithoutId(){
        return spec().log().all()
                .when()
                .get(GET_AD_STATISTIC_BY_ID);
    }

    @Step("Send GET request to /api/1/:sellerID/item to get info about ad with incorrect sellerID")
    public Response getInfoAboutAdsWithIncorrectSellerId(String sellerId) {
        return spec().log().all()
                .when()
                .get(GET_ADS_BY_SELLER_ID.replace(":sellerID", sellerId));
    }

    @Step("Send GET request to /api/1/:sellerID/item to get info about ad with incorrect request")
    public Response getInfoAboutAdsWithIncorrectGetRequest(){
        return spec().log().all()
                .when()
                .get(GET_ADS_BY_SELLER_ID.substring(0, 6));
    }
}

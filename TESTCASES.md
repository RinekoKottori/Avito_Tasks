# ## ПОЗИТИВНЫЕ ТЕСТЫ:

## **Id тест-кейса: **
### API-1

**Название тест-кейса:**
Создать обяъявление запросом POST /api/1/item

**Окружение:** 
HOST - https://qa-internship.avito.com;

 **Шаги:**
1. Ввести ключ sellerId со значением 999995;
2. Ввести ключ name со значением "Seo";
3. Ввести ключ price со значением 568;

**Ожидаемый результат:**
Статуст код: 200 OK;
Структура ответа: {\n  \"status\": \"<string>\"\n};

 **Статуст:**

**Id баг-репорта:** 

----------------------------------------------------------------------

## **Id тест-кейса: **
### API-2

**Название тест-кейса:**
Получить объявление по его id запросом GET /api/1/item/:id

**Окружение:** 
HOST - https://qa-internship.avito.com;

**Предусловие:**

1. Ввести ключ sellerId со значением 999995;
2. Ввести ключ name со значением "Seo";
3. Ввести ключ price со значением 373;
4. Скопировать полученный id объявления;

**Шаги:**
1. Ввести в url запроса / query-параметр  - id объявления:


**Ожидаемый результат:**
Статуст код: 200 OK;
Структура ответа: 
{
    "id": "<string>",
    "sellerId": 999997,
    "name": "Seo",
    "price": 373,
    "statistics": {
      "likes": 0,
      "viewCount": 0,
      "contacts": 0
    },
    "createdAt": "<string>"(current day/time)
}

**Статуст:**

**Id баг-репорта:** 

----------------------------------------------------------------------

## **Id тест-кейса: **
### API-3

 **Название тест-кейса:**
 Получить объявление по id продовца запросом GET /api/1/:sellerId/item

 **Окружение:**
 HOST - https://qa-internship.avito.com;


 **Предусловия:**
 1. Ввести ключ sellerId со значением 999995;
 2. Ввести ключ name со значением "Seo";
 3. Ввести ключ price со значением 128;

 **Шаги:**
 1. Ввести в url запроса / query-параметр  - id продовца: 999997

 **Ожидаемый результат:**
 Статуст код: 200 OK;
 Структура ответа: 
 [
  {
    "id": "<string>",
    "sellerId": 999997,
    "name": "Seo",
    "price": 128,
    "statistics": {
      "likes": 0,
      "viewCount": 0,
      "contacts": 0
    },
    "createdAt": "<string>"(current day/time)
},
...
]

 **Статуст:**

 **Id баг-репорта:**
BGAPI-1,  BGAPI-2, BGAPI-3
----------------------------------------------------------------------

## **Id тест-кейса: **
### API-4

 **Название тест-кейса:**
 Получить статистику по id объявления запросом GET /api/1/statistic/:id
 
 **Окружение:**
 HOST - https://qa-internship.avito.com;

 **Предусловия:**
 1. Ввести ключ sellerId со значением 999995;
 2. Ввести ключ name со значением "Seo";
 3. Ввести ключ price со значением 5557;
 4. Скопировать полученный id объявления;

 **Шаги:**
 1. Ввести в url запроса / query-параметр  - id объявления;

 **Ожидаемый результат:**
 Статуст код: 200 OK;
 Структура ответа: 
    {
      "likes": 0,
      "viewCount": 0,
      "contacts": 0
    }

 **Статуст:**

 **Id баг-репорта:** 

 ***----------------------------------------------------------------------***

# ## НЕГАТИВНЫЕ ТЕСТЫ:

## **Id тест-кейса: **
### API-5

**Название тест-кейса:**
Получить Status code 400 Bad Rquest при создании объявления запросом POST /api/1/item с пустым объектом{}

**Окружение:** 
HOST - https://qa-internship.avito.com;

 **Шаги:**
1. Передать в теле запроса пустой объект {};

**Ожидаемый результат:**
Статуст код: 400 Bad Rquest;
Структура ответа: 
{
  "result": {
    "messages": {
      "nostrudffb": "<string>",
      "Ut__": "<string>"
    },
    "message": "<string>"
  },
  "status": "<string>"
}

 **Статуст:**

**Id баг-репорта:** 
BGAPI-5
----------------------------------------------------------------------

## **Id тест-кейса: **
### API-6

**Название тест-кейса:**
Получить Status code 400 Bad Rquest при создании объявления запросом POST /api/1/item без объекта/тела запроса

**Окружение:** 
HOST - https://qa-internship.avito.com;

 **Шаги:**
1. Отправить запрос без тела;

**Ожидаемый результат:**
Статуст код: 400 Bad Rquest;
Структура ответа: 
{
  "result": {
    "messages": {
      "nostrudffb": "<string>",
      "Ut__": "<string>"
    },
    "message": "<string>"
  },
  "status": "<string>"
}

 **Статуст:**

**Id баг-репорта:** 
BGAPI-4
----------------------------------------------------------------------

## **Id тест-кейса: **
### API-7

**Название тест-кейса:**
Получить Status code 400 Bad Rquest при создании объявления запросом POST /api/1/item, передав значение ключа sellerId с типом String;

**Окружение:** 
HOST - https://qa-internship.avito.com;

 **Шаги:**
 1. Ввести ключ sellerId со значением "sellerId";
 2. Ввести ключ name со значением "Seo";
 3. Ввести ключ price со значением 5357;

**Ожидаемый результат:**
Статуст код: 400 Bad Rquest;
Структура ответа: 
{
  "result": {
    "messages": {
      "nostrudffb": "<string>",
      "Ut__": "<string>"
    },
    "message": "<string>"
  },
  "status": "<string>"
}

 **Статуст:**

**Id баг-репорта:** 

----------------------------------------------------------------------

## **Id тест-кейса: **
### API-8

**Название тест-кейса:**
Получить Status code 400 Bad Rquest при создании объявления запросом POST /api/1/item, передав значение ключа sellerId с типом Float;

**Окружение:** 
HOST - https://qa-internship.avito.com;

 **Шаги:**
 1. Ввести ключ sellerId со значением 999995.1;
 2. Ввести ключ name со значением "Seo";
 3. Ввести ключ price со значением 5357;

**Ожидаемый результат:**
Статуст код: 400 Bad Rquest;
Структура ответа: 
{
  "result": {
    "messages": {
      "nostrudffb": "<string>",
      "Ut__": "<string>"
    },
    "message": "<string>"
  },
  "status": "<string>"
}

 **Статуст:**

**Id баг-репорта:** 


----------------------------------------------------------------------

## **Id тест-кейса: **
### API-9

**Название тест-кейса:**
Получить Status code 400 Bad Rquest при создании объявления запросом POST /api/1/item, не передав значение ключа sellerId;

**Окружение:** 
HOST - https://qa-internship.avito.com;

 **Шаги:**
 1. Ввести ключ name со значением "Seo";
 2. Ввести ключ price со значением 5857;

**Ожидаемый результат:**
Статуст код: 400 Bad Rquest;
Структура ответа: 
{
  "result": {
    "messages": {
      "nostrudffb": "<string>",
      "Ut__": "<string>"
    },
    "message": "<string>"
  },
  "status": "<string>"
}

 **Статуст:**

**Id баг-репорта:** 
BGAPI-6
----------------------------------------------------------------------

## **Id тест-кейса: **
### API-10

**Название тест-кейса:**
Получить Status code 400 Bad Rquest при создании объявления POST /api/1/item, передав значение ключа sellerId со спец.значением Null;

**Окружение:** 
HOST - https://qa-internship.avito.com;

 **Шаги:**
 1. Ввести ключ sellerId со значением Null;
 2. Ввести ключ name со значением "Seo";
 3. Ввести ключ price со значением 5857;

**Ожидаемый результат:**
Статуст код: 400 Bad Rquest;
Структура ответа: 
{
  "result": {
    "messages": {
      "nostrudffb": "<string>",
      "Ut__": "<string>"
    },
    "message": "<string>"
  },
  "status": "<string>"
}

 **Статуст:**

**Id баг-репорта:** 
BGAPI-7
----------------------------------------------------------------------

## **Id тест-кейса: **
### API-11

**Название тест-кейса:**
Получить Status code 400 Bad Rquest при создании объявления запросом POST /api/1/item, передав значение ключа sellerId пустым;

**Окружение:** 
HOST - https://qa-internship.avito.com;

 **Шаги:**
 1. Ввести ключ sellerId оставить значение пустым;
 2. Ввести ключ name со значением "Seo";
 3. Ввести ключ price со значением 5857;

**Ожидаемый результат:**
Статуст код: 400 Bad Rquest;
Структура ответа: 
{
  "result": {
    "messages": {
      "nostrudffb": "<string>",
      "Ut__": "<string>"
    },
    "message": "<string>"
  },
  "status": "<string>"
}

 **Статуст:**

**Id баг-репорта:** 
BGAPI-7
----------------------------------------------------------------------

## **Id тест-кейса: **
### API-12

**Название тест-кейса:**
Получить Status code 400 Bad Rquest при создании объявления запросом POST /api/1/item, передав значение ключа name с типом Integer;

**Окружение:** 
HOST - https://qa-internship.avito.com;

 **Шаги:**
 1. Ввести ключ sellerId со значением 999995;
 2. Ввести ключ name со значением 78;
 3. Ввести ключ price со значением 5457;

**Ожидаемый результат:**
Статуст код: 400 Bad Rquest;
Структура ответа: 
{
  "result": {
    "messages": {
      "nostrudffb": "<string>",
      "Ut__": "<string>"
    },
    "message": "<string>"
  },
  "status": "<string>"
}

 **Статуст:**

**Id баг-репорта:** 

----------------------------------------------------------------------

## **Id тест-кейса: **
### API-13

**Название тест-кейса:**
Получить Status code 400 Bad Rquest при создании объявления запросом POST /api/1/item, передав значение ключа name с пустой строкой;

**Окружение:** 
HOST - https://qa-internship.avito.com;

 **Шаги:**
 1. Ввести ключ sellerId со значением 999995;
 2. Ввести ключ name со значением "";
 3. Ввести ключ price со значением 5257;

**Ожидаемый результат:**
Статуст код: 400 Bad Rquest;
Структура ответа: 
{
  "result": {
    "messages": {
      "nostrudffb": "<string>",
      "Ut__": "<string>"
    },
    "message": "<string>"
  },
  "status": "<string>"
}

 **Статуст:**

**Id баг-репорта:** 
BGAPI-8
----------------------------------------------------------------------


## **Id тест-кейса: **
### API-14

**Название тест-кейса:**
Получить Status code 400 Bad Rquest при создании объявления запросом POST /api/1/item, не передав ключ name;

**Окружение:** 
HOST - https://qa-internship.avito.com;

 **Шаги:**
 1. Ввести ключ sellerId со значением 999995;
 2. Ввести ключ price со значением 5157;

**Ожидаемый результат:**
Статуст код: 400 Bad Rquest;
Структура ответа: 
{
  "result": {
    "messages": {
      "nostrudffb": "<string>",
      "Ut__": "<string>"
    },
    "message": "<string>"
  },
  "status": "<string>"
}

 **Статуст:**

**Id баг-репорта:** 
BGAPI-10
----------------------------------------------------------------------

## **Id тест-кейса: **
### API-15

**Название тест-кейса:**
Получить Status code 400 Bad Rquest при создании объявления запросом POST /api/1/item, передав в значение ключа name со спец.значение Null;

**Окружение:** 
HOST - https://qa-internship.avito.com;

 **Шаги:**
 1. Ввести ключ sellerId со значением 999995;
 2. Ввести ключ name со значением Null;
 3. Ввести ключ price со значением 5157;

**Ожидаемый результат:**
Статуст код: 400 Bad Rquest;
Структура ответа: 
{
  "result": {
    "messages": {
      "nostrudffb": "<string>",
      "Ut__": "<string>"
    },
    "message": "<string>"
  },
  "status": "<string>"
}

 **Статуст:**

**Id баг-репорта:** 
BGAPI-9
----------------------------------------------------------------------

## **Id тест-кейса: **
### API-16

**Название тест-кейса:**
Получить Status code 400 Bad Rquest при создании объявления запросом POST /api/1/item, передав в значение ключа price типа string;

**Окружение:** 
HOST - https://qa-internship.avito.com;

 **Шаги:**
 1. Ввести ключ sellerId со значением 999995;
 2. Ввести ключ name со значением "Seo";
 3. Ввести ключ price со значением "5157";

**Ожидаемый результат:**
Статуст код: 400 Bad Rquest;
Структура ответа: 
{
  "result": {
    "messages": {
      "nostrudffb": "<string>",
      "Ut__": "<string>"
    },
    "message": "<string>"
  },
  "status": "<string>"
}

 **Статуст:**

**Id баг-репорта:** 

----------------------------------------------------------------------

## **Id тест-кейса: **
### API-17

**Название тест-кейса:**
Получить Status code 400 Bad Rquest при создании объявления запросом POST /api/1/item, не передав ключ price;

**Окружение:** 
HOST - https://qa-internship.avito.com;

 **Шаги:**
 1. Ввести ключ sellerId со значением 999995;
 2. Ввести ключ name со значением "Seo";

**Ожидаемый результат:**
Статуст код: 400 Bad Rquest;
Структура ответа: 
{
  "result": {
    "messages": {
      "nostrudffb": "<string>",
      "Ut__": "<string>"
    },
    "message": "<string>"
  },
  "status": "<string>"
}

 **Статуст:**

**Id баг-репорта:** 
BGAPI-11
----------------------------------------------------------------------

## **Id тест-кейса: **
### API-19

**Название тест-кейса:**
Получить Status code 400 Bad Rquest при создании объявления запросом POST /api/1/item, передав в значение ключа price спец.значение Null;

**Окружение:** 
HOST - https://qa-internship.avito.com;

 **Шаги:**
 1. Ввести ключ sellerId со значением 999995;
 2. Ввести ключ name со значением "Seo";
 3. Ввести ключ price со значением Null;

**Ожидаемый результат:**
Статуст код: 400 Bad Rquest;
Структура ответа: 
{
  "result": {
    "messages": {
      "nostrudffb": "<string>",
      "Ut__": "<string>"
    },
    "message": "<string>"
  },
  "status": "<string>"
}

 **Статуст:**

**Id баг-репорта:** 
BGAPI-12
---------------------------------------------------------------------

## **Id тест-кейса: **
### API-20

**Название тест-кейса:**
Получить Status Code 404, указав не существующий id в запросе GET /api/1/item/:id, 

**Окружение:** 
HOST - https://qa-internship.avito.com;

 **Предусловия:**
 1. Ввести ключ sellerId со значением 999995;
 2. Ввести ключ name со значением "Seo2";
 3. Ввести ключ price со значением 999;
 4. Скопировать полученный id объявления;
   
**Шаги:**
1. Ввставить в url запроса / query-параметр id объявления:
2. Изменить символ в id: 
3. Отправить запрос;


**Ожидаемый результат:**
Статуст код: 404 Not Found;
Структура ответа: 
{
  "result": {
    "messages": {},
    "message": "<string>"
  },
  "status": "<string>"
}

 **Статуст:**

**Id баг-репорта:** 

----------------------------------------------------------------------

## **Id тест-кейса: **
### API-21

**Название тест-кейса:**
Получить Status Code 500 при удалении id из запроса GET /api/1/item/:id

**Окружение:** 
HOST - https://qa-internship.avito.com;

 **Предусловия:**
 1. Ввести ключ sellerId со значением 999995;
 2. Ввести ключ name со значением "Seo3";
 3. Ввести ключ price со значением 991;
   
**Шаги:**
1. Отправить запрос GET /api/1/item/:id


**Ожидаемый результат:**
Статуст код: 500 Server Error;
{
  "result": {
    "messages": {},
    "message": "<string>"
  },
  "status": "<string>"
}

 **Статуст:**

**Id баг-репорта:** 
BGAPI-13
----------------------------------------------------------------------

## **Id тест-кейса: **
### API-22

**Название тест-кейса:**
Получить Status Code 404, указав не существующий id в запросе GET /api/1/statistic/:id

**Окружение:** 
HOST - https://qa-internship.avito.com;

 **Предусловия:**
 1. Ввести ключ sellerId со значением 999995;
 2. Ввести ключ name со значением "Seo7";
 3. Ввести ключ price со значением 999;
 4. Скопировать полученный id объявления;
   
**Шаги:**
1. Ввставить в url запроса / query-параметр id объявления:
2. Изменить символ в id: 
3. Отправить запрос;


**Ожидаемый результат:**
Статуст код: 404 Not Found;
Структура ответа: 
{
  "result": {
    "messages": {},
    "message": "<string>"
  },
  "status": "<string>"
}

 **Статуст:**

**Id баг-репорта:** 
BGAPI-14
----------------------------------------------------------------------

## **Id тест-кейса: **
### API-23

**Название тест-кейса:**
Получить Status Code 500 при удалении из id из запроса GET /api/1/statistic/:id

**Окружение:** 
HOST - https://qa-internship.avito.com;

 **Предусловия:**
 1. Ввести ключ sellerId со значением 999995;
 2. Ввести ключ name со значением "Seo7";
 3. Ввести ключ price со значением 996.
   
**Шаги:**
1. Отправить запрос GET /api/1/statistic/


**Ожидаемый результат:**
Статуст код: 500 Server Error;
{
  "result": {
    "messages": {},
    "message": "<string>"
  },
  "status": "<string>"
}

 **Статуст:**

**Id баг-репорта:** 
BGAPI-15
----------------------------------------------------------------------

## **Id тест-кейса: **
### API-24

**Название тест-кейса:**
Получить Status Code 400, указав не корректный тип id в запросе GET /api/1/:sellerID/item

**Окружение:** 
HOST - https://qa-internship.avito.com;

 **Предусловия:**
 1. Ввести ключ sellerId со значением 999995;
 2. Ввести ключ name со значением "Seo21";
 3. Ввести ключ price со значением 999;
   
**Шаги:**
1. Ввставить в url запроса / query-параметр sellerID: 1.67;
2. Отправить запрос.


**Ожидаемый результат:**
Статуст код: 400 Bad Request;
{
  "result": {
    "messages": {
      "nostrudffb": "<string>",
      "Ut__": "<string>"
    },
    "message": "<string>"
  },
  "status": "<string>"
}

 **Статуст:**

**Id баг-репорта:** 

----------------------------------------------------------------------

## **Id тест-кейса: **
### API-25

**Название тест-кейса:**
Получить Status Code 500 при удалении item из запроса GET /api/1/:sellerID/item

**Окружение:** 
HOST - https://qa-internship.avito.com;

 **Предусловия:**
 1. Ввести ключ sellerId со значением 999995;
 2. Ввести ключ name со значением "Seo7";
 3. Ввести ключ price со значением 996;
   
**Шаги:**
1. Отправить запрос GET /api/1/:sellerID/


**Ожидаемый результат:**
Статуст код: 500 Server Error;
{
  "result": {
    "messages": {},
    "message": "<string>"
  },
  "status": "<string>"
}

 **Статуст:**

**Id баг-репорта:** 
BGAPI-16


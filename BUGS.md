# **Задание 1**

## **Id:**
##  UI-1

### **Название:**
  Некорректная сортировка по городу в разделе Велосипеды-Горные

**Окружение:** 
-;

 **Шаги:**
 1. Отсортировать объявления по городу, кликнув по tooglebar "Сначала из Москвы"

**Ожидаемый результат:**
  Все отображаемые объявления из Москвы должны быть вверху списка, а остальные - внизу.

**Фактический результат:**
  В списке из отображаемых 12 объявлений, 8-ое объявление из Липецка. 

**Дополнительные материалы:**

![Некорректность сортировки по городу](images\Uncorrect_town_filter.png)

----------------------------------------------------------------------

## **Id:**
##  UI-2

### **Название:**
  Некорректная сортировка по цене в разделе Велосипеды-Горные

**Окружение:** 
-;

 **Шаги:**
 1. Отсортировать объявления по цене, кликнув выпадающему списку "Сортировать";
 2. Выбрать "Дороже";

**Ожидаемый результат:**
  Все отображаемые объявления должны быть отсортированы по ценне от большего к меньшему.

**Фактический результат:**
  Сортировки по цене не произошло, хаотичное отображение объявлений по цене.

**Дополнительные материалы:**

----------------------------------------------------------------------

## **Id:**
##  UI-2

### **Название:**
  Некорректная сортировка по бренду в разделе Велосипеды-Горные

**Окружение:** 
-;

 **Шаги:**
 1. Отсортировать объявления по бренду Author, кликнув на чек-бокс Author в разделе Бренд;
 2. Выбрать "Дороже";

**Ожидаемый результат:**
  Все отображаемые объявления должны быть отсортированы по бренду Author.

**Фактический результат:**
  В списке из отображаемых 12 объявлений, 8-ое объявление бренда Atom. 

**Дополнительные материалы:**

![Некорректность сортировки по бренду](images\Uncorrect_brend_filter.png)

----------------------------------------------------------------------


# **Задание 2.1**

## **Id:**
##  BGAPI-1

### **Название:**
  Неверный JSON ответ при получении информации об объявлении через запрос GET /api/1/:sellerID/item

**Окружение:** 
HOST - https://qa-internship.avito.com

**Предусловия:**
 1. Создать объявление
 2. Ввести ключ - значение в тело запросоа в формате JSON:
   "sellerID": 999995,
    "name": "zkcfAmt",
    "price": 47
 3. Отправить запрос POST api/1/item

 **Шаги:**
 1. Отправить запрос GET api/1/999995/item

**Ожидаемый результат:**
Значение ключа id совпадает с значением из созданного обявления id айтема.
 
**Фактический результат:**
Значение ключа id подменяется на значение name.

**Дополнительные материалы:**
Log ошибки:
JSON path id doesn't match.
>Expected: a collection containing "dbbd4620-74bd-44e3-8180-68e66c0c5703";
  Actual: <[dsdsd, dsdsd, dsdsd, dsdsd, dsdsd, dsdsd, dsdsd, dsdsd, dsdsd, dsdsd, dsdsd, dsdsd, dsdsd, dsdsd, dsdsd, dsdsd, dsdsd, dsdsd, dsdsd, dsdsd, dsdsd, dsdsd, dsdsd, dsdsd, dsdsd, dsdsd, dsdsd, dsdsd, dsdsd, dsdsd, dsdsd, dsdsd]>;

  Связанный Баг : BGAPI-3

----------------------------------------------------------------------

## **Id:**
## BGAPI-2

### **Название:**
  Неверное значение ключа name в JSON ответе при получении информации об объявлении через запрос GET /api/1/:sellerID/item

**Окружение:** 
HOST - https://qa-internship.avito.com

**Предусловия:**
 1. Создать объявление
 2. Ввести ключ - значение в тело запросоа в формате JSON:
   "sellerID": 999995,
    "name": "zkcfAmt",
    "price": 47
 3. Отправить запрос POST api/1/item

 **Шаги:**
 1. Отправить запрос GET api/1/999995/item

**Ожидаемый результат:**
Значение ключа name совпадает с значением из созданного обявления.
 
**Фактический результат:**
Значение name подменяется на значение dsdsd.

**Дополнительные материалы:**

----------------------------------------------------------------------

## **Id:**
##  BGAPI-3

### **Название:**
  Неверное значение ключа name в JSON ответе при получении информации об объявлении через запрос GET /api/1/:sellerID/item

**Окружение:** 
HOST - https://qa-internship.avito.com

**Предусловия:**
 1. Создать объявление
 2. Ввести ключ - значение в тело запросоа в формате JSON:
   "sellerID": 999995,
    "name": "zkcfAmt",
    "price": 47
 3. Отправить запрос POST api/1/item

 **Шаги:**
 1. Отправить запрос GET api/1/999995/item

**Ожидаемый результат:**
Значение ключа name совпадает с значением из созданного обявления.
 
**Фактический результат:**
Значение name подменяется на значение dsdsd.

**Дополнительные материалы:**

----------------------------------------------------------------------

## **Id:**
##  BGAPI-4

### **Название:**
  Статус код 200 при отправке запроса POST api/1/item без тела/объекта

**Окружение:** 
HOST - https://qa-internship.avito.com

 **Шаги:**
 1. Создать объявление
 2. Не писать тело запроса
 3. Отправить запрос POST api/1/item

**Ожидаемый результат:**
Статус код: 400 Bad Request
 
**Фактический результат:**
Статус код: 200 Ok

**Дополнительные материалы:**

----------------------------------------------------------------------

## **Id:**
##  BGAPI-5

### **Название:**
  Статус код 200 при отправке запроса POST api/1/item с пустым телом запроса/без ключей

**Окружение:** 
HOST - https://qa-internship.avito.com

 **Шаги:**
 1. Создать объявление
 2. Написать тело запроса {}
 3. Отправить запрос POST api/1/item

**Ожидаемый результат:**
Статус код: 400 Bad Request
 
**Фактический результат:**
Статус код: 200 Ok

**Дополнительные материалы:**

----------------------------------------------------------------------

## **Id:**
##  BGAPI-6

### **Название:**
  Статус код 200 при отправке запроса POST api/1/item без ключа sellerId

**Окружение:** 
HOST - https://qa-internship.avito.com

 **Шаги:**
 1. Создать объявление
 2. Написать тело запроса 
   {
      "name": "Seo",
      "price": 113
   }

 3. Отправить запрос POST api/1/item

**Ожидаемый результат:**
Статус код: 400 Bad Request
 
**Фактический результат:**
Статус код: 200 Ok

**Дополнительные материалы:**\

----------------------------------------------------------------------

## **Id:**
##  BGAPI-7

### **Название:**
  Статус код 200 при отправке запроса POST api/1/item со значением Null для ключа sellerId 

**Окружение:** 
HOST - https://qa-internship.avito.com

 **Шаги:**
 1. Создать объявление
 2. Написать тело запроса 
   {
      "sellerId": null,
      "name": "Seo",
      "price": 113
   }

 3. Отправить запрос POST api/1/item

**Ожидаемый результат:**
Статус код: 400 Bad Request
 
**Фактический результат:**
Статус код: 200 Ok

**Дополнительные материалы:**

----------------------------------------------------------------------

## **Id:**
##  BGAPI-8

### **Название:**
  Статус код 200 при отправке запроса POST api/1/item с пустой строкой для ключа name 

**Окружение:** 
HOST - https://qa-internship.avito.com

 **Шаги:**
 1. Создать объявление
 2. Написать тело запроса 
   {
      "sellerId": 999995,
      "name": "",
      "price": 115
   }

 3. Отправить запрос POST api/1/item

**Ожидаемый результат:**
Статус код: 400 Bad Request
 
**Фактический результат:**
Статус код: 200 Ok

**Дополнительные материалы:**

----------------------------------------------------------------------

## **Id:**
##  BGAPI-9

### **Название:**
  Статус код 200 при отправке запроса POST api/1/item со спец.значением null для ключа name 

**Окружение:** 
HOST - https://qa-internship.avito.com

 **Шаги:**
 1. Создать объявление
 2. Написать тело запроса 
   {
      "sellerId": 999995,
      "name": null,
      "price": 115
   }

 3. Отправить запрос POST api/1/item

**Ожидаемый результат:**
Статус код: 400 Bad Request
 
**Фактический результат:**
Статус код: 200 Ok

**Дополнительные материалы:**

----------------------------------------------------------------------

## **Id:**
##  BGAPI-10

### **Название:**
  Статус код 200 при отправке запроса POST api/1/item без ключа name 

**Окружение:** 
HOST - https://qa-internship.avito.com

 **Шаги:**
 1. Создать объявление
 2. Написать тело запроса 
   {
      "sellerId": 999995,
      "price": 115
   }

 3. Отправить запрос POST api/1/item

**Ожидаемый результат:**
Статус код: 400 Bad Request
 
**Фактический результат:**
Статус код: 200 Ok

**Дополнительные материалы:**

----------------------------------------------------------------------

## **Id:**
##  BGAPI-11

### **Название:**
  Статус код 200 при отправке запроса POST api/1/item без ключа price 

**Окружение:** 
HOST - https://qa-internship.avito.com

 **Шаги:**
 1. Создать объявление
 2. Написать тело запроса 
   {
      "sellerId": 999995,
      "name": "Seo"
   }

 3. Отправить запрос POST api/1/item

**Ожидаемый результат:**
Статус код: 400 Bad Request
 
**Фактический результат:**
Статус код: 200 Ok

**Дополнительные материалы:**

----------------------------------------------------------------------

## **Id:**
##  BGAPI-12

### **Название:**
  Статус код 200 при отправке запроса POST api/1/item без ключа price 

**Окружение:** 
HOST - https://qa-internship.avito.com

 **Шаги:**
 1. Создать объявление
 2. Написать тело запроса 
   {
      "sellerId": 999995,
      "name": "Seo",
      "price": null
   }

 3. Отправить запрос POST api/1/item

**Ожидаемый результат:**
Статус код: 400 Bad Request
 
**Фактический результат:**
Статус код: 200 Ok

**Дополнительные материалы:**

----------------------------------------------------------------------

## **Id:**
##  BGAPI-13

### **Название:**
  Статус код 400 при отправке запроса GET api/1/item/:id при отсутствии id

**Окружение:** 
HOST - https://qa-internship.avito.com

 **Шаги:**
 1. Отправить запрос GET api/1/item/:id

**Ожидаемый результат:**
Статус код: 500 Server Error
 
**Фактический результат:**
Статус код: 400 Bad Request 

**Дополнительные материалы:**

----------------------------------------------------------------------

## **Id:**
##  BGAPI-14

### **Название:**
  Статус код 400 при отправке запроса GET/api/1/statistic/:id с id не существующего объявления

**Окружение:** 
HOST - https://qa-internship.avito.com

**Предусловия:**
 1. Создать объявление
 2. Написать тело запроса 
   {
      "sellerId": 999995,
      "name": "Seo",
      "price": 465
   }

  3. Скопировать полученнный id айтема
   
 **Шаги:**
  1. Отправить запрос GET/api/1/statistic/:id с измененнием id на несуществующий id, путём замены 1 буквы.

**Ожидаемый результат:**
Статус код: 404 Not Found
 
**Фактический результат:**
Статус код: 400 Bad Request 

**Дополнительные материалы:**

Плавающий баг, при мануальной проверки тест может пройти и выдать 404 Not Found, но при автоматической проверке падает.

----------------------------------------------------------------------

## **Id:**
##  BGAPI-15

### **Название:**
  Статус код 400 при отправке запроса GET /api/1/statistic/:id без id

**Окружение:** 
HOST - https://qa-internship.avito.com

 **Шаги:**
 1. Отправить запрос GET/api/1/statistic/:id

**Ожидаемый результат:**
Статус код: 500 Server Error
 
**Фактический результат:**
Статус код: 400 Bad Request 

**Дополнительные материалы:**

----------------------------------------------------------------------

## **Id:**
##  BGAPI-16

### **Название:**
  Статус код 500 при отправке запроса GET /api/1/:sellerID/item без item

**Окружение:** 
HOST - https://qa-internship.avito.com

 **Шаги:**
 1. Отправить запрос GET /api/1/:sellerID/
 

**Ожидаемый результат:**
Статус код: 500 Server Error
 
**Фактический результат:**
Статус код: 400 Bad Request 

**Дополнительные материалы:**

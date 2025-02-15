# Необходимые зависимости

Можно найти в репозитории Maven по ссылке: https://mvnrepository.com/repos/central

| Dependencies | Version   |
|--------------|-----------|
| Java         | 11.0.24_8 |
| JUnit        | 4.13.1    |
| JDK          | 11.0.24   |
| Maven        | 11        |
| Allure       | 2.29.0    |
| Aspectj      | 4.13.1    |
| Rest-assured | 5.5.0     |
| Gson         | 2.11.0    |

# Необходимые плагины

Можно найти в репозитории Maven по ссылке: https://mvnrepository.com/repos/central

| Plugin         | Version  | configuration |
|----------------|----------|---------------|
| Maven-surefire | 3.5.0    |               |
| Allure-maven   | 2.12.0   | 2.30.0        | 

# Консольные команды
## Проверка, что Java установлен
`java -version`

## Running the test
`mvn clean test`

## Для просмотра отчёта в Allure
`mvn allure:serve`
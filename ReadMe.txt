развернуть базу
sudo docker-compose -f ./docker/docker-compose.yml up -d

проверить что контейнер создан
sudo docker ps

собрать проект
mvn clean install

посмотреть базу
sudo docker exec -it demo_db psql demo demo

Запустить проект (после сборки в папке target)
java -jar demo-0.0.1-SNAPSHOT.jar

Проверить. В браузере должен отобразиться свагер
http://localhost:8080/swagger-ui.html

Создать владельца страховки
curl -X POST "http://localhost:8080/insuranceHolder" -H "accept: application/json" -H "Content-Type: application/json" -d "{ \"birthDate\": \"1981-03-12\", \"firstName\": \"Иван\", \"lastName\": \"Иванов\", \"middleName\": \"Иванович\", \"passportId\": 654321, \"passportSeries\": 1234}"

Посмотреть список созданных владельцев страховок
curl -X GET "http://localhost:8080/insuranceHolders" -H "accept: application/json"
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
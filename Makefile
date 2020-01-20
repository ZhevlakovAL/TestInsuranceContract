.ONESHELL:

db-start:
	sudo docker-compose -f ./docker/docker-compose.yml up -d

db-down:
	sudo docker-compose \
	-f ./docker/docker-compose.yml down

.PHONY: test
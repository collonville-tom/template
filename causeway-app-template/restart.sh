docker kill causeway-template-webapp-mongo;
docker kill causeway-template-webapp-postgres;
docker rm causeway-template-webapp-mongo;
docker rm causeway-template-webapp-postgres;
docker-compose build;
docker-compose up -d

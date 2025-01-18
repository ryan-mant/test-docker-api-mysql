#!/bin/bash

export DB_HOST=db

echo "Waiting for database to be ready..."

until mysqladmin ping -h "$DB_HOST" --silent; do
  echo "Waiting for database..."
  sleep 2
done

echo "Database is up - executing command"

exec java -jar /app/app.jar

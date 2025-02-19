@echo off
REM Change directory to two levels up from the script location
cd %~dp0\..\..\

REM Run docker-compose with multiple files
docker-compose -f docker-compose.yaml -f docker-compose.camunda8.yaml -f docker-compose.demo-data-loader.camunda8.yaml -f docker-compose.event-hub.camunda8.yaml -f docker-compose.websocket.yaml -f docker-compose.novu.yaml -f docker-compose.email-sender.yaml -f docker-compose.portal.yaml up -d --build

REM Change back to the original directory
cd %CD%

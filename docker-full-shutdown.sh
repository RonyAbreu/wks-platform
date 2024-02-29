#!/bin/bash

# Run docker-compose with multiple files
docker-compose -f docker-compose.yaml -f docker-compose.demo-data-loader.yaml -f docker-compose.kafka.yaml -f docker-compose.websocket.yaml -f docker-compose.novu.yaml -f docker-compose.portal.yaml down --remove-orphans -v "$@"
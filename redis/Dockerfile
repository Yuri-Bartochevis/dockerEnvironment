FROM        ubuntu
MAINTAINER Yuri-Bartochevis
RUN         apt-get update && apt-get install -y redis-server
EXPOSE      6379
# Run Redis
ENTRYPOINT  ["/usr/bin/redis-server"]

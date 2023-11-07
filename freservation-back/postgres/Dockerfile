FROM postgres:16
LABEL authors="corentin_lefranc"

ENV POSTGRES_USER postgres
ENV POSTGRES_PASSWORD pass
ENV POSTGRES_DB freservation

ADD init_db.sh /docker-entrypoint-initdb.d
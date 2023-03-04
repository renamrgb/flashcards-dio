FROM gradle:7.5.1-jdk17

RUN apt-get update && apt-get install -qq -y --no-recommends

ENV INSTALL_PATH /flashcards-dio

RUN mkdir $INSTALL_PATH

WORKDIR $INSTALL_PATH

COPY . .

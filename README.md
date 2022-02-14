# Spring Boot Rsocket deployed on Heroku 

This project is a demo of Spring Boot app using `RSocket protocol` and deployed on Heroku platform.

# RSocket client

The easiest way to test the connection is to use the RSocket client.

## To download the RSocket Client CLI
`wget -O rsc.jar https://github.com/making/rsc/releases/download/0.9.1/rsc-0.9.1.jar`

## To make the client easier to work with, set an alias
``alias rsc='java -jar rsc.jar'```

## To use the client to do request-response against a server on tcp://localhost:7000
`rsc --debug --request --route request-response wss://YOUR_APP_NAME.herokuapp.com/rsocket`

# Important note

To work, Heroku need a web container. Here, this project run on ___${PORT}___ which is
defined by Heroku container. 

We define in this project the RSocket port to 7000. Heroku use load balancing. Because
of that, we have to set a ___mapping-path (/rsocket)___ in the ```application.yml file```.
Thanks to that, when we call ___wss://YOUR_APP_NAME.herokuapp.com/rsocket___, the mapping of
the port 7000 is automatically done.


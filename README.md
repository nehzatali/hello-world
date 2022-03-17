This is a hello world gradle project with Kotlin SDL enabled.

## Commands
Run the command below to start a playground container for dev/testing.
`docker run --rm -ti -v `pwd`:/app -w /app gradle:jdk8-alpine /bin/sh`

Once inside the container, run the command below to build the application.
`gradle build`

To confirm the build worked as expected run:
`gradle run`

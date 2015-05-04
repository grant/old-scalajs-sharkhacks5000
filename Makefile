# Runs locally
local:
	sbt "project server" run

# Runs from heroku
heroku:
	foreman start

# Builds the package
build:
	sbt "project server" assembly

# Runs the package
run:
	java -jar ./server/target/scala-2.11/sharkhacks5000-server-assembly-1.0-SNAPSHOT.jar

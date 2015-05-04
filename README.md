# SharkHacks5000

The home page for SharkHacks5000

## Development

How to start:

Locally:

```sh
sbt "project server" run
```

Heroku:

```sh
foreman start
```

How to package (Create a fat JAR):

```sh
sbt "project server" assembly
java -jar ./server/target/scala-2.11/sharkhacks5000-server-assembly-1.0-SNAPSHOT.jar
```



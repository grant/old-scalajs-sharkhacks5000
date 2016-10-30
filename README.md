# SharkHacks5000

The home page for SharkHacks5000. The most epic game ever.

## Development

How to continuously develop. Open 3 tabs and run the following:

```sh
sbt
project client
~fastOptJS
```

```sh
make local
```

Serve the javascript:
```sh
make js
```

## Building / Deploying

How to start:

Locally:

```sh
make local
```

Heroku:

```sh
make heroku
```

How to package (Create a fat JAR):

```sh
make build
make run
```

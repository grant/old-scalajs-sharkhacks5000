# SharkHacks5000

The home page for SharkHacks5000. The most epic game ever.

## Story

I am the cofounder of [DubHacks](dubhacks.co), the University of Washington collegiate hackathon and I directed the hackathon from 2013 to 2015. I attended [Hackcon in 2014 in NYC](http://news.mlh.io/hackcon-talks-03-31-2014) where the idea of SharkHacks5000 

![](https://cloud.githubusercontent.com/assets/744973/12055590/7340b810-aee3-11e5-9267-75d4278a415d.jpg)

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

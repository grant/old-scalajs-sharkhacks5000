# SharkHacks5000

The home page for SharkHacks5000.
| "The most epically incredible super-premier really really big hackathon that has ever happened or will ever happen in the history of the entire known universe epecially on a boat."

## Story

I am the cofounder of [DubHacks](dubhacks.co), the University of Washington collegiate hackathon and I directed the hackathon from 2013 to 2015. When I attended [Hackcon in 2014 in NYC](http://news.mlh.io/hackcon-talks-03-31-2014), the idea of SharkHacks5000 appeared - a hackathon on a boat. I thought, "Why not?", and proceeded to figure out how to make it happen. Let's start with a fun, hacky, website.

![](https://cloud.githubusercontent.com/assets/744973/12055590/7340b810-aee3-11e5-9267-75d4278a415d.jpg)

### TODO

- Create small issues of small features to add
- Draw out what you want the end to look like
- Create small components of each feature

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

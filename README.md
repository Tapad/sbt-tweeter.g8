# sbt-tweeter.g8
A [giter8](http://www.foundweekends.org/giter8/) template for creating the [sbt-tweeter](https://github.com/Tapad/sbt-tweeter) plugin, which allows users to publish Twitter status updates from the sbt console.

Developed for the *sbt: Beyond the Build Tool* workshop given at [flatMap(Oslo) 2017](http://2017.flatmap.no).

## Table of Contents
* [Installation](#installation)
* [Next steps](#next-steps)

## Installation
1. [Install sbt](http://www.scala-sbt.org/download.html)

We will be utilizing the `sbt new` command, so please ensure that you are installing, or have installed, sbt version 0.13.13 or greater. At the time of this writing, the latest version of sbt is 0.13.15.

2. Evaluate the giter8 template

Use the `sbt new` command (or `g8`, if preferred) to evaluate the [sbt-tweeter.g8](https://github.com/Tapad/sbt-tweeter.g8) template.

```
sbt new Tapad/sbt-tweeter.g8
```

While this is not strictly necessary for plugin development, it will reduce the amount of boilerplate required given a time constrained workshop.

3. Create a Twitter application and generate your access token(s)

You can do so at [https://apps.twitter.com](https://apps.twitter.com). It will require a valid Twitter account.

Although the steps to create an application are super simple, the guide available at [http://docs.inboundnow.com/guide/create-twitter-application](http://docs.inboundnow.com/guide/create-twitter-application) is extremely helpful and thorough if you should have any trouble.

Once you create your application and generate your access tokens, please ensure that your application and access token *Access Type* is set to **Read & Write**.

## Next steps
After evaluating the template, invoke sbt from the generated project.

The README.md of the generated project will contain the necessary information for extending, testing, and releasing your derived project.

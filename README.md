# mongo-pattern-search
This project includes a fully deployable Spring Boot app that handles pattern search against a MongoDb instance.

You'll need to deploy and configure your own Mongo database to make this work.

You'll also need to update the application.properties file with info specific to your MongoDb instance.

If you're interested in learning more about how this app works, feel free to check out <a href="https://careydevelopment.us/2019/01/19/pattern-like-searching-spring-boot-mongodb/" target="_blank">the tutorial.</a>

You can run the Spring Boot app by right-clicking on PatternSearchApplication and selecting Run As... Java Application.

If you're having problems starting the app, it's probably because you're not pointing to a valid Mongo database.

Here's a sample URL that accesses the app from a browser:

http://localhost:8090/moma/artworks?match=plate


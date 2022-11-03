# Twitter

A simple implementation of Twitter microservices architecture suing Spring Boot.

## Contributors

<a href = "https://github.com/hsouf/twitter-microservices/graphs/contributors">
<img src = "https://contrib.rocks/image?repo=hsouf/twitter-microservices"/>
</a>


## Architecture

<img width="972" alt="twitter" src="https://user-images.githubusercontent.com/37840702/199830627-f6ba812c-d451-40a5-a746-82f104b15395.png">



## Entities


### USER 

![chat](./Images/User.png)

### TWEET

![chat](./Images/entite-tweet.png)

### MESSAGE

![chat](./Images/Entite-message.png)
### CHAT ROOM
![chatRoom](https://user-images.githubusercontent.com/37840702/147685071-f9498db6-76c7-486d-a17d-d5b6d2e4edf3.png)

### HASHTAG

![chat](./Images/entite-Hashtag.png)

### Comment
![chat](./Images/Comment.png)

## ROUTES

### Tweet Service 

- POST http://localhost:8080/tweet-service/tweet/post : to post a tweet 
- DELETE http://localhost:8080/tweet-service/tweet/delete/1 : to delete a tweet (idpost = 1)
- POST http://localhost:8080/tweet-service/tweet/comment : to comment a tweet
- GET http://localhost:8080/tweet-service/tweet/like/1 : to like a post (idpost = 1)
- GET http://localhost:8080/tweet-service/tweet/retweet/1 : to retweet a post (idpost=1)
- GET http://localhost:8080/tweet-service/tweet/favorite/1 : to add a post to favoris (idpost=1)

### Search Service 

- GET http://localhost:8080/search-service/search/user/{username} : to search a user
- GET http://localhost:8080/search-service/search/hashtag/{hashtag} : to search hashtag
- GET http://localhost:8080//search-service/search/tweet/{tweetContent} : to search tweet


### UserTimeline Service 

- GET http://localhost:8080/usertimeline-service/timeline/user/{id} : account profile


### hometimeline Service

- GET http://localhost:8080/usertimeline-service/timeline/home

### USER service 

- POST http://localhost:8080/user-service/user/signin 
- POST http://localhost:8080/user-service/user/signup 
### DM service

Le client STOMP se connecte au serveur via un websocket au terminal suivant "http://localhost:8084/dm-service/ws", ci-dessous le code à implémenter côté client: 
```javascript

const connect = () => {
    const Stomp = require("stompjs");
    var SockJS = require("sockjs-client");
    SockJS = new SockJS("http://localhost:8080/dm-service/ws");
    stompClient = Stomp.over(SockJS);
    stompClient.connect({}, onConnected, onError);
  };
  ```
Le client ensuite envoie un message au broker sur "/app/chat" 

```javascript
const sendMessage = (msg) => {
    if (msg.trim() !== "") {
      const message = {
        senderId: currentUser.id,
        recipientId: activeContact.id,
        senderName: currentUser.name,
        recipientName: activeContact.name,
        content: msg,
        timestamp: new Date(),
      };
        
      stompClient.send("/app/chat", {}, JSON.stringify(message));
    }
  };
```



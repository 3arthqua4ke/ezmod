# ezmod

A simple chat mod for Forge 1.12.2. Converts "ez" to "e z". 

## Example: 

On the chat event, if the message content contains ez:

![ezmod](https://media.discordapp.net/attachments/770747526859980851/774618307483271178/unknown.png)


## Dev Environment:

```gradle
gradlew SetupDecompWorkspace
gradlew runClient genIntelliJ
```

## Building:

```gradle
gradlew build
```
You will find your built jar in the project directory, in `build/libs/`. 

## Release: 
## License
[MIT](https://choosealicense.com/licenses/mit/)
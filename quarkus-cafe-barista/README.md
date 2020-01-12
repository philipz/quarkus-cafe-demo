# quarkus-cafe-barista project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

## Packaging and running the application

The application is packageable using `./mvnw package`.
It produces the executable `quarkus-cafe-barista-1.0-SNAPSHOT-runner.jar` file in `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using `java -jar target/quarkus-cafe-barista-1.0-SNAPSHOT-runner.jar`.

## Creating a native executable

You can create a native executable using: `./mvnw package -Pnative`.

Or you can use Docker to build the native executable using: `./mvnw package -Pnative -Dquarkus.native.container-build=true`.

You can then execute your binary: `./target/quarkus-cafe-barista-1.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/building-native-image-guide .

{"name": "Riley","orderId": "f6308055-993b-4827-b648-3a681141de7c","product": "CAPPUCCINO","state": "IN_QUEUE"}

{"eventType":"BEVERAGE_ORDER_IN","item":"ESPRESSO","itemId":"0c767756-572b-40c5-9287-9e124354d21f","name":"Jeremy","orderId":"ec5251a3-e434-431b-83f7-8416eea725d2"}
{"eventType":"BEVERAGE_ORDER_IN","item":"CAPPUCCINO","itemId":"fd2af2b9-8d97-443d-bed8-371f2782a8b8","name":"Riley","orderId":"9103dd6b-ed58-423f-90b2-5cc4314996f3"}
{"eventType":"BEVERAGE_ORDER_IN","item":"BLACK_COFFEE","itemId":"fd2af2b9-8d97-443d-bed8-371f2782a8b3","name":"Brady","orderId":"9103dd6b-ed58-423f-90b2-5cc4314996fg"}
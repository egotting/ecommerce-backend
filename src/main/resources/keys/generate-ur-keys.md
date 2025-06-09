### Assim você ira gerar sua chave publica e privada
```bash
    cd /src/main/resources/keys && openssl genrsa > app.key && openssl rsa -in app.key -pubout -out app.pub
```
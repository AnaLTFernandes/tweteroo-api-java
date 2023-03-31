# :bird: Tweteroo Api

# Índice

- [Sobre](#Sobre)
- [Rotas](#Rotas)
    - [Cadastro](#Cadastro)

<br/>

# Sobre
Tweteroo é uma api para postagem de tweets.

<br/>

# Rotas

URL base: `http://localhost:8080/api`

<br/>

## Cadastro
- Rota: `/auth/sign-up`
- Método: `POST`
- Exemplo de Body:

  ```json
  {
    "username": "bobesponja",
    "avatar": "https://super.abril.com.br/wp-content/uploads/2020/09/04-09_gato_SITE.jpg?quality=70&strip=info"
  }
  ```


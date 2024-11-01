# :bird: Tweteroo Api

![Badge Finalizado](https://img.shields.io/static/v1?label=STATUS&message=FINALIZADO&color=success&style=for-the-badge)

# Índice

- [Sobre](#Sobre)
- [Rotas](#Rotas)
  - [Cadastro](#Cadastro)
  - [Postar tweet](#Postar-tweet)
  - [Listar tweets](#Listar-tweets)
  - [Listar tweets de um usuário](#Listar-tweets-de-um-usuário)

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

<br/>

## Postar tweet

- Rota: `/tweets`
- Método: `POST`
- Exemplo de Body:

  ```json
  {
  	"username": "bobesponja",
  	"tweet": "eu amo o hub"
  }
  ```

<br/>

## Listar tweets

- Rota: `/tweets/?page=`
- Método: `GET`
- Exemplo de Resposta:

  ```json
  [
  	{
  		"id": 1,
  		"username": "bobesponja",
  		"avatar": "https://super.abril.com.br/wp-content/uploads/2020/09/04-09_gato_SITE.jpg?quality=70&strip=info",
  		"tweet": "eu amo o hub"
  	}
  ]
  ```

<br/>

## Listar tweets de um usuário

- Rota: `/tweets/:username`
- Método: `GET`
- Exemplo de Resposta:

  ```json
  [
  	{
  		"id": 1,
  		"username": "bobesponja",
  		"avatar": "https://super.abril.com.br/wp-content/uploads/2020/09/04-09_gato_SITE.jpg?quality=70&strip=info",
  		"tweet": "eu amo o hub"
  	}
  ]
  ```

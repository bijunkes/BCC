# Como testar

## 1. Cadastrar três músicas e listar o acervo, mostrando os IDs saindo 1, 2, 3

Pode ser testado utilizando a opção do menu:

**7 - Listar acervo**

---

## 2. Reproduzir uma música três vezes e mostrar `getReproducoes()` retornando 3

Pode ser testado utilizando a opção do menu:

**6 - Reproduzir uma música**

Reproduza a mesma música três vezes.

Depois utilize uma das seguintes opções para ver o total de repetições:

* **4 - Buscar música por ID**
* **5 - Buscar música por título**
* **7 - Listar acervo**

---

## 3. Mostrar `getDuracaoFormatada()` para 354, 65 e 600 segundos

Pode ser visto utilizando a opção do menu:

**7 - Listar acervo**

---

## 4. Cadastrar um usuário, criar uma playlist para ele, adicionar músicas e mostrar `getQuantidade()` e `getDuracaoTotalSegundos()`

Pode ser testado utilizando a opção do menu:

**3 - Criar playlist e adicionar músicas**

---

## 5. Encher uma playlist até 100 músicas e tentar adicionar a 101ª, mostrando que adicionar devolve `false` e a quantidade continua 100

Pode ser testado criando uma playlist teste e adicionando a mesma música 100 vezes:

```java
Playlist playlistTeste = new Playlist(nomePlaylist, u1);

for (int i = 0; i < 100; i++) {
    playlistTeste.adicionar(m1);
}

System.out.println("Quantidade após 100 músicas: " + playlistTeste.getQuantidade());

boolean adicionou = playlistTeste.adicionar(m2);

System.out.println("Tentativa de adicionar a 101ª música: " + adicionou);
System.out.println("Quantidade após tentativa: " + playlistTeste.getQuantidade());
```

---

## 6. Remover uma música do meio da playlist e mostrar que não ficou buraco (as posições seguintes andaram para trás)

Pode ser testado criando uma playlist:

```java
Playlist playlist = new Playlist("Alice in Chains", u1);
playlist.adicionar(m1);
playlist.adicionar(m2);
playlist.adicionar(m3);

//Removendo a música da posição 1
playlist.removerNaPosicao(1);

// Mostrando as posições
System.out.println("Depois de remover:");

for (int i = 0; i < playlist.getQuantidade(); i++) {
    System.out.println(
        "Posição " + i + ": " + playlist.getNaPosicao(i).getTitulo()
    );
}
```

---

## 7. Buscar uma música por um ID que existe e por um ID que não existe (o segundo devolve `null`)

Pode ser testado utilizando as opções do menu:

* **4 - Buscar música por ID**
* **6 - Reproduzir uma música**

O retorno será:

```text
Música não encontrada.
```

Internamente, o método retorna:

```java
null
```

---

## 8. Buscar uma música por título (a versão sobrecarregada)

Pode ser testado utilizando casos com métodos de sobrecarga, por exemplo:

* **3 - Criar playlist e adicionar músicas**
* **4 - Buscar música por ID**
* **5 - Buscar música por título**
* **6 - Reproduzir uma música**
* **7 - Listar acervo**

---

## 9. Chamar `reproduzirTudo()` e mostrar que a contagem de reproduções de todas as músicas da playlist subiu

Pode ser testado após criar uma playlist teste e reproduzi-la por inteiro:

```java
Playlist playlist = new Playlist("Alice in Chains", u1);
playlist.adicionar(m1);
playlist.adicionar(m2);
playlist.adicionar(m3);

playlist.reproduzirTudo();

for (int i = 0; i < playlist.getQuantidade(); i++) {
    Musica musica = playlist.getNaPosicao(i);

    System.out.println(
        musica.getTitulo() +
        " → " +
        musica.getReproducoes() +
        " reproduções"
    );
}
```
# COLINHA - POO em Java (projeto Transportadora)

Abrir no VS Code: File > Open Folder > pasta `transportadora` (precisa da extensao
"Extension Pack for Java"). Abra `src/Main.java` e clique em **Run**.
Terminal: `javac -d out src/*.java && java -cp out Main`

## Onde esta cada conceito
| Conceito | Arquivo |
|---|---|
| Associacao unidirecional 0..1 (variavel pode ser null) | Motorista (veiculoAtual) |
| Associacao reflexiva | Motorista (supervisor) |
| Associacao bidirecional | Cliente <-> Pacote |
| Multiplicidade com limite (0..3) + ArrayList | Caminhao.embarcar() |
| Dependencia (parametro / variavel local) | GeradorRecibo |
| Agregacao (parte chega pronta) | Frota.adicionar() |
| Composicao (todo cria a parte, sem getter) | Entrega -> Rota |
| Heranca (extends) | Caminhao, Moto, Motorista, Cliente |
| Construtores em cascata, super(...) | Pessoa -> Motorista |
| Sobrescrita + @Override + super.metodo() | Caminhao.rodar() |
| protected | Veiculo.setKmRodados() usado em Moto.revisao() |
| Classe abstrata + metodo abstrato | Veiculo |
| final | Moto |
| Polimorfismo | Frota.calcularFreteTotal() |
| instanceof + downcasting | Frota.tratarEspecificos() |
| Interface, default, heranca de interface | Rastreavel, RastreavelGPS |
| Object: toString / equals / hashCode | Veiculo |

## Moldes para copiar na prova

### Classe com heranca + construtor
```java
public class Filha extends Mae {
    public Filha(String x) {
        super(x);            // 1o comando; obrigatorio se a Mae nao tem ctor sem parametros
    }
}
```
### Sobrescrita
```java
@Override
public void metodo() { super.metodo(); /* + algo extra */ }
```
### Associacao 0..1  /  0..*  /  limite max N
```java
private Caminhao veiculoAtual;                       // 0..1 (null = nenhum)
private ArrayList<Pacote> pacotes = new ArrayList<>(); // 0..*
if (pacotes.size() >= N) throw new IllegalStateException("cheio"); // max N
```
### Bidirecional (manter os dois lados)
```java
public void adicionarPacote(Pacote p) { pacotes.add(p); p.setRemetente(this); }
```
### Agregacao x Composicao
```java
// Agregacao: parte vem de fora
public void adicionar(Veiculo v) { veiculos.add(v); }
// Composicao: todo cria, nada de getter/setter da parte
public Entrega(...) { this.rota = new Rota(origem, destino); }
```
### Abstrata / final / interface
```java
public abstract class Veiculo { public abstract double calcularFrete(double km); }
public final class Moto extends Veiculo { ... }          // nao pode ser estendida
public interface A { void x(); default String y() { return "ok"; } }
public interface B extends A { }                         // heranca de interface
public class C implements B { public void x() { } }      // implements
```
### Polimorfismo / downcasting
```java
Veiculo v = new Caminhao("A");        // upcasting (automatico)
if (v instanceof Caminhao) {
    Caminhao c = (Caminhao) v;        // downcasting (explicito)
}
// Caminhao c = new Veiculo(..);      // NAO compila
```
### for-each com ArrayList
```java
for (Produto p : lista) { total += p.getPreco(); }
```

## Setas UML
| Relacao | Desenho |
|---|---|
| Associacao | linha continua (seta aberta -> se unidirecional) |
| Dependencia | tracejada com seta aberta |
| Agregacao | losango VAZIO no todo |
| Composicao | losango CHEIO no todo |
| Heranca | continua + triangulo vazio na superclasse |
| Implements | tracejada + triangulo vazio na interface |

## Erros classicos
1. `>` no lugar de `>=` no limite do ArrayList.
2. Superclasse sem ctor padrao e subclasse sem `super(...)`.
3. Esquecer `@Override` e escrever `Area()` em vez de `area()` (vira overload).
4. Acessar atributo `private` da superclasse (use getter/setter protected).
5. `new` em classe abstrata ou interface.
6. Downcasting sem `instanceof` (ClassCastException).

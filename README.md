# Simples Interpretador (Parte 8)

Atividade Individual - Simples Interpretador”

## 💻 Como compilar e executar
```bash
javac *.java
java -cp . Main



# Simples Interpretador — Parte 8

Atividade Individual — **“De um Simples Tradutor a um Simples Interpretador”**  
Objetivo: implementar um **interpretador simples** baseado em uma linguagem de **pilha** com os comandos `PUSH`, `POP`, `ADD`, `SUB` e `PRINT`.

> Projeto desenvolvido para a Parte 8 (Um simples interpretador).

---

## ✨ Funcionalidades

- Pilha de inteiros
- Variáveis simples (armazenadas via `POP <nome>`, lidas com `PUSH <nome>`)
- Operações aritméticas básicas: `ADD` (soma) e `SUB` (subtração)
- Impressão do topo da pilha: `PRINT`
- Ignora linhas vazias e comentários que começam com `//`

---

## 🧱 Estrutura do repositório
├── Main.java # Programa de demonstração (entrada de comandos)
├── Interpretador.java # Interpretador (parsing de linhas e execução)
├── .gitignore # Ignora arquivos .class (binários)
└── README.md # Este arquivo

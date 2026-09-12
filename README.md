# 🏢 Sistema de Consulta de Benefícios (Java)

Um sistema simples e eficiente desenvolvido em Java para avaliar a elegibilidade de colaboradores aos benefícios corporativos com base em critérios como renda, modalidade de trabalho, dependentes e tempo de empresa.

---

## 📌 Funcionalidades

O projeto é dividido em duas classes executáveis:

* **`BeneficioVale` (Consulta Rápida):** Uma validação simples focada exclusivamente no teto salarial para concessão do Vale-Alimentação/Refeição.
* **`ConsultaBeneficios` (Avaliação Completa):** Um formulário interativo via terminal que faz uma análise detalhada dos seguintes benefícios:
* **Vale-Alimentação:** Disponível para salários até R$ 4.000,00.
* **Auxílio-Creche:** Concedido a colaboradores com filhos.
* **Plano de Saúde:** Disponível para todos os colaboradores desde a admissão.
* **Auxílio Home Office:** Exclusivo para quem trabalha na modalidade remota.
* **Auxílio Combustível:** Destinado a colaboradores presenciais que utilizam veículo próprio.
* **PLR (Participação nos Lucros):** Elegível após 1 ano de empresa.
* **Bolsa de Estudos:** Elegível após 2 anos de empresa.



---

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java 8+
* **Entrada de Dados:** `java.util.Scanner`

---

## 🚀 Como Executar o Projeto

### Pré-requisitos

* Java Development Kit (JDK) instalado.
* VS Code (com Java Extension Pack) ou qualquer IDE de sua preferência (Eclipse, IntelliJ).


## 📋 Exemplo de Uso (Saída no Terminal)

```text
Digite o nome do colaborador: Maria Silva
Digite a idade: 30
Digite o salário: R$ 3500.00
Digite o tempo de empresa (em anos): 2
Digite a quantidade de filhos: 1
Digite a modalidade de trabalho (presencial / home office): home office
Utiliza veículo próprio? (sim / nao): nao

----------------------------------------
  SISTEMA DE CONSULTA DE BENEFÍCIOS
----------------------------------------
Colaborador: Maria Silva
Idade: 30 anos
----------------------------------------
Vale-Alimentação: Possui direito
Auxílio-Creche: Possui direito
Plano de Saúde: Elegível
Auxílio Home Office: Possui direito
Auxílio Combustível: Não possui direito
Participação na PLR: Possui direito
Bolsa de Estudos: Elegível
----------------------------------------

```

# Desafio: Contribuintes

A meta do desafio proposto pelo curso DevSuperior é ler os dados de N contribuintes, salvá-los em uma lista e, então, exibir um relatório do imposto de cada contribuinte. As regras do desafio são:

1. **Imposto sobre Salário:**
   - A pessoa paga imposto sobre seu salário conforme a tabela abaixo:
     
   | Salário mensal | Imposto   |
   | -------------  | --------- |
   | Abaixo de 3000 por mês | Isento |
   | 3000 até 5000 (exclusive) | 10% |
   | 5000 ou acima | 20% |

2. **Imposto sobre Prestação de Serviços:**
   - Se a pessoa obteve renda com prestação de serviços, o imposto cobrado é de 15%.

3. **Imposto sobre Ganho de Capital:**
   - Se a pessoa obteve ganho de capital (imóveis, ações, etc.), o imposto cobrado é de 20%.

4. **Deduções:**
   - A pessoa pode abater até 30% do seu imposto bruto devido com gastos médicos ou educacionais. No entanto, se seus gastos médicos e educacionais forem abaixo desses 30%, apenas os gastos médicos e educacionais podem ser abatidos.

5. **Seguir o diagrama de classe:**
 
   ![Diagrama de classe](https://github.com/LucasFrancoBN/contribuintes/blob/master/img/diagrama_classe.png)
   

## Exemplo
```plaintext
Quantos contribuintes você vai digitar? 2

Digite os dados do 1o contribuinte:
Renda anual com salário: 48000.00
Renda anual com prestação de serviço: 0.00
Renda anual com ganho de capital: 800.00
Gastos médicos: 400.00
Gastos educacionais: 5400.00

Digite os dados do 2o contribuinte:
Renda anual com salário: 189000.00
Renda anual com prestação de serviço: 55184.93
Renda anual com ganho de capital: 20000.00
Gastos médicos: 600.00
Gastos educacionais: 7500.00

Resumo do 1o contribuinte:
Imposto bruto total: 4960.00
Abatimento: 1488.00
Imposto devido: 3472.00

Resumo do 2o contribuinte:
Imposto bruto total: 50077.74
Abatimento: 8100.00
Imposto devido: 41977.74
```

## Ferramentas
Desafio desenvolvido utilizando a linguagem Java e a IDE Intellij Community.


## Instruções de Uso
Antes de prosseguir com as instruções de uso, é requerido que você tenha em sua máquina o Java 20 e o git.

### Instalação
Antes de tudo, recomendo que você, pelo terminal, navegue até o diretório Desktop e rode o comando
```bash
# Clone o repositório
git clone https://github.com/LucasFrancoBN/contribuintes.git

# Acesse o diretório da classe Program
cd contribuintes/src/application
```
Agora basta você digitar no seu terminal
```bash
# Compile o projeto
javac Program.java ../entities/TaxPayer.java
```
Retroceda ao diretório src e compile o programa
```
# Retrocedendo ao diretório src
cd ../

# Execute o programa
java application.Program
```

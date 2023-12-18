package application;

import entities.TaxPayer;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.print("Quantos contribuintes você vai digitar? ");
    int numberOfTaxPayers = sc.nextInt();
    List<TaxPayer> taxPayers = new ArrayList<>();
    System.out.println();

    registerTaxPayers(numberOfTaxPayers, taxPayers, sc);

    showTaxPayers(taxPayers);

  }

  public static void registerTaxPayers(int numberOfTaxPayers, List<TaxPayer> taxPayers, Scanner sc) {
    for(int i = 0; i < numberOfTaxPayers; i++) {
      System.out.printf("Digite os dados do %dº contribuinte:%n", i + 1);
      System.out.print("Renda anual com salário: ");
      double salaryIncome = sc.nextDouble();
      System.out.print("Renda anual com prestação de serviço: ");
      double serviceIncome = sc.nextDouble();
      System.out.print("Renda anual com ganho de capital: ");
      double capitalIncome = sc.nextDouble();
      System.out.print("Gastos médicos: ");
      double healthSpending = sc.nextDouble();
      System.out.print("Gastos educacionais: ");
      double educationSpending = sc.nextDouble();

      TaxPayer taxPayer = new TaxPayer(salaryIncome, serviceIncome, capitalIncome, healthSpending, educationSpending);

      taxPayers.add(taxPayer);
      System.out.println();
    }
  }

  public static void showTaxPayers(List<TaxPayer> taxPayers) {
    for(int i = 0; i < taxPayers.size(); i++) {
      System.out.printf("Resumo do %dº contribuinte:%n", i + 1);
      System.out.println(taxPayers.get(i).toString());
    }
  }
}

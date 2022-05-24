import java.sql.SQLOutput;

public class Main {
    public static void main (String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println("Сумма кредита: 1 000 000 ₽");
        System.out.println("Срок кредита: 12 месяцев");
        System.out.println("Процентная ставка: 9,99 %");
        System.out.println("Ежемесячный платеж: " + service.calculate (1_000_000, 12) + " ₽");

        System.out.println();
        System.out.println("Сумма кредита: 1 000 000 ₽");
        System.out.println("Срок кредита: 24 месяцев");
        System.out.println("Процентная ставка: 9,99 %");
        System.out.println("Ежемесячный платеж: " + service.calculate (1_000_000, 24) + " ₽");

        System.out.println();
        System.out.println("Сумма кредита: 1 000 000 ₽");
        System.out.println("Срок кредита: 36 месяцев");
        System.out.println("Процентная ставка: 9,99 %");
        System.out.println("Ежемесячный платеж: " + service.calculate (1_000_000, 36) + " ₽");
    }
}

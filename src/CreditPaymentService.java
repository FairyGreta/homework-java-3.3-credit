public class CreditPaymentService {

    public double calculate(int loanAmount, int month) {
        double interestRate = 9.99 / 100; // ставка годовая
        double mounthlyRate = interestRate / 12; // ставка в месяц
        double mounthlyRate1 = Math.pow(mounthlyRate + 1, month); // промежуточное действие возвести в степень
        double creditPayment =  (mounthlyRate * mounthlyRate1 / (mounthlyRate1 - 1)) * loanAmount; // формула
        double creditPayment1 = Math.round(creditPayment); // округляем до целого числа
        return creditPayment1 ;
    }


}

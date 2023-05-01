public class Hourly extends Employee {
    double HourlyRate;
    double Hours = 0;

    Hourly(String nome, double rate, double Hours) {
        this.nome = nome;
        this.HourlyRate = rate;
        this.Hours = Hours;
    }

    public double getPay() {
        return HourlyRate * Hours;
    }

    public void addHours(double hours) {
        this.Hours += hours;
    }

}

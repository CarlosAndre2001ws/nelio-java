package exercicio.fixacao.exercicio142.entities;

public class OutsourcedEmployee extends Employee {

    private final Double additionalCharge;

    public OutsourcedEmployee(String nome, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(nome, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public final Double payment() {
        return super.payment() +  (110/100) * additionalCharge;
    }
}

package HomeWork3.Task1;

public class Financialrecord {

  private int incomes;
  private int outcomes;

    public Financialrecord(int incomes, int outcomes) {
        this.incomes = incomes;
        this.outcomes = outcomes;
    }

    public int getIncomes() {
        return incomes;
    }

    public void setIncomes(int incomes) {
        this.incomes = incomes;
    }

    public int getOutcomes() {
        return outcomes;
    }

    public void setOutcomes(int outcomes) {
        this.outcomes = outcomes;
    }

    @Override
    public String toString() {
        return "Financialrecord{" +
                "incomes=" + incomes +
                ", outcomes=" + outcomes +
                '}';
    }
}

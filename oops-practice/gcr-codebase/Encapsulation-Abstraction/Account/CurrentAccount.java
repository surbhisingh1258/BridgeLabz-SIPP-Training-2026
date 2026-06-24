class CurrentAccount extends Account {
    private double monthlyBonusRate;

    public double getMonthlyBonusRate() {
        return monthlyBonusRate;
    }

    public void setMonthlyBonusRate(double monthlyBonusRate) {
        this.monthlyBonusRate = monthlyBonusRate;
    }

    @Override
    double calculateInterest() {
        return getBalance() * monthlyBonusRate / 100;
    }
}
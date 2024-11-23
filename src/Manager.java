public class Manager extends Employee{

    private double bonus;

    // constructor
    Manager(String name, double baseSalary)
    {
        super();
        super.setName(name);
        super.setBaseSalary(baseSalary);
    }

    // setter method of bonus
    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    // @Override
    public double getSalary()
    {
        return super.getSalary()+bonus;
    }


}
import javax.swing.JOptionPane;

public class Salary 
{
    public static void main(String[] args) 
    {
        int working_Hours = Integer.parseInt(JOptionPane.showInputDialog("How many hours does the job take daily? "));
        int working_Days = Integer.parseInt(JOptionPane.showInputDialog("How many days does they work regularly? "));
        double hourly_Wage = Integer.parseInt(JOptionPane.showInputDialog("How much should the workers receive per hour? "));

        double monthly_Brutal_Wage = hourly_Wage * working_Hours * working_Days * 4;
        double tax = monthly_Brutal_Wage * 3  / 100;
        double liquid_Wage = monthly_Brutal_Wage - tax;

        JOptionPane.showMessageDialog(null, 
        "The workers brute wage is: " + monthly_Brutal_Wage);

        JOptionPane.showMessageDialog(null, "Taxes will add up to " + tax);
        JOptionPane.showMessageDialog(null, "The actual wage will be of " + liquid_Wage);
    }
}